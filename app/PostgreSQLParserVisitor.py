# Generated from PostgreSQLParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PostgreSQLParser import PostgreSQLParser
else:
    from PostgreSQLParser import PostgreSQLParser

# This class defines a complete generic visitor for a parse tree produced by PostgreSQLParser.

class PostgreSQLParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PostgreSQLParser#program.
    def visitProgram(self, ctx:PostgreSQLParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtSelect.
    def visitStmtSelect(self, ctx:PostgreSQLParser.StmtSelectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtInsert.
    def visitStmtInsert(self, ctx:PostgreSQLParser.StmtInsertContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtUpdate.
    def visitStmtUpdate(self, ctx:PostgreSQLParser.StmtUpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtDelete.
    def visitStmtDelete(self, ctx:PostgreSQLParser.StmtDeleteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtCreateTable.
    def visitStmtCreateTable(self, ctx:PostgreSQLParser.StmtCreateTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtAlterTable.
    def visitStmtAlterTable(self, ctx:PostgreSQLParser.StmtAlterTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtDropTable.
    def visitStmtDropTable(self, ctx:PostgreSQLParser.StmtDropTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtCreateView.
    def visitStmtCreateView(self, ctx:PostgreSQLParser.StmtCreateViewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtDropView.
    def visitStmtDropView(self, ctx:PostgreSQLParser.StmtDropViewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtCreateIndex.
    def visitStmtCreateIndex(self, ctx:PostgreSQLParser.StmtCreateIndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtDropIndex.
    def visitStmtDropIndex(self, ctx:PostgreSQLParser.StmtDropIndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#stmtTransaction.
    def visitStmtTransaction(self, ctx:PostgreSQLParser.StmtTransactionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#selectStmt.
    def visitSelectStmt(self, ctx:PostgreSQLParser.SelectStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#withClause.
    def visitWithClause(self, ctx:PostgreSQLParser.WithClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#cteList.
    def visitCteList(self, ctx:PostgreSQLParser.CteListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#commonTableExpr.
    def visitCommonTableExpr(self, ctx:PostgreSQLParser.CommonTableExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#selectNoParens.
    def visitSelectNoParens(self, ctx:PostgreSQLParser.SelectNoParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#selectClause.
    def visitSelectClause(self, ctx:PostgreSQLParser.SelectClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#setOperator.
    def visitSetOperator(self, ctx:PostgreSQLParser.SetOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#simpleSelect.
    def visitSimpleSelect(self, ctx:PostgreSQLParser.SimpleSelectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#setQuantifier.
    def visitSetQuantifier(self, ctx:PostgreSQLParser.SetQuantifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#targetList.
    def visitTargetList(self, ctx:PostgreSQLParser.TargetListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#targetStar.
    def visitTargetStar(self, ctx:PostgreSQLParser.TargetStarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#targetExpr.
    def visitTargetExpr(self, ctx:PostgreSQLParser.TargetExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#fromClause.
    def visitFromClause(self, ctx:PostgreSQLParser.FromClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#fromList.
    def visitFromList(self, ctx:PostgreSQLParser.FromListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#joinedTable.
    def visitJoinedTable(self, ctx:PostgreSQLParser.JoinedTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#plainTable.
    def visitPlainTable(self, ctx:PostgreSQLParser.PlainTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#crossJoinedTable.
    def visitCrossJoinedTable(self, ctx:PostgreSQLParser.CrossJoinedTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#namedTable.
    def visitNamedTable(self, ctx:PostgreSQLParser.NamedTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#subqueryTable.
    def visitSubqueryTable(self, ctx:PostgreSQLParser.SubqueryTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#joinType.
    def visitJoinType(self, ctx:PostgreSQLParser.JoinTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#joinOn.
    def visitJoinOn(self, ctx:PostgreSQLParser.JoinOnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#joinUsing.
    def visitJoinUsing(self, ctx:PostgreSQLParser.JoinUsingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#whereClause.
    def visitWhereClause(self, ctx:PostgreSQLParser.WhereClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#groupClause.
    def visitGroupClause(self, ctx:PostgreSQLParser.GroupClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#havingClause.
    def visitHavingClause(self, ctx:PostgreSQLParser.HavingClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#windowClause.
    def visitWindowClause(self, ctx:PostgreSQLParser.WindowClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#windowDefList.
    def visitWindowDefList(self, ctx:PostgreSQLParser.WindowDefListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#windowDef.
    def visitWindowDef(self, ctx:PostgreSQLParser.WindowDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sortClause.
    def visitSortClause(self, ctx:PostgreSQLParser.SortClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sortSpec.
    def visitSortSpec(self, ctx:PostgreSQLParser.SortSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#limitClause.
    def visitLimitClause(self, ctx:PostgreSQLParser.LimitClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#offsetClause.
    def visitOffsetClause(self, ctx:PostgreSQLParser.OffsetClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#insertStmt.
    def visitInsertStmt(self, ctx:PostgreSQLParser.InsertStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#insertValues.
    def visitInsertValues(self, ctx:PostgreSQLParser.InsertValuesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#insertFromSelect.
    def visitInsertFromSelect(self, ctx:PostgreSQLParser.InsertFromSelectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#valuesList.
    def visitValuesList(self, ctx:PostgreSQLParser.ValuesListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#valuesRow.
    def visitValuesRow(self, ctx:PostgreSQLParser.ValuesRowContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#returningClause.
    def visitReturningClause(self, ctx:PostgreSQLParser.ReturningClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#updateStmt.
    def visitUpdateStmt(self, ctx:PostgreSQLParser.UpdateStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#setClauseList.
    def visitSetClauseList(self, ctx:PostgreSQLParser.SetClauseListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#setClause.
    def visitSetClause(self, ctx:PostgreSQLParser.SetClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#deleteStmt.
    def visitDeleteStmt(self, ctx:PostgreSQLParser.DeleteStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#usingClause.
    def visitUsingClause(self, ctx:PostgreSQLParser.UsingClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#createTableStmt.
    def visitCreateTableStmt(self, ctx:PostgreSQLParser.CreateTableStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableElementList.
    def visitTableElementList(self, ctx:PostgreSQLParser.TableElementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableElementColumn.
    def visitTableElementColumn(self, ctx:PostgreSQLParser.TableElementColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableElementConstraint.
    def visitTableElementConstraint(self, ctx:PostgreSQLParser.TableElementConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnDef.
    def visitColumnDef(self, ctx:PostgreSQLParser.ColumnDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintNotNull.
    def visitColConstraintNotNull(self, ctx:PostgreSQLParser.ColConstraintNotNullContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintNull.
    def visitColConstraintNull(self, ctx:PostgreSQLParser.ColConstraintNullContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintDefault.
    def visitColConstraintDefault(self, ctx:PostgreSQLParser.ColConstraintDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintPrimaryKey.
    def visitColConstraintPrimaryKey(self, ctx:PostgreSQLParser.ColConstraintPrimaryKeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintUnique.
    def visitColConstraintUnique(self, ctx:PostgreSQLParser.ColConstraintUniqueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintCheck.
    def visitColConstraintCheck(self, ctx:PostgreSQLParser.ColConstraintCheckContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colConstraintReferences.
    def visitColConstraintReferences(self, ctx:PostgreSQLParser.ColConstraintReferencesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tblConstraintPrimaryKey.
    def visitTblConstraintPrimaryKey(self, ctx:PostgreSQLParser.TblConstraintPrimaryKeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tblConstraintUnique.
    def visitTblConstraintUnique(self, ctx:PostgreSQLParser.TblConstraintUniqueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tblConstraintForeignKey.
    def visitTblConstraintForeignKey(self, ctx:PostgreSQLParser.TblConstraintForeignKeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tblConstraintCheck.
    def visitTblConstraintCheck(self, ctx:PostgreSQLParser.TblConstraintCheckContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#dataTypeBracketArray.
    def visitDataTypeBracketArray(self, ctx:PostgreSQLParser.DataTypeBracketArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#dataTypeKeywordArray.
    def visitDataTypeKeywordArray(self, ctx:PostgreSQLParser.DataTypeKeywordArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeInteger.
    def visitTypeInteger(self, ctx:PostgreSQLParser.TypeIntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeInt.
    def visitTypeInt(self, ctx:PostgreSQLParser.TypeIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeSmallint.
    def visitTypeSmallint(self, ctx:PostgreSQLParser.TypeSmallintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeBigint.
    def visitTypeBigint(self, ctx:PostgreSQLParser.TypeBigintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeSerial.
    def visitTypeSerial(self, ctx:PostgreSQLParser.TypeSerialContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeBigserial.
    def visitTypeBigserial(self, ctx:PostgreSQLParser.TypeBigserialContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeNumeric.
    def visitTypeNumeric(self, ctx:PostgreSQLParser.TypeNumericContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeReal.
    def visitTypeReal(self, ctx:PostgreSQLParser.TypeRealContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeDouble.
    def visitTypeDouble(self, ctx:PostgreSQLParser.TypeDoubleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeFloat.
    def visitTypeFloat(self, ctx:PostgreSQLParser.TypeFloatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeVarchar.
    def visitTypeVarchar(self, ctx:PostgreSQLParser.TypeVarcharContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeChar.
    def visitTypeChar(self, ctx:PostgreSQLParser.TypeCharContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeText.
    def visitTypeText(self, ctx:PostgreSQLParser.TypeTextContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeBoolean.
    def visitTypeBoolean(self, ctx:PostgreSQLParser.TypeBooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeDate.
    def visitTypeDate(self, ctx:PostgreSQLParser.TypeDateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeTime.
    def visitTypeTime(self, ctx:PostgreSQLParser.TypeTimeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeTimestamp.
    def visitTypeTimestamp(self, ctx:PostgreSQLParser.TypeTimestampContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeInterval.
    def visitTypeInterval(self, ctx:PostgreSQLParser.TypeIntervalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeUuid.
    def visitTypeUuid(self, ctx:PostgreSQLParser.TypeUuidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeJson.
    def visitTypeJson(self, ctx:PostgreSQLParser.TypeJsonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeBytea.
    def visitTypeBytea(self, ctx:PostgreSQLParser.TypeByteaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeUserDefined.
    def visitTypeUserDefined(self, ctx:PostgreSQLParser.TypeUserDefinedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeModifiers.
    def visitTypeModifiers(self, ctx:PostgreSQLParser.TypeModifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#alterTableStmt.
    def visitAlterTableStmt(self, ctx:PostgreSQLParser.AlterTableStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#actionAddColumn.
    def visitActionAddColumn(self, ctx:PostgreSQLParser.ActionAddColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#actionDropColumn.
    def visitActionDropColumn(self, ctx:PostgreSQLParser.ActionDropColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#actionAlterColumn.
    def visitActionAlterColumn(self, ctx:PostgreSQLParser.ActionAlterColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#actionAddConstraint.
    def visitActionAddConstraint(self, ctx:PostgreSQLParser.ActionAddConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#actionRenameTable.
    def visitActionRenameTable(self, ctx:PostgreSQLParser.ActionRenameTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#actionRenameColumn.
    def visitActionRenameColumn(self, ctx:PostgreSQLParser.ActionRenameColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colActionSetDefault.
    def visitColActionSetDefault(self, ctx:PostgreSQLParser.ColActionSetDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colActionDropDefault.
    def visitColActionDropDefault(self, ctx:PostgreSQLParser.ColActionDropDefaultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colActionSetNotNull.
    def visitColActionSetNotNull(self, ctx:PostgreSQLParser.ColActionSetNotNullContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colActionDropNotNull.
    def visitColActionDropNotNull(self, ctx:PostgreSQLParser.ColActionDropNotNullContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#colActionSetType.
    def visitColActionSetType(self, ctx:PostgreSQLParser.ColActionSetTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#dropTableStmt.
    def visitDropTableStmt(self, ctx:PostgreSQLParser.DropTableStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#qualifiedNameList.
    def visitQualifiedNameList(self, ctx:PostgreSQLParser.QualifiedNameListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#createViewStmt.
    def visitCreateViewStmt(self, ctx:PostgreSQLParser.CreateViewStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#dropViewStmt.
    def visitDropViewStmt(self, ctx:PostgreSQLParser.DropViewStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#createIndexStmt.
    def visitCreateIndexStmt(self, ctx:PostgreSQLParser.CreateIndexStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#indexColumnList.
    def visitIndexColumnList(self, ctx:PostgreSQLParser.IndexColumnListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#indexColumn.
    def visitIndexColumn(self, ctx:PostgreSQLParser.IndexColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#dropIndexStmt.
    def visitDropIndexStmt(self, ctx:PostgreSQLParser.DropIndexStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#beginStmt.
    def visitBeginStmt(self, ctx:PostgreSQLParser.BeginStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#commitStmt.
    def visitCommitStmt(self, ctx:PostgreSQLParser.CommitStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#rollbackStmt.
    def visitRollbackStmt(self, ctx:PostgreSQLParser.RollbackStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#savepointStmt.
    def visitSavepointStmt(self, ctx:PostgreSQLParser.SavepointStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#releaseStmt.
    def visitReleaseStmt(self, ctx:PostgreSQLParser.ReleaseStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#addSubExpr.
    def visitAddSubExpr(self, ctx:PostgreSQLParser.AddSubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typecastExpr.
    def visitTypecastExpr(self, ctx:PostgreSQLParser.TypecastExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#castExpr.
    def visitCastExpr(self, ctx:PostgreSQLParser.CastExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#inExpr.
    def visitInExpr(self, ctx:PostgreSQLParser.InExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#orExpr.
    def visitOrExpr(self, ctx:PostgreSQLParser.OrExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#comparisonExpr.
    def visitComparisonExpr(self, ctx:PostgreSQLParser.ComparisonExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#subqueryExpr.
    def visitSubqueryExpr(self, ctx:PostgreSQLParser.SubqueryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnRefExpr.
    def visitColumnRefExpr(self, ctx:PostgreSQLParser.ColumnRefExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#arrayConstructorExpr.
    def visitArrayConstructorExpr(self, ctx:PostgreSQLParser.ArrayConstructorExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#existsExpr.
    def visitExistsExpr(self, ctx:PostgreSQLParser.ExistsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#parenExpr.
    def visitParenExpr(self, ctx:PostgreSQLParser.ParenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#concatExpr.
    def visitConcatExpr(self, ctx:PostgreSQLParser.ConcatExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#betweenExpr.
    def visitBetweenExpr(self, ctx:PostgreSQLParser.BetweenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#unaryExpr.
    def visitUnaryExpr(self, ctx:PostgreSQLParser.UnaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#notExpr.
    def visitNotExpr(self, ctx:PostgreSQLParser.NotExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#isDistinctExpr.
    def visitIsDistinctExpr(self, ctx:PostgreSQLParser.IsDistinctExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#isNullExpr.
    def visitIsNullExpr(self, ctx:PostgreSQLParser.IsNullExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#literalExpr.
    def visitLiteralExpr(self, ctx:PostgreSQLParser.LiteralExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#functionCallExpr.
    def visitFunctionCallExpr(self, ctx:PostgreSQLParser.FunctionCallExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#likeExpr.
    def visitLikeExpr(self, ctx:PostgreSQLParser.LikeExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#caseExpr.
    def visitCaseExpr(self, ctx:PostgreSQLParser.CaseExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#subqueryComparisonExpr.
    def visitSubqueryComparisonExpr(self, ctx:PostgreSQLParser.SubqueryComparisonExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#mulDivExpr.
    def visitMulDivExpr(self, ctx:PostgreSQLParser.MulDivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#andExpr.
    def visitAndExpr(self, ctx:PostgreSQLParser.AndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:PostgreSQLParser.ComparisonOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#whenClause.
    def visitWhenClause(self, ctx:PostgreSQLParser.WhenClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#functionCall.
    def visitFunctionCall(self, ctx:PostgreSQLParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#functionName.
    def visitFunctionName(self, ctx:PostgreSQLParser.FunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#overClause.
    def visitOverClause(self, ctx:PostgreSQLParser.OverClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#overClauseBody.
    def visitOverClauseBody(self, ctx:PostgreSQLParser.OverClauseBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnref.
    def visitColumnref(self, ctx:PostgreSQLParser.ColumnrefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#qualifiedName.
    def visitQualifiedName(self, ctx:PostgreSQLParser.QualifiedNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnName.
    def visitColumnName(self, ctx:PostgreSQLParser.ColumnNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnList.
    def visitColumnList(self, ctx:PostgreSQLParser.ColumnListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#exprList.
    def visitExprList(self, ctx:PostgreSQLParser.ExprListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#literal.
    def visitLiteral(self, ctx:PostgreSQLParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnLabel.
    def visitColumnLabel(self, ctx:PostgreSQLParser.ColumnLabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#identifier.
    def visitIdentifier(self, ctx:PostgreSQLParser.IdentifierContext):
        return self.visitChildren(ctx)



del PostgreSQLParser