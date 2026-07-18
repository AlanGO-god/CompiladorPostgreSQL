// Generated from c:/Users/lugor/OneDrive/Documentos/Proyecto LyA2_2/CompiladorPostgreSQL/grammar/PostgreSQLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PostgreSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AS=4, DISTINCT=5, ALL=6, INTO=7, GROUP=8, BY=9, 
		HAVING=10, ORDER=11, ASC=12, DESC=13, NULLS=14, FIRST=15, LAST=16, LIMIT=17, 
		OFFSET=18, UNION=19, INTERSECT=20, EXCEPT=21, WITH=22, RECURSIVE=23, OVER=24, 
		PARTITION=25, WINDOW=26, JOIN=27, INNER=28, LEFT=29, RIGHT=30, FULL=31, 
		OUTER=32, CROSS=33, ON=34, USING=35, ONLY=36, INSERT=37, VALUES=38, UPDATE=39, 
		SET=40, DELETE=41, RETURNING=42, CREATE=43, ALTER=44, DROP=45, TABLE=46, 
		VIEW=47, INDEX=48, TEMP=49, TEMPORARY=50, IF=51, EXISTS=52, CASCADE=53, 
		RESTRICT=54, ADD=55, COLUMN=56, RENAME=57, TO=58, CONSTRAINT=59, PRIMARY=60, 
		KEY=61, FOREIGN=62, REFERENCES=63, UNIQUE=64, DEFAULT=65, CHECK=66, REPLACE=67, 
		TYPE=68, BEGIN=69, COMMIT=70, ROLLBACK=71, TRANSACTION=72, WORK=73, SAVEPOINT=74, 
		RELEASE=75, AND=76, OR=77, NOT=78, IN=79, BETWEEN=80, LIKE=81, ILIKE=82, 
		IS=83, NULL=84, TRUE=85, FALSE=86, CASE=87, WHEN=88, THEN=89, ELSE=90, 
		END=91, CAST=92, ANY=93, SOME=94, INTEGER=95, INT=96, SMALLINT=97, BIGINT=98, 
		SERIAL=99, BIGSERIAL=100, NUMERIC=101, DECIMAL=102, REAL=103, DOUBLE=104, 
		PRECISION=105, FLOAT=106, VARCHAR=107, CHARACTER=108, VARYING=109, CHAR=110, 
		TEXT=111, BOOLEAN=112, BOOL=113, DATE=114, TIME=115, TIMESTAMP=116, ZONE=117, 
		WITHOUT=118, INTERVAL=119, UUID=120, JSON=121, JSONB=122, BYTEA=123, ARRAY=124, 
		EQ=125, NEQ=126, LE=127, GE=128, LT=129, GT=130, PLUS=131, MINUS=132, 
		STAR=133, SLASH=134, PERCENT=135, CONCAT=136, TYPECAST=137, DOT=138, COMMA=139, 
		SEMI=140, LPAREN=141, RPAREN=142, LBRACKET=143, RBRACKET=144, INTEGER_LITERAL=145, 
		NUMERIC_LITERAL=146, STRING=147, ESTRING=148, QUOTED_IDENTIFIER=149, IDENTIFIER=150, 
		LINE_COMMENT=151, BLOCK_COMMENT=152, WS=153;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_selectStmt = 2, RULE_withClause = 3, 
		RULE_cteList = 4, RULE_commonTableExpr = 5, RULE_selectNoParens = 6, RULE_selectClause = 7, 
		RULE_setOperator = 8, RULE_simpleSelect = 9, RULE_setQuantifier = 10, 
		RULE_targetList = 11, RULE_targetEl = 12, RULE_fromClause = 13, RULE_fromList = 14, 
		RULE_tableRef = 15, RULE_tablePrimary = 16, RULE_joinType = 17, RULE_joinQualifier = 18, 
		RULE_whereClause = 19, RULE_groupClause = 20, RULE_havingClause = 21, 
		RULE_windowClause = 22, RULE_windowDefList = 23, RULE_windowDef = 24, 
		RULE_sortClause = 25, RULE_sortSpec = 26, RULE_limitClause = 27, RULE_offsetClause = 28, 
		RULE_insertStmt = 29, RULE_insertSource = 30, RULE_valuesList = 31, RULE_valuesRow = 32, 
		RULE_returningClause = 33, RULE_updateStmt = 34, RULE_setClauseList = 35, 
		RULE_setClause = 36, RULE_deleteStmt = 37, RULE_usingClause = 38, RULE_createTableStmt = 39, 
		RULE_tableElementList = 40, RULE_tableElement = 41, RULE_columnDef = 42, 
		RULE_columnConstraint = 43, RULE_tableConstraint = 44, RULE_dataType = 45, 
		RULE_baseType = 46, RULE_typeModifiers = 47, RULE_alterTableStmt = 48, 
		RULE_alterTableAction = 49, RULE_alterColumnAction = 50, RULE_dropTableStmt = 51, 
		RULE_qualifiedNameList = 52, RULE_createViewStmt = 53, RULE_dropViewStmt = 54, 
		RULE_createIndexStmt = 55, RULE_indexColumnList = 56, RULE_indexColumn = 57, 
		RULE_dropIndexStmt = 58, RULE_transactionStmt = 59, RULE_expr = 60, RULE_comparisonOperator = 61, 
		RULE_whenClause = 62, RULE_functionName = 63, RULE_overClause = 64, RULE_overClauseBody = 65, 
		RULE_columnref = 66, RULE_qualifiedName = 67, RULE_columnName = 68, RULE_columnList = 69, 
		RULE_exprList = 70, RULE_literal = 71, RULE_columnLabel = 72, RULE_identifier = 73;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "selectStmt", "withClause", "cteList", "commonTableExpr", 
			"selectNoParens", "selectClause", "setOperator", "simpleSelect", "setQuantifier", 
			"targetList", "targetEl", "fromClause", "fromList", "tableRef", "tablePrimary", 
			"joinType", "joinQualifier", "whereClause", "groupClause", "havingClause", 
			"windowClause", "windowDefList", "windowDef", "sortClause", "sortSpec", 
			"limitClause", "offsetClause", "insertStmt", "insertSource", "valuesList", 
			"valuesRow", "returningClause", "updateStmt", "setClauseList", "setClause", 
			"deleteStmt", "usingClause", "createTableStmt", "tableElementList", "tableElement", 
			"columnDef", "columnConstraint", "tableConstraint", "dataType", "baseType", 
			"typeModifiers", "alterTableStmt", "alterTableAction", "alterColumnAction", 
			"dropTableStmt", "qualifiedNameList", "createViewStmt", "dropViewStmt", 
			"createIndexStmt", "indexColumnList", "indexColumn", "dropIndexStmt", 
			"transactionStmt", "expr", "comparisonOperator", "whenClause", "functionName", 
			"overClause", "overClauseBody", "columnref", "qualifiedName", "columnName", 
			"columnList", "exprList", "literal", "columnLabel", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'='", null, "'<='", "'>='", "'<'", "'>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'::'", "'.'", "','", "';'", 
			"'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "AS", "DISTINCT", "ALL", "INTO", "GROUP", 
			"BY", "HAVING", "ORDER", "ASC", "DESC", "NULLS", "FIRST", "LAST", "LIMIT", 
			"OFFSET", "UNION", "INTERSECT", "EXCEPT", "WITH", "RECURSIVE", "OVER", 
			"PARTITION", "WINDOW", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "OUTER", 
			"CROSS", "ON", "USING", "ONLY", "INSERT", "VALUES", "UPDATE", "SET", 
			"DELETE", "RETURNING", "CREATE", "ALTER", "DROP", "TABLE", "VIEW", "INDEX", 
			"TEMP", "TEMPORARY", "IF", "EXISTS", "CASCADE", "RESTRICT", "ADD", "COLUMN", 
			"RENAME", "TO", "CONSTRAINT", "PRIMARY", "KEY", "FOREIGN", "REFERENCES", 
			"UNIQUE", "DEFAULT", "CHECK", "REPLACE", "TYPE", "BEGIN", "COMMIT", "ROLLBACK", 
			"TRANSACTION", "WORK", "SAVEPOINT", "RELEASE", "AND", "OR", "NOT", "IN", 
			"BETWEEN", "LIKE", "ILIKE", "IS", "NULL", "TRUE", "FALSE", "CASE", "WHEN", 
			"THEN", "ELSE", "END", "CAST", "ANY", "SOME", "INTEGER", "INT", "SMALLINT", 
			"BIGINT", "SERIAL", "BIGSERIAL", "NUMERIC", "DECIMAL", "REAL", "DOUBLE", 
			"PRECISION", "FLOAT", "VARCHAR", "CHARACTER", "VARYING", "CHAR", "TEXT", 
			"BOOLEAN", "BOOL", "DATE", "TIME", "TIMESTAMP", "ZONE", "WITHOUT", "INTERVAL", 
			"UUID", "JSON", "JSONB", "BYTEA", "ARRAY", "EQ", "NEQ", "LE", "GE", "LT", 
			"GT", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "CONCAT", "TYPECAST", 
			"DOT", "COMMA", "SEMI", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "INTEGER_LITERAL", 
			"NUMERIC_LITERAL", "STRING", "ESTRING", "QUOTED_IDENTIFIER", "IDENTIFIER", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PostgreSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode EOF() { return getToken(PostgreSQLParser.EOF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PostgreSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PostgreSQLParser.SEMI, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			stmt();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(SEMI);
					setState(150);
					stmt();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(156);
				match(SEMI);
				}
			}

			setState(159);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCreateIndexContext extends StmtContext {
		public CreateIndexStmtContext createIndexStmt() {
			return getRuleContext(CreateIndexStmtContext.class,0);
		}
		public StmtCreateIndexContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDropTableContext extends StmtContext {
		public DropTableStmtContext dropTableStmt() {
			return getRuleContext(DropTableStmtContext.class,0);
		}
		public StmtDropTableContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSelectContext extends StmtContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public StmtSelectContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDropViewContext extends StmtContext {
		public DropViewStmtContext dropViewStmt() {
			return getRuleContext(DropViewStmtContext.class,0);
		}
		public StmtDropViewContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtTransactionContext extends StmtContext {
		public TransactionStmtContext transactionStmt() {
			return getRuleContext(TransactionStmtContext.class,0);
		}
		public StmtTransactionContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInsertContext extends StmtContext {
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public StmtInsertContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtUpdateContext extends StmtContext {
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public StmtUpdateContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCreateTableContext extends StmtContext {
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public StmtCreateTableContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDropIndexContext extends StmtContext {
		public DropIndexStmtContext dropIndexStmt() {
			return getRuleContext(DropIndexStmtContext.class,0);
		}
		public StmtDropIndexContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAlterTableContext extends StmtContext {
		public AlterTableStmtContext alterTableStmt() {
			return getRuleContext(AlterTableStmtContext.class,0);
		}
		public StmtAlterTableContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDeleteContext extends StmtContext {
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public StmtDeleteContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCreateViewContext extends StmtContext {
		public CreateViewStmtContext createViewStmt() {
			return getRuleContext(CreateViewStmtContext.class,0);
		}
		public StmtCreateViewContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StmtSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				selectStmt();
				}
				break;
			case 2:
				_localctx = new StmtInsertContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				insertStmt();
				}
				break;
			case 3:
				_localctx = new StmtUpdateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				updateStmt();
				}
				break;
			case 4:
				_localctx = new StmtDeleteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				deleteStmt();
				}
				break;
			case 5:
				_localctx = new StmtCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				createTableStmt();
				}
				break;
			case 6:
				_localctx = new StmtAlterTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				alterTableStmt();
				}
				break;
			case 7:
				_localctx = new StmtDropTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				dropTableStmt();
				}
				break;
			case 8:
				_localctx = new StmtCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				createViewStmt();
				}
				break;
			case 9:
				_localctx = new StmtDropViewContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				dropViewStmt();
				}
				break;
			case 10:
				_localctx = new StmtCreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				createIndexStmt();
				}
				break;
			case 11:
				_localctx = new StmtDropIndexContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				dropIndexStmt();
				}
				break;
			case 12:
				_localctx = new StmtTransactionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				transactionStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStmtContext extends ParserRuleContext {
		public SelectNoParensContext selectNoParens() {
			return getRuleContext(SelectNoParensContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(175);
				withClause();
				}
			}

			setState(178);
			selectNoParens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public CteListContext cteList() {
			return getRuleContext(CteListContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(PostgreSQLParser.RECURSIVE, 0); }
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WITH);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(181);
				match(RECURSIVE);
				}
			}

			setState(184);
			cteList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteListContext extends ParserRuleContext {
		public List<CommonTableExprContext> commonTableExpr() {
			return getRuleContexts(CommonTableExprContext.class);
		}
		public CommonTableExprContext commonTableExpr(int i) {
			return getRuleContext(CommonTableExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public CteListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteList; }
	}

	public final CteListContext cteList() throws RecognitionException {
		CteListContext _localctx = new CteListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cteList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			commonTableExpr();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				commonTableExpr();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommonTableExprContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PostgreSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PostgreSQLParser.LPAREN, i);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PostgreSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PostgreSQLParser.RPAREN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public CommonTableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonTableExpr; }
	}

	public final CommonTableExprContext commonTableExpr() throws RecognitionException {
		CommonTableExprContext _localctx = new CommonTableExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commonTableExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((CommonTableExprContext)_localctx).name = identifier();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(195);
				match(LPAREN);
				setState(196);
				columnList();
				setState(197);
				match(RPAREN);
				}
			}

			setState(201);
			match(AS);
			setState(202);
			match(LPAREN);
			setState(203);
			selectStmt();
			setState(204);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectNoParensContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<SetOperatorContext> setOperator() {
			return getRuleContexts(SetOperatorContext.class);
		}
		public SetOperatorContext setOperator(int i) {
			return getRuleContext(SetOperatorContext.class,i);
		}
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public SelectNoParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectNoParens; }
	}

	public final SelectNoParensContext selectNoParens() throws RecognitionException {
		SelectNoParensContext _localctx = new SelectNoParensContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectNoParens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			selectClause();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				{
				setState(207);
				setOperator();
				setState(208);
				selectClause();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(215);
				sortClause();
				}
			}

			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(218);
				limitClause();
				}
			}

			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(221);
				offsetClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public SimpleSelectContext simpleSelect() {
			return getRuleContext(SimpleSelectContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public SelectNoParensContext selectNoParens() {
			return getRuleContext(SelectNoParensContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectClause);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				simpleSelect();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(LPAREN);
				setState(226);
				selectNoParens();
				setState(227);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOperatorContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(PostgreSQLParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(PostgreSQLParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(PostgreSQLParser.EXCEPT, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public SetOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperator; }
	}

	public final SetOperatorContext setOperator() throws RecognitionException {
		SetOperatorContext _localctx = new SetOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(232);
				match(ALL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLParser.SELECT, 0); }
		public TargetListContext targetList() {
			return getRuleContext(TargetListContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public SimpleSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelect; }
	}

	public final SimpleSelectContext simpleSelect() throws RecognitionException {
		SimpleSelectContext _localctx = new SimpleSelectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SELECT);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(236);
				setQuantifier();
				}
			}

			setState(239);
			targetList();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(240);
				fromClause();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(243);
				whereClause();
				}
			}

			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(246);
				groupClause();
				}
			}

			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(249);
				havingClause();
				}
			}

			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(252);
				windowClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(PostgreSQLParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetListContext extends ParserRuleContext {
		public List<TargetElContext> targetEl() {
			return getRuleContexts(TargetElContext.class);
		}
		public TargetElContext targetEl(int i) {
			return getRuleContext(TargetElContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public TargetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetList; }
	}

	public final TargetListContext targetList() throws RecognitionException {
		TargetListContext _localctx = new TargetListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_targetList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			targetEl();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				setState(259);
				targetEl();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetElContext extends ParserRuleContext {
		public TargetElContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetEl; }
	 
		public TargetElContext() { }
		public void copyFrom(TargetElContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TargetStarContext extends TargetElContext {
		public TerminalNode STAR() { return getToken(PostgreSQLParser.STAR, 0); }
		public TargetStarContext(TargetElContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TargetExprContext extends TargetElContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ColumnLabelContext columnLabel() {
			return getRuleContext(ColumnLabelContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public TargetExprContext(TargetElContext ctx) { copyFrom(ctx); }
	}

	public final TargetElContext targetEl() throws RecognitionException {
		TargetElContext _localctx = new TargetElContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_targetEl);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new TargetStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(STAR);
				}
				break;
			case EXISTS:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case CASE:
			case CAST:
			case ARRAY:
			case PLUS:
			case MINUS:
			case LPAREN:
			case INTEGER_LITERAL:
			case NUMERIC_LITERAL:
			case STRING:
			case ESTRING:
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
				_localctx = new TargetExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				expr(0);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
					{
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(267);
						match(AS);
						}
					}

					setState(270);
					columnLabel();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public FromListContext fromList() {
			return getRuleContext(FromListContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FROM);
			setState(276);
			fromList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromListContext extends ParserRuleContext {
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public FromListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromList; }
	}

	public final FromListContext fromList() throws RecognitionException {
		FromListContext _localctx = new FromListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fromList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			tableRef(0);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				tableRef(0);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableRefContext extends ParserRuleContext {
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
	 
		public TableRefContext() { }
		public void copyFrom(TableRefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JoinedTableContext extends TableRefContext {
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(PostgreSQLParser.JOIN, 0); }
		public JoinQualifierContext joinQualifier() {
			return getRuleContext(JoinQualifierContext.class,0);
		}
		public JoinedTableContext(TableRefContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainTableContext extends TableRefContext {
		public TablePrimaryContext tablePrimary() {
			return getRuleContext(TablePrimaryContext.class,0);
		}
		public PlainTableContext(TableRefContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CrossJoinedTableContext extends TableRefContext {
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(PostgreSQLParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(PostgreSQLParser.JOIN, 0); }
		public CrossJoinedTableContext(TableRefContext ctx) { copyFrom(ctx); }
	}

	public final TableRefContext tableRef() throws RecognitionException {
		return tableRef(0);
	}

	private TableRefContext tableRef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableRefContext _localctx = new TableRefContext(_ctx, _parentState);
		TableRefContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_tableRef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PlainTableContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(287);
			tablePrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new CrossJoinedTableContext(new TableRefContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_tableRef);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						match(CROSS);
						setState(291);
						match(JOIN);
						setState(292);
						tableRef(3);
						}
						break;
					case 2:
						{
						_localctx = new JoinedTableContext(new TableRefContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_tableRef);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						joinType();
						setState(295);
						match(JOIN);
						setState(296);
						tableRef(0);
						setState(297);
						joinQualifier();
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePrimaryContext extends ParserRuleContext {
		public TablePrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimary; }
	 
		public TablePrimaryContext() { }
		public void copyFrom(TablePrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedTableContext extends TablePrimaryContext {
		public IdentifierContext alias;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public NamedTableContext(TablePrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryTableContext extends TablePrimaryContext {
		public IdentifierContext alias;
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public SubqueryTableContext(TablePrimaryContext ctx) { copyFrom(ctx); }
	}

	public final TablePrimaryContext tablePrimary() throws RecognitionException {
		TablePrimaryContext _localctx = new TablePrimaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tablePrimary);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
				_localctx = new NamedTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				qualifiedName();
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(305);
						match(AS);
						}
					}

					setState(308);
					((NamedTableContext)_localctx).alias = identifier();
					}
					break;
				}
				}
				break;
			case LPAREN:
				_localctx = new SubqueryTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(LPAREN);
				setState(312);
				selectStmt();
				setState(313);
				match(RPAREN);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(314);
					match(AS);
					}
				}

				setState(317);
				((SubqueryTableContext)_localctx).alias = identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(PostgreSQLParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(PostgreSQLParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_joinType);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(321);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(LEFT);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(325);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(RIGHT);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(329);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(FULL);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(333);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinQualifierContext extends ParserRuleContext {
		public JoinQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinQualifier; }
	 
		public JoinQualifierContext() { }
		public void copyFrom(JoinQualifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JoinUsingContext extends JoinQualifierContext {
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public JoinUsingContext(JoinQualifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JoinOnContext extends JoinQualifierContext {
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JoinOnContext(JoinQualifierContext ctx) { copyFrom(ctx); }
	}

	public final JoinQualifierContext joinQualifier() throws RecognitionException {
		JoinQualifierContext _localctx = new JoinQualifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinQualifier);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				_localctx = new JoinOnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(ON);
				setState(339);
				expr(0);
				}
				break;
			case USING:
				_localctx = new JoinUsingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(USING);
				setState(341);
				match(LPAREN);
				setState(342);
				columnList();
				setState(343);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(WHERE);
			setState(348);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(PostgreSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(GROUP);
			setState(351);
			match(BY);
			setState(352);
			expr(0);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				expr(0);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(PostgreSQLParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(HAVING);
			setState(361);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(PostgreSQLParser.WINDOW, 0); }
		public WindowDefListContext windowDefList() {
			return getRuleContext(WindowDefListContext.class,0);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_windowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(WINDOW);
			setState(364);
			windowDefList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefListContext extends ParserRuleContext {
		public List<WindowDefContext> windowDef() {
			return getRuleContexts(WindowDefContext.class);
		}
		public WindowDefContext windowDef(int i) {
			return getRuleContext(WindowDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public WindowDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefList; }
	}

	public final WindowDefListContext windowDefList() throws RecognitionException {
		WindowDefListContext _localctx = new WindowDefListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			windowDef();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(367);
				match(COMMA);
				setState(368);
				windowDef();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowDefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public OverClauseBodyContext overClauseBody() {
			return getRuleContext(OverClauseBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public WindowDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDef; }
	}

	public final WindowDefContext windowDef() throws RecognitionException {
		WindowDefContext _localctx = new WindowDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_windowDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			identifier();
			setState(375);
			match(AS);
			setState(376);
			match(LPAREN);
			setState(377);
			overClauseBody();
			setState(378);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(PostgreSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public List<SortSpecContext> sortSpec() {
			return getRuleContexts(SortSpecContext.class);
		}
		public SortSpecContext sortSpec(int i) {
			return getRuleContext(SortSpecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public SortClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortClause; }
	}

	public final SortClauseContext sortClause() throws RecognitionException {
		SortClauseContext _localctx = new SortClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sortClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ORDER);
			setState(381);
			match(BY);
			setState(382);
			sortSpec();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(383);
				match(COMMA);
				setState(384);
				sortSpec();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortSpecContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(PostgreSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLParser.LAST, 0); }
		public SortSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortSpec; }
	}

	public final SortSpecContext sortSpec() throws RecognitionException {
		SortSpecContext _localctx = new SortSpecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sortSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			expr(0);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(391);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(394);
				match(NULLS);
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(PostgreSQLParser.LIMIT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(LIMIT);
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(PostgreSQLParser.OFFSET, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(OFFSET);
			setState(402);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(PostgreSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PostgreSQLParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public InsertSourceContext insertSource() {
			return getRuleContext(InsertSourceContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ReturningClauseContext returningClause() {
			return getRuleContext(ReturningClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(INSERT);
			setState(405);
			match(INTO);
			setState(406);
			qualifiedName();
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(407);
				match(LPAREN);
				setState(408);
				columnList();
				setState(409);
				match(RPAREN);
				}
				break;
			}
			setState(413);
			insertSource();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(414);
				returningClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertSourceContext extends ParserRuleContext {
		public InsertSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSource; }
	 
		public InsertSourceContext() { }
		public void copyFrom(InsertSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertFromSelectContext extends InsertSourceContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public InsertFromSelectContext(InsertSourceContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsertValuesContext extends InsertSourceContext {
		public TerminalNode VALUES() { return getToken(PostgreSQLParser.VALUES, 0); }
		public ValuesListContext valuesList() {
			return getRuleContext(ValuesListContext.class,0);
		}
		public InsertValuesContext(InsertSourceContext ctx) { copyFrom(ctx); }
	}

	public final InsertSourceContext insertSource() throws RecognitionException {
		InsertSourceContext _localctx = new InsertSourceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insertSource);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				_localctx = new InsertValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(VALUES);
				setState(418);
				valuesList();
				}
				break;
			case SELECT:
			case WITH:
			case LPAREN:
				_localctx = new InsertFromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				selectStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesListContext extends ParserRuleContext {
		public List<ValuesRowContext> valuesRow() {
			return getRuleContexts(ValuesRowContext.class);
		}
		public ValuesRowContext valuesRow(int i) {
			return getRuleContext(ValuesRowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public ValuesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList; }
	}

	public final ValuesListContext valuesList() throws RecognitionException {
		ValuesListContext _localctx = new ValuesListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valuesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			valuesRow();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(423);
				match(COMMA);
				setState(424);
				valuesRow();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesRowContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ValuesRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesRow; }
	}

	public final ValuesRowContext valuesRow() throws RecognitionException {
		ValuesRowContext _localctx = new ValuesRowContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valuesRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(LPAREN);
			setState(431);
			exprList();
			setState(432);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturningClauseContext extends ParserRuleContext {
		public TerminalNode RETURNING() { return getToken(PostgreSQLParser.RETURNING, 0); }
		public TargetListContext targetList() {
			return getRuleContext(TargetListContext.class,0);
		}
		public ReturningClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningClause; }
	}

	public final ReturningClauseContext returningClause() throws RecognitionException {
		ReturningClauseContext _localctx = new ReturningClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returningClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(RETURNING);
			setState(435);
			targetList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(PostgreSQLParser.UPDATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLParser.SET, 0); }
		public SetClauseListContext setClauseList() {
			return getRuleContext(SetClauseListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturningClauseContext returningClause() {
			return getRuleContext(ReturningClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(UPDATE);
			setState(438);
			qualifiedName();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(439);
					match(AS);
					}
				}

				setState(442);
				identifier();
				}
			}

			setState(445);
			match(SET);
			setState(446);
			setClauseList();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(447);
				fromClause();
				}
			}

			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(450);
				whereClause();
				}
			}

			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(453);
				returningClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetClauseListContext extends ParserRuleContext {
		public List<SetClauseContext> setClause() {
			return getRuleContexts(SetClauseContext.class);
		}
		public SetClauseContext setClause(int i) {
			return getRuleContext(SetClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public SetClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClauseList; }
	}

	public final SetClauseListContext setClauseList() throws RecognitionException {
		SetClauseListContext _localctx = new SetClauseListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			setClause();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				setClause();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetClauseContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PostgreSQLParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			columnName();
			setState(465);
			match(EQ);
			setState(466);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(PostgreSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(PostgreSQLParser.ONLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UsingClauseContext usingClause() {
			return getRuleContext(UsingClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturningClauseContext returningClause() {
			return getRuleContext(ReturningClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(DELETE);
			setState(469);
			match(FROM);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(470);
				match(ONLY);
				}
			}

			setState(473);
			qualifiedName();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(474);
					match(AS);
					}
				}

				setState(477);
				identifier();
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(480);
				usingClause();
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(483);
				whereClause();
				}
			}

			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(486);
				returningClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public FromListContext fromList() {
			return getRuleContext(FromListContext.class,0);
		}
		public UsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingClause; }
	}

	public final UsingClauseContext usingClause() throws RecognitionException {
		UsingClauseContext _localctx = new UsingClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_usingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(USING);
			setState(490);
			fromList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public TableElementListContext tableElementList() {
			return getRuleContext(TableElementListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLParser.TEMP, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLParser.TEMPORARY, 0); }
		public CreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStmt; }
	}

	public final CreateTableStmtContext createTableStmt() throws RecognitionException {
		CreateTableStmtContext _localctx = new CreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_createTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(CREATE);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP || _la==TEMPORARY) {
				{
				setState(493);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(496);
			match(TABLE);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(497);
				match(IF);
				setState(498);
				match(NOT);
				setState(499);
				match(EXISTS);
				}
			}

			setState(502);
			qualifiedName();
			setState(503);
			match(LPAREN);
			setState(504);
			tableElementList();
			setState(505);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableElementListContext extends ParserRuleContext {
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public TableElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElementList; }
	}

	public final TableElementListContext tableElementList() throws RecognitionException {
		TableElementListContext _localctx = new TableElementListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			tableElement();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(508);
				match(COMMA);
				setState(509);
				tableElement();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableElementContext extends ParserRuleContext {
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
	 
		public TableElementContext() { }
		public void copyFrom(TableElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableElementConstraintContext extends TableElementContext {
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableElementConstraintContext(TableElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableElementColumnContext extends TableElementContext {
		public ColumnDefContext columnDef() {
			return getRuleContext(ColumnDefContext.class,0);
		}
		public TableElementColumnContext(TableElementContext ctx) { copyFrom(ctx); }
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tableElement);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
				_localctx = new TableElementColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				columnDef();
				}
				break;
			case CONSTRAINT:
			case PRIMARY:
			case FOREIGN:
			case UNIQUE:
			case CHECK:
				_localctx = new TableElementConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				tableConstraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			columnName();
			setState(520);
			dataType();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 17039481L) != 0)) {
				{
				{
				setState(521);
				columnConstraint();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	 
		public ColumnConstraintContext() { }
		public void copyFrom(ColumnConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintPrimaryKeyContext extends ColumnConstraintContext {
		public TerminalNode PRIMARY() { return getToken(PostgreSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLParser.KEY, 0); }
		public ColConstraintPrimaryKeyContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintReferencesContext extends ColumnConstraintContext {
		public TerminalNode REFERENCES() { return getToken(PostgreSQLParser.REFERENCES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ColConstraintReferencesContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintNotNullContext extends ColumnConstraintContext {
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public ColConstraintNotNullContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintCheckContext extends ColumnConstraintContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ColConstraintCheckContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintDefaultContext extends ColumnConstraintContext {
		public TerminalNode DEFAULT() { return getToken(PostgreSQLParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ColConstraintDefaultContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintUniqueContext extends ColumnConstraintContext {
		public TerminalNode UNIQUE() { return getToken(PostgreSQLParser.UNIQUE, 0); }
		public ColConstraintUniqueContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColConstraintNullContext extends ColumnConstraintContext {
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public ColConstraintNullContext(ColumnConstraintContext ctx) { copyFrom(ctx); }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_columnConstraint);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new ColConstraintNotNullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(NOT);
				setState(528);
				match(NULL);
				}
				break;
			case NULL:
				_localctx = new ColConstraintNullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(NULL);
				}
				break;
			case DEFAULT:
				_localctx = new ColConstraintDefaultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(DEFAULT);
				setState(531);
				expr(0);
				}
				break;
			case PRIMARY:
				_localctx = new ColConstraintPrimaryKeyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				match(PRIMARY);
				setState(533);
				match(KEY);
				}
				break;
			case UNIQUE:
				_localctx = new ColConstraintUniqueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				match(UNIQUE);
				}
				break;
			case CHECK:
				_localctx = new ColConstraintCheckContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				match(CHECK);
				setState(536);
				match(LPAREN);
				setState(537);
				expr(0);
				setState(538);
				match(RPAREN);
				}
				break;
			case REFERENCES:
				_localctx = new ColConstraintReferencesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(540);
				match(REFERENCES);
				setState(541);
				qualifiedName();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(542);
					match(LPAREN);
					setState(543);
					columnName();
					setState(544);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	 
		public TableConstraintContext() { }
		public void copyFrom(TableConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TblConstraintPrimaryKeyContext extends TableConstraintContext {
		public TerminalNode PRIMARY() { return getToken(PostgreSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TblConstraintPrimaryKeyContext(TableConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TblConstraintUniqueContext extends TableConstraintContext {
		public TerminalNode UNIQUE() { return getToken(PostgreSQLParser.UNIQUE, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TblConstraintUniqueContext(TableConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TblConstraintCheckContext extends TableConstraintContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TblConstraintCheckContext(TableConstraintContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TblConstraintForeignKeyContext extends TableConstraintContext {
		public TerminalNode FOREIGN() { return getToken(PostgreSQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PostgreSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PostgreSQLParser.LPAREN, i);
		}
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PostgreSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PostgreSQLParser.RPAREN, i);
		}
		public TerminalNode REFERENCES() { return getToken(PostgreSQLParser.REFERENCES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TblConstraintForeignKeyContext(TableConstraintContext ctx) { copyFrom(ctx); }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tableConstraint);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new TblConstraintPrimaryKeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(550);
					match(CONSTRAINT);
					setState(551);
					identifier();
					}
				}

				setState(554);
				match(PRIMARY);
				setState(555);
				match(KEY);
				setState(556);
				match(LPAREN);
				setState(557);
				columnList();
				setState(558);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new TblConstraintUniqueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(560);
					match(CONSTRAINT);
					setState(561);
					identifier();
					}
				}

				setState(564);
				match(UNIQUE);
				setState(565);
				match(LPAREN);
				setState(566);
				columnList();
				setState(567);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new TblConstraintForeignKeyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(569);
					match(CONSTRAINT);
					setState(570);
					identifier();
					}
				}

				setState(573);
				match(FOREIGN);
				setState(574);
				match(KEY);
				setState(575);
				match(LPAREN);
				setState(576);
				columnList();
				setState(577);
				match(RPAREN);
				setState(578);
				match(REFERENCES);
				setState(579);
				qualifiedName();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(580);
					match(LPAREN);
					setState(581);
					columnList();
					setState(582);
					match(RPAREN);
					}
				}

				}
				break;
			case 4:
				_localctx = new TblConstraintCheckContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(586);
					match(CONSTRAINT);
					setState(587);
					identifier();
					}
				}

				setState(590);
				match(CHECK);
				setState(591);
				match(LPAREN);
				setState(592);
				expr(0);
				setState(593);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeBracketArrayContext extends DataTypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(PostgreSQLParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(PostgreSQLParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(PostgreSQLParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(PostgreSQLParser.RBRACKET, i);
		}
		public DataTypeBracketArrayContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeKeywordArrayContext extends DataTypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PostgreSQLParser.ARRAY, 0); }
		public DataTypeKeywordArrayContext(DataTypeContext ctx) { copyFrom(ctx); }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dataType);
		try {
			int _alt;
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new DataTypeBracketArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				baseType();
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(LBRACKET);
						setState(599);
						match(RBRACKET);
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new DataTypeKeywordArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				baseType();
				setState(606);
				match(ARRAY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeContext extends ParserRuleContext {
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	 
		public BaseTypeContext() { }
		public void copyFrom(BaseTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDateContext extends BaseTypeContext {
		public TerminalNode DATE() { return getToken(PostgreSQLParser.DATE, 0); }
		public TypeDateContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeByteaContext extends BaseTypeContext {
		public TerminalNode BYTEA() { return getToken(PostgreSQLParser.BYTEA, 0); }
		public TypeByteaContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTimestampContext extends BaseTypeContext {
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLParser.TIMESTAMP, 0); }
		public TypeModifiersContext typeModifiers() {
			return getRuleContext(TypeModifiersContext.class,0);
		}
		public TerminalNode TIME() { return getToken(PostgreSQLParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLParser.WITHOUT, 0); }
		public TypeTimestampContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeUuidContext extends BaseTypeContext {
		public TerminalNode UUID() { return getToken(PostgreSQLParser.UUID, 0); }
		public TypeUuidContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntegerContext extends BaseTypeContext {
		public TerminalNode INTEGER() { return getToken(PostgreSQLParser.INTEGER, 0); }
		public TypeIntegerContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeNumericContext extends BaseTypeContext {
		public TerminalNode NUMERIC() { return getToken(PostgreSQLParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(PostgreSQLParser.DECIMAL, 0); }
		public TypeModifiersContext typeModifiers() {
			return getRuleContext(TypeModifiersContext.class,0);
		}
		public TypeNumericContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeUserDefinedContext extends BaseTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeUserDefinedContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeJsonContext extends BaseTypeContext {
		public TerminalNode JSON() { return getToken(PostgreSQLParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(PostgreSQLParser.JSONB, 0); }
		public TypeJsonContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntervalContext extends BaseTypeContext {
		public TerminalNode INTERVAL() { return getToken(PostgreSQLParser.INTERVAL, 0); }
		public TypeIntervalContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSmallintContext extends BaseTypeContext {
		public TerminalNode SMALLINT() { return getToken(PostgreSQLParser.SMALLINT, 0); }
		public TypeSmallintContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSerialContext extends BaseTypeContext {
		public TerminalNode SERIAL() { return getToken(PostgreSQLParser.SERIAL, 0); }
		public TypeSerialContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeVarcharContext extends BaseTypeContext {
		public TerminalNode VARCHAR() { return getToken(PostgreSQLParser.VARCHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(PostgreSQLParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(PostgreSQLParser.VARYING, 0); }
		public TypeModifiersContext typeModifiers() {
			return getRuleContext(TypeModifiersContext.class,0);
		}
		public TypeVarcharContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends BaseTypeContext {
		public TerminalNode INT() { return getToken(PostgreSQLParser.INT, 0); }
		public TypeIntContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeFloatContext extends BaseTypeContext {
		public TerminalNode FLOAT() { return getToken(PostgreSQLParser.FLOAT, 0); }
		public TypeModifiersContext typeModifiers() {
			return getRuleContext(TypeModifiersContext.class,0);
		}
		public TypeFloatContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeRealContext extends BaseTypeContext {
		public TerminalNode REAL() { return getToken(PostgreSQLParser.REAL, 0); }
		public TypeRealContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTextContext extends BaseTypeContext {
		public TerminalNode TEXT() { return getToken(PostgreSQLParser.TEXT, 0); }
		public TypeTextContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTimeContext extends BaseTypeContext {
		public List<TerminalNode> TIME() { return getTokens(PostgreSQLParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(PostgreSQLParser.TIME, i);
		}
		public TypeModifiersContext typeModifiers() {
			return getRuleContext(TypeModifiersContext.class,0);
		}
		public TerminalNode ZONE() { return getToken(PostgreSQLParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLParser.WITHOUT, 0); }
		public TypeTimeContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCharContext extends BaseTypeContext {
		public TerminalNode CHAR() { return getToken(PostgreSQLParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(PostgreSQLParser.CHARACTER, 0); }
		public TypeModifiersContext typeModifiers() {
			return getRuleContext(TypeModifiersContext.class,0);
		}
		public TypeCharContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBigintContext extends BaseTypeContext {
		public TerminalNode BIGINT() { return getToken(PostgreSQLParser.BIGINT, 0); }
		public TypeBigintContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBigserialContext extends BaseTypeContext {
		public TerminalNode BIGSERIAL() { return getToken(PostgreSQLParser.BIGSERIAL, 0); }
		public TypeBigserialContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBooleanContext extends BaseTypeContext {
		public TerminalNode BOOLEAN() { return getToken(PostgreSQLParser.BOOLEAN, 0); }
		public TerminalNode BOOL() { return getToken(PostgreSQLParser.BOOL, 0); }
		public TypeBooleanContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDoubleContext extends BaseTypeContext {
		public TerminalNode DOUBLE() { return getToken(PostgreSQLParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(PostgreSQLParser.PRECISION, 0); }
		public TypeDoubleContext(BaseTypeContext ctx) { copyFrom(ctx); }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_baseType);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new TypeIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(INT);
				}
				break;
			case 3:
				_localctx = new TypeSmallintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(SMALLINT);
				}
				break;
			case 4:
				_localctx = new TypeBigintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				match(BIGINT);
				}
				break;
			case 5:
				_localctx = new TypeSerialContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(614);
				match(SERIAL);
				}
				break;
			case 6:
				_localctx = new TypeBigserialContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(615);
				match(BIGSERIAL);
				}
				break;
			case 7:
				_localctx = new TypeNumericContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(616);
				_la = _input.LA(1);
				if ( !(_la==NUMERIC || _la==DECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(617);
					typeModifiers();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(620);
				match(REAL);
				}
				break;
			case 9:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(621);
				match(DOUBLE);
				setState(622);
				match(PRECISION);
				}
				break;
			case 10:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(623);
				match(FLOAT);
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(624);
					typeModifiers();
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new TypeVarcharContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(630);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARCHAR:
					{
					setState(627);
					match(VARCHAR);
					}
					break;
				case CHARACTER:
					{
					setState(628);
					match(CHARACTER);
					setState(629);
					match(VARYING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(632);
					typeModifiers();
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(635);
				_la = _input.LA(1);
				if ( !(_la==CHARACTER || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(636);
					typeModifiers();
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new TypeTextContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(639);
				match(TEXT);
				}
				break;
			case 14:
				_localctx = new TypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(640);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==BOOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				_localctx = new TypeDateContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(641);
				match(DATE);
				}
				break;
			case 16:
				_localctx = new TypeTimeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(642);
				match(TIME);
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(643);
					typeModifiers();
					}
					break;
				}
				setState(649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(647);
					match(TIME);
					setState(648);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 17:
				_localctx = new TypeTimestampContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(651);
				match(TIMESTAMP);
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(652);
					typeModifiers();
					}
					break;
				}
				setState(658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(655);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(656);
					match(TIME);
					setState(657);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 18:
				_localctx = new TypeIntervalContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(660);
				match(INTERVAL);
				}
				break;
			case 19:
				_localctx = new TypeUuidContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(661);
				match(UUID);
				}
				break;
			case 20:
				_localctx = new TypeJsonContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==JSON || _la==JSONB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 21:
				_localctx = new TypeByteaContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(663);
				match(BYTEA);
				}
				break;
			case 22:
				_localctx = new TypeUserDefinedContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(664);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeModifiersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(PostgreSQLParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(PostgreSQLParser.INTEGER_LITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(PostgreSQLParser.COMMA, 0); }
		public TypeModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeModifiers; }
	}

	public final TypeModifiersContext typeModifiers() throws RecognitionException {
		TypeModifiersContext _localctx = new TypeModifiersContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(LPAREN);
			setState(668);
			match(INTEGER_LITERAL);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(669);
				match(COMMA);
				setState(670);
				match(INTEGER_LITERAL);
				}
			}

			setState(673);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableStmtContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public AlterTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableStmt; }
	}

	public final AlterTableStmtContext alterTableStmt() throws RecognitionException {
		AlterTableStmtContext _localctx = new AlterTableStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alterTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(ALTER);
			setState(676);
			match(TABLE);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(677);
				match(IF);
				setState(678);
				match(EXISTS);
				}
			}

			setState(681);
			qualifiedName();
			setState(682);
			alterTableAction();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(683);
				match(COMMA);
				setState(684);
				alterTableAction();
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableActionContext extends ParserRuleContext {
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
	 
		public AlterTableActionContext() { }
		public void copyFrom(AlterTableActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionAddColumnContext extends AlterTableActionContext {
		public TerminalNode ADD() { return getToken(PostgreSQLParser.ADD, 0); }
		public ColumnDefContext columnDef() {
			return getRuleContext(ColumnDefContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public ActionAddColumnContext(AlterTableActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionAddConstraintContext extends AlterTableActionContext {
		public TerminalNode ADD() { return getToken(PostgreSQLParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public ActionAddConstraintContext(AlterTableActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionRenameColumnContext extends AlterTableActionContext {
		public IdentifierContext newColumn;
		public TerminalNode RENAME() { return getToken(PostgreSQLParser.RENAME, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(PostgreSQLParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLParser.COLUMN, 0); }
		public ActionRenameColumnContext(AlterTableActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionDropColumnContext extends AlterTableActionContext {
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLParser.RESTRICT, 0); }
		public ActionDropColumnContext(AlterTableActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionAlterColumnContext extends AlterTableActionContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLParser.COLUMN, 0); }
		public ActionAlterColumnContext(AlterTableActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionRenameTableContext extends AlterTableActionContext {
		public IdentifierContext newTable;
		public TerminalNode RENAME() { return getToken(PostgreSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActionRenameTableContext(AlterTableActionContext ctx) { copyFrom(ctx); }
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alterTableAction);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new ActionAddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(ADD);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(691);
					match(COLUMN);
					}
				}

				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(694);
					match(IF);
					setState(695);
					match(NOT);
					setState(696);
					match(EXISTS);
					}
				}

				setState(699);
				columnDef();
				}
				break;
			case 2:
				_localctx = new ActionDropColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(DROP);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(701);
					match(COLUMN);
					}
				}

				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(704);
					match(IF);
					setState(705);
					match(EXISTS);
					}
				}

				setState(708);
				columnName();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(709);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 3:
				_localctx = new ActionAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				match(ALTER);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(713);
					match(COLUMN);
					}
				}

				setState(716);
				columnName();
				setState(717);
				alterColumnAction();
				}
				break;
			case 4:
				_localctx = new ActionAddConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(719);
				match(ADD);
				setState(720);
				tableConstraint();
				}
				break;
			case 5:
				_localctx = new ActionRenameTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(721);
				match(RENAME);
				setState(722);
				match(TO);
				setState(723);
				((ActionRenameTableContext)_localctx).newTable = identifier();
				}
				break;
			case 6:
				_localctx = new ActionRenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(724);
				match(RENAME);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(725);
					match(COLUMN);
					}
				}

				setState(728);
				columnName();
				setState(729);
				match(TO);
				setState(730);
				((ActionRenameColumnContext)_localctx).newColumn = identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterColumnActionContext extends ParserRuleContext {
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
	 
		public AlterColumnActionContext() { }
		public void copyFrom(AlterColumnActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColActionSetNotNullContext extends AlterColumnActionContext {
		public TerminalNode SET() { return getToken(PostgreSQLParser.SET, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public ColActionSetNotNullContext(AlterColumnActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColActionDropNotNullContext extends AlterColumnActionContext {
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public ColActionDropNotNullContext(AlterColumnActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColActionDropDefaultContext extends AlterColumnActionContext {
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLParser.DEFAULT, 0); }
		public ColActionDropDefaultContext(AlterColumnActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColActionSetDefaultContext extends AlterColumnActionContext {
		public TerminalNode SET() { return getToken(PostgreSQLParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ColActionSetDefaultContext(AlterColumnActionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColActionSetTypeContext extends AlterColumnActionContext {
		public TerminalNode TYPE() { return getToken(PostgreSQLParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ColActionSetTypeContext(AlterColumnActionContext ctx) { copyFrom(ctx); }
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alterColumnAction);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new ColActionSetDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(SET);
				setState(735);
				match(DEFAULT);
				setState(736);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ColActionDropDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(DROP);
				setState(738);
				match(DEFAULT);
				}
				break;
			case 3:
				_localctx = new ColActionSetNotNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				match(SET);
				setState(740);
				match(NOT);
				setState(741);
				match(NULL);
				}
				break;
			case 4:
				_localctx = new ColActionDropNotNullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
				match(DROP);
				setState(743);
				match(NOT);
				setState(744);
				match(NULL);
				}
				break;
			case 5:
				_localctx = new ColActionSetTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				match(TYPE);
				setState(746);
				dataType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableStmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLParser.TABLE, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLParser.RESTRICT, 0); }
		public DropTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStmt; }
	}

	public final DropTableStmtContext dropTableStmt() throws RecognitionException {
		DropTableStmtContext _localctx = new DropTableStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dropTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(DROP);
			setState(750);
			match(TABLE);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(751);
				match(IF);
				setState(752);
				match(EXISTS);
				}
			}

			setState(755);
			qualifiedNameList();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(756);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			qualifiedName();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(760);
				match(COMMA);
				setState(761);
				qualifiedName();
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(PostgreSQLParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PostgreSQLParser.REPLACE, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public CreateViewStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewStmt; }
	}

	public final CreateViewStmtContext createViewStmt() throws RecognitionException {
		CreateViewStmtContext _localctx = new CreateViewStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_createViewStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(CREATE);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(768);
				match(OR);
				setState(769);
				match(REPLACE);
				}
			}

			setState(772);
			match(VIEW);
			setState(773);
			qualifiedName();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(774);
				match(LPAREN);
				setState(775);
				columnList();
				setState(776);
				match(RPAREN);
				}
			}

			setState(780);
			match(AS);
			setState(781);
			selectStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropViewStmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(PostgreSQLParser.VIEW, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLParser.RESTRICT, 0); }
		public DropViewStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropViewStmt; }
	}

	public final DropViewStmtContext dropViewStmt() throws RecognitionException {
		DropViewStmtContext _localctx = new DropViewStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dropViewStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(DROP);
			setState(784);
			match(VIEW);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(785);
				match(IF);
				setState(786);
				match(EXISTS);
				}
			}

			setState(789);
			qualifiedNameList();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(790);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexStmtContext extends ParserRuleContext {
		public IdentifierContext indexName;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public IndexColumnListContext indexColumnList() {
			return getRuleContext(IndexColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSQLParser.UNIQUE, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CreateIndexStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexStmt; }
	}

	public final CreateIndexStmtContext createIndexStmt() throws RecognitionException {
		CreateIndexStmtContext _localctx = new CreateIndexStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_createIndexStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(CREATE);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(794);
				match(UNIQUE);
				}
			}

			setState(797);
			match(INDEX);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(798);
				match(IF);
				setState(799);
				match(NOT);
				setState(800);
				match(EXISTS);
				}
			}

			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_IDENTIFIER || _la==IDENTIFIER) {
				{
				setState(803);
				((CreateIndexStmtContext)_localctx).indexName = identifier();
				}
			}

			setState(806);
			match(ON);
			setState(807);
			qualifiedName();
			setState(808);
			match(LPAREN);
			setState(809);
			indexColumnList();
			setState(810);
			match(RPAREN);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(811);
				match(WHERE);
				setState(812);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexColumnListContext extends ParserRuleContext {
		public List<IndexColumnContext> indexColumn() {
			return getRuleContexts(IndexColumnContext.class);
		}
		public IndexColumnContext indexColumn(int i) {
			return getRuleContext(IndexColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public IndexColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnList; }
	}

	public final IndexColumnListContext indexColumnList() throws RecognitionException {
		IndexColumnListContext _localctx = new IndexColumnListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_indexColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			indexColumn();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(816);
				match(COMMA);
				setState(817);
				indexColumn();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexColumnContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLParser.DESC, 0); }
		public IndexColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumn; }
	}

	public final IndexColumnContext indexColumn() throws RecognitionException {
		IndexColumnContext _localctx = new IndexColumnContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_indexColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			columnName();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropIndexStmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLParser.INDEX, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public DropIndexStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexStmt; }
	}

	public final DropIndexStmtContext dropIndexStmt() throws RecognitionException {
		DropIndexStmtContext _localctx = new DropIndexStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_dropIndexStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(DROP);
			setState(828);
			match(INDEX);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(829);
				match(IF);
				setState(830);
				match(EXISTS);
				}
			}

			setState(833);
			qualifiedNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransactionStmtContext extends ParserRuleContext {
		public TransactionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionStmt; }
	 
		public TransactionStmtContext() { }
		public void copyFrom(TransactionStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RollbackStmtContext extends TransactionStmtContext {
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLParser.ROLLBACK, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLParser.TRANSACTION, 0); }
		public TerminalNode WORK() { return getToken(PostgreSQLParser.WORK, 0); }
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLParser.SAVEPOINT, 0); }
		public RollbackStmtContext(TransactionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReleaseStmtContext extends TransactionStmtContext {
		public TerminalNode RELEASE() { return getToken(PostgreSQLParser.RELEASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLParser.SAVEPOINT, 0); }
		public ReleaseStmtContext(TransactionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SavepointStmtContext extends TransactionStmtContext {
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLParser.SAVEPOINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SavepointStmtContext(TransactionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BeginStmtContext extends TransactionStmtContext {
		public TerminalNode BEGIN() { return getToken(PostgreSQLParser.BEGIN, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLParser.TRANSACTION, 0); }
		public TerminalNode WORK() { return getToken(PostgreSQLParser.WORK, 0); }
		public BeginStmtContext(TransactionStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommitStmtContext extends TransactionStmtContext {
		public TerminalNode COMMIT() { return getToken(PostgreSQLParser.COMMIT, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLParser.TRANSACTION, 0); }
		public TerminalNode WORK() { return getToken(PostgreSQLParser.WORK, 0); }
		public CommitStmtContext(TransactionStmtContext ctx) { copyFrom(ctx); }
	}

	public final TransactionStmtContext transactionStmt() throws RecognitionException {
		TransactionStmtContext _localctx = new TransactionStmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_transactionStmt);
		int _la;
		try {
			setState(861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				_localctx = new BeginStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				match(BEGIN);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION || _la==WORK) {
					{
					setState(836);
					_la = _input.LA(1);
					if ( !(_la==TRANSACTION || _la==WORK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case COMMIT:
				_localctx = new CommitStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(COMMIT);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION || _la==WORK) {
					{
					setState(840);
					_la = _input.LA(1);
					if ( !(_la==TRANSACTION || _la==WORK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case ROLLBACK:
				_localctx = new RollbackStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(ROLLBACK);
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION || _la==WORK) {
					{
					setState(844);
					_la = _input.LA(1);
					if ( !(_la==TRANSACTION || _la==WORK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(847);
					match(TO);
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SAVEPOINT) {
						{
						setState(848);
						match(SAVEPOINT);
						}
					}

					setState(851);
					identifier();
					}
				}

				}
				break;
			case SAVEPOINT:
				_localctx = new SavepointStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				match(SAVEPOINT);
				setState(855);
				identifier();
				}
				break;
			case RELEASE:
				_localctx = new ReleaseStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(RELEASE);
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(857);
					match(SAVEPOINT);
					}
				}

				setState(860);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PostgreSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PostgreSQLParser.MINUS, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypecastExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPECAST() { return getToken(PostgreSQLParser.TYPECAST, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypecastExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExprContext extends ExprContext {
		public TerminalNode CAST() { return getToken(PostgreSQLParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public CastExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(PostgreSQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public InExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public SubqueryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnRefExprContext extends ExprContext {
		public ColumnrefContext columnref() {
			return getRuleContext(ColumnrefContext.class,0);
		}
		public ColumnRefExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayConstructorExprContext extends ExprContext {
		public TerminalNode ARRAY() { return getToken(PostgreSQLParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(PostgreSQLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PostgreSQLParser.RBRACKET, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArrayConstructorExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(PostgreSQLParser.CONCAT, 0); }
		public ConcatExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BetweenExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(PostgreSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public BetweenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PostgreSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PostgreSQLParser.MINUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsDistinctExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IS() { return getToken(PostgreSQLParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public IsDistinctExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNullExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IS() { return getToken(PostgreSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public IsNullExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(PostgreSQLParser.ILIKE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public LikeExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseExprContext extends ExprContext {
		public TerminalNode CASE() { return getToken(PostgreSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(PostgreSQLParser.END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PostgreSQLParser.ELSE, 0); }
		public CaseExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryComparisonExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode ANY() { return getToken(PostgreSQLParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(PostgreSQLParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public SubqueryComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(PostgreSQLParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PostgreSQLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PostgreSQLParser.PERCENT, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(PostgreSQLParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(864);
				match(LPAREN);
				setState(865);
				expr(0);
				setState(866);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new SubqueryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(868);
				match(LPAREN);
				setState(869);
				selectStmt();
				setState(870);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new CaseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(872);
				match(CASE);
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 1164003246081L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 132252033L) != 0)) {
					{
					setState(873);
					expr(0);
					}
				}

				setState(877); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(876);
					whenClause();
					}
					}
					setState(879); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(881);
					match(ELSE);
					setState(882);
					expr(0);
					}
				}

				setState(885);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(887);
				match(CAST);
				setState(888);
				match(LPAREN);
				setState(889);
				expr(0);
				setState(890);
				match(AS);
				setState(891);
				dataType();
				setState(892);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(894);
				match(EXISTS);
				setState(895);
				match(LPAREN);
				setState(896);
				selectStmt();
				setState(897);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new ColumnRefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(899);
				columnref();
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(900);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(901);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(902);
				expr(15);
				}
				break;
			case 9:
				{
				_localctx = new ArrayConstructorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(903);
				match(ARRAY);
				setState(904);
				match(LBRACKET);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 1164003246081L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 132252033L) != 0)) {
					{
					setState(905);
					exprList();
					}
				}

				setState(908);
				match(RBRACKET);
				}
				break;
			case 10:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(909);
				match(NOT);
				setState(910);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(983);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(913);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(914);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 7L) != 0)) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(915);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(916);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(917);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(918);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ConcatExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(919);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(920);
						match(CONCAT);
						setState(921);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(922);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(923);
						comparisonOperator();
						setState(924);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new BetweenExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(926);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(928);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(927);
							match(NOT);
							}
						}

						setState(930);
						match(BETWEEN);
						setState(931);
						expr(0);
						setState(932);
						match(AND);
						setState(933);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new LikeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(935);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(937);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(936);
							match(NOT);
							}
						}

						setState(939);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==ILIKE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(940);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new IsDistinctExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(941);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(942);
						match(IS);
						setState(944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(943);
							match(NOT);
							}
						}

						setState(946);
						match(DISTINCT);
						setState(947);
						match(FROM);
						setState(948);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(949);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(950);
						match(AND);
						setState(951);
						expr(3);
						}
						break;
					case 9:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(952);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(953);
						match(OR);
						setState(954);
						expr(2);
						}
						break;
					case 10:
						{
						_localctx = new TypecastExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(955);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(956);
						match(TYPECAST);
						setState(957);
						dataType();
						}
						break;
					case 11:
						{
						_localctx = new SubqueryComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(958);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(959);
						comparisonOperator();
						setState(960);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(961);
						match(LPAREN);
						setState(962);
						selectStmt();
						setState(963);
						match(RPAREN);
						}
						break;
					case 12:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(965);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(967);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(966);
							match(NOT);
							}
						}

						setState(969);
						match(IN);
						setState(970);
						match(LPAREN);
						setState(973);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(971);
							exprList();
							}
							break;
						case 2:
							{
							setState(972);
							selectStmt();
							}
							break;
						}
						setState(975);
						match(RPAREN);
						}
						break;
					case 13:
						{
						_localctx = new IsNullExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(977);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(978);
						match(IS);
						setState(980);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(979);
							match(NOT);
							}
						}

						setState(982);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PostgreSQLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PostgreSQLParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PostgreSQLParser.LT, 0); }
		public TerminalNode GT() { return getToken(PostgreSQLParser.GT, 0); }
		public TerminalNode LE() { return getToken(PostgreSQLParser.LE, 0); }
		public TerminalNode GE() { return getToken(PostgreSQLParser.GE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PostgreSQLParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PostgreSQLParser.THEN, 0); }
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(WHEN);
			setState(991);
			expr(0);
			setState(992);
			match(THEN);
			setState(993);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(PostgreSQLParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public OverClauseBodyContext overClauseBody() {
			return getRuleContext(OverClauseBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_overClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(OVER);
			setState(998);
			match(LPAREN);
			setState(999);
			overClauseBody();
			setState(1000);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OverClauseBodyContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(PostgreSQLParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(PostgreSQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(PostgreSQLParser.BY, i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(PostgreSQLParser.ORDER, 0); }
		public List<SortSpecContext> sortSpec() {
			return getRuleContexts(SortSpecContext.class);
		}
		public SortSpecContext sortSpec(int i) {
			return getRuleContext(SortSpecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public OverClauseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClauseBody; }
	}

	public final OverClauseBodyContext overClauseBody() throws RecognitionException {
		OverClauseBodyContext _localctx = new OverClauseBodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_overClauseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1002);
				match(PARTITION);
				setState(1003);
				match(BY);
				setState(1004);
				exprList();
				}
			}

			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1007);
				match(ORDER);
				setState(1008);
				match(BY);
				setState(1009);
				sortSpec();
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1010);
					match(COMMA);
					setState(1011);
					sortSpec();
					}
					}
					setState(1016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnrefContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnref; }
	}

	public final ColumnrefContext columnref() throws RecognitionException {
		ColumnrefContext _localctx = new ColumnrefContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_columnref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PostgreSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PostgreSQLParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			identifier();
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022);
					match(DOT);
					setState(1023);
					identifier();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			columnName();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1032);
				match(COMMA);
				setState(1033);
				columnName();
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			expr(0);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1040);
				match(COMMA);
				setState(1041);
				expr(0);
				}
				}
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PostgreSQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(PostgreSQLParser.STRING, 0); }
		public TerminalNode ESTRING() { return getToken(PostgreSQLParser.ESTRING, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & -2305843009213693945L) != 0) || _la==ESTRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnLabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnLabel; }
	}

	public final ColumnLabelContext columnLabel() throws RecognitionException {
		ColumnLabelContext _localctx = new ColumnLabelContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_columnLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PostgreSQLParser.IDENTIFIER, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(PostgreSQLParser.QUOTED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_IDENTIFIER || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return tableRef_sempred((TableRefContext)_localctx, predIndex);
		case 60:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tableRef_sempred(TableRefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0099\u041e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0098\b\u0000\n\u0000\f\u0000\u009b"+
		"\t\u0000\u0001\u0000\u0003\u0000\u009e\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00ae\b\u0001\u0001\u0002\u0003\u0002\u00b1\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00b7\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00be"+
		"\b\u0004\n\u0004\f\u0004\u00c1\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c8\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00d3\b\u0006\n\u0006\f\u0006\u00d6\t\u0006\u0001"+
		"\u0006\u0003\u0006\u00d9\b\u0006\u0001\u0006\u0003\u0006\u00dc\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00df\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00e6\b\u0007\u0001\b\u0001\b\u0003"+
		"\b\u00ea\b\b\u0001\t\u0001\t\u0003\t\u00ee\b\t\u0001\t\u0001\t\u0003\t"+
		"\u00f2\b\t\u0001\t\u0003\t\u00f5\b\t\u0001\t\u0003\t\u00f8\b\t\u0001\t"+
		"\u0003\t\u00fb\b\t\u0001\t\u0003\t\u00fe\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0105\b\u000b\n\u000b\f\u000b\u0108"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\f\u0003\f\u0110"+
		"\b\f\u0003\f\u0112\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u011a\b\u000e\n\u000e\f\u000e\u011d\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u012c\b\u000f\n\u000f\f\u000f\u012f\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0133\b\u0010\u0001\u0010\u0003\u0010\u0136\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u013c"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0140\b\u0010\u0001\u0011"+
		"\u0003\u0011\u0143\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0147\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014b\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u014f\b\u0011\u0003\u0011\u0151\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u015a\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0164\b\u0014"+
		"\n\u0014\f\u0014\u0167\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0172\b\u0017\n\u0017\f\u0017\u0175\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0182\b\u0019\n\u0019"+
		"\f\u0019\u0185\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0189\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u018d\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u019c\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a0\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a5\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01aa\b\u001f\n\u001f\f\u001f\u01ad\t\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01b9\b\"\u0001\"\u0003\"\u01bc\b\"\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u01c1\b\"\u0001\"\u0003\"\u01c4\b\"\u0001\"\u0003\"\u01c7\b\""+
		"\u0001#\u0001#\u0001#\u0005#\u01cc\b#\n#\f#\u01cf\t#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0003%\u01d8\b%\u0001%\u0001%\u0003%\u01dc"+
		"\b%\u0001%\u0003%\u01df\b%\u0001%\u0003%\u01e2\b%\u0001%\u0003%\u01e5"+
		"\b%\u0001%\u0003%\u01e8\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u01ef\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01f5\b\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005(\u01ff\b("+
		"\n(\f(\u0202\t(\u0001)\u0001)\u0003)\u0206\b)\u0001*\u0001*\u0001*\u0005"+
		"*\u020b\b*\n*\f*\u020e\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u0223\b+\u0003+\u0225\b+\u0001,\u0001,\u0003,\u0229"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0233"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u023c\b,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0249\b,\u0001,\u0001,\u0003,\u024d\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0254\b,\u0001-\u0001-\u0001-\u0005-\u0259\b-\n-\f-\u025c"+
		"\t-\u0001-\u0001-\u0001-\u0003-\u0261\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u026b\b.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0272\b.\u0001.\u0001.\u0001.\u0003.\u0277\b.\u0001.\u0003.\u027a"+
		"\b.\u0001.\u0001.\u0003.\u027e\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u0285\b.\u0001.\u0001.\u0001.\u0003.\u028a\b.\u0001.\u0001.\u0003.\u028e"+
		"\b.\u0001.\u0001.\u0001.\u0003.\u0293\b.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u029a\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u02a0\b/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00030\u02a8\b0\u00010\u00010\u00010\u0001"+
		"0\u00050\u02ae\b0\n0\f0\u02b1\t0\u00011\u00011\u00031\u02b5\b1\u00011"+
		"\u00011\u00011\u00031\u02ba\b1\u00011\u00011\u00011\u00031\u02bf\b1\u0001"+
		"1\u00011\u00031\u02c3\b1\u00011\u00011\u00031\u02c7\b1\u00011\u00011\u0003"+
		"1\u02cb\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u02d7\b1\u00011\u00011\u00011\u00011\u00031\u02dd\b1\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00032\u02ec\b2\u00013\u00013\u00013\u00013\u00033\u02f2"+
		"\b3\u00013\u00013\u00033\u02f6\b3\u00014\u00014\u00014\u00054\u02fb\b"+
		"4\n4\f4\u02fe\t4\u00015\u00015\u00015\u00035\u0303\b5\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u030b\b5\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00036\u0314\b6\u00016\u00016\u00036\u0318\b6\u00017\u0001"+
		"7\u00037\u031c\b7\u00017\u00017\u00017\u00017\u00037\u0322\b7\u00017\u0003"+
		"7\u0325\b7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u032e"+
		"\b7\u00018\u00018\u00018\u00058\u0333\b8\n8\f8\u0336\t8\u00019\u00019"+
		"\u00039\u033a\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u0340\b:\u0001:\u0001"+
		":\u0001;\u0001;\u0003;\u0346\b;\u0001;\u0001;\u0003;\u034a\b;\u0001;\u0001"+
		";\u0003;\u034e\b;\u0001;\u0001;\u0003;\u0352\b;\u0001;\u0003;\u0355\b"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u035b\b;\u0001;\u0003;\u035e\b;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u036b\b<\u0001<\u0004<\u036e\b<\u000b<\f<\u036f\u0001<\u0001"+
		"<\u0003<\u0374\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0003<\u038b\b<\u0001<\u0001<\u0001<\u0003<\u0390"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u03a1\b<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u03aa\b<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u03b1\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u03c8\b<\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u03ce\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u03d5\b<\u0001"+
		"<\u0005<\u03d8\b<\n<\f<\u03db\t<\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0003A\u03ee\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u03f5"+
		"\bA\nA\fA\u03f8\tA\u0003A\u03fa\bA\u0001B\u0001B\u0001C\u0001C\u0001C"+
		"\u0005C\u0401\bC\nC\fC\u0404\tC\u0001D\u0001D\u0001E\u0001E\u0001E\u0005"+
		"E\u040b\bE\nE\fE\u040e\tE\u0001F\u0001F\u0001F\u0005F\u0413\bF\nF\fF\u0416"+
		"\tF\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001I\u0000\u0002\u001e"+
		"xJ\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0000\u0014\u0001\u0000"+
		"\u0013\u0015\u0001\u0000\u0005\u0006\u0001\u0000\f\r\u0001\u0000\u000f"+
		"\u0010\u0002\u0000\u0006\u0006\u0091\u0091\u0001\u000012\u0001\u0000e"+
		"f\u0002\u0000llnn\u0001\u0000pq\u0002\u0000\u0016\u0016vv\u0001\u0000"+
		"yz\u0001\u000056\u0001\u0000HI\u0001\u0000\u0083\u0084\u0001\u0000\u0085"+
		"\u0087\u0001\u0000QR\u0002\u0000\u0006\u0006]^\u0001\u0000}\u0082\u0002"+
		"\u0000TV\u0091\u0094\u0001\u0000\u0095\u0096\u049d\u0000\u0094\u0001\u0000"+
		"\u0000\u0000\u0002\u00ad\u0001\u0000\u0000\u0000\u0004\u00b0\u0001\u0000"+
		"\u0000\u0000\u0006\u00b4\u0001\u0000\u0000\u0000\b\u00ba\u0001\u0000\u0000"+
		"\u0000\n\u00c2\u0001\u0000\u0000\u0000\f\u00ce\u0001\u0000\u0000\u0000"+
		"\u000e\u00e5\u0001\u0000\u0000\u0000\u0010\u00e7\u0001\u0000\u0000\u0000"+
		"\u0012\u00eb\u0001\u0000\u0000\u0000\u0014\u00ff\u0001\u0000\u0000\u0000"+
		"\u0016\u0101\u0001\u0000\u0000\u0000\u0018\u0111\u0001\u0000\u0000\u0000"+
		"\u001a\u0113\u0001\u0000\u0000\u0000\u001c\u0116\u0001\u0000\u0000\u0000"+
		"\u001e\u011e\u0001\u0000\u0000\u0000 \u013f\u0001\u0000\u0000\u0000\""+
		"\u0150\u0001\u0000\u0000\u0000$\u0159\u0001\u0000\u0000\u0000&\u015b\u0001"+
		"\u0000\u0000\u0000(\u015e\u0001\u0000\u0000\u0000*\u0168\u0001\u0000\u0000"+
		"\u0000,\u016b\u0001\u0000\u0000\u0000.\u016e\u0001\u0000\u0000\u00000"+
		"\u0176\u0001\u0000\u0000\u00002\u017c\u0001\u0000\u0000\u00004\u0186\u0001"+
		"\u0000\u0000\u00006\u018e\u0001\u0000\u0000\u00008\u0191\u0001\u0000\u0000"+
		"\u0000:\u0194\u0001\u0000\u0000\u0000<\u01a4\u0001\u0000\u0000\u0000>"+
		"\u01a6\u0001\u0000\u0000\u0000@\u01ae\u0001\u0000\u0000\u0000B\u01b2\u0001"+
		"\u0000\u0000\u0000D\u01b5\u0001\u0000\u0000\u0000F\u01c8\u0001\u0000\u0000"+
		"\u0000H\u01d0\u0001\u0000\u0000\u0000J\u01d4\u0001\u0000\u0000\u0000L"+
		"\u01e9\u0001\u0000\u0000\u0000N\u01ec\u0001\u0000\u0000\u0000P\u01fb\u0001"+
		"\u0000\u0000\u0000R\u0205\u0001\u0000\u0000\u0000T\u0207\u0001\u0000\u0000"+
		"\u0000V\u0224\u0001\u0000\u0000\u0000X\u0253\u0001\u0000\u0000\u0000Z"+
		"\u0260\u0001\u0000\u0000\u0000\\\u0299\u0001\u0000\u0000\u0000^\u029b"+
		"\u0001\u0000\u0000\u0000`\u02a3\u0001\u0000\u0000\u0000b\u02dc\u0001\u0000"+
		"\u0000\u0000d\u02eb\u0001\u0000\u0000\u0000f\u02ed\u0001\u0000\u0000\u0000"+
		"h\u02f7\u0001\u0000\u0000\u0000j\u02ff\u0001\u0000\u0000\u0000l\u030f"+
		"\u0001\u0000\u0000\u0000n\u0319\u0001\u0000\u0000\u0000p\u032f\u0001\u0000"+
		"\u0000\u0000r\u0337\u0001\u0000\u0000\u0000t\u033b\u0001\u0000\u0000\u0000"+
		"v\u035d\u0001\u0000\u0000\u0000x\u038f\u0001\u0000\u0000\u0000z\u03dc"+
		"\u0001\u0000\u0000\u0000|\u03de\u0001\u0000\u0000\u0000~\u03e3\u0001\u0000"+
		"\u0000\u0000\u0080\u03e5\u0001\u0000\u0000\u0000\u0082\u03ed\u0001\u0000"+
		"\u0000\u0000\u0084\u03fb\u0001\u0000\u0000\u0000\u0086\u03fd\u0001\u0000"+
		"\u0000\u0000\u0088\u0405\u0001\u0000\u0000\u0000\u008a\u0407\u0001\u0000"+
		"\u0000\u0000\u008c\u040f\u0001\u0000\u0000\u0000\u008e\u0417\u0001\u0000"+
		"\u0000\u0000\u0090\u0419\u0001\u0000\u0000\u0000\u0092\u041b\u0001\u0000"+
		"\u0000\u0000\u0094\u0099\u0003\u0002\u0001\u0000\u0095\u0096\u0005\u008c"+
		"\u0000\u0000\u0096\u0098\u0003\u0002\u0001\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u008c"+
		"\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0000"+
		"\u0000\u0001\u00a0\u0001\u0001\u0000\u0000\u0000\u00a1\u00ae\u0003\u0004"+
		"\u0002\u0000\u00a2\u00ae\u0003:\u001d\u0000\u00a3\u00ae\u0003D\"\u0000"+
		"\u00a4\u00ae\u0003J%\u0000\u00a5\u00ae\u0003N\'\u0000\u00a6\u00ae\u0003"+
		"`0\u0000\u00a7\u00ae\u0003f3\u0000\u00a8\u00ae\u0003j5\u0000\u00a9\u00ae"+
		"\u0003l6\u0000\u00aa\u00ae\u0003n7\u0000\u00ab\u00ae\u0003t:\u0000\u00ac"+
		"\u00ae\u0003v;\u0000\u00ad\u00a1\u0001\u0000\u0000\u0000\u00ad\u00a2\u0001"+
		"\u0000\u0000\u0000\u00ad\u00a3\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001"+
		"\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u0003\u0001\u0000\u0000\u0000\u00af\u00b1\u0003"+
		"\u0006\u0003\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"\f\u0006\u0000\u00b3\u0005\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005\u0016"+
		"\u0000\u0000\u00b5\u00b7\u0005\u0017\u0000\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0003\b\u0004\u0000\u00b9\u0007\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bf\u0003\n\u0005\u0000\u00bb\u00bc\u0005\u008b\u0000\u0000"+
		"\u00bc\u00be\u0003\n\u0005\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\t\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u0092I\u0000\u00c3\u00c4\u0005"+
		"\u008d\u0000\u0000\u00c4\u00c5\u0003\u008aE\u0000\u00c5\u00c6\u0005\u008e"+
		"\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca\u00cb\u0005\u008d"+
		"\u0000\u0000\u00cb\u00cc\u0003\u0004\u0002\u0000\u00cc\u00cd\u0005\u008e"+
		"\u0000\u0000\u00cd\u000b\u0001\u0000\u0000\u0000\u00ce\u00d4\u0003\u000e"+
		"\u0007\u0000\u00cf\u00d0\u0003\u0010\b\u0000\u00d0\u00d1\u0003\u000e\u0007"+
		"\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d9\u00032\u0019\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00dc\u00036\u001b\u0000\u00db"+
		"\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0001\u0000\u0000\u0000\u00dd\u00df\u00038\u001c\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\r\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e6\u0003\u0012\t\u0000\u00e1\u00e2\u0005\u008d"+
		"\u0000\u0000\u00e2\u00e3\u0003\f\u0006\u0000\u00e3\u00e4\u0005\u008e\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e1\u0001\u0000\u0000\u0000\u00e6\u000f\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0007\u0000\u0000\u0000\u00e8\u00ea\u0005\u0006\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u0011\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005\u0001\u0000"+
		"\u0000\u00ec\u00ee\u0003\u0014\n\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0003\u0016\u000b\u0000\u00f0\u00f2\u0003\u001a\r\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f5\u0003&\u0013\u0000\u00f4\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003(\u0014\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fb\u0003*\u0015\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0003,\u0016\u0000\u00fd\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0013\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0007\u0001\u0000\u0000\u0100\u0015\u0001\u0000\u0000"+
		"\u0000\u0101\u0106\u0003\u0018\f\u0000\u0102\u0103\u0005\u008b\u0000\u0000"+
		"\u0103\u0105\u0003\u0018\f\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0017\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0109\u0112\u0005\u0085\u0000\u0000\u010a"+
		"\u010f\u0003x<\u0000\u010b\u010d\u0005\u0004\u0000\u0000\u010c\u010b\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u0110\u0003\u0090H\u0000\u010f\u010c\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u0109\u0001\u0000\u0000\u0000\u0111\u010a\u0001\u0000"+
		"\u0000\u0000\u0112\u0019\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0002"+
		"\u0000\u0000\u0114\u0115\u0003\u001c\u000e\u0000\u0115\u001b\u0001\u0000"+
		"\u0000\u0000\u0116\u011b\u0003\u001e\u000f\u0000\u0117\u0118\u0005\u008b"+
		"\u0000\u0000\u0118\u011a\u0003\u001e\u000f\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u001d\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0006\u000f"+
		"\uffff\uffff\u0000\u011f\u0120\u0003 \u0010\u0000\u0120\u012d\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\n\u0002\u0000\u0000\u0122\u0123\u0005!\u0000"+
		"\u0000\u0123\u0124\u0005\u001b\u0000\u0000\u0124\u012c\u0003\u001e\u000f"+
		"\u0003\u0125\u0126\n\u0003\u0000\u0000\u0126\u0127\u0003\"\u0011\u0000"+
		"\u0127\u0128\u0005\u001b\u0000\u0000\u0128\u0129\u0003\u001e\u000f\u0000"+
		"\u0129\u012a\u0003$\u0012\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0121\u0001\u0000\u0000\u0000\u012b\u0125\u0001\u0000\u0000\u0000\u012c"+
		"\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u001f\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0135\u0003\u0086C\u0000\u0131\u0133"+
		"\u0005\u0004\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0003\u0092I\u0000\u0135\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0140\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"\u008d\u0000\u0000\u0138\u0139\u0003\u0004\u0002\u0000\u0139\u013b\u0005"+
		"\u008e\u0000\u0000\u013a\u013c\u0005\u0004\u0000\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0003\u0092I\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u0130\u0001\u0000\u0000\u0000\u013f\u0137\u0001\u0000"+
		"\u0000\u0000\u0140!\u0001\u0000\u0000\u0000\u0141\u0143\u0005\u001c\u0000"+
		"\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0151\u0001\u0000\u0000\u0000\u0144\u0146\u0005\u001d\u0000"+
		"\u0000\u0145\u0147\u0005 \u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0151\u0001\u0000\u0000\u0000"+
		"\u0148\u014a\u0005\u001e\u0000\u0000\u0149\u014b\u0005 \u0000\u0000\u014a"+
		"\u0149\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u0151\u0001\u0000\u0000\u0000\u014c\u014e\u0005\u001f\u0000\u0000\u014d"+
		"\u014f\u0005 \u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0142"+
		"\u0001\u0000\u0000\u0000\u0150\u0144\u0001\u0000\u0000\u0000\u0150\u0148"+
		"\u0001\u0000\u0000\u0000\u0150\u014c\u0001\u0000\u0000\u0000\u0151#\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0005\"\u0000\u0000\u0153\u015a\u0003x"+
		"<\u0000\u0154\u0155\u0005#\u0000\u0000\u0155\u0156\u0005\u008d\u0000\u0000"+
		"\u0156\u0157\u0003\u008aE\u0000\u0157\u0158\u0005\u008e\u0000\u0000\u0158"+
		"\u015a\u0001\u0000\u0000\u0000\u0159\u0152\u0001\u0000\u0000\u0000\u0159"+
		"\u0154\u0001\u0000\u0000\u0000\u015a%\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005\u0003\u0000\u0000\u015c\u015d\u0003x<\u0000\u015d\'\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005\b\u0000\u0000\u015f\u0160\u0005\t\u0000"+
		"\u0000\u0160\u0165\u0003x<\u0000\u0161\u0162\u0005\u008b\u0000\u0000\u0162"+
		"\u0164\u0003x<\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0167\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166)\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0005\n\u0000\u0000\u0169\u016a\u0003x<\u0000"+
		"\u016a+\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u001a\u0000\u0000\u016c"+
		"\u016d\u0003.\u0017\u0000\u016d-\u0001\u0000\u0000\u0000\u016e\u0173\u0003"+
		"0\u0018\u0000\u016f\u0170\u0005\u008b\u0000\u0000\u0170\u0172\u00030\u0018"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174/\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0003\u0092I\u0000\u0177\u0178\u0005\u0004\u0000\u0000\u0178"+
		"\u0179\u0005\u008d\u0000\u0000\u0179\u017a\u0003\u0082A\u0000\u017a\u017b"+
		"\u0005\u008e\u0000\u0000\u017b1\u0001\u0000\u0000\u0000\u017c\u017d\u0005"+
		"\u000b\u0000\u0000\u017d\u017e\u0005\t\u0000\u0000\u017e\u0183\u00034"+
		"\u001a\u0000\u017f\u0180\u0005\u008b\u0000\u0000\u0180\u0182\u00034\u001a"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u01843\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000"+
		"\u0186\u0188\u0003x<\u0000\u0187\u0189\u0007\u0002\u0000\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018c"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u000e\u0000\u0000\u018b\u018d"+
		"\u0007\u0003\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d5\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"\u0011\u0000\u0000\u018f\u0190\u0007\u0004\u0000\u0000\u01907\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0005\u0012\u0000\u0000\u0192\u0193\u0005\u0091"+
		"\u0000\u0000\u01939\u0001\u0000\u0000\u0000\u0194\u0195\u0005%\u0000\u0000"+
		"\u0195\u0196\u0005\u0007\u0000\u0000\u0196\u019b\u0003\u0086C\u0000\u0197"+
		"\u0198\u0005\u008d\u0000\u0000\u0198\u0199\u0003\u008aE\u0000\u0199\u019a"+
		"\u0005\u008e\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0197"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u0003<\u001e\u0000\u019e\u01a0\u0003"+
		"B!\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0;\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005&\u0000\u0000\u01a2"+
		"\u01a5\u0003>\u001f\u0000\u01a3\u01a5\u0003\u0004\u0002\u0000\u01a4\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5=\u0001"+
		"\u0000\u0000\u0000\u01a6\u01ab\u0003@ \u0000\u01a7\u01a8\u0005\u008b\u0000"+
		"\u0000\u01a8\u01aa\u0003@ \u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac?\u0001\u0000\u0000\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u008d\u0000\u0000\u01af\u01b0"+
		"\u0003\u008cF\u0000\u01b0\u01b1\u0005\u008e\u0000\u0000\u01b1A\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0005*\u0000\u0000\u01b3\u01b4\u0003\u0016\u000b"+
		"\u0000\u01b4C\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005\'\u0000\u0000"+
		"\u01b6\u01bb\u0003\u0086C\u0000\u01b7\u01b9\u0005\u0004\u0000\u0000\u01b8"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003\u0092I\u0000\u01bb\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0005(\u0000\u0000\u01be\u01c0\u0003"+
		"F#\u0000\u01bf\u01c1\u0003\u001a\r\u0000\u01c0\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c4\u0003&\u0013\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c7\u0003B!\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7E\u0001\u0000\u0000\u0000\u01c8\u01cd\u0003"+
		"H$\u0000\u01c9\u01ca\u0005\u008b\u0000\u0000\u01ca\u01cc\u0003H$\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000"+
		"\u01ceG\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0003\u0088D\u0000\u01d1\u01d2\u0005}\u0000\u0000\u01d2\u01d3\u0003"+
		"x<\u0000\u01d3I\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005)\u0000\u0000"+
		"\u01d5\u01d7\u0005\u0002\u0000\u0000\u01d6\u01d8\u0005$\u0000\u0000\u01d7"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01de\u0003\u0086C\u0000\u01da\u01dc"+
		"\u0005\u0004\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df"+
		"\u0003\u0092I\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003"+
		"L&\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e5\u0003&\u0013\u0000"+
		"\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e8\u0003B!\u0000\u01e7\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8K\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0005#\u0000\u0000\u01ea\u01eb\u0003\u001c"+
		"\u000e\u0000\u01ebM\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005+\u0000\u0000"+
		"\u01ed\u01ef\u0007\u0005\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f4\u0005.\u0000\u0000\u01f1\u01f2\u00053\u0000\u0000\u01f2\u01f3"+
		"\u0005N\u0000\u0000\u01f3\u01f5\u00054\u0000\u0000\u01f4\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0003\u0086C\u0000\u01f7\u01f8\u0005\u008d\u0000"+
		"\u0000\u01f8\u01f9\u0003P(\u0000\u01f9\u01fa\u0005\u008e\u0000\u0000\u01fa"+
		"O\u0001\u0000\u0000\u0000\u01fb\u0200\u0003R)\u0000\u01fc\u01fd\u0005"+
		"\u008b\u0000\u0000\u01fd\u01ff\u0003R)\u0000\u01fe\u01fc\u0001\u0000\u0000"+
		"\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201Q\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0206\u0003T*\u0000\u0204\u0206"+
		"\u0003X,\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000"+
		"\u0000\u0000\u0206S\u0001\u0000\u0000\u0000\u0207\u0208\u0003\u0088D\u0000"+
		"\u0208\u020c\u0003Z-\u0000\u0209\u020b\u0003V+\u0000\u020a\u0209\u0001"+
		"\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020dU\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0210\u0005N\u0000"+
		"\u0000\u0210\u0225\u0005T\u0000\u0000\u0211\u0225\u0005T\u0000\u0000\u0212"+
		"\u0213\u0005A\u0000\u0000\u0213\u0225\u0003x<\u0000\u0214\u0215\u0005"+
		"<\u0000\u0000\u0215\u0225\u0005=\u0000\u0000\u0216\u0225\u0005@\u0000"+
		"\u0000\u0217\u0218\u0005B\u0000\u0000\u0218\u0219\u0005\u008d\u0000\u0000"+
		"\u0219\u021a\u0003x<\u0000\u021a\u021b\u0005\u008e\u0000\u0000\u021b\u0225"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0005?\u0000\u0000\u021d\u0222\u0003"+
		"\u0086C\u0000\u021e\u021f\u0005\u008d\u0000\u0000\u021f\u0220\u0003\u0088"+
		"D\u0000\u0220\u0221\u0005\u008e\u0000\u0000\u0221\u0223\u0001\u0000\u0000"+
		"\u0000\u0222\u021e\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u020f\u0001\u0000\u0000"+
		"\u0000\u0224\u0211\u0001\u0000\u0000\u0000\u0224\u0212\u0001\u0000\u0000"+
		"\u0000\u0224\u0214\u0001\u0000\u0000\u0000\u0224\u0216\u0001\u0000\u0000"+
		"\u0000\u0224\u0217\u0001\u0000\u0000\u0000\u0224\u021c\u0001\u0000\u0000"+
		"\u0000\u0225W\u0001\u0000\u0000\u0000\u0226\u0227\u0005;\u0000\u0000\u0227"+
		"\u0229\u0003\u0092I\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0005<\u0000\u0000\u022b\u022c\u0005=\u0000\u0000\u022c\u022d\u0005\u008d"+
		"\u0000\u0000\u022d\u022e\u0003\u008aE\u0000\u022e\u022f\u0005\u008e\u0000"+
		"\u0000\u022f\u0254\u0001\u0000\u0000\u0000\u0230\u0231\u0005;\u0000\u0000"+
		"\u0231\u0233\u0003\u0092I\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0005@\u0000\u0000\u0235\u0236\u0005\u008d\u0000\u0000\u0236\u0237"+
		"\u0003\u008aE\u0000\u0237\u0238\u0005\u008e\u0000\u0000\u0238\u0254\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0005;\u0000\u0000\u023a\u023c\u0003\u0092"+
		"I\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0005>\u0000\u0000"+
		"\u023e\u023f\u0005=\u0000\u0000\u023f\u0240\u0005\u008d\u0000\u0000\u0240"+
		"\u0241\u0003\u008aE\u0000\u0241\u0242\u0005\u008e\u0000\u0000\u0242\u0243"+
		"\u0005?\u0000\u0000\u0243\u0248\u0003\u0086C\u0000\u0244\u0245\u0005\u008d"+
		"\u0000\u0000\u0245\u0246\u0003\u008aE\u0000\u0246\u0247\u0005\u008e\u0000"+
		"\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u0244\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u0254\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0005;\u0000\u0000\u024b\u024d\u0003\u0092I\u0000\u024c"+
		"\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0005B\u0000\u0000\u024f\u0250"+
		"\u0005\u008d\u0000\u0000\u0250\u0251\u0003x<\u0000\u0251\u0252\u0005\u008e"+
		"\u0000\u0000\u0252\u0254\u0001\u0000\u0000\u0000\u0253\u0228\u0001\u0000"+
		"\u0000\u0000\u0253\u0232\u0001\u0000\u0000\u0000\u0253\u023b\u0001\u0000"+
		"\u0000\u0000\u0253\u024c\u0001\u0000\u0000\u0000\u0254Y\u0001\u0000\u0000"+
		"\u0000\u0255\u025a\u0003\\.\u0000\u0256\u0257\u0005\u008f\u0000\u0000"+
		"\u0257\u0259\u0005\u0090\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000"+
		"\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u0261\u0001\u0000\u0000\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u025e\u0003\\.\u0000\u025e"+
		"\u025f\u0005|\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u0255"+
		"\u0001\u0000\u0000\u0000\u0260\u025d\u0001\u0000\u0000\u0000\u0261[\u0001"+
		"\u0000\u0000\u0000\u0262\u029a\u0005_\u0000\u0000\u0263\u029a\u0005`\u0000"+
		"\u0000\u0264\u029a\u0005a\u0000\u0000\u0265\u029a\u0005b\u0000\u0000\u0266"+
		"\u029a\u0005c\u0000\u0000\u0267\u029a\u0005d\u0000\u0000\u0268\u026a\u0007"+
		"\u0006\u0000\u0000\u0269\u026b\u0003^/\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u029a\u0001\u0000\u0000"+
		"\u0000\u026c\u029a\u0005g\u0000\u0000\u026d\u026e\u0005h\u0000\u0000\u026e"+
		"\u029a\u0005i\u0000\u0000\u026f\u0271\u0005j\u0000\u0000\u0270\u0272\u0003"+
		"^/\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u029a\u0001\u0000\u0000\u0000\u0273\u0277\u0005k\u0000\u0000"+
		"\u0274\u0275\u0005l\u0000\u0000\u0275\u0277\u0005m\u0000\u0000\u0276\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0277\u0279"+
		"\u0001\u0000\u0000\u0000\u0278\u027a\u0003^/\u0000\u0279\u0278\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u029a\u0001\u0000"+
		"\u0000\u0000\u027b\u027d\u0007\u0007\u0000\u0000\u027c\u027e\u0003^/\u0000"+
		"\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u029a\u0001\u0000\u0000\u0000\u027f\u029a\u0005o\u0000\u0000\u0280"+
		"\u029a\u0007\b\u0000\u0000\u0281\u029a\u0005r\u0000\u0000\u0282\u0284"+
		"\u0005s\u0000\u0000\u0283\u0285\u0003^/\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0289\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0007\t\u0000\u0000\u0287\u0288\u0005s\u0000"+
		"\u0000\u0288\u028a\u0005u\u0000\u0000\u0289\u0286\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u029a\u0001\u0000\u0000\u0000"+
		"\u028b\u028d\u0005t\u0000\u0000\u028c\u028e\u0003^/\u0000\u028d\u028c"+
		"\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0292"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0007\t\u0000\u0000\u0290\u0291\u0005"+
		"s\u0000\u0000\u0291\u0293\u0005u\u0000\u0000\u0292\u028f\u0001\u0000\u0000"+
		"\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u029a\u0001\u0000\u0000"+
		"\u0000\u0294\u029a\u0005w\u0000\u0000\u0295\u029a\u0005x\u0000\u0000\u0296"+
		"\u029a\u0007\n\u0000\u0000\u0297\u029a\u0005{\u0000\u0000\u0298\u029a"+
		"\u0003\u0092I\u0000\u0299\u0262\u0001\u0000\u0000\u0000\u0299\u0263\u0001"+
		"\u0000\u0000\u0000\u0299\u0264\u0001\u0000\u0000\u0000\u0299\u0265\u0001"+
		"\u0000\u0000\u0000\u0299\u0266\u0001\u0000\u0000\u0000\u0299\u0267\u0001"+
		"\u0000\u0000\u0000\u0299\u0268\u0001\u0000\u0000\u0000\u0299\u026c\u0001"+
		"\u0000\u0000\u0000\u0299\u026d\u0001\u0000\u0000\u0000\u0299\u026f\u0001"+
		"\u0000\u0000\u0000\u0299\u0276\u0001\u0000\u0000\u0000\u0299\u027b\u0001"+
		"\u0000\u0000\u0000\u0299\u027f\u0001\u0000\u0000\u0000\u0299\u0280\u0001"+
		"\u0000\u0000\u0000\u0299\u0281\u0001\u0000\u0000\u0000\u0299\u0282\u0001"+
		"\u0000\u0000\u0000\u0299\u028b\u0001\u0000\u0000\u0000\u0299\u0294\u0001"+
		"\u0000\u0000\u0000\u0299\u0295\u0001\u0000\u0000\u0000\u0299\u0296\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u0298\u0001"+
		"\u0000\u0000\u0000\u029a]\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u008d"+
		"\u0000\u0000\u029c\u029f\u0005\u0091\u0000\u0000\u029d\u029e\u0005\u008b"+
		"\u0000\u0000\u029e\u02a0\u0005\u0091\u0000\u0000\u029f\u029d\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0005\u008e\u0000\u0000\u02a2_\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0005,\u0000\u0000\u02a4\u02a7\u0005.\u0000\u0000\u02a5"+
		"\u02a6\u00053\u0000\u0000\u02a6\u02a8\u00054\u0000\u0000\u02a7\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0003\u0086C\u0000\u02aa\u02af\u0003b1"+
		"\u0000\u02ab\u02ac\u0005\u008b\u0000\u0000\u02ac\u02ae\u0003b1\u0000\u02ad"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af"+
		"\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0"+
		"a\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02b4"+
		"\u00057\u0000\u0000\u02b3\u02b5\u00058\u0000\u0000\u02b4\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u00053\u0000\u0000\u02b7\u02b8\u0005N\u0000\u0000"+
		"\u02b8\u02ba\u00054\u0000\u0000\u02b9\u02b6\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb"+
		"\u02dd\u0003T*\u0000\u02bc\u02be\u0005-\u0000\u0000\u02bd\u02bf\u0005"+
		"8\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02c1\u00053\u0000"+
		"\u0000\u02c1\u02c3\u00054\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c6\u0003\u0088D\u0000\u02c5\u02c7\u0007\u000b\u0000\u0000\u02c6"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7"+
		"\u02dd\u0001\u0000\u0000\u0000\u02c8\u02ca\u0005,\u0000\u0000\u02c9\u02cb"+
		"\u00058\u0000\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0003"+
		"\u0088D\u0000\u02cd\u02ce\u0003d2\u0000\u02ce\u02dd\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d0\u00057\u0000\u0000\u02d0\u02dd\u0003X,\u0000\u02d1"+
		"\u02d2\u00059\u0000\u0000\u02d2\u02d3\u0005:\u0000\u0000\u02d3\u02dd\u0003"+
		"\u0092I\u0000\u02d4\u02d6\u00059\u0000\u0000\u02d5\u02d7\u00058\u0000"+
		"\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0003\u0088D\u0000"+
		"\u02d9\u02da\u0005:\u0000\u0000\u02da\u02db\u0003\u0092I\u0000\u02db\u02dd"+
		"\u0001\u0000\u0000\u0000\u02dc\u02b2\u0001\u0000\u0000\u0000\u02dc\u02bc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02c8\u0001\u0000\u0000\u0000\u02dc\u02cf"+
		"\u0001\u0000\u0000\u0000\u02dc\u02d1\u0001\u0000\u0000\u0000\u02dc\u02d4"+
		"\u0001\u0000\u0000\u0000\u02ddc\u0001\u0000\u0000\u0000\u02de\u02df\u0005"+
		"(\u0000\u0000\u02df\u02e0\u0005A\u0000\u0000\u02e0\u02ec\u0003x<\u0000"+
		"\u02e1\u02e2\u0005-\u0000\u0000\u02e2\u02ec\u0005A\u0000\u0000\u02e3\u02e4"+
		"\u0005(\u0000\u0000\u02e4\u02e5\u0005N\u0000\u0000\u02e5\u02ec\u0005T"+
		"\u0000\u0000\u02e6\u02e7\u0005-\u0000\u0000\u02e7\u02e8\u0005N\u0000\u0000"+
		"\u02e8\u02ec\u0005T\u0000\u0000\u02e9\u02ea\u0005D\u0000\u0000\u02ea\u02ec"+
		"\u0003Z-\u0000\u02eb\u02de\u0001\u0000\u0000\u0000\u02eb\u02e1\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e3\u0001\u0000\u0000\u0000\u02eb\u02e6\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ece\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0005-\u0000\u0000\u02ee\u02f1\u0005.\u0000\u0000\u02ef"+
		"\u02f0\u00053\u0000\u0000\u02f0\u02f2\u00054\u0000\u0000\u02f1\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f5\u0003h4\u0000\u02f4\u02f6\u0007\u000b\u0000"+
		"\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f6g\u0001\u0000\u0000\u0000\u02f7\u02fc\u0003\u0086C\u0000\u02f8"+
		"\u02f9\u0005\u008b\u0000\u0000\u02f9\u02fb\u0003\u0086C\u0000\u02fa\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fdi\u0001"+
		"\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0302\u0005"+
		"+\u0000\u0000\u0300\u0301\u0005M\u0000\u0000\u0301\u0303\u0005C\u0000"+
		"\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0005/\u0000\u0000"+
		"\u0305\u030a\u0003\u0086C\u0000\u0306\u0307\u0005\u008d\u0000\u0000\u0307"+
		"\u0308\u0003\u008aE\u0000\u0308\u0309\u0005\u008e\u0000\u0000\u0309\u030b"+
		"\u0001\u0000\u0000\u0000\u030a\u0306\u0001\u0000\u0000\u0000\u030a\u030b"+
		"\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0005\u0004\u0000\u0000\u030d\u030e\u0003\u0004\u0002\u0000\u030ek\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0005-\u0000\u0000\u0310\u0313\u0005/\u0000"+
		"\u0000\u0311\u0312\u00053\u0000\u0000\u0312\u0314\u00054\u0000\u0000\u0313"+
		"\u0311\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314"+
		"\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0003h4\u0000\u0316\u0318\u0007"+
		"\u000b\u0000\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0317\u0318\u0001"+
		"\u0000\u0000\u0000\u0318m\u0001\u0000\u0000\u0000\u0319\u031b\u0005+\u0000"+
		"\u0000\u031a\u031c\u0005@\u0000\u0000\u031b\u031a\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000"+
		"\u031d\u0321\u00050\u0000\u0000\u031e\u031f\u00053\u0000\u0000\u031f\u0320"+
		"\u0005N\u0000\u0000\u0320\u0322\u00054\u0000\u0000\u0321\u031e\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0324\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0003\u0092I\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0005\"\u0000\u0000\u0327\u0328\u0003\u0086C\u0000"+
		"\u0328\u0329\u0005\u008d\u0000\u0000\u0329\u032a\u0003p8\u0000\u032a\u032d"+
		"\u0005\u008e\u0000\u0000\u032b\u032c\u0005\u0003\u0000\u0000\u032c\u032e"+
		"\u0003x<\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000"+
		"\u0000\u0000\u032eo\u0001\u0000\u0000\u0000\u032f\u0334\u0003r9\u0000"+
		"\u0330\u0331\u0005\u008b\u0000\u0000\u0331\u0333\u0003r9\u0000\u0332\u0330"+
		"\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000\u0000\u0000\u0334\u0332"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335q\u0001"+
		"\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u0339\u0003"+
		"\u0088D\u0000\u0338\u033a\u0007\u0002\u0000\u0000\u0339\u0338\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033as\u0001\u0000\u0000"+
		"\u0000\u033b\u033c\u0005-\u0000\u0000\u033c\u033f\u00050\u0000\u0000\u033d"+
		"\u033e\u00053\u0000\u0000\u033e\u0340\u00054\u0000\u0000\u033f\u033d\u0001"+
		"\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0341\u0001"+
		"\u0000\u0000\u0000\u0341\u0342\u0003h4\u0000\u0342u\u0001\u0000\u0000"+
		"\u0000\u0343\u0345\u0005E\u0000\u0000\u0344\u0346\u0007\f\u0000\u0000"+
		"\u0345\u0344\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000"+
		"\u0346\u035e\u0001\u0000\u0000\u0000\u0347\u0349\u0005F\u0000\u0000\u0348"+
		"\u034a\u0007\f\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u035e\u0001\u0000\u0000\u0000\u034b\u034d"+
		"\u0005G\u0000\u0000\u034c\u034e\u0007\f\u0000\u0000\u034d\u034c\u0001"+
		"\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0354\u0001"+
		"\u0000\u0000\u0000\u034f\u0351\u0005:\u0000\u0000\u0350\u0352\u0005J\u0000"+
		"\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0355\u0003\u0092I\u0000"+
		"\u0354\u034f\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000"+
		"\u0355\u035e\u0001\u0000\u0000\u0000\u0356\u0357\u0005J\u0000\u0000\u0357"+
		"\u035e\u0003\u0092I\u0000\u0358\u035a\u0005K\u0000\u0000\u0359\u035b\u0005"+
		"J\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035e\u0003\u0092"+
		"I\u0000\u035d\u0343\u0001\u0000\u0000\u0000\u035d\u0347\u0001\u0000\u0000"+
		"\u0000\u035d\u034b\u0001\u0000\u0000\u0000\u035d\u0356\u0001\u0000\u0000"+
		"\u0000\u035d\u0358\u0001\u0000\u0000\u0000\u035ew\u0001\u0000\u0000\u0000"+
		"\u035f\u0360\u0006<\uffff\uffff\u0000\u0360\u0361\u0005\u008d\u0000\u0000"+
		"\u0361\u0362\u0003x<\u0000\u0362\u0363\u0005\u008e\u0000\u0000\u0363\u0390"+
		"\u0001\u0000\u0000\u0000\u0364\u0365\u0005\u008d\u0000\u0000\u0365\u0366"+
		"\u0003\u0004\u0002\u0000\u0366\u0367\u0005\u008e\u0000\u0000\u0367\u0390"+
		"\u0001\u0000\u0000\u0000\u0368\u036a\u0005W\u0000\u0000\u0369\u036b\u0003"+
		"x<\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000"+
		"\u0000\u036b\u036d\u0001\u0000\u0000\u0000\u036c\u036e\u0003|>\u0000\u036d"+
		"\u036c\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f"+
		"\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370"+
		"\u0373\u0001\u0000\u0000\u0000\u0371\u0372\u0005Z\u0000\u0000\u0372\u0374"+
		"\u0003x<\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0376\u0005[\u0000"+
		"\u0000\u0376\u0390\u0001\u0000\u0000\u0000\u0377\u0378\u0005\\\u0000\u0000"+
		"\u0378\u0379\u0005\u008d\u0000\u0000\u0379\u037a\u0003x<\u0000\u037a\u037b"+
		"\u0005\u0004\u0000\u0000\u037b\u037c\u0003Z-\u0000\u037c\u037d\u0005\u008e"+
		"\u0000\u0000\u037d\u0390\u0001\u0000\u0000\u0000\u037e\u037f\u00054\u0000"+
		"\u0000\u037f\u0380\u0005\u008d\u0000\u0000\u0380\u0381\u0003\u0004\u0002"+
		"\u0000\u0381\u0382\u0005\u008e\u0000\u0000\u0382\u0390\u0001\u0000\u0000"+
		"\u0000\u0383\u0390\u0003\u0084B\u0000\u0384\u0390\u0003\u008eG\u0000\u0385"+
		"\u0386\u0007\r\u0000\u0000\u0386\u0390\u0003x<\u000f\u0387\u0388\u0005"+
		"|\u0000\u0000\u0388\u038a\u0005\u008f\u0000\u0000\u0389\u038b\u0003\u008c"+
		"F\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000"+
		"\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u0390\u0005\u0090\u0000"+
		"\u0000\u038d\u038e\u0005N\u0000\u0000\u038e\u0390\u0003x<\u0003\u038f"+
		"\u035f\u0001\u0000\u0000\u0000\u038f\u0364\u0001\u0000\u0000\u0000\u038f"+
		"\u0368\u0001\u0000\u0000\u0000\u038f\u0377\u0001\u0000\u0000\u0000\u038f"+
		"\u037e\u0001\u0000\u0000\u0000\u038f\u0383\u0001\u0000\u0000\u0000\u038f"+
		"\u0384\u0001\u0000\u0000\u0000\u038f\u0385\u0001\u0000\u0000\u0000\u038f"+
		"\u0387\u0001\u0000\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u0390"+
		"\u03d9\u0001\u0000\u0000\u0000\u0391\u0392\n\u000e\u0000\u0000\u0392\u0393"+
		"\u0007\u000e\u0000\u0000\u0393\u03d8\u0003x<\u000f\u0394\u0395\n\r\u0000"+
		"\u0000\u0395\u0396\u0007\r\u0000\u0000\u0396\u03d8\u0003x<\u000e\u0397"+
		"\u0398\n\f\u0000\u0000\u0398\u0399\u0005\u0088\u0000\u0000\u0399\u03d8"+
		"\u0003x<\r\u039a\u039b\n\u000b\u0000\u0000\u039b\u039c\u0003z=\u0000\u039c"+
		"\u039d\u0003x<\f\u039d\u03d8\u0001\u0000\u0000\u0000\u039e\u03a0\n\b\u0000"+
		"\u0000\u039f\u03a1\u0005N\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a3\u0005P\u0000\u0000\u03a3\u03a4\u0003x<\u0000\u03a4\u03a5"+
		"\u0005L\u0000\u0000\u03a5\u03a6\u0003x<\t\u03a6\u03d8\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a9\n\u0006\u0000\u0000\u03a8\u03aa\u0005N\u0000\u0000"+
		"\u03a9\u03a8\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000"+
		"\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ac\u0007\u000f\u0000\u0000"+
		"\u03ac\u03d8\u0003x<\u0007\u03ad\u03ae\n\u0004\u0000\u0000\u03ae\u03b0"+
		"\u0005S\u0000\u0000\u03af\u03b1\u0005N\u0000\u0000\u03b0\u03af\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b3\u0005\u0005\u0000\u0000\u03b3\u03b4\u0005\u0002"+
		"\u0000\u0000\u03b4\u03d8\u0003x<\u0005\u03b5\u03b6\n\u0002\u0000\u0000"+
		"\u03b6\u03b7\u0005L\u0000\u0000\u03b7\u03d8\u0003x<\u0003\u03b8\u03b9"+
		"\n\u0001\u0000\u0000\u03b9\u03ba\u0005M\u0000\u0000\u03ba\u03d8\u0003"+
		"x<\u0002\u03bb\u03bc\n\u0010\u0000\u0000\u03bc\u03bd\u0005\u0089\u0000"+
		"\u0000\u03bd\u03d8\u0003Z-\u0000\u03be\u03bf\n\n\u0000\u0000\u03bf\u03c0"+
		"\u0003z=\u0000\u03c0\u03c1\u0007\u0010\u0000\u0000\u03c1\u03c2\u0005\u008d"+
		"\u0000\u0000\u03c2\u03c3\u0003\u0004\u0002\u0000\u03c3\u03c4\u0005\u008e"+
		"\u0000\u0000\u03c4\u03d8\u0001\u0000\u0000\u0000\u03c5\u03c7\n\u0007\u0000"+
		"\u0000\u03c6\u03c8\u0005N\u0000\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000"+
		"\u03c9\u03ca\u0005O\u0000\u0000\u03ca\u03cd\u0005\u008d\u0000\u0000\u03cb"+
		"\u03ce\u0003\u008cF\u0000\u03cc\u03ce\u0003\u0004\u0002\u0000\u03cd\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000\u03ce\u03cf"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d0\u0005\u008e\u0000\u0000\u03d0\u03d8"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\n\u0005\u0000\u0000\u03d2\u03d4\u0005"+
		"S\u0000\u0000\u03d3\u03d5\u0005N\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d8\u0005T\u0000\u0000\u03d7\u0391\u0001\u0000\u0000\u0000"+
		"\u03d7\u0394\u0001\u0000\u0000\u0000\u03d7\u0397\u0001\u0000\u0000\u0000"+
		"\u03d7\u039a\u0001\u0000\u0000\u0000\u03d7\u039e\u0001\u0000\u0000\u0000"+
		"\u03d7\u03a7\u0001\u0000\u0000\u0000\u03d7\u03ad\u0001\u0000\u0000\u0000"+
		"\u03d7\u03b5\u0001\u0000\u0000\u0000\u03d7\u03b8\u0001\u0000\u0000\u0000"+
		"\u03d7\u03bb\u0001\u0000\u0000\u0000\u03d7\u03be\u0001\u0000\u0000\u0000"+
		"\u03d7\u03c5\u0001\u0000\u0000\u0000\u03d7\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d8\u03db\u0001\u0000\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000"+
		"\u03d9\u03da\u0001\u0000\u0000\u0000\u03day\u0001\u0000\u0000\u0000\u03db"+
		"\u03d9\u0001\u0000\u0000\u0000\u03dc\u03dd\u0007\u0011\u0000\u0000\u03dd"+
		"{\u0001\u0000\u0000\u0000\u03de\u03df\u0005X\u0000\u0000\u03df\u03e0\u0003"+
		"x<\u0000\u03e0\u03e1\u0005Y\u0000\u0000\u03e1\u03e2\u0003x<\u0000\u03e2"+
		"}\u0001\u0000\u0000\u0000\u03e3\u03e4\u0003\u0092I\u0000\u03e4\u007f\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e6\u0005\u0018\u0000\u0000\u03e6\u03e7\u0005"+
		"\u008d\u0000\u0000\u03e7\u03e8\u0003\u0082A\u0000\u03e8\u03e9\u0005\u008e"+
		"\u0000\u0000\u03e9\u0081\u0001\u0000\u0000\u0000\u03ea\u03eb\u0005\u0019"+
		"\u0000\u0000\u03eb\u03ec\u0005\t\u0000\u0000\u03ec\u03ee\u0003\u008cF"+
		"\u0000\u03ed\u03ea\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000"+
		"\u0000\u03ee\u03f9\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005\u000b\u0000"+
		"\u0000\u03f0\u03f1\u0005\t\u0000\u0000\u03f1\u03f6\u00034\u001a\u0000"+
		"\u03f2\u03f3\u0005\u008b\u0000\u0000\u03f3\u03f5\u00034\u001a\u0000\u03f4"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7"+
		"\u03fa\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9"+
		"\u03ef\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa"+
		"\u0083\u0001\u0000\u0000\u0000\u03fb\u03fc\u0003\u0086C\u0000\u03fc\u0085"+
		"\u0001\u0000\u0000\u0000\u03fd\u0402\u0003\u0092I\u0000\u03fe\u03ff\u0005"+
		"\u008a\u0000\u0000\u03ff\u0401\u0003\u0092I\u0000\u0400\u03fe\u0001\u0000"+
		"\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000"+
		"\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0087\u0001\u0000"+
		"\u0000\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405\u0406\u0003\u0092"+
		"I\u0000\u0406\u0089\u0001\u0000\u0000\u0000\u0407\u040c\u0003\u0088D\u0000"+
		"\u0408\u0409\u0005\u008b\u0000\u0000\u0409\u040b\u0003\u0088D\u0000\u040a"+
		"\u0408\u0001\u0000\u0000\u0000\u040b\u040e\u0001\u0000\u0000\u0000\u040c"+
		"\u040a\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d"+
		"\u008b\u0001\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000\u0000\u040f"+
		"\u0414\u0003x<\u0000\u0410\u0411\u0005\u008b\u0000\u0000\u0411\u0413\u0003"+
		"x<\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0413\u0416\u0001\u0000\u0000"+
		"\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000"+
		"\u0000\u0415\u008d\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000"+
		"\u0000\u0417\u0418\u0007\u0012\u0000\u0000\u0418\u008f\u0001\u0000\u0000"+
		"\u0000\u0419\u041a\u0003\u0092I\u0000\u041a\u0091\u0001\u0000\u0000\u0000"+
		"\u041b\u041c\u0007\u0013\u0000\u0000\u041c\u0093\u0001\u0000\u0000\u0000"+
		"\u0086\u0099\u009d\u00ad\u00b0\u00b6\u00bf\u00c7\u00d4\u00d8\u00db\u00de"+
		"\u00e5\u00e9\u00ed\u00f1\u00f4\u00f7\u00fa\u00fd\u0106\u010c\u010f\u0111"+
		"\u011b\u012b\u012d\u0132\u0135\u013b\u013f\u0142\u0146\u014a\u014e\u0150"+
		"\u0159\u0165\u0173\u0183\u0188\u018c\u019b\u019f\u01a4\u01ab\u01b8\u01bb"+
		"\u01c0\u01c3\u01c6\u01cd\u01d7\u01db\u01de\u01e1\u01e4\u01e7\u01ee\u01f4"+
		"\u0200\u0205\u020c\u0222\u0224\u0228\u0232\u023b\u0248\u024c\u0253\u025a"+
		"\u0260\u026a\u0271\u0276\u0279\u027d\u0284\u0289\u028d\u0292\u0299\u029f"+
		"\u02a7\u02af\u02b4\u02b9\u02be\u02c2\u02c6\u02ca\u02d6\u02dc\u02eb\u02f1"+
		"\u02f5\u02fc\u0302\u030a\u0313\u0317\u031b\u0321\u0324\u032d\u0334\u0339"+
		"\u033f\u0345\u0349\u034d\u0351\u0354\u035a\u035d\u036a\u036f\u0373\u038a"+
		"\u038f\u03a0\u03a9\u03b0\u03c7\u03cd\u03d4\u03d7\u03d9\u03ed\u03f6\u03f9"+
		"\u0402\u040c\u0414";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}