# Importamos herramientas principales de ANTLR
from antlr4 import InputStream, CommonTokenStream, Token

# Importamos ErrorListener para capturar errores lexicos
from antlr4.error.ErrorListener import ErrorListener

# Importamos el lexer generado por ANTLR a partir de PostgreSQLLexer.g4
from PostgreSQLLexer import PostgreSQLLexer


# ------------------------------------------------------------------
# Clasificacion de tokens por categoria (para mostrar una columna
# "categoria" en la tabla de tokens, igual que documentamos en
# docs/TOKENS.md). Esto no cambia el analisis, solo ayuda a leer
# la tabla resultante con fines didacticos.
# ------------------------------------------------------------------

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
    """Devuelve la categoria didactica de un token segun su nombre."""

    # Las palabras clave se revisan primero (algunas, como TRUE/FALSE/NULL,
    # tambien cuentan como literal; para la tabla las mostramos como
    # palabra clave porque asi se definen en el lexer)
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

    # Cualquier token no clasificado (por ejemplo, tokens de error)
    return "OTRO"


# Clase para guardar errores lexicos
class ErroresLexicos(ErrorListener):

    # Constructor
    def __init__(self):

        # Lista donde guardaremos los errores
        self.lista = []

    # Metodo que ANTLR ejecuta cuando encuentra un error lexico
    # (por ejemplo, un caracter que no reconoce ninguna regla del lexer,
    # como '@' o un string sin comilla de cierre)
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):

        # Guardamos el error en la lista
        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg
        })


# Clase para hacer el analisis lexico
class AnalizadorLexico:

    # Constructor
    def __init__(self):

        # Variable para guardar el lexer
        self.lexer = None

        # Variable para guardar los tokens
        self.tokens = None

        # Objeto para guardar errores lexicos
        self.errores = ErroresLexicos()

    # Metodo para analizar codigo fuente SQL
    def analizar(self, codigo):

        # Convertimos el texto en entrada para ANTLR
        entrada = InputStream(codigo)

        # Creamos el lexer generado a partir de PostgreSQLLexer.g4
        self.lexer = PostgreSQLLexer(entrada)

        # Quitamos los errores normales de ANTLR (los que se imprimen en consola)
        self.lexer.removeErrorListeners()

        # Agregamos nuestro capturador de errores
        self.lexer.addErrorListener(self.errores)

        # Creamos el flujo de tokens
        self.tokens = CommonTokenStream(self.lexer)

        # Leemos todos los tokens del codigo fuente
        self.tokens.fill()

    # Metodo para obtener los tokens como lista de diccionarios
    def obtener_tokens(self):

        # Creamos una lista vacia
        resultado = []

        # Recorremos todos los tokens generados
        for token in self.tokens.tokens:

            # Saltamos EOF porque no es un token real del codigo
            if token.type == Token.EOF:
                continue

            # Obtenemos el nombre simbolico del token (ej. "SELECT", "IDENTIFIER")
            nombre_token = self.lexer.symbolicNames[token.type]

            # Agregamos el token a la lista, con su categoria didactica
            resultado.append({
                "lexema": token.text,
                "token": nombre_token,
                "categoria": clasificar_token(nombre_token),
                "linea": token.line,
                "columna": token.column,
            })

        # Retornamos la lista de tokens
        return resultado

    # Metodo para obtener errores lexicos
    def obtener_errores(self):

        # Retornamos la lista de errores
        return self.errores.lista

    # Metodo para obtener un resumen (cuantos tokens hay por categoria),
    # util para mostrar una pequenia grafica en la app
    def obtener_resumen_categorias(self):

        # Diccionario donde acumulamos los conteos
        conteo = {}

        # Recorremos los tokens ya clasificados
        for t in self.obtener_tokens():
            categoria = t["categoria"]
            conteo[categoria] = conteo.get(categoria, 0) + 1

        # Retornamos el diccionario de conteos
        return conteo