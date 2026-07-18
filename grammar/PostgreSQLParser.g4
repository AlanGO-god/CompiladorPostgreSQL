parser grammar PostgreSQLParser;

options {
    tokenVocab = PostgreSQLLexer;
}

program
    : stmt (SEMI stmt)* SEMI? EOF
    ;

stmt
    : sentenciaSelect
    | sentenciaInsert
    | sentenciaUpdate
    | sentenciaDelete
    | sentenciaCrearTabla
    | sentenciaAlterTable
    | sentenciaDropTable
    | sentenciaCreateView
    | sentenciaDropView
    | sentenciaCreateIndex
    | sentenciaDropIndex
    | sentenciaTransaccion
    ;

sentenciaSelect
    : withClause? selectNoParens
    ;

withClause
    : WITH RECURSIVE? cteList
    ;

cteList
    : commonTableExpr (COMMA commonTableExpr)*
    ;

commonTableExpr
    : name=identifier (LPAREN columnList RPAREN)? AS LPAREN sentenciaSelect RPAREN
    ;

selectNoParens
    : selectClause (setOperator selectClause)* sortClause? limitClause? offsetClause?
    ;

selectClause
    : simpleSelect
    | LPAREN selectNoParens RPAREN
    ;

setOperator
    : (UNION | INTERSECT | EXCEPT) ALL?
    ;

simpleSelect
    : SELECT setQuantifier? targetList
      fromClause?
      whereClause?
      groupClause?
      havingClause?
      windowClause?
    ;

setQuantifier
    : DISTINCT
    | ALL
    ;

targetList
    : targetEl (COMMA targetEl)*
    ;

targetEl
    : STAR
    | expr (AS? columnLabel)?
    ;

fromClause
    : FROM fromList
    ;

fromList
    : tableRef (COMMA tableRef)*
    ;

tableRef
    : tableRef joinType JOIN tableRef joinQualifier   
    | tableRef CROSS JOIN tableRef
    | tablePrimary
    ;

tablePrimary
    : qualifiedName (AS? alias=identifier)?
    | LPAREN sentenciaSelect RPAREN AS? alias=identifier
    ;

joinType
    : INNER?
    | LEFT OUTER?
    | RIGHT OUTER?
    | FULL OUTER?
    ;

joinQualifier
    : ON expr
    | USING LPAREN columnList RPAREN
    ;

whereClause
    : WHERE expr
    ;

groupClause
    : GROUP BY expr (COMMA expr)*
    ;

havingClause
    : HAVING expr
    ;

windowClause
    : WINDOW windowDefList
    ;

windowDefList
    : windowDef (COMMA windowDef)*
    ;

windowDef
    : identifier AS LPAREN overClauseBody RPAREN
    ;

sortClause
    : ORDER BY sortSpec (COMMA sortSpec)*
    ;

sortSpec
    : expr (ASC | DESC)? (NULLS (FIRST | LAST))?
    ;

limitClause
    : LIMIT (INTEGER_LITERAL | ALL)
    ;

offsetClause
    : OFFSET INTEGER_LITERAL
    ;

sentenciaInsert
    : INSERT INTO qualifiedName (LPAREN columnList RPAREN)?
      insertSource
      returningClause?
    ;

insertSource
    : VALUES valuesList
    | sentenciaSelect
    ;

valuesList
    : valuesRow (COMMA valuesRow)*
    ;

valuesRow
    : LPAREN exprList RPAREN
    ;

returningClause
    : RETURNING targetList
    ;

sentenciaUpdate
    : UPDATE qualifiedName (AS? identifier)?
      SET setClauseList
      fromClause?
      whereClause?
      returningClause?
    ;

setClauseList
    : setClause (COMMA setClause)*
    ;

setClause
    : columnName EQ expr
    ;

sentenciaDelete
    : DELETE FROM ONLY? qualifiedName (AS? identifier)?
      usingClause?
      whereClause?
      returningClause?
    ;

usingClause
    : USING fromList
    ;

sentenciaCrearTabla
    : CREATE (TEMP | TEMPORARY)? TABLE (IF NOT EXISTS)? qualifiedName
      LPAREN tableElementList RPAREN
    ;

tableElementList
    : tableElement (COMMA tableElement)*
    ;

tableElement
    : columnDef
    | tableConstraint
    ;

columnDef
    : columnName dataType columnConstraint*
    ;

columnConstraint
    : NOT NULL
    | NULL
    | DEFAULT expr
    | PRIMARY KEY
    | UNIQUE
    | CHECK LPAREN expr RPAREN
    | REFERENCES qualifiedName (LPAREN columnName RPAREN)?
    ;

tableConstraint
    : (CONSTRAINT identifier)? PRIMARY KEY LPAREN columnList RPAREN
    | (CONSTRAINT identifier)? UNIQUE LPAREN columnList RPAREN
    | (CONSTRAINT identifier)? FOREIGN KEY LPAREN columnList RPAREN REFERENCES qualifiedName (LPAREN columnList RPAREN)?
    | (CONSTRAINT identifier)? CHECK LPAREN expr RPAREN
    ;

dataType
    : baseType (LBRACKET RBRACKET)*
    | baseType ARRAY
    ;

baseType
    : INTEGER
    | INT
    | SMALLINT
    | BIGINT
    | SERIAL
    | BIGSERIAL
    | (NUMERIC | DECIMAL) typeModifiers?
    | REAL
    | DOUBLE PRECISION
    | FLOAT typeModifiers?
    | (VARCHAR | CHARACTER VARYING) typeModifiers?
    | (CHAR | CHARACTER) typeModifiers?
    | TEXT
    | (BOOLEAN | BOOL)
    | DATE
    | TIME typeModifiers? ((WITH | WITHOUT) TIME ZONE)?
    | TIMESTAMP typeModifiers? ((WITH | WITHOUT) TIME ZONE)?
    | INTERVAL
    | UUID
    | (JSON | JSONB)
    | BYTEA
    | identifier
    ;

typeModifiers
    : LPAREN INTEGER_LITERAL (COMMA INTEGER_LITERAL)? RPAREN
    ;

sentenciaAlterTable
    : ALTER TABLE (IF EXISTS)? qualifiedName alterTableAction (COMMA alterTableAction)*
    ;

alterTableAction
    : ADD COLUMN? (IF NOT EXISTS)? columnDef
    | DROP COLUMN? (IF EXISTS)? columnName (CASCADE | RESTRICT)?
    | ALTER COLUMN? columnName alterColumnAction  
    | ADD tableConstraint               
    | RENAME TO newTable=identifier            
    | RENAME COLUMN? columnName TO newColumn=identifier
    ;

alterColumnAction
    : SET DEFAULT expr
    | DROP DEFAULT
    | SET NOT NULL
    | DROP NOT NULL
    | TYPE dataType
    ;

sentenciaDropTable
    : DROP TABLE (IF EXISTS)? qualifiedNameList (CASCADE | RESTRICT)?
    ;

qualifiedNameList
    : qualifiedName (COMMA qualifiedName)*
    ;

sentenciaCreateView
    : CREATE (OR REPLACE)? VIEW qualifiedName (LPAREN columnList RPAREN)? AS sentenciaSelect
    ;

sentenciaDropView
    : DROP VIEW (IF EXISTS)? qualifiedNameList (CASCADE | RESTRICT)?
    ;

sentenciaCreateIndex
    : CREATE UNIQUE? INDEX (IF NOT EXISTS)? indexName=identifier? ON qualifiedName
      LPAREN indexColumnList RPAREN
      (WHERE expr)?
    ;

indexColumnList
    : indexColumn (COMMA indexColumn)*
    ;

indexColumn
    : columnName (ASC | DESC)?
    ;

sentenciaDropIndex
    : DROP INDEX (IF EXISTS)? qualifiedNameList
    ;

sentenciaTransaccion
    : BEGIN (TRANSACTION | WORK)?
    | COMMIT (TRANSACTION | WORK)?
    | ROLLBACK (TRANSACTION | WORK)? (TO SAVEPOINT? identifier)?
    | SAVEPOINT identifier
    | RELEASE SAVEPOINT? identifier
    ;

expr
    : LPAREN expr RPAREN
    | LPAREN sentenciaSelect RPAREN
    | CASE expr? whenClause+ (ELSE expr)? END
    | CAST LPAREN expr AS dataType RPAREN
    | EXISTS LPAREN sentenciaSelect RPAREN
    | columnref
    | literal
    | expr TYPECAST dataType
    | op=(PLUS | MINUS) expr
    | expr op=(STAR | SLASH | PERCENT) expr
    | expr op=(PLUS | MINUS) expr
    | expr CONCAT expr
    | expr comparisonOperator expr
    | expr comparisonOperator (ANY | SOME | ALL) LPAREN sentenciaSelect RPAREN
    | ARRAY LBRACKET exprList? RBRACKET
    | expr NOT? BETWEEN expr AND expr
    | expr NOT? IN LPAREN (exprList | sentenciaSelect) RPAREN
    | expr NOT? (LIKE | ILIKE) expr
    | expr IS NOT? NULL
    | expr IS NOT? DISTINCT FROM expr
    | NOT expr
    | expr AND expr
    | expr OR expr
    ;

comparisonOperator
    : EQ | NEQ | LT | GT | LE | GE
    ;

whenClause
    : WHEN expr THEN expr
    ;

functionName
    : identifier
    ;

overClause
    : OVER LPAREN overClauseBody RPAREN
    ;

overClauseBody
    : (PARTITION BY exprList)? (ORDER BY sortSpec (COMMA sortSpec)*)?
    ;

columnref
    : qualifiedName
    ;

qualifiedName
    : identifier (DOT identifier)*
    ;

columnName
    : identifier
    ;

columnList
    : columnName (COMMA columnName)*
    ;

exprList
    : expr (COMMA expr)*
    ;

literal
    : INTEGER_LITERAL
    | NUMERIC_LITERAL
    | STRING
    | ESTRING
    | TRUE
    | FALSE
    | NULL
    ;

columnLabel
    : identifier
    ;

identifier
    : IDENTIFIER
    | QUOTED_IDENTIFIER
    ;
