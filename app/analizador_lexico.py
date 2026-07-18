from antlr4 import InputStream, CommonTokenStream, Token
from antlr4.error.ErrorListener import ErrorListener
from PostgreSQLLexer import PostgreSQLLexer


PALABRAS_CLAVE = {
    "SELECT", "FROM", "WHERE", "AS", "DISTINCT", "ALL", "INTO", "GROUP", "BY",
    "HAVING", "ORDER", "ASC", "DESC", "NULLS", "FIRST", "LAST", "LIMIT",
    "OFFSET", "UNION", "INTERSECT", "EXCEPT", "WITH", "RECURSIVE", "OVER",
    "PARTITION", "WINDOW", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER",
    "CROSS", "ON", "USING", "ONLY", "INSERT", "VALUES", "UPDATE", "SET",
    "DELETE", "RETURNING", "CREATE", "ALTER", "DROP", "TABLE", "VIEW",
    "INDEX", "TEMP", "TEMPORARY", "IF", "EXISTS", "CASCADE", "RESTRICT",
    "ADD", "COLUMN", "RENAME", "TO", "CONSTRAINT", "PRIMARY", "KEY",
    "FOREIGN", "REFERENCES", "UNIQUE", "DEFAULT", "CHECK", "REPLACE", "TYPE",
    "BEGIN", "COMMIT", "ROLLBACK", "TRANSACTION", "WORK", "SAVEPOINT",
    "RELEASE", "AND", "OR", "NOT", "IN", "BETWEEN", "LIKE", "ILIKE", "IS",
    "NULL", "TRUE", "FALSE", "CASE", "WHEN", "THEN", "ELSE", "END", "CAST",
    "ANY", "SOME", "INTEGER", "INT", "SMALLINT", "BIGINT", "SERIAL",
    "BIGSERIAL", "NUMERIC", "DECIMAL", "REAL", "DOUBLE", "PRECISION",
    "FLOAT", "VARCHAR", "CHARACTER", "VARYING", "CHAR", "TEXT", "BOOLEAN",
    "BOOL", "DATE", "TIME", "TIMESTAMP", "ZONE", "WITHOUT", "INTERVAL",
    "UUID", "JSON", "JSONB", "BYTEA", "ARRAY",
}

OPERADORES = {
    "EQ", "NEQ", "LE", "GE", "LT", "GT", "PLUS", "MINUS", "STAR", "SLASH",
    "PERCENT", "CONCAT", "TYPECAST",
}

PUNTUACION = {"DOT", "COMMA", "SEMI", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET"}

LITERALES = {
    "INTEGER_LITERAL", "NUMERIC_LITERAL", "STRING", "ESTRING",
    "QUOTED_IDENTIFIER", "TRUE", "FALSE", "NULL",
}

IDENTIFICADORES = {"IDENTIFIER"}


def clasificar_token(nombre_token):

    if nombre_token in PALABRAS_CLAVE:
        return "PALABRA_CLAVE"

    if nombre_token in OPERADORES:
        return "OPERADOR"

    if nombre_token in PUNTUACION:
        return "PUNTUACION"

    if nombre_token in LITERALES:
        return "LITERAL"

    if nombre_token in IDENTIFICADORES:
        return "IDENTIFICADOR"

    return "OTRO"


class ErroresLexicos(ErrorListener):

    def __init__(self):

        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):

        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg
        })

class AnalizadorLexico:

    def __init__(self):

        self.lexer = None

        self.tokens = None

        self.errores = ErroresLexicos()

    def analizar(self, codigo):

        entrada = InputStream(codigo)

        self.lexer = PostgreSQLLexer(entrada)

        self.lexer.removeErrorListeners()

        self.lexer.addErrorListener(self.errores)

        self.tokens = CommonTokenStream(self.lexer)

        self.tokens.fill()

    def obtener_tokens(self):

        resultado = []

        for token in self.tokens.tokens:

            if token.type == Token.EOF:
                continue

            nombre_token = self.lexer.symbolicNames[token.type]

            resultado.append({
                "lexema": token.text,
                "token": nombre_token,
                "categoria": clasificar_token(nombre_token),
                "linea": token.line,
                "columna": token.column,
            })

        return resultado

    def obtener_errores(self):

        return self.errores.lista

    def obtener_resumen_categorias(self):
        conteo = {}

        for t in self.obtener_tokens():
            categoria = t["categoria"]
            conteo[categoria] = conteo.get(categoria, 0) + 1

        return conteo