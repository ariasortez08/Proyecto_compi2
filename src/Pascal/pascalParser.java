// Generated from C:/Users/miria/IdeaProjects/Compilador/src/Grammar/pascal.g4 by ANTLR 4.13.2
package Pascal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, BRACKET_LEFT=3, BRACKET_RIGHT=4, SQBRACKET_LEFT=5, SQBRACKET_RIGHT=6, 
		PROGRAM=7, BEGIN=8, END=9, INT_TYPE=10, STR_TYPE=11, BOOL_TYPE=12, CHAR_TYPE=13, 
		VAR=14, ARRAY=15, OF=16, CONST=17, CONST_CHAR=18, CONST_STRING=19, ARRAY_OF=20, 
		ASSIGN=21, NUMBER=22, TEXTCHAR=23, TEXT=24, COLON=25, SEMI_COLON=26, COMA=27, 
		DOBLEDOTS=28, QUATATION_MARK=29, DOUBLE_QUOTATION_MARK=30, DOT=31, TRUE=32, 
		FALSE=33, BOOLEANE=34, EQUAL=35, FUNCTION=36, C_WHILE=37, C_DO=38, C_to=39, 
		C_FOR=40, C_REPEAT=41, C_UNTIL=42, C_IF=43, C_THEN=44, C_ELSE=45, PLUS=46, 
		MINUS=47, MULT=48, DIV=49, MOD=50, ID=51, WS=52, COMMENT=53;
	public static final int
		RULE_main = 0, RULE_statements = 1, RULE_typesstatemes = 2, RULE_sentence = 3, 
		RULE_assign = 4, RULE_expression = 5, RULE_assingId = 6, RULE_optional_values = 7, 
		RULE_varBlock = 8, RULE_varDecl = 9, RULE_varID = 10, RULE_typeDef = 11, 
		RULE_typeName = 12, RULE_arrDecl = 13, RULE_arr1D = 14, RULE_arr2D = 15, 
		RULE_typearray = 16, RULE_range = 17, RULE_constBlock = 18, RULE_constDecl = 19, 
		RULE_constCharDecl = 20, RULE_constStrDecl = 21, RULE_functionBlock = 22, 
		RULE_functionDecl = 23, RULE_params = 24, RULE_returnType = 25, RULE_varParamBlock = 26, 
		RULE_varParamDecl = 27, RULE_varParamID = 28, RULE_typeParamDef = 29, 
		RULE_typeParamName = 30, RULE_fuctionUsage = 31, RULE_paramsusable = 32, 
		RULE_whileBlock = 33, RULE_whileDecla = 34, RULE_condition = 35, RULE_codition2 = 36, 
		RULE_forBlock = 37, RULE_forDecla = 38, RULE_forcondition = 39, RULE_idfor = 40, 
		RULE_valuesfor = 41, RULE_repeatBlock = 42, RULE_repeatDecla = 43, RULE_repeatcondition = 44, 
		RULE_ifBlock = 45, RULE_ifDecla = 46, RULE_ifcondition = 47, RULE_conditionvali = 48, 
		RULE_cond2 = 49, RULE_array_call = 50, RULE_arraybi_call = 51, RULE_arraybi1 = 52, 
		RULE_arraybi2 = 53, RULE_read_function = 54, RULE_readId = 55, RULE_write_function = 56, 
		RULE_writeId = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statements", "typesstatemes", "sentence", "assign", "expression", 
			"assingId", "optional_values", "varBlock", "varDecl", "varID", "typeDef", 
			"typeName", "arrDecl", "arr1D", "arr2D", "typearray", "range", "constBlock", 
			"constDecl", "constCharDecl", "constStrDecl", "functionBlock", "functionDecl", 
			"params", "returnType", "varParamBlock", "varParamDecl", "varParamID", 
			"typeParamDef", "typeParamName", "fuctionUsage", "paramsusable", "whileBlock", 
			"whileDecla", "condition", "codition2", "forBlock", "forDecla", "forcondition", 
			"idfor", "valuesfor", "repeatBlock", "repeatDecla", "repeatcondition", 
			"ifBlock", "ifDecla", "ifcondition", "conditionvali", "cond2", "array_call", 
			"arraybi_call", "arraybi1", "arraybi2", "read_function", "readId", "write_function", 
			"writeId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", null, "'('", "')'", "'['", "']'", "'program'", "'begin'", 
			"'end'", "'integer'", "'string'", "'boolean'", "'char'", "'var'", "'array'", 
			"'of'", "'const'", "'constchar'", "'conststr'", "'array of'", "':='", 
			null, null, null, "':'", "';'", "','", "'..'", "'''", "'\"'", "'.'", 
			"'true'", "'false'", null, "'='", "'function'", "'while'", "'do'", null, 
			"'for'", "'repeat'", "'until'", "'if'", "'then'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "WRITE", "BRACKET_LEFT", "BRACKET_RIGHT", "SQBRACKET_LEFT", 
			"SQBRACKET_RIGHT", "PROGRAM", "BEGIN", "END", "INT_TYPE", "STR_TYPE", 
			"BOOL_TYPE", "CHAR_TYPE", "VAR", "ARRAY", "OF", "CONST", "CONST_CHAR", 
			"CONST_STRING", "ARRAY_OF", "ASSIGN", "NUMBER", "TEXTCHAR", "TEXT", "COLON", 
			"SEMI_COLON", "COMA", "DOBLEDOTS", "QUATATION_MARK", "DOUBLE_QUOTATION_MARK", 
			"DOT", "TRUE", "FALSE", "BOOLEANE", "EQUAL", "FUNCTION", "C_WHILE", "C_DO", 
			"C_to", "C_FOR", "C_REPEAT", "C_UNTIL", "C_IF", "C_THEN", "C_ELSE", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "ID", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(pascalParser.EOF, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public ConstBlockContext constBlock() {
			return getRuleContext(ConstBlockContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PROGRAM);
			setState(117);
			match(ID);
			setState(118);
			match(SEMI_COLON);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(119);
				varBlock();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(122);
				constBlock();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(125);
				functionBlock();
				}
			}

			setState(128);
			match(BEGIN);
			setState(129);
			statements();
			setState(130);
			match(END);
			setState(131);
			match(DOT);
			setState(132);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<TypesstatemesContext> typesstatemes() {
			return getRuleContexts(TypesstatemesContext.class);
		}
		public TypesstatemesContext typesstatemes(int i) {
			return getRuleContext(TypesstatemesContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
				{
				{
				setState(134);
				typesstatemes();
				}
				}
				setState(139);
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
	public static class TypesstatemesContext extends ParserRuleContext {
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public RepeatBlockContext repeatBlock() {
			return getRuleContext(RepeatBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public FuctionUsageContext fuctionUsage() {
			return getRuleContext(FuctionUsageContext.class,0);
		}
		public Write_functionContext write_function() {
			return getRuleContext(Write_functionContext.class,0);
		}
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TypesstatemesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesstatemes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypesstatemes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypesstatemes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypesstatemes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesstatemesContext typesstatemes() throws RecognitionException {
		TypesstatemesContext _localctx = new TypesstatemesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typesstatemes);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				whileBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				forBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				repeatBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				fuctionUsage();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				write_function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				read_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				sentence();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				match(TEXT);
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
	public static class SentenceContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expression(0);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public AssingIdContext assingId() {
			return getRuleContext(AssingIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			assingId();
			}
			setState(156);
			match(ASSIGN);
			{
			setState(157);
			expression(0);
			}
			setState(158);
			match(SEMI_COLON);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCallExpressionContext extends ExpressionContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ArrayCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBiCallExpressionContext extends ExpressionContext {
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ArrayBiCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayBiCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayBiCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayBiCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuesExpressionContext extends ExpressionContext {
		public Optional_valuesContext optional_values() {
			return getRuleContext(Optional_valuesContext.class,0);
		}
		public ValuesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterValuesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitValuesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitValuesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(pascalParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
		public MulDivModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMulDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMulDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitMulDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				match(BRACKET_LEFT);
				setState(162);
				expression(0);
				setState(163);
				match(BRACKET_RIGHT);
				}
				break;
			case 2:
				{
				_localctx = new ValuesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				optional_values();
				}
				break;
			case 3:
				{
				_localctx = new ArrayCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				array_call();
				}
				break;
			case 4:
				{
				_localctx = new ArrayBiCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				arraybi_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class AssingIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public AssingIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAssingId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAssingId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAssingId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssingIdContext assingId() throws RecognitionException {
		AssingIdContext _localctx = new AssingIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assingId);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				array_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				arraybi_call();
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
	public static class Optional_valuesContext extends ParserRuleContext {
		public FuctionUsageContext fuctionUsage() {
			return getRuleContext(FuctionUsageContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode TEXTCHAR() { return getToken(pascalParser.TEXTCHAR, 0); }
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public Optional_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterOptional_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitOptional_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitOptional_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_valuesContext optional_values() throws RecognitionException {
		Optional_valuesContext _localctx = new Optional_valuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optional_values);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				fuctionUsage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(TEXTCHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				match(FALSE);
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
	public static class VarBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public VarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(VAR);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				varDecl();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class VarDeclContext extends ParserRuleContext {
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			varID();
			setState(202);
			match(COLON);
			setState(203);
			typeDef();
			setState(204);
			match(SEMI_COLON);
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
	public static class VarIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pascalParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pascalParser.COMA, i);
		}
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIDContext varID() throws RecognitionException {
		VarIDContext _localctx = new VarIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(206);
			match(ID);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(207);
				match(COMA);
				{
				setState(208);
				match(ID);
				}
				}
				}
				setState(213);
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
	public static class TypeDefContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			typeName();
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
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public ArrDeclContext arrDecl() {
			return getRuleContext(ArrDeclContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeName);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(BOOL_TYPE);
				}
				break;
			case STR_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(STR_TYPE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				arrDecl();
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
	public static class ArrDeclContext extends ParserRuleContext {
		public Arr1DContext arr1D() {
			return getRuleContext(Arr1DContext.class,0);
		}
		public Arr2DContext arr2D() {
			return getRuleContext(Arr2DContext.class,0);
		}
		public ArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrDeclContext arrDecl() throws RecognitionException {
		ArrDeclContext _localctx = new ArrDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrDecl);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				arr1D();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				arr2D();
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
	public static class Arr1DContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pascalParser.ARRAY, 0); }
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public TerminalNode DOBLEDOTS() { return getToken(pascalParser.DOBLEDOTS, 0); }
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public TypearrayContext typearray() {
			return getRuleContext(TypearrayContext.class,0);
		}
		public Arr1DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr1D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArr1D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArr1D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArr1D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr1DContext arr1D() throws RecognitionException {
		Arr1DContext _localctx = new Arr1DContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arr1D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ARRAY);
			setState(228);
			match(SQBRACKET_LEFT);
			setState(229);
			range();
			setState(230);
			match(DOBLEDOTS);
			setState(231);
			range();
			setState(232);
			match(SQBRACKET_RIGHT);
			setState(233);
			match(OF);
			setState(234);
			typearray();
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
	public static class Arr2DContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pascalParser.ARRAY, 0); }
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<TerminalNode> DOBLEDOTS() { return getTokens(pascalParser.DOBLEDOTS); }
		public TerminalNode DOBLEDOTS(int i) {
			return getToken(pascalParser.DOBLEDOTS, i);
		}
		public TerminalNode COMA() { return getToken(pascalParser.COMA, 0); }
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public TypearrayContext typearray() {
			return getRuleContext(TypearrayContext.class,0);
		}
		public Arr2DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr2D; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArr2D(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArr2D(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArr2D(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr2DContext arr2D() throws RecognitionException {
		Arr2DContext _localctx = new Arr2DContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr2D);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ARRAY);
			setState(237);
			match(SQBRACKET_LEFT);
			setState(238);
			range();
			setState(239);
			match(DOBLEDOTS);
			setState(240);
			range();
			setState(241);
			match(COMA);
			setState(242);
			range();
			setState(243);
			match(DOBLEDOTS);
			setState(244);
			range();
			setState(245);
			match(SQBRACKET_RIGHT);
			setState(246);
			match(OF);
			setState(247);
			typearray();
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
	public static class TypearrayContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public TypearrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typearray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypearray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypearray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypearrayContext typearray() throws RecognitionException {
		TypearrayContext _localctx = new TypearrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typearray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(NUMBER);
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
	public static class ConstBlockContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(pascalParser.CONST, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public ConstBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstBlockContext constBlock() throws RecognitionException {
		ConstBlockContext _localctx = new ConstBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(CONST);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				constDecl();
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONST_CHAR || _la==CONST_STRING );
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
	public static class ConstDeclContext extends ParserRuleContext {
		public ConstCharDeclContext constCharDecl() {
			return getRuleContext(ConstCharDeclContext.class,0);
		}
		public ConstStrDeclContext constStrDecl() {
			return getRuleContext(ConstStrDeclContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constDecl);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				constCharDecl();
				}
				break;
			case CONST_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				constStrDecl();
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
	public static class ConstCharDeclContext extends ParserRuleContext {
		public TerminalNode CONST_CHAR() { return getToken(pascalParser.CONST_CHAR, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public TerminalNode TEXTCHAR() { return getToken(pascalParser.TEXTCHAR, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public ConstCharDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constCharDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstCharDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstCharDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstCharDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstCharDeclContext constCharDecl() throws RecognitionException {
		ConstCharDeclContext _localctx = new ConstCharDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constCharDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CONST_CHAR);
			setState(264);
			match(COLON);
			setState(265);
			match(ID);
			setState(266);
			match(EQUAL);
			setState(267);
			match(TEXTCHAR);
			setState(268);
			match(SEMI_COLON);
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
	public static class ConstStrDeclContext extends ParserRuleContext {
		public TerminalNode CONST_STRING() { return getToken(pascalParser.CONST_STRING, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public ConstStrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstStrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstStrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstStrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStrDeclContext constStrDecl() throws RecognitionException {
		ConstStrDeclContext _localctx = new ConstStrDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constStrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(CONST_STRING);
			setState(271);
			match(COLON);
			setState(272);
			match(ID);
			setState(273);
			match(EQUAL);
			setState(274);
			match(TEXT);
			setState(275);
			match(SEMI_COLON);
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
	public static class FunctionBlockContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				functionDecl();
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(pascalParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(pascalParser.SEMI_COLON, i);
		}
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(pascalParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(pascalParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(pascalParser.TEXT, i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FUNCTION);
			setState(283);
			match(ID);
			setState(284);
			params();
			setState(285);
			match(COLON);
			setState(286);
			returnType();
			setState(287);
			match(SEMI_COLON);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(288);
				varBlock();
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(291);
				functionBlock();
				}
			}

			setState(294);
			match(BEGIN);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(295);
						whileBlock();
						}
						break;
					case 2:
						{
						setState(296);
						forBlock();
						}
						break;
					case 3:
						{
						setState(297);
						repeatBlock();
						}
						break;
					case 4:
						{
						setState(298);
						ifBlock();
						}
						break;
					case 5:
						{
						setState(299);
						assign();
						}
						break;
					case 6:
						{
						setState(300);
						fuctionUsage();
						}
						break;
					case 7:
						{
						setState(301);
						write_function();
						}
						break;
					case 8:
						{
						setState(302);
						read_function();
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799834656768L) != 0)) ) {
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
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(314);
				assign();
				}
			}

			setState(317);
			match(END);
			setState(318);
			match(SEMI_COLON);
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
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public VarParamBlockContext varParamBlock() {
			return getRuleContext(VarParamBlockContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(BRACKET_LEFT);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(321);
				varParamBlock();
				}
			}

			}
			setState(324);
			match(BRACKET_RIGHT);
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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
	public static class VarParamBlockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<VarParamDeclContext> varParamDecl() {
			return getRuleContexts(VarParamDeclContext.class);
		}
		public VarParamDeclContext varParamDecl(int i) {
			return getRuleContext(VarParamDeclContext.class,i);
		}
		public VarParamBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParamBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarParamBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarParamBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarParamBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamBlockContext varParamBlock() throws RecognitionException {
		VarParamBlockContext _localctx = new VarParamBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varParamBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(VAR);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				varParamDecl();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class VarParamDeclContext extends ParserRuleContext {
		public VarParamIDContext varParamID() {
			return getRuleContext(VarParamIDContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeParamDefContext typeParamDef() {
			return getRuleContext(TypeParamDefContext.class,0);
		}
		public VarParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamDeclContext varParamDecl() throws RecognitionException {
		VarParamDeclContext _localctx = new VarParamDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_varParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			varParamID();
			setState(335);
			match(COLON);
			setState(336);
			typeParamDef();
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
	public static class VarParamIDContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(pascalParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pascalParser.COMA, i);
		}
		public VarParamIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParamID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVarParamID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVarParamID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVarParamID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParamIDContext varParamID() throws RecognitionException {
		VarParamIDContext _localctx = new VarParamIDContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varParamID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(338);
			match(ID);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(339);
				match(COMA);
				{
				setState(340);
				match(ID);
				}
				}
				}
				setState(345);
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
	public static class TypeParamDefContext extends ParserRuleContext {
		public TypeParamNameContext typeParamName() {
			return getRuleContext(TypeParamNameContext.class,0);
		}
		public TypeParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeParamDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeParamDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamDefContext typeParamDef() throws RecognitionException {
		TypeParamDefContext _localctx = new TypeParamDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeParamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			typeParamName();
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
	public static class TypeParamNameContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(pascalParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(pascalParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(pascalParser.BOOL_TYPE, 0); }
		public TerminalNode STR_TYPE() { return getToken(pascalParser.STR_TYPE, 0); }
		public TypeParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeParamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeParamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamNameContext typeParamName() throws RecognitionException {
		TypeParamNameContext _localctx = new TypeParamNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeParamName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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
	public static class FuctionUsageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public ParamsusableContext paramsusable() {
			return getRuleContext(ParamsusableContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public FuctionUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuctionUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFuctionUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFuctionUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFuctionUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuctionUsageContext fuctionUsage() throws RecognitionException {
		FuctionUsageContext _localctx = new FuctionUsageContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fuctionUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(ID);
			setState(351);
			match(BRACKET_LEFT);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251812727947272L) != 0)) {
				{
				setState(352);
				paramsusable();
				}
			}

			setState(355);
			match(BRACKET_RIGHT);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(356);
				match(SEMI_COLON);
				}
				break;
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
	public static class ParamsusableContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pascalParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pascalParser.COMA, i);
		}
		public ParamsusableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsusable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParamsusable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParamsusable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParamsusable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsusableContext paramsusable() throws RecognitionException {
		ParamsusableContext _localctx = new ParamsusableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_paramsusable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			expression(0);
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(360);
				match(COMA);
				{
				setState(361);
				expression(0);
				}
				}
				}
				setState(366);
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
	public static class WhileBlockContext extends ParserRuleContext {
		public List<WhileDeclaContext> whileDecla() {
			return getRuleContexts(WhileDeclaContext.class);
		}
		public WhileDeclaContext whileDecla(int i) {
			return getRuleContext(WhileDeclaContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(367);
					whileDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(370); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class WhileDeclaContext extends ParserRuleContext {
		public TerminalNode C_WHILE() { return getToken(pascalParser.C_WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode C_DO() { return getToken(pascalParser.C_DO, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public WhileDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWhileDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWhileDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWhileDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDeclaContext whileDecla() throws RecognitionException {
		WhileDeclaContext _localctx = new WhileDeclaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileDecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(C_WHILE);
			setState(373);
			condition();
			setState(374);
			match(C_DO);
			setState(375);
			match(BEGIN);
			setState(376);
			statements();
			setState(377);
			match(END);
			setState(378);
			match(SEMI_COLON);
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
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public ConditionvaliContext conditionvali() {
			return getRuleContext(ConditionvaliContext.class,0);
		}
		public Codition2Context codition2() {
			return getRuleContext(Codition2Context.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(BRACKET_LEFT);
			{
			setState(381);
			match(ID);
			setState(382);
			conditionvali();
			setState(383);
			codition2();
			}
			setState(385);
			match(BRACKET_RIGHT);
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
	public static class Codition2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public Codition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCodition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCodition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCodition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Codition2Context codition2() throws RecognitionException {
		Codition2Context _localctx = new Codition2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_codition2);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				sentence();
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
	public static class ForBlockContext extends ParserRuleContext {
		public List<ForDeclaContext> forDecla() {
			return getRuleContexts(ForDeclaContext.class);
		}
		public ForDeclaContext forDecla(int i) {
			return getRuleContext(ForDeclaContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(392);
					forDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(395); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ForDeclaContext extends ParserRuleContext {
		public TerminalNode C_FOR() { return getToken(pascalParser.C_FOR, 0); }
		public ForconditionContext forcondition() {
			return getRuleContext(ForconditionContext.class,0);
		}
		public TerminalNode C_to() { return getToken(pascalParser.C_to, 0); }
		public ValuesforContext valuesfor() {
			return getRuleContext(ValuesforContext.class,0);
		}
		public TerminalNode C_DO() { return getToken(pascalParser.C_DO, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public WhileDeclaContext whileDecla() {
			return getRuleContext(WhileDeclaContext.class,0);
		}
		public ForDeclaContext forDecla() {
			return getRuleContext(ForDeclaContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ForDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclaContext forDecla() throws RecognitionException {
		ForDeclaContext _localctx = new ForDeclaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forDecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(C_FOR);
			setState(398);
			forcondition();
			setState(399);
			match(C_to);
			setState(400);
			valuesfor();
			setState(401);
			match(C_DO);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				{
				setState(402);
				match(BEGIN);
				setState(403);
				statements();
				setState(404);
				match(END);
				setState(405);
				match(SEMI_COLON);
				}
				}
				break;
			case 2:
				{
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case C_WHILE:
					{
					setState(407);
					whileDecla();
					}
					break;
				case C_FOR:
					{
					setState(408);
					forDecla();
					}
					break;
				case BRACKET_LEFT:
				case NUMBER:
				case TEXTCHAR:
				case TEXT:
				case TRUE:
				case FALSE:
				case ID:
					{
					setState(409);
					sentence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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
	public static class ForconditionContext extends ParserRuleContext {
		public IdforContext idfor() {
			return getRuleContext(IdforContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ValuesforContext valuesfor() {
			return getRuleContext(ValuesforContext.class,0);
		}
		public ForconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForconditionContext forcondition() throws RecognitionException {
		ForconditionContext _localctx = new ForconditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			idfor();
			setState(415);
			match(ASSIGN);
			setState(416);
			valuesfor();
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
	public static class IdforContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public IdforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdforContext idfor() throws RecognitionException {
		IdforContext _localctx = new IdforContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_idfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(ID);
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
	public static class ValuesforContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public ValuesforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterValuesfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitValuesfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitValuesfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesforContext valuesfor() throws RecognitionException {
		ValuesforContext _localctx = new ValuesforContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_valuesfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
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
	public static class RepeatBlockContext extends ParserRuleContext {
		public List<RepeatDeclaContext> repeatDecla() {
			return getRuleContexts(RepeatDeclaContext.class);
		}
		public RepeatDeclaContext repeatDecla(int i) {
			return getRuleContext(RepeatDeclaContext.class,i);
		}
		public RepeatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatBlockContext repeatBlock() throws RecognitionException {
		RepeatBlockContext _localctx = new RepeatBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_repeatBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(422);
					repeatDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(425); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class RepeatDeclaContext extends ParserRuleContext {
		public TerminalNode C_REPEAT() { return getToken(pascalParser.C_REPEAT, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public RepeatconditionContext repeatcondition() {
			return getRuleContext(RepeatconditionContext.class,0);
		}
		public List<WhileBlockContext> whileBlock() {
			return getRuleContexts(WhileBlockContext.class);
		}
		public WhileBlockContext whileBlock(int i) {
			return getRuleContext(WhileBlockContext.class,i);
		}
		public List<ForBlockContext> forBlock() {
			return getRuleContexts(ForBlockContext.class);
		}
		public ForBlockContext forBlock(int i) {
			return getRuleContext(ForBlockContext.class,i);
		}
		public List<RepeatBlockContext> repeatBlock() {
			return getRuleContexts(RepeatBlockContext.class);
		}
		public RepeatBlockContext repeatBlock(int i) {
			return getRuleContext(RepeatBlockContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<FuctionUsageContext> fuctionUsage() {
			return getRuleContexts(FuctionUsageContext.class);
		}
		public FuctionUsageContext fuctionUsage(int i) {
			return getRuleContext(FuctionUsageContext.class,i);
		}
		public List<Write_functionContext> write_function() {
			return getRuleContexts(Write_functionContext.class);
		}
		public Write_functionContext write_function(int i) {
			return getRuleContext(Write_functionContext.class,i);
		}
		public List<Read_functionContext> read_function() {
			return getRuleContexts(Read_functionContext.class);
		}
		public Read_functionContext read_function(int i) {
			return getRuleContext(Read_functionContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public RepeatDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatDeclaContext repeatDecla() throws RecognitionException {
		RepeatDeclaContext _localctx = new RepeatDeclaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_repeatDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(C_REPEAT);
			setState(428);
			match(BEGIN);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2264044794806286L) != 0)) {
				{
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(429);
					whileBlock();
					}
					break;
				case 2:
					{
					setState(430);
					forBlock();
					}
					break;
				case 3:
					{
					setState(431);
					repeatBlock();
					}
					break;
				case 4:
					{
					setState(432);
					ifBlock();
					}
					break;
				case 5:
					{
					setState(433);
					fuctionUsage();
					}
					break;
				case 6:
					{
					setState(434);
					write_function();
					}
					break;
				case 7:
					{
					setState(435);
					read_function();
					}
					break;
				case 8:
					{
					setState(436);
					sentence();
					}
					break;
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(END);
			setState(443);
			repeatcondition();
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
	public static class RepeatconditionContext extends ParserRuleContext {
		public TerminalNode C_UNTIL() { return getToken(pascalParser.C_UNTIL, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public ConditionvaliContext conditionvali() {
			return getRuleContext(ConditionvaliContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(pascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalParser.ID, i);
		}
		public RepeatconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatconditionContext repeatcondition() throws RecognitionException {
		RepeatconditionContext _localctx = new RepeatconditionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_repeatcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(C_UNTIL);
			{
			{
			setState(446);
			match(ID);
			}
			setState(447);
			conditionvali();
			{
			setState(448);
			match(ID);
			}
			}
			setState(450);
			match(SEMI_COLON);
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
	public static class IfBlockContext extends ParserRuleContext {
		public List<IfDeclaContext> ifDecla() {
			return getRuleContexts(IfDeclaContext.class);
		}
		public IfDeclaContext ifDecla(int i) {
			return getRuleContext(IfDeclaContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(452);
					ifDecla();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(455); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class IfDeclaContext extends ParserRuleContext {
		public TerminalNode C_IF() { return getToken(pascalParser.C_IF, 0); }
		public IfconditionContext ifcondition() {
			return getRuleContext(IfconditionContext.class,0);
		}
		public TerminalNode C_THEN() { return getToken(pascalParser.C_THEN, 0); }
		public TerminalNode C_ELSE() { return getToken(pascalParser.C_ELSE, 0); }
		public List<TypesstatemesContext> typesstatemes() {
			return getRuleContexts(TypesstatemesContext.class);
		}
		public TypesstatemesContext typesstatemes(int i) {
			return getRuleContext(TypesstatemesContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public IfDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDeclaContext ifDecla() throws RecognitionException {
		IfDeclaContext _localctx = new IfDeclaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ifDecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(C_IF);
			setState(458);
			ifcondition();
			setState(459);
			match(C_THEN);
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				{
				setState(460);
				match(BEGIN);
				setState(461);
				statements();
				setState(462);
				match(END);
				setState(463);
				match(SEMI_COLON);
				}
				}
				break;
			case 2:
				{
				{
				setState(465);
				typesstatemes();
				}
				}
				break;
			}
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(468);
				match(C_ELSE);
				setState(469);
				typesstatemes();
				}
				break;
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
	public static class IfconditionContext extends ParserRuleContext {
		public ConditionvaliContext conditionvali() {
			return getRuleContext(ConditionvaliContext.class,0);
		}
		public Cond2Context cond2() {
			return getRuleContext(Cond2Context.class,0);
		}
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public IfconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfconditionContext ifcondition() throws RecognitionException {
		IfconditionContext _localctx = new IfconditionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(472);
			match(ID);
			}
			setState(473);
			conditionvali();
			setState(474);
			cond2();
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
	public static class ConditionvaliContext extends ParserRuleContext {
		public TerminalNode BOOLEANE() { return getToken(pascalParser.BOOLEANE, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public ConditionvaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionvali; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConditionvali(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConditionvali(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConditionvali(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionvaliContext conditionvali() throws RecognitionException {
		ConditionvaliContext _localctx = new ConditionvaliContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_conditionvali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANE || _la==EQUAL) ) {
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
	public static class Cond2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public Cond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond2Context cond2() throws RecognitionException {
		Cond2Context _localctx = new Cond2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_cond2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799834656768L) != 0)) ) {
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
	public static class Array_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public Arraybi1Context arraybi1() {
			return getRuleContext(Arraybi1Context.class,0);
		}
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public Array_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArray_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArray_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArray_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_callContext array_call() throws RecognitionException {
		Array_callContext _localctx = new Array_callContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_array_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(ID);
			setState(481);
			match(SQBRACKET_LEFT);
			setState(482);
			arraybi1();
			setState(483);
			match(SQBRACKET_RIGHT);
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
	public static class Arraybi_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode SQBRACKET_LEFT() { return getToken(pascalParser.SQBRACKET_LEFT, 0); }
		public Arraybi1Context arraybi1() {
			return getRuleContext(Arraybi1Context.class,0);
		}
		public TerminalNode COMA() { return getToken(pascalParser.COMA, 0); }
		public Arraybi2Context arraybi2() {
			return getRuleContext(Arraybi2Context.class,0);
		}
		public TerminalNode SQBRACKET_RIGHT() { return getToken(pascalParser.SQBRACKET_RIGHT, 0); }
		public Arraybi_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybi_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybi_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybi_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybi_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybi_callContext arraybi_call() throws RecognitionException {
		Arraybi_callContext _localctx = new Arraybi_callContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arraybi_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(ID);
			setState(486);
			match(SQBRACKET_LEFT);
			setState(487);
			arraybi1();
			setState(488);
			match(COMA);
			setState(489);
			arraybi2();
			setState(490);
			match(SQBRACKET_RIGHT);
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
	public static class Arraybi1Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Arraybi1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybi1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybi1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybi1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybi1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybi1Context arraybi1() throws RecognitionException {
		Arraybi1Context _localctx = new Arraybi1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_arraybi1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
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
	public static class Arraybi2Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Arraybi2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybi2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybi2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybi2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybi2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybi2Context arraybi2() throws RecognitionException {
		Arraybi2Context _localctx = new Arraybi2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_arraybi2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
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
	public static class Read_functionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(pascalParser.READ, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public ReadIdContext readId() {
			return getRuleContext(ReadIdContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public Read_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRead_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRead_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRead_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_functionContext read_function() throws RecognitionException {
		Read_functionContext _localctx = new Read_functionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_read_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(READ);
			setState(497);
			match(BRACKET_LEFT);
			setState(498);
			readId();
			setState(499);
			match(BRACKET_RIGHT);
			setState(500);
			match(SEMI_COLON);
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
	public static class ReadIdContext extends ParserRuleContext {
		public ReadIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readId; }
	 
		public ReadIdContext() { }
		public void copyFrom(ReadIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraybiReadContext extends ReadIdContext {
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ArraybiReadContext(ReadIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybiRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybiRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybiRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdReadContext extends ReadIdContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public IdReadContext(ReadIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayReadContext extends ReadIdContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ArrayReadContext(ReadIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadIdContext readId() throws RecognitionException {
		ReadIdContext _localctx = new ReadIdContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_readId);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new IdReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				array_call();
				}
				break;
			case 3:
				_localctx = new ArraybiReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				arraybi_call();
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
	public static class Write_functionContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(pascalParser.WRITE, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(pascalParser.BRACKET_LEFT, 0); }
		public WriteIdContext writeId() {
			return getRuleContext(WriteIdContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(pascalParser.BRACKET_RIGHT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(pascalParser.SEMI_COLON, 0); }
		public Write_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWrite_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWrite_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWrite_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_functionContext write_function() throws RecognitionException {
		Write_functionContext _localctx = new Write_functionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_write_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(WRITE);
			setState(508);
			match(BRACKET_LEFT);
			setState(509);
			writeId();
			setState(510);
			match(BRACKET_RIGHT);
			setState(511);
			match(SEMI_COLON);
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
	public static class WriteIdContext extends ParserRuleContext {
		public WriteIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeId; }
	 
		public WriteIdContext() { }
		public void copyFrom(WriteIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdWriteContext extends WriteIdContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode COMA() { return getToken(pascalParser.COMA, 0); }
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public IdWriteContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraybiWriteContext extends WriteIdContext {
		public Arraybi_callContext arraybi_call() {
			return getRuleContext(Arraybi_callContext.class,0);
		}
		public ArraybiWriteContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArraybiWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArraybiWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArraybiWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdTextContext extends WriteIdContext {
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public IdTextContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayWriteContext extends WriteIdContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ArrayWriteContext(WriteIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteIdContext writeId() throws RecognitionException {
		WriteIdContext _localctx = new WriteIdContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_writeId);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IdWriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(TEXT);
				setState(515);
				match(COMA);
				setState(519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(516);
					match(ID);
					}
					break;
				case 2:
					{
					setState(517);
					array_call();
					}
					break;
				case 3:
					{
					setState(518);
					arraybi_call();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ArrayWriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				array_call();
				}
				break;
			case 4:
				_localctx = new ArraybiWriteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				arraybi_call();
				}
				break;
			case 5:
				_localctx = new IdTextContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				match(TEXT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u020f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000y\b\u0000\u0001\u0000\u0003\u0000|\b\u0000\u0001"+
		"\u0000\u0003\u0000\u007f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0088\b\u0001\n"+
		"\u0001\f\u0001\u008b\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0096\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a9\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b1\b\u0005\n\u0005"+
		"\f\u0005\u00b4\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b9\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007\u0001\b\u0001\b\u0004"+
		"\b\u00c6\b\b\u000b\b\f\b\u00c7\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00de\b\f"+
		"\u0001\r\u0001\r\u0003\r\u00e2\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u0100\b\u0012\u000b\u0012\f\u0012\u0101\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0106\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0004\u0016\u0117\b\u0016\u000b\u0016\f\u0016\u0118\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0122\b\u0017\u0001\u0017\u0003\u0017\u0125\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0130\b\u0017\n\u0017\f\u0017"+
		"\u0133\t\u0017\u0001\u0017\u0005\u0017\u0136\b\u0017\n\u0017\f\u0017\u0139"+
		"\t\u0017\u0001\u0017\u0003\u0017\u013c\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0143\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0004\u001a"+
		"\u014b\b\u001a\u000b\u001a\f\u001a\u014c\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0156"+
		"\b\u001c\n\u001c\f\u001c\u0159\t\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0162\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0166\b\u001f\u0001 \u0001 \u0001"+
		" \u0005 \u016b\b \n \f \u016e\t \u0001!\u0004!\u0171\b!\u000b!\f!\u0172"+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003"+
		"$\u0187\b$\u0001%\u0004%\u018a\b%\u000b%\f%\u018b\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u019b\b&\u0003&\u019d\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0004*\u01a8\b*\u000b*\f*\u01a9\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u01b6"+
		"\b+\n+\f+\u01b9\t+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0004-\u01c6\b-\u000b-\f-\u01c7\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01d3\b.\u0001.\u0001"+
		".\u0003.\u01d7\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00037\u01fa\b7\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0208\b9\u00019\u00019\u00019\u00039\u020d\b9\u00019\u0000\u0001\n:"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0006\u0001"+
		"\u000002\u0001\u0000./\u0001\u0000\n\r\u0003\u0000\u0016\u0016\u0018\u0018"+
		"33\u0002\u0000\u0016\u001633\u0001\u0000\"#\u0227\u0000t\u0001\u0000\u0000"+
		"\u0000\u0002\u0089\u0001\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000"+
		"\u0000\u0006\u0099\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000"+
		"\n\u00a8\u0001\u0000\u0000\u0000\f\u00b8\u0001\u0000\u0000\u0000\u000e"+
		"\u00c1\u0001\u0000\u0000\u0000\u0010\u00c3\u0001\u0000\u0000\u0000\u0012"+
		"\u00c9\u0001\u0000\u0000\u0000\u0014\u00ce\u0001\u0000\u0000\u0000\u0016"+
		"\u00d6\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000\u0000\u0000\u001a"+
		"\u00e1\u0001\u0000\u0000\u0000\u001c\u00e3\u0001\u0000\u0000\u0000\u001e"+
		"\u00ec\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000\"\u00fb"+
		"\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000\u0000&\u0105\u0001\u0000"+
		"\u0000\u0000(\u0107\u0001\u0000\u0000\u0000*\u010e\u0001\u0000\u0000\u0000"+
		",\u0116\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u00000\u0140"+
		"\u0001\u0000\u0000\u00002\u0146\u0001\u0000\u0000\u00004\u0148\u0001\u0000"+
		"\u0000\u00006\u014e\u0001\u0000\u0000\u00008\u0152\u0001\u0000\u0000\u0000"+
		":\u015a\u0001\u0000\u0000\u0000<\u015c\u0001\u0000\u0000\u0000>\u015e"+
		"\u0001\u0000\u0000\u0000@\u0167\u0001\u0000\u0000\u0000B\u0170\u0001\u0000"+
		"\u0000\u0000D\u0174\u0001\u0000\u0000\u0000F\u017c\u0001\u0000\u0000\u0000"+
		"H\u0186\u0001\u0000\u0000\u0000J\u0189\u0001\u0000\u0000\u0000L\u018d"+
		"\u0001\u0000\u0000\u0000N\u019e\u0001\u0000\u0000\u0000P\u01a2\u0001\u0000"+
		"\u0000\u0000R\u01a4\u0001\u0000\u0000\u0000T\u01a7\u0001\u0000\u0000\u0000"+
		"V\u01ab\u0001\u0000\u0000\u0000X\u01bd\u0001\u0000\u0000\u0000Z\u01c5"+
		"\u0001\u0000\u0000\u0000\\\u01c9\u0001\u0000\u0000\u0000^\u01d8\u0001"+
		"\u0000\u0000\u0000`\u01dc\u0001\u0000\u0000\u0000b\u01de\u0001\u0000\u0000"+
		"\u0000d\u01e0\u0001\u0000\u0000\u0000f\u01e5\u0001\u0000\u0000\u0000h"+
		"\u01ec\u0001\u0000\u0000\u0000j\u01ee\u0001\u0000\u0000\u0000l\u01f0\u0001"+
		"\u0000\u0000\u0000n\u01f9\u0001\u0000\u0000\u0000p\u01fb\u0001\u0000\u0000"+
		"\u0000r\u020c\u0001\u0000\u0000\u0000tu\u0005\u0007\u0000\u0000uv\u0005"+
		"3\u0000\u0000vx\u0005\u001a\u0000\u0000wy\u0003\u0010\b\u0000xw\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"z|\u0003$\u0012\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}\u007f\u0003,\u0016\u0000~}\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\b\u0000\u0000\u0081\u0082\u0003\u0002\u0001\u0000\u0082"+
		"\u0083\u0005\t\u0000\u0000\u0083\u0084\u0005\u001f\u0000\u0000\u0084\u0085"+
		"\u0005\u0000\u0000\u0001\u0085\u0001\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0003\u0004\u0002\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0003\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u0096\u0003B!\u0000\u008d\u0096\u0003J"+
		"%\u0000\u008e\u0096\u0003T*\u0000\u008f\u0096\u0003Z-\u0000\u0090\u0096"+
		"\u0003>\u001f\u0000\u0091\u0096\u0003p8\u0000\u0092\u0096\u0003l6\u0000"+
		"\u0093\u0096\u0003\u0006\u0003\u0000\u0094\u0096\u0005\u0018\u0000\u0000"+
		"\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000"+
		"\u0095\u008e\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000"+
		"\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0005\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0003\b\u0004\u0000\u0098\u009a\u0003\n\u0005\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0003\f\u0006\u0000\u009c\u009d"+
		"\u0005\u0015\u0000\u0000\u009d\u009e\u0003\n\u0005\u0000\u009e\u009f\u0005"+
		"\u001a\u0000\u0000\u009f\t\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u0005"+
		"\uffff\uffff\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0003"+
		"\n\u0005\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a9\u0003\u000e\u0007\u0000\u00a6\u00a9\u0003d2\u0000"+
		"\u00a7\u00a9\u0003f3\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00b2\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\n\u0005\u0000\u0000\u00ab\u00ac\u0007\u0000\u0000\u0000\u00ac\u00b1\u0003"+
		"\n\u0005\u0006\u00ad\u00ae\n\u0004\u0000\u0000\u00ae\u00af\u0007\u0001"+
		"\u0000\u0000\u00af\u00b1\u0003\n\u0005\u0005\u00b0\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u000b\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b9\u00053\u0000\u0000\u00b6\u00b9\u0003d2\u0000\u00b7"+
		"\u00b9\u0003f3\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\r\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c2\u0003>\u001f\u0000\u00bb\u00c2\u0005\u0018\u0000"+
		"\u0000\u00bc\u00c2\u0005\u0016\u0000\u0000\u00bd\u00c2\u00053\u0000\u0000"+
		"\u00be\u00c2\u0005\u0017\u0000\u0000\u00bf\u00c2\u0005 \u0000\u0000\u00c0"+
		"\u00c2\u0005!\u0000\u0000\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c1\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u000f"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\u000e\u0000\u0000\u00c4\u00c6"+
		"\u0003\u0012\t\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u0011\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"\u0014\n\u0000\u00ca\u00cb\u0005\u0019\u0000\u0000\u00cb\u00cc\u0003\u0016"+
		"\u000b\u0000\u00cc\u00cd\u0005\u001a\u0000\u0000\u00cd\u0013\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d3\u00053\u0000\u0000\u00cf\u00d0\u0005\u001b\u0000"+
		"\u0000\u00d0\u00d2\u00053\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7"+
		"\u0017\u0001\u0000\u0000\u0000\u00d8\u00de\u0005\n\u0000\u0000\u00d9\u00de"+
		"\u0005\r\u0000\u0000\u00da\u00de\u0005\f\u0000\u0000\u00db\u00de\u0005"+
		"\u000b\u0000\u0000\u00dc\u00de\u0003\u001a\r\u0000\u00dd\u00d8\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u0019\u0001\u0000\u0000\u0000\u00df\u00e2\u0003\u001c"+
		"\u000e\u0000\u00e0\u00e2\u0003\u001e\u000f\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u001b\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005\u000f\u0000\u0000\u00e4\u00e5\u0005\u0005"+
		"\u0000\u0000\u00e5\u00e6\u0003\"\u0011\u0000\u00e6\u00e7\u0005\u001c\u0000"+
		"\u0000\u00e7\u00e8\u0003\"\u0011\u0000\u00e8\u00e9\u0005\u0006\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00eb\u0003 \u0010\u0000\u00eb"+
		"\u001d\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u000f\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0005\u0000\u0000\u00ee\u00ef\u0003\"\u0011\u0000\u00ef\u00f0"+
		"\u0005\u001c\u0000\u0000\u00f0\u00f1\u0003\"\u0011\u0000\u00f1\u00f2\u0005"+
		"\u001b\u0000\u0000\u00f2\u00f3\u0003\"\u0011\u0000\u00f3\u00f4\u0005\u001c"+
		"\u0000\u0000\u00f4\u00f5\u0003\"\u0011\u0000\u00f5\u00f6\u0005\u0006\u0000"+
		"\u0000\u00f6\u00f7\u0005\u0010\u0000\u0000\u00f7\u00f8\u0003 \u0010\u0000"+
		"\u00f8\u001f\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0002\u0000\u0000"+
		"\u00fa!\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0016\u0000\u0000\u00fc"+
		"#\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005\u0011\u0000\u0000\u00fe\u0100"+
		"\u0003&\u0013\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102%\u0001\u0000\u0000\u0000\u0103\u0106\u0003(\u0014"+
		"\u0000\u0104\u0106\u0003*\u0015\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0104\u0001\u0000\u0000\u0000\u0106\'\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005\u0012\u0000\u0000\u0108\u0109\u0005\u0019\u0000\u0000\u0109"+
		"\u010a\u00053\u0000\u0000\u010a\u010b\u0005#\u0000\u0000\u010b\u010c\u0005"+
		"\u0017\u0000\u0000\u010c\u010d\u0005\u001a\u0000\u0000\u010d)\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u0013\u0000\u0000\u010f\u0110\u0005\u0019"+
		"\u0000\u0000\u0110\u0111\u00053\u0000\u0000\u0111\u0112\u0005#\u0000\u0000"+
		"\u0112\u0113\u0005\u0018\u0000\u0000\u0113\u0114\u0005\u001a\u0000\u0000"+
		"\u0114+\u0001\u0000\u0000\u0000\u0115\u0117\u0003.\u0017\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119-\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005$\u0000\u0000\u011b\u011c\u00053\u0000"+
		"\u0000\u011c\u011d\u00030\u0018\u0000\u011d\u011e\u0005\u0019\u0000\u0000"+
		"\u011e\u011f\u00032\u0019\u0000\u011f\u0121\u0005\u001a\u0000\u0000\u0120"+
		"\u0122\u0003\u0010\b\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0003,\u0016\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0131\u0005"+
		"\b\u0000\u0000\u0127\u0130\u0003B!\u0000\u0128\u0130\u0003J%\u0000\u0129"+
		"\u0130\u0003T*\u0000\u012a\u0130\u0003Z-\u0000\u012b\u0130\u0003\b\u0004"+
		"\u0000\u012c\u0130\u0003>\u001f\u0000\u012d\u0130\u0003p8\u0000\u012e"+
		"\u0130\u0003l6\u0000\u012f\u0127\u0001\u0000\u0000\u0000\u012f\u0128\u0001"+
		"\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012a\u0001"+
		"\u0000\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u012f\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0137\u0001"+
		"\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0136\u0007"+
		"\u0003\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u013a\u013c\u0003\b\u0004\u0000\u013b\u013a\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005\t\u0000\u0000\u013e\u013f\u0005\u001a\u0000"+
		"\u0000\u013f/\u0001\u0000\u0000\u0000\u0140\u0142\u0005\u0003\u0000\u0000"+
		"\u0141\u0143\u00034\u001a\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005\u0004\u0000\u0000\u01451\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0007\u0002\u0000\u0000\u01473\u0001\u0000\u0000\u0000\u0148\u014a\u0005"+
		"\u000e\u0000\u0000\u0149\u014b\u00036\u001b\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d5\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u00038\u001c\u0000\u014f\u0150\u0005\u0019\u0000\u0000"+
		"\u0150\u0151\u0003:\u001d\u0000\u01517\u0001\u0000\u0000\u0000\u0152\u0157"+
		"\u00053\u0000\u0000\u0153\u0154\u0005\u001b\u0000\u0000\u0154\u0156\u0005"+
		"3\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u01589\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0003<\u001e\u0000\u015b;\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0007\u0002\u0000\u0000\u015d=\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u00053\u0000\u0000\u015f\u0161\u0005\u0003\u0000\u0000\u0160\u0162\u0003"+
		"@ \u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0005\u0004\u0000"+
		"\u0000\u0164\u0166\u0005\u001a\u0000\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166?\u0001\u0000\u0000\u0000"+
		"\u0167\u016c\u0003\n\u0005\u0000\u0168\u0169\u0005\u001b\u0000\u0000\u0169"+
		"\u016b\u0003\n\u0005\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016e"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016dA\u0001\u0000\u0000\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0171\u0003D\"\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173C\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005%\u0000\u0000\u0175\u0176\u0003F#\u0000\u0176"+
		"\u0177\u0005&\u0000\u0000\u0177\u0178\u0005\b\u0000\u0000\u0178\u0179"+
		"\u0003\u0002\u0001\u0000\u0179\u017a\u0005\t\u0000\u0000\u017a\u017b\u0005"+
		"\u001a\u0000\u0000\u017bE\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0003"+
		"\u0000\u0000\u017d\u017e\u00053\u0000\u0000\u017e\u017f\u0003`0\u0000"+
		"\u017f\u0180\u0003H$\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0005\u0004\u0000\u0000\u0182G\u0001\u0000\u0000\u0000\u0183\u0187\u0005"+
		"3\u0000\u0000\u0184\u0187\u0005\u0016\u0000\u0000\u0185\u0187\u0003\u0006"+
		"\u0003\u0000\u0186\u0183\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187I\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0003L&\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018cK\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005(\u0000\u0000\u018e\u018f\u0003N\'\u0000\u018f\u0190\u0005\'\u0000"+
		"\u0000\u0190\u0191\u0003R)\u0000\u0191\u019c\u0005&\u0000\u0000\u0192"+
		"\u0193\u0005\b\u0000\u0000\u0193\u0194\u0003\u0002\u0001\u0000\u0194\u0195"+
		"\u0005\t\u0000\u0000\u0195\u0196\u0005\u001a\u0000\u0000\u0196\u019d\u0001"+
		"\u0000\u0000\u0000\u0197\u019b\u0003D\"\u0000\u0198\u019b\u0003L&\u0000"+
		"\u0199\u019b\u0003\u0006\u0003\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u0192\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019dM\u0001\u0000\u0000\u0000\u019e\u019f\u0003P(\u0000\u019f\u01a0"+
		"\u0005\u0015\u0000\u0000\u01a0\u01a1\u0003R)\u0000\u01a1O\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u00053\u0000\u0000\u01a3Q\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0007\u0004\u0000\u0000\u01a5S\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a8\u0003V+\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aaU\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005)\u0000"+
		"\u0000\u01ac\u01b7\u0005\b\u0000\u0000\u01ad\u01b6\u0003B!\u0000\u01ae"+
		"\u01b6\u0003J%\u0000\u01af\u01b6\u0003T*\u0000\u01b0\u01b6\u0003Z-\u0000"+
		"\u01b1\u01b6\u0003>\u001f\u0000\u01b2\u01b6\u0003p8\u0000\u01b3\u01b6"+
		"\u0003l6\u0000\u01b4\u01b6\u0003\u0006\u0003\u0000\u01b5\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b5\u01ae\u0001\u0000\u0000\u0000\u01b5\u01af\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000\u0000\u01b5\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0005\t\u0000\u0000\u01bb\u01bc\u0003X,\u0000"+
		"\u01bcW\u0001\u0000\u0000\u0000\u01bd\u01be\u0005*\u0000\u0000\u01be\u01bf"+
		"\u00053\u0000\u0000\u01bf\u01c0\u0003`0\u0000\u01c0\u01c1\u00053\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u001a\u0000"+
		"\u0000\u01c3Y\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003\\.\u0000\u01c5"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"[\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005+\u0000\u0000\u01ca\u01cb\u0003"+
		"^/\u0000\u01cb\u01d2\u0005,\u0000\u0000\u01cc\u01cd\u0005\b\u0000\u0000"+
		"\u01cd\u01ce\u0003\u0002\u0001\u0000\u01ce\u01cf\u0005\t\u0000\u0000\u01cf"+
		"\u01d0\u0005\u001a\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d3\u0003\u0004\u0002\u0000\u01d2\u01cc\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005-\u0000\u0000\u01d5\u01d7"+
		"\u0003\u0004\u0002\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7]\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005"+
		"3\u0000\u0000\u01d9\u01da\u0003`0\u0000\u01da\u01db\u0003b1\u0000\u01db"+
		"_\u0001\u0000\u0000\u0000\u01dc\u01dd\u0007\u0005\u0000\u0000\u01dda\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0007\u0003\u0000\u0000\u01dfc\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u00053\u0000\u0000\u01e1\u01e2\u0005\u0005\u0000"+
		"\u0000\u01e2\u01e3\u0003h4\u0000\u01e3\u01e4\u0005\u0006\u0000\u0000\u01e4"+
		"e\u0001\u0000\u0000\u0000\u01e5\u01e6\u00053\u0000\u0000\u01e6\u01e7\u0005"+
		"\u0005\u0000\u0000\u01e7\u01e8\u0003h4\u0000\u01e8\u01e9\u0005\u001b\u0000"+
		"\u0000\u01e9\u01ea\u0003j5\u0000\u01ea\u01eb\u0005\u0006\u0000\u0000\u01eb"+
		"g\u0001\u0000\u0000\u0000\u01ec\u01ed\u0007\u0004\u0000\u0000\u01edi\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0007\u0004\u0000\u0000\u01efk\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0005\u0001\u0000\u0000\u01f1\u01f2\u0005\u0003"+
		"\u0000\u0000\u01f2\u01f3\u0003n7\u0000\u01f3\u01f4\u0005\u0004\u0000\u0000"+
		"\u01f4\u01f5\u0005\u001a\u0000\u0000\u01f5m\u0001\u0000\u0000\u0000\u01f6"+
		"\u01fa\u00053\u0000\u0000\u01f7\u01fa\u0003d2\u0000\u01f8\u01fa\u0003"+
		"f3\u0000\u01f9\u01f6\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fao\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fc\u0005\u0002\u0000\u0000\u01fc\u01fd\u0005\u0003\u0000\u0000"+
		"\u01fd\u01fe\u0003r9\u0000\u01fe\u01ff\u0005\u0004\u0000\u0000\u01ff\u0200"+
		"\u0005\u001a\u0000\u0000\u0200q\u0001\u0000\u0000\u0000\u0201\u020d\u0005"+
		"3\u0000\u0000\u0202\u0203\u0005\u0018\u0000\u0000\u0203\u0207\u0005\u001b"+
		"\u0000\u0000\u0204\u0208\u00053\u0000\u0000\u0205\u0208\u0003d2\u0000"+
		"\u0206\u0208\u0003f3\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0207\u0205"+
		"\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020d"+
		"\u0001\u0000\u0000\u0000\u0209\u020d\u0003d2\u0000\u020a\u020d\u0003f"+
		"3\u0000\u020b\u020d\u0005\u0018\u0000\u0000\u020c\u0201\u0001\u0000\u0000"+
		"\u0000\u020c\u0202\u0001\u0000\u0000\u0000\u020c\u0209\u0001\u0000\u0000"+
		"\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000"+
		"\u0000\u020ds\u0001\u0000\u0000\u0000,x{~\u0089\u0095\u0099\u00a8\u00b0"+
		"\u00b2\u00b8\u00c1\u00c7\u00d3\u00dd\u00e1\u0101\u0105\u0118\u0121\u0124"+
		"\u012f\u0131\u0137\u013b\u0142\u014c\u0157\u0161\u0165\u016c\u0172\u0186"+
		"\u018b\u019a\u019c\u01a9\u01b5\u01b7\u01c7\u01d2\u01d6\u01f9\u0207\u020c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}