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


    # Visit a parse tree produced by PostgreSQLParser#stmt.
    def visitStmt(self, ctx:PostgreSQLParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaSelect.
    def visitSentenciaSelect(self, ctx:PostgreSQLParser.SentenciaSelectContext):
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


    # Visit a parse tree produced by PostgreSQLParser#targetEl.
    def visitTargetEl(self, ctx:PostgreSQLParser.TargetElContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#fromClause.
    def visitFromClause(self, ctx:PostgreSQLParser.FromClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#fromList.
    def visitFromList(self, ctx:PostgreSQLParser.FromListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableRef.
    def visitTableRef(self, ctx:PostgreSQLParser.TableRefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tablePrimary.
    def visitTablePrimary(self, ctx:PostgreSQLParser.TablePrimaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#joinType.
    def visitJoinType(self, ctx:PostgreSQLParser.JoinTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#joinQualifier.
    def visitJoinQualifier(self, ctx:PostgreSQLParser.JoinQualifierContext):
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


    # Visit a parse tree produced by PostgreSQLParser#sentenciaInsert.
    def visitSentenciaInsert(self, ctx:PostgreSQLParser.SentenciaInsertContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#insertSource.
    def visitInsertSource(self, ctx:PostgreSQLParser.InsertSourceContext):
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


    # Visit a parse tree produced by PostgreSQLParser#sentenciaUpdate.
    def visitSentenciaUpdate(self, ctx:PostgreSQLParser.SentenciaUpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#setClauseList.
    def visitSetClauseList(self, ctx:PostgreSQLParser.SetClauseListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#setClause.
    def visitSetClause(self, ctx:PostgreSQLParser.SetClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaDelete.
    def visitSentenciaDelete(self, ctx:PostgreSQLParser.SentenciaDeleteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#usingClause.
    def visitUsingClause(self, ctx:PostgreSQLParser.UsingClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaCrearTabla.
    def visitSentenciaCrearTabla(self, ctx:PostgreSQLParser.SentenciaCrearTablaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableElementList.
    def visitTableElementList(self, ctx:PostgreSQLParser.TableElementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableElement.
    def visitTableElement(self, ctx:PostgreSQLParser.TableElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnDef.
    def visitColumnDef(self, ctx:PostgreSQLParser.ColumnDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#columnConstraint.
    def visitColumnConstraint(self, ctx:PostgreSQLParser.ColumnConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#tableConstraint.
    def visitTableConstraint(self, ctx:PostgreSQLParser.TableConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#dataType.
    def visitDataType(self, ctx:PostgreSQLParser.DataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#baseType.
    def visitBaseType(self, ctx:PostgreSQLParser.BaseTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#typeModifiers.
    def visitTypeModifiers(self, ctx:PostgreSQLParser.TypeModifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaAlterTable.
    def visitSentenciaAlterTable(self, ctx:PostgreSQLParser.SentenciaAlterTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#alterTableAction.
    def visitAlterTableAction(self, ctx:PostgreSQLParser.AlterTableActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#alterColumnAction.
    def visitAlterColumnAction(self, ctx:PostgreSQLParser.AlterColumnActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaDropTable.
    def visitSentenciaDropTable(self, ctx:PostgreSQLParser.SentenciaDropTableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#qualifiedNameList.
    def visitQualifiedNameList(self, ctx:PostgreSQLParser.QualifiedNameListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaCreateView.
    def visitSentenciaCreateView(self, ctx:PostgreSQLParser.SentenciaCreateViewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaDropView.
    def visitSentenciaDropView(self, ctx:PostgreSQLParser.SentenciaDropViewContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaCreateIndex.
    def visitSentenciaCreateIndex(self, ctx:PostgreSQLParser.SentenciaCreateIndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#indexColumnList.
    def visitIndexColumnList(self, ctx:PostgreSQLParser.IndexColumnListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#indexColumn.
    def visitIndexColumn(self, ctx:PostgreSQLParser.IndexColumnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaDropIndex.
    def visitSentenciaDropIndex(self, ctx:PostgreSQLParser.SentenciaDropIndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#sentenciaTransaccion.
    def visitSentenciaTransaccion(self, ctx:PostgreSQLParser.SentenciaTransaccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#expr.
    def visitExpr(self, ctx:PostgreSQLParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:PostgreSQLParser.ComparisonOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSQLParser#whenClause.
    def visitWhenClause(self, ctx:PostgreSQLParser.WhenClauseContext):
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