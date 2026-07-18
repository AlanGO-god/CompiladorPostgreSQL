from antlr4 import InputStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener
from antlr4.tree.Trees import Trees
from antlr4.tree.Tree import TerminalNode

import graphviz

from PostgreSQLLexer import PostgreSQLLexer
from PostgreSQLParser import PostgreSQLParser


MAX_NODOS_GRAFICO = 400


class ErroresSintacticos(ErrorListener):

    def __init__(self):

        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):

        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg
        })


class AnalizadorSintactico:

    # Constructor
    def __init__(self):

        self.parser = None

        self.arbol = None

        self.errores = ErroresSintacticos()

        self.arbol_truncado = False

    def analizar(self, codigo):

        entrada = InputStream(codigo)

        lexer = PostgreSQLLexer(entrada)
        lexer.removeErrorListeners()

        tokens = CommonTokenStream(lexer)

        self.parser = PostgreSQLParser(tokens)

        self.parser.removeErrorListeners()

        self.parser.addErrorListener(self.errores)

        self.arbol = self.parser.program()

    def obtener_errores(self):

        return self.errores.lista

    def obtener_arbol_texto(self):

        if self.arbol is None:
            return ""

        return Trees.toStringTree(self.arbol, None, self.parser)

    def obtener_arbol_grafico(self):

        grafo = graphviz.Digraph()

        grafo.attr(bgcolor="#0d1117", rankdir="TB")
        grafo.attr("node", fontname="Consolas")
        grafo.attr("edge", color="#4d5566")

        if self.arbol is None:
            return grafo

        contador = [0]

        self.arbol_truncado = False

        self._agregar_nodo(grafo, self.arbol, contador)

        return grafo

    def _agregar_nodo(self, grafo, nodo, contador):

        if contador[0] >= MAX_NODOS_GRAFICO:
            self.arbol_truncado = True
            return None

        id_actual = "n{0}".format(contador[0])
        contador[0] += 1

        if isinstance(nodo, TerminalNode):

            texto = nodo.getText()

            grafo.node(
                id_actual, texto,
                shape="box", style="filled,rounded",
                fillcolor="#2b6cb0", fontcolor="#ffffff",
            )

            return id_actual

        nombre_regla = self.parser.ruleNames[nodo.getRuleIndex()]

        grafo.node(
            id_actual, nombre_regla,
            shape="ellipse", style="filled",
            fillcolor="#161b22", fontcolor="#79c0ff",
        )

        for i in range(nodo.getChildCount()):
            hijo = nodo.getChild(i)

            id_hijo = self._agregar_nodo(grafo, hijo, contador)

            if id_hijo is not None:
                grafo.edge(id_actual, id_hijo)

        return id_actual
