parser grammar PostgreSQLParser;

options {
    tokenVocab = PostgreSQLLexer;
}

program
    : stmt (SEMI stmt)* SEMI? EOF
    ;

stmt
    : selectStmt         # stmtSelect
    | insertStmt          # stmtInsert
    | updateStmt           # stmtUpdate
    | deleteStmt             # stmtDelete
    | createTableStmt          # stmtCreateTable
    | alterTableStmt             # stmtAlterTable
    | dropTableStmt                # stmtDropTable
    | createViewStmt                  # stmtCreateView
    | dropViewStmt                       # stmtDropView
    | createIndexStmt                       # stmtCreateIndex
    | dropIndexStmt                            # stmtDropIndex
    | transactionStmt                             # stmtTransaction
    ;

// ============================================================
// 1) SELECT  (equivalente a SelectStmt / select_no_parens)
// ============================================================

selectStmt
    : withClause? selectNoParens
    ;

withClause
    : WITH RECURSIVE? cteList
    ;

cteList
    : commonTableExpr (COMMA commonTableExpr)*
    ;

commonTableExpr
    : name=identifier (LPAREN columnList RPAREN)? AS LPAREN selectStmt RPAREN
    ;

// select_no_parens: permite UNION/INTERSECT/EXCEPT encadenados,
// con ORDER BY / LIMIT / OFFSET aplicados al resultado final.
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
    : STAR                              # targetStar
    | expr (AS? columnLabel)?           # targetExpr
    ;

fromClause
    : FROM fromList
    ;

fromList
    : tableRef (COMMA tableRef)*
    ;

// table_ref: soporta JOIN encadenados via recursion izquierda,
// igual que la gramatica real de Postgres.
tableRef
    : tableRef joinType JOIN tableRef joinQualifier   # joinedTable
    | tableRef CROSS JOIN tableRef                    # crossJoinedTable
    | tablePrimary                                    # plainTable
    ;

tablePrimary
    : qualifiedName (AS? alias=identifier)?            # namedTable
    | LPAREN selectStmt RPAREN AS? alias=identifier    # subqueryTable
    ;

joinType
    : INNER?
    | LEFT OUTER?
    | RIGHT OUTER?
    | FULL OUTER?
    ;

joinQualifier
    : ON expr                              # joinOn
    | USING LPAREN columnList RPAREN       # joinUsing
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

// WINDOW nombrado: WINDOW w AS (PARTITION BY ... ORDER BY ...)
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

// ============================================================
// 2) INSERT  (equivalente a InsertStmt)
// ============================================================

insertStmt
    : INSERT INTO qualifiedName (LPAREN columnList RPAREN)?
      insertSource
      returningClause?
    ;

insertSource
    : VALUES valuesList        # insertValues
    | selectStmt                # insertFromSelect
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

// ============================================================
// 3) UPDATE  (equivalente a UpdateStmt)
// ============================================================

updateStmt
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

// ============================================================
// 4) DELETE  (equivalente a DeleteStmt)
// ============================================================

deleteStmt
    : DELETE FROM ONLY? qualifiedName (AS? identifier)?
      usingClause?
      whereClause?
      returningClause?
    ;

usingClause
    : USING fromList
    ;

// ============================================================
// 5) CREATE TABLE  (equivalente a CreateStmt)
// ============================================================

createTableStmt
    : CREATE (TEMP | TEMPORARY)? TABLE (IF NOT EXISTS)? qualifiedName
      LPAREN tableElementList RPAREN
    ;

tableElementList
    : tableElement (COMMA tableElement)*
    ;

tableElement
    : columnDef          # tableElementColumn
    | tableConstraint     # tableElementConstraint
    ;

columnDef
    : columnName dataType columnConstraint*
    ;

columnConstraint
    : NOT NULL                                              # colConstraintNotNull
    | NULL                                                   # colConstraintNull
    | DEFAULT expr                                            # colConstraintDefault
    | PRIMARY KEY                                              # colConstraintPrimaryKey
    | UNIQUE                                                    # colConstraintUnique
    | CHECK LPAREN expr RPAREN                                   # colConstraintCheck
    | REFERENCES qualifiedName (LPAREN columnName RPAREN)?         # colConstraintReferences
    ;

// Nota: el prefijo opcional "CONSTRAINT nombre" se repite en cada
// alternativa porque ANTLR4 solo permite etiquetar (#) alternativas
// de nivel superior, no ramas anidadas dentro de un grupo.
tableConstraint
    : (CONSTRAINT identifier)? PRIMARY KEY LPAREN columnList RPAREN                                          # tblConstraintPrimaryKey
    | (CONSTRAINT identifier)? UNIQUE LPAREN columnList RPAREN                                                # tblConstraintUnique
    | (CONSTRAINT identifier)? FOREIGN KEY LPAREN columnList RPAREN REFERENCES qualifiedName (LPAREN columnList RPAREN)?  # tblConstraintForeignKey
    | (CONSTRAINT identifier)? CHECK LPAREN expr RPAREN                                                        # tblConstraintCheck
    ;

// data_type / Typename simplificado
dataType
    : baseType (LBRACKET RBRACKET)*   # dataTypeBracketArray
    | baseType ARRAY                   # dataTypeKeywordArray
    ;

baseType
    : INTEGER                                                     # typeInteger
    | INT                                                          # typeInt
    | SMALLINT                                                      # typeSmallint
    | BIGINT                                                         # typeBigint
    | SERIAL                                                          # typeSerial
    | BIGSERIAL                                                        # typeBigserial
    | (NUMERIC | DECIMAL) typeModifiers?                                # typeNumeric
    | REAL                                                                # typeReal
    | DOUBLE PRECISION                                                     # typeDouble
    | FLOAT typeModifiers?                                                  # typeFloat
    | (VARCHAR | CHARACTER VARYING) typeModifiers?                           # typeVarchar
    | (CHAR | CHARACTER) typeModifiers?                                       # typeChar
    | TEXT                                                                     # typeText
    | (BOOLEAN | BOOL)                                                          # typeBoolean
    | DATE                                                                       # typeDate
    | TIME typeModifiers? ((WITH | WITHOUT) TIME ZONE)?                          # typeTime
    | TIMESTAMP typeModifiers? ((WITH | WITHOUT) TIME ZONE)?                      # typeTimestamp
    | INTERVAL                                                                     # typeInterval
    | UUID                                                                          # typeUuid
    | (JSON | JSONB)                                                                 # typeJson
    | BYTEA                                                                           # typeBytea
    | identifier                                                                       # typeUserDefined
    ;

typeModifiers
    : LPAREN INTEGER_LITERAL (COMMA INTEGER_LITERAL)? RPAREN
    ;

// ============================================================
// 6) ALTER TABLE  (equivalente a AlterTableStmt)
// ============================================================

alterTableStmt
    : ALTER TABLE (IF EXISTS)? qualifiedName alterTableAction (COMMA alterTableAction)*
    ;

alterTableAction
    : ADD COLUMN? (IF NOT EXISTS)? columnDef                       # actionAddColumn
    | DROP COLUMN? (IF EXISTS)? columnName (CASCADE | RESTRICT)?    # actionDropColumn
    | ALTER COLUMN? columnName alterColumnAction                     # actionAlterColumn
    | ADD tableConstraint                                              # actionAddConstraint
    | RENAME TO newTable=identifier                                     # actionRenameTable
    | RENAME COLUMN? columnName TO newColumn=identifier                  # actionRenameColumn
    ;

alterColumnAction
    : SET DEFAULT expr    # colActionSetDefault
    | DROP DEFAULT         # colActionDropDefault
    | SET NOT NULL           # colActionSetNotNull
    | DROP NOT NULL            # colActionDropNotNull
    | TYPE dataType               # colActionSetType
    ;

// ============================================================
// 7) DROP TABLE  (equivalente a DropStmt)
// ============================================================

dropTableStmt
    : DROP TABLE (IF EXISTS)? qualifiedNameList (CASCADE | RESTRICT)?
    ;

qualifiedNameList
    : qualifiedName (COMMA qualifiedName)*
    ;

// ============================================================
// 8) CREATE / DROP VIEW  (equivalente a ViewStmt)
// ============================================================

createViewStmt
    : CREATE (OR REPLACE)? VIEW qualifiedName (LPAREN columnList RPAREN)? AS selectStmt
    ;

dropViewStmt
    : DROP VIEW (IF EXISTS)? qualifiedNameList (CASCADE | RESTRICT)?
    ;

// ============================================================
// 9) CREATE / DROP INDEX  (equivalente a IndexStmt)
// ============================================================

createIndexStmt
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

dropIndexStmt
    : DROP INDEX (IF EXISTS)? qualifiedNameList
    ;

// ============================================================
// 10) CONTROL DE TRANSACCIONES  (equivalente a TransactionStmt)
// ============================================================

transactionStmt
    : BEGIN (TRANSACTION | WORK)?                              # beginStmt
    | COMMIT (TRANSACTION | WORK)?                              # commitStmt
    | ROLLBACK (TRANSACTION | WORK)? (TO SAVEPOINT? identifier)? # rollbackStmt
    | SAVEPOINT identifier                                        # savepointStmt
    | RELEASE SAVEPOINT? identifier                                # releaseStmt
    ;

// ============================================================
// 11) EXPRESIONES  (equivalente a a_expr / b_expr / c_expr)
//     Se usa recursion izquierda directa de ANTLR4: el orden de
//     las alternativas define la precedencia (de mayor a menor),
//     siguiendo aproximadamente la tabla de precedencia de
//     operadores documentada por PostgreSQL.
// ============================================================

expr
    : LPAREN expr RPAREN                                           # parenExpr
    | LPAREN selectStmt RPAREN                                     # subqueryExpr
    | CASE expr? whenClause+ (ELSE expr)? END                      # caseExpr
    | CAST LPAREN expr AS dataType RPAREN                          # castExpr
    | EXISTS LPAREN selectStmt RPAREN                              # existsExpr
    | columnref                                                    # columnRefExpr
    | literal                                                      # literalExpr
    | expr TYPECAST dataType                                       # typecastExpr
    | op=(PLUS | MINUS) expr                                       # unaryExpr
    | expr op=(STAR | SLASH | PERCENT) expr                        # mulDivExpr
    | expr op=(PLUS | MINUS) expr                                  # addSubExpr
    | expr CONCAT expr                                             # concatExpr
    | expr comparisonOperator expr                                 # comparisonExpr
    | expr comparisonOperator (ANY | SOME | ALL) LPAREN selectStmt RPAREN  # subqueryComparisonExpr
    | ARRAY LBRACKET exprList? RBRACKET                            # arrayConstructorExpr
    | expr NOT? BETWEEN expr AND expr                              # betweenExpr
    | expr NOT? IN LPAREN (exprList | selectStmt) RPAREN           # inExpr
    | expr NOT? (LIKE | ILIKE) expr                                # likeExpr
    | expr IS NOT? NULL                                            # isNullExpr
    | expr IS NOT? DISTINCT FROM expr                              # isDistinctExpr
    | NOT expr                                                     # notExpr
    | expr AND expr                                                # andExpr
    | expr OR expr                                                 # orExpr
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
