lexer grammar PostgreSQLLexer;

// consultas
SELECT: [Ss][Ee][Ll][Ee][Cc][Tt];
FROM: [Ff][Rr][Oo][Mm];
WHERE: [Ww][Hh][Ee][Rr][Ee];
AS: [Aa][Ss];
DISTINCT: [Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt];
ALL: [Aa][Ll][Ll];
INTO: [Ii][Nn][Tt][Oo];
GROUP: [Gg][Rr][Oo][Uu][Pp];
BY: [Bb][Yy];
HAVING: [Hh][Aa][Vv][Ii][Nn][Gg];
ORDER: [Oo][Rr][Dd][Ee][Rr];
ASC: [Aa][Ss][Cc];
DESC: [Dd][Ee][Ss][Cc];
NULLS: [Nn][Uu][Ll][Ll][Ss];
FIRST: [Ff][Ii][Rr][Ss][Tt];
LAST: [Ll][Aa][Ss][Tt];
LIMIT: [Ll][Ii][Mm][Ii][Tt];
OFFSET: [Oo][Ff][Ff][Ss][Ee][Tt];
UNION: [Uu][Nn][Ii][Oo][Nn];
INTERSECT: [Ii][Nn][Tt][Ee][Rr][Ss][Ee][Cc][Tt];
EXCEPT: [Ee][Xx][Cc][Ee][Pp][Tt];
WITH: [Ww][Ii][Tt][Hh];
RECURSIVE: [Rr][Ee][Cc][Uu][Rr][Ss][Ii][Vv][Ee];
OVER: [Oo][Vv][Ee][Rr];
PARTITION: [Pp][Aa][Rr][Tt][Ii][Tt][Ii][Oo][Nn];
WINDOW: [Ww][Ii][Nn][Dd][Oo][Ww];
JOIN: [Jj][Oo][Ii][Nn];
INNER: [Ii][Nn][Nn][Ee][Rr];
LEFT: [Ll][Ee][Ff][Tt];
RIGHT: [Rr][Ii][Gg][Hh][Tt];
FULL: [Ff][Uu][Ll][Ll];
OUTER: [Oo][Uu][Tt][Ee][Rr];
CROSS: [Cc][Rr][Oo][Ss][Ss];
ON: [Oo][Nn];
USING: [Uu][Ss][Ii][Nn][Gg];
ONLY: [Oo][Nn][Ll][Yy];

// insert, update, delete
INSERT: [Ii][Nn][Ss][Ee][Rr][Tt];
VALUES: [Vv][Aa][Ll][Uu][Ee][Ss];
UPDATE: [Uu][Pp][Dd][Aa][Tt][Ee];
SET: [Ss][Ee][Tt];
DELETE: [Dd][Ee][Ll][Ee][Tt][Ee];
RETURNING: [Rr][Ee][Tt][Uu][Rr][Nn][Ii][Nn][Gg];

// DDL
CREATE: [Cc][Rr][Ee][Aa][Tt][Ee];
ALTER: [Aa][Ll][Tt][Ee][Rr];
DROP: [Dd][Rr][Oo][Pp];
TABLE: [Tt][Aa][Bb][Ll][Ee];
VIEW: [Vv][Ii][Ee][Ww];
INDEX: [Ii][Nn][Dd][Ee][Xx];
TEMP: [Tt][Ee][Mm][Pp];
TEMPORARY: [Tt][Ee][Mm][Pp][Oo][Rr][Aa][Rr][Yy];
IF: [Ii][Ff];
EXISTS: [Ee][Xx][Ii][Ss][Tt][Ss];
CASCADE: [Cc][Aa][Ss][Cc][Aa][Dd][Ee];
RESTRICT: [Rr][Ee][Ss][Tt][Rr][Ii][Cc][Tt];
ADD: [Aa][Dd][Dd];
COLUMN: [Cc][Oo][Ll][Uu][Mm][Nn];
RENAME: [Rr][Ee][Nn][Aa][Mm][Ee];
TO: [Tt][Oo];
CONSTRAINT: [Cc][Oo][Nn][Ss][Tt][Rr][Aa][Ii][Nn][Tt];
PRIMARY: [Pp][Rr][Ii][Mm][Aa][Rr][Yy];
KEY: [Kk][Ee][Yy];
FOREIGN: [Ff][Oo][Rr][Ee][Ii][Gg][Nn];
REFERENCES: [Rr][Ee][Ff][Ee][Rr][Ee][Nn][Cc][Ee][Ss];
UNIQUE: [Uu][Nn][Ii][Qq][Uu][Ee];
DEFAULT: [Dd][Ee][Ff][Aa][Uu][Ll][Tt];
CHECK: [Cc][Hh][Ee][Cc][Kk];
REPLACE: [Rr][Ee][Pp][Ll][Aa][Cc][Ee];
TYPE: [Tt][Yy][Pp][Ee];

// transacciones
BEGIN: [Bb][Ee][Gg][Ii][Nn];
COMMIT: [Cc][Oo][Mm][Mm][Ii][Tt];
ROLLBACK: [Rr][Oo][Ll][Ll][Bb][Aa][Cc][Kk];
TRANSACTION:
	[Tt][Rr][Aa][Nn][Ss][Aa][Cc][Tt][Ii][Oo][Nn];
WORK: [Ww][Oo][Rr][Kk];
SAVEPOINT: [Ss][Aa][Vv][Ee][Pp][Oo][Ii][Nn][Tt];
RELEASE: [Rr][Ee][Ll][Ee][Aa][Ss][Ee];

// operaciones logicas 
AND: [Aa][Nn][Dd];
OR: [Oo][Rr];
NOT: [Nn][Oo][Tt];
IN: [Ii][Nn];
BETWEEN: [Bb][Ee][Tt][Ww][Ee][Ee][Nn];
LIKE: [Ll][Ii][Kk][Ee];
ILIKE: [Ii][Ll][Ii][Kk][Ee];
IS: [Ii][Ss];
NULL: [Nn][Uu][Ll][Ll];
TRUE: [Tt][Rr][Uu][Ee];
FALSE: [Ff][Aa][Ll][Ss][Ee];
CASE: [Cc][Aa][Ss][Ee];
WHEN: [Ww][Hh][Ee][Nn];
THEN: [Tt][Hh][Ee][Nn];
ELSE: [Ee][Ll][Ss][Ee];
END: [Ee][Nn][Dd];
CAST: [Cc][Aa][Ss][Tt];
ANY: [Aa][Nn][Yy];
SOME: [Ss][Oo][Mm][Ee];

// tipos de datos 
INTEGER: [Ii][Nn][Tt][Ee][Gg][Ee][Rr];
INT: [Ii][Nn][Tt];
SMALLINT: [Ss][Mm][Aa][Ll][Ll][Ii][Nn][Tt];
BIGINT: [Bb][Ii][Gg][Ii][Nn][Tt];
SERIAL: [Ss][Ee][Rr][Ii][Aa][Ll];
BIGSERIAL: [Bb][Ii][Gg][Ss][Ee][Rr][Ii][Aa][Ll];
NUMERIC: [Nn][Uu][Mm][Ee][Rr][Ii][Cc];
DECIMAL: [Dd][Ee][Cc][Ii][Mm][Aa][Ll];
REAL: [Rr][Ee][Aa][Ll];
DOUBLE: [Dd][Oo][Uu][Bb][Ll][Ee];
PRECISION: [Pp][Rr][Ee][Cc][Ii][Ss][Ii][Oo][Nn];
FLOAT: [Ff][Ll][Oo][Aa][Tt];
VARCHAR: [Vv][Aa][Rr][Cc][Hh][Aa][Rr];
CHARACTER: [Cc][Hh][Aa][Rr][Aa][Cc][Tt][Ee][Rr];
VARYING: [Vv][Aa][Rr][Yy][Ii][Nn][Gg];
CHAR: [Cc][Hh][Aa][Rr];
TEXT: [Tt][Ee][Xx][Tt];
BOOLEAN: [Bb][Oo][Oo][Ll][Ee][Aa][Nn];
BOOL: [Bb][Oo][Oo][Ll];
DATE: [Dd][Aa][Tt][Ee];
TIME: [Tt][Ii][Mm][Ee];
TIMESTAMP: [Tt][Ii][Mm][Ee][Ss][Tt][Aa][Mm][Pp];
ZONE: [Zz][Oo][Nn][Ee];
WITHOUT: [Ww][Ii][Tt][Hh][Oo][Uu][Tt];
INTERVAL: [Ii][Nn][Tt][Ee][Rr][Vv][Aa][Ll];
UUID: [Uu][Uu][Ii][Dd];
JSON: [Jj][Ss][Oo][Nn];
JSONB: [Jj][Ss][Oo][Nn][Bb];
BYTEA: [Bb][Yy][Tt][Ee][Aa];
ARRAY: [Aa][Rr][Rr][Aa][Yy];

// funciones de comparacion
EQ: '=';
NEQ: '<>' | '!=';
LE: '<=';
GE: '>=';
LT: '<';
GT: '>';

// operadores aritmeticos 
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';

// concatenacion y casteo
CONCAT: '||';
TYPECAST: '::';

// puntuacion
DOT: '.';
COMMA: ',';
SEMI: ';';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';

fragment DIGIT: [0-9];
fragment EXPONENT: [eE] [+-]? DIGIT+;

INTEGER_LITERAL: DIGIT+;

NUMERIC_LITERAL:
	DIGIT+ '.' DIGIT* EXPONENT?
	| '.' DIGIT+ EXPONENT?
	| DIGIT+ EXPONENT;

// cadenas
STRING: '\'' ( '\'\'' | ~['])* '\'';
ESTRING: [Ee] '\'' ( '\\' . | '\'\'' | ~['\\])* '\'';

// identificadores (que estén entre comillas)
QUOTED_IDENTIFIER: '"' ( '""' | ~["])* '"';

// identificadores
IDENTIFIER: [a-zA-Z_] [a-zA-Z_0-9$]*;

// comentarios
LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// WS
WS: [ \t\r\n]+ -> skip;