// Generated from /Users/yepro12/compiler2017/src/com/yepro12/compiler2017/Parser/mx.g4 by ANTLR 4.6
package com.yepro12.compiler2017.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SELFPLUS=7, SELFMINUS=8, 
		PLUS=9, MINUS=10, TIMES=11, DIVIDE=12, MODULE=13, LSHIFT=14, RSHIFT=15, 
		LESSEQUALTHAN=16, GREATEREQUALTHAN=17, LESSTHAN=18, GREATERTHAN=19, EQUAL=20, 
		NOTEQUAL=21, LAND=22, BAND=23, LOR=24, BOR=25, LNOT=26, BNOT=27, BXOR=28, 
		PIES=29, BOOL=30, INT=31, STRING=32, NULL=33, VOID=34, TRUE=35, FALSE=36, 
		IF=37, ELSE=38, FOR=39, WHILE=40, BREAK=41, CONTINUE=42, RETURN=43, NEW=44, 
		CLASS=45, THIS=46, SEMICOLON=47, COMMA=48, ASSIGN=49, NUM=50, ID=51, CHAIN=52, 
		DIGIT=53, ALPHA=54, COMMENT=55, NEWLINE=56, WS=57, CHAR=58;
	public static final int
		RULE_code = 0, RULE_section = 1, RULE_stmt = 2, RULE_sta = 3, RULE_block = 4, 
		RULE_branch = 5, RULE_jump = 6, RULE_loop = 7, RULE_vardefine = 8, RULE_classdefine = 9, 
		RULE_member = 10, RULE_function = 11, RULE_paralist = 12, RULE_argument = 13, 
		RULE_arraytype = 14, RULE_type = 15, RULE_exprstmt = 16, RULE_expr = 17, 
		RULE_lite = 18, RULE_newtype = 19, RULE_dim = 20, RULE_list = 21;
	public static final String[] ruleNames = {
		"code", "section", "stmt", "sta", "block", "branch", "jump", "loop", "vardefine", 
		"classdefine", "member", "function", "paralist", "argument", "arraytype", 
		"type", "exprstmt", "expr", "lite", "newtype", "dim", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'['", "']'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'<='", "'>='", "'<'", "'>'", 
		"'=='", "'!='", "'&&'", "'&'", "'||'", "'|'", "'!'", "'~'", "'^'", "'.'", 
		"'bool'", "'int'", "'string'", "'null'", "'void'", "'TRUE'", "'FALSE'", 
		"'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", "'return'", 
		"'new'", "'class'", "'this'", "';'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "SELFPLUS", "SELFMINUS", "PLUS", 
		"MINUS", "TIMES", "DIVIDE", "MODULE", "LSHIFT", "RSHIFT", "LESSEQUALTHAN", 
		"GREATEREQUALTHAN", "LESSTHAN", "GREATERTHAN", "EQUAL", "NOTEQUAL", "LAND", 
		"BAND", "LOR", "BOR", "LNOT", "BNOT", "BXOR", "PIES", "BOOL", "INT", "STRING", 
		"NULL", "VOID", "TRUE", "FALSE", "IF", "ELSE", "FOR", "WHILE", "BREAK", 
		"CONTINUE", "RETURN", "NEW", "CLASS", "THIS", "SEMICOLON", "COMMA", "ASSIGN", 
		"NUM", "ID", "CHAIN", "DIGIT", "ALPHA", "COMMENT", "NEWLINE", "WS", "CHAR"
	};
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
	public String getGrammarFileName() { return "mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mxParser.EOF, 0); }
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				section();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class SectionContext extends ParserRuleContext {
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	 
		public SectionContext() { }
		public void copyFrom(SectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassdefContext extends SectionContext {
		public ClassdefineContext classdefine() {
			return getRuleContext(ClassdefineContext.class,0);
		}
		public ClassdefContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlbvardefContext extends SectionContext {
		public VardefineContext vardefine() {
			return getRuleContext(VardefineContext.class,0);
		}
		public GlbvardefContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterGlbvardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitGlbvardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitGlbvardef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncdefContext extends SectionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncdefContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ClassdefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				classdefine();
				}
				break;
			case 2:
				_localctx = new FuncdefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				function();
				}
				break;
			case 3:
				_localctx = new GlbvardefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				vardefine();
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
	public static class StatementContext extends StmtContext {
		public StaContext sta() {
			return getRuleContext(StaContext.class,0);
		}
		public StatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			_localctx = new StatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			sta();
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

	public static class StaContext extends ParserRuleContext {
		public StaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sta; }
	 
		public StaContext() { }
		public void copyFrom(StaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlkContext extends StaContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlkContext(StaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterBlk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitBlk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBlk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends StaContext {
		public ExprstmtContext exprstmt() {
			return getRuleContext(ExprstmtContext.class,0);
		}
		public ExpressionContext(StaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BranContext extends StaContext {
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public BranContext(StaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterBran(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitBran(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBran(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LpContext extends StaContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LpContext(StaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterLp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitLp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitLp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JpContext extends StaContext {
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public JpContext(StaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterJp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitJp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitJp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardefContext extends StaContext {
		public VardefineContext vardefine() {
			return getRuleContext(VardefineContext.class,0);
		}
		public VardefContext(StaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaContext sta() throws RecognitionException {
		StaContext _localctx = new StaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sta);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BlkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				block();
				}
				break;
			case 2:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				exprstmt();
				}
				break;
			case 3:
				_localctx = new LpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				loop();
				}
				break;
			case 4:
				_localctx = new BranContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				branch();
				}
				break;
			case 5:
				_localctx = new JpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				jump();
				}
				break;
			case 6:
				_localctx = new VardefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				vardefine();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << NULL) | (1L << VOID) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << SEMICOLON) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
				{
				{
				setState(68);
				stmt();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__1);
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

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mxParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(mxParser.ELSE, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IF);
			setState(77);
			match(T__2);
			setState(78);
			expr(0);
			setState(79);
			match(T__3);
			setState(80);
			stmt();
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(81);
				match(ELSE);
				setState(82);
				stmt();
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

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
	 
		public JumpContext() { }
		public void copyFrom(JumpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakContext extends JumpContext {
		public TerminalNode BREAK() { return getToken(mxParser.BREAK, 0); }
		public BreakContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends JumpContext {
		public TerminalNode CONTINUE() { return getToken(mxParser.CONTINUE, 0); }
		public ContinueContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends JumpContext {
		public TerminalNode RETURN() { return getToken(mxParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(JumpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jump);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(RETURN);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
					{
					setState(86);
					expr(0);
					}
				}

				setState(89);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(BREAK);
				setState(91);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(CONTINUE);
				setState(93);
				match(SEMICOLON);
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends LoopContext {
		public ExprContext init;
		public ExprContext cond;
		public ExprContext step;
		public TerminalNode FOR() { return getToken(mxParser.FOR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends LoopContext {
		public TerminalNode WHILE() { return getToken(mxParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(FOR);
				setState(97);
				match(T__2);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
					{
					setState(98);
					((ForContext)_localctx).init = expr(0);
					}
				}

				setState(101);
				match(SEMICOLON);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
					{
					setState(102);
					((ForContext)_localctx).cond = expr(0);
					}
				}

				setState(105);
				match(SEMICOLON);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
					{
					setState(106);
					((ForContext)_localctx).step = expr(0);
					}
				}

				setState(109);
				match(T__3);
				setState(110);
				stmt();
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(WHILE);
				setState(112);
				match(T__2);
				setState(113);
				expr(0);
				setState(114);
				match(T__3);
				setState(115);
				stmt();
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

	public static class VardefineContext extends ParserRuleContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterVardefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitVardefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitVardefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefineContext vardefine() throws RecognitionException {
		VardefineContext _localctx = new VardefineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			arraytype(0);
			setState(120);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(121);
				match(ASSIGN);
				setState(122);
				expr(0);
				}
			}

			setState(125);
			match(SEMICOLON);
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

	public static class ClassdefineContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(mxParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ClassdefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterClassdefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitClassdefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitClassdefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefineContext classdefine() throws RecognitionException {
		ClassdefineContext _localctx = new ClassdefineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classdefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CLASS);
			setState(128);
			match(ID);
			setState(129);
			match(T__0);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(130);
				member();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__1);
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

	public static class MemberContext extends ParserRuleContext {
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	 
		public MemberContext() { }
		public void copyFrom(MemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClsfuncContext extends MemberContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ClsfuncContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterClsfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitClsfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitClsfunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClsvarContext extends MemberContext {
		public VardefineContext vardefine() {
			return getRuleContext(VardefineContext.class,0);
		}
		public ClsvarContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterClsvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitClsvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitClsvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_member);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ClsvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				vardefine();
				}
				break;
			case 2:
				_localctx = new ClsfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				function();
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

	public static class FunctionContext extends ParserRuleContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParalistContext paralist() {
			return getRuleContext(ParalistContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			arraytype(0);
			setState(143);
			match(ID);
			setState(144);
			match(T__2);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(145);
				paralist();
				}
			}

			setState(148);
			match(T__3);
			setState(149);
			block();
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

	public static class ParalistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mxParser.COMMA, i);
		}
		public ParalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterParalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitParalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitParalist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParalistContext paralist() throws RecognitionException {
		ParalistContext _localctx = new ParalistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paralist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			argument();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				argument();
				}
				}
				setState(158);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			arraytype(0);
			setState(160);
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

	public static class ArraytypeContext extends ParserRuleContext {
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
	 
		public ArraytypeContext() { }
		public void copyFrom(ArraytypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArtpContext extends ArraytypeContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public ArtpContext(ArraytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterArtp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitArtp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitArtp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonarrayContext extends ArraytypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonarrayContext(ArraytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterNonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitNonarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitNonarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		return arraytype(0);
	}

	private ArraytypeContext arraytype(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, _parentState);
		ArraytypeContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arraytype, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NonarrayContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(163);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArtpContext(new ArraytypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arraytype);
					setState(165);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(166);
					match(T__4);
					setState(167);
					match(T__5);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public Token tp;
		public TerminalNode BOOL() { return getToken(mxParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(mxParser.INT, 0); }
		public TerminalNode VOID() { return getToken(mxParser.VOID, 0); }
		public TerminalNode STRING() { return getToken(mxParser.STRING, 0); }
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((TypeContext)_localctx).tp = match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((TypeContext)_localctx).tp = match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				((TypeContext)_localctx).tp = match(VOID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				((TypeContext)_localctx).tp = match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				((TypeContext)_localctx).tp = match(ID);
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

	public static class ExprstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterExprstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitExprstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitExprstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprstmtContext exprstmt() throws RecognitionException {
		ExprstmtContext _localctx = new ExprstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
				{
				setState(180);
				expr(0);
				}
			}

			setState(183);
			match(SEMICOLON);
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
	public static class ParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewpContext extends ExprContext {
		public TerminalNode NEW() { return getToken(mxParser.NEW, 0); }
		public NewtypeContext newtype() {
			return getRuleContext(NewtypeContext.class,0);
		}
		public NewpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterNewp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitNewp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitNewp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(mxParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(mxParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(mxParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(mxParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(mxParser.MINUS, 0); }
		public TerminalNode LSHIFT() { return getToken(mxParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(mxParser.RSHIFT, 0); }
		public TerminalNode LESSEQUALTHAN() { return getToken(mxParser.LESSEQUALTHAN, 0); }
		public TerminalNode GREATEREQUALTHAN() { return getToken(mxParser.GREATEREQUALTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(mxParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(mxParser.GREATERTHAN, 0); }
		public TerminalNode EQUAL() { return getToken(mxParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(mxParser.NOTEQUAL, 0); }
		public TerminalNode BAND() { return getToken(mxParser.BAND, 0); }
		public TerminalNode BOR() { return getToken(mxParser.BOR, 0); }
		public TerminalNode BXOR() { return getToken(mxParser.BXOR, 0); }
		public TerminalNode LOR() { return getToken(mxParser.LOR, 0); }
		public TerminalNode LAND() { return getToken(mxParser.LAND, 0); }
		public TerminalNode ASSIGN() { return getToken(mxParser.ASSIGN, 0); }
		public BinaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterBina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitBina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitBina(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FccallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FccallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterFccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitFccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitFccall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MbacContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PIES() { return getToken(mxParser.PIES, 0); }
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public MbacContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterMbac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitMbac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitMbac(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdenContext extends ExprContext {
		public TerminalNode ID() { return getToken(mxParser.ID, 0); }
		public IdenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitIden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitIden(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CstContext extends ExprContext {
		public LiteContext lite() {
			return getRuleContext(LiteContext.class,0);
		}
		public CstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterCst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitCst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitCst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdacContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdacContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterAdac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitAdac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitAdac(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SELFPLUS() { return getToken(mxParser.SELFPLUS, 0); }
		public TerminalNode SELFMINUS() { return getToken(mxParser.SELFMINUS, 0); }
		public TerminalNode MINUS() { return getToken(mxParser.MINUS, 0); }
		public TerminalNode LNOT() { return getToken(mxParser.LNOT, 0); }
		public TerminalNode BNOT() { return getToken(mxParser.BNOT, 0); }
		public UnaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfaltContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SELFPLUS() { return getToken(mxParser.SELFPLUS, 0); }
		public TerminalNode SELFMINUS() { return getToken(mxParser.SELFMINUS, 0); }
		public SelfaltContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterSelfalt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitSelfalt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitSelfalt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				match(T__2);
				setState(187);
				expr(0);
				setState(188);
				match(T__3);
				}
				break;
			case SELFPLUS:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				((UnaContext)_localctx).op = match(SELFPLUS);
				setState(191);
				expr(29);
				}
				break;
			case SELFMINUS:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				((UnaContext)_localctx).op = match(SELFMINUS);
				setState(193);
				expr(27);
				}
				break;
			case MINUS:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				((UnaContext)_localctx).op = match(MINUS);
				setState(195);
				expr(26);
				}
				break;
			case LNOT:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				((UnaContext)_localctx).op = match(LNOT);
				setState(197);
				expr(25);
				}
				break;
			case BNOT:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				((UnaContext)_localctx).op = match(BNOT);
				setState(199);
				expr(24);
				}
				break;
			case NEW:
				{
				_localctx = new NewpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(NEW);
				setState(201);
				newtype();
				}
				break;
			case ID:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(ID);
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case NUM:
			case CHAIN:
				{
				_localctx = new CstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				lite();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(207);
						((BinaContext)_localctx).op = match(TIMES);
						setState(208);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(210);
						((BinaContext)_localctx).op = match(DIVIDE);
						setState(211);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(213);
						((BinaContext)_localctx).op = match(MODULE);
						setState(214);
						expr(22);
						}
						break;
					case 4:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(216);
						((BinaContext)_localctx).op = match(PLUS);
						setState(217);
						expr(21);
						}
						break;
					case 5:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(219);
						((BinaContext)_localctx).op = match(MINUS);
						setState(220);
						expr(20);
						}
						break;
					case 6:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(222);
						((BinaContext)_localctx).op = match(LSHIFT);
						setState(223);
						expr(19);
						}
						break;
					case 7:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(225);
						((BinaContext)_localctx).op = match(RSHIFT);
						setState(226);
						expr(18);
						}
						break;
					case 8:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(228);
						((BinaContext)_localctx).op = match(LESSEQUALTHAN);
						setState(229);
						expr(17);
						}
						break;
					case 9:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(231);
						((BinaContext)_localctx).op = match(GREATEREQUALTHAN);
						setState(232);
						expr(16);
						}
						break;
					case 10:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(234);
						((BinaContext)_localctx).op = match(LESSTHAN);
						setState(235);
						expr(15);
						}
						break;
					case 11:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(237);
						((BinaContext)_localctx).op = match(GREATERTHAN);
						setState(238);
						expr(14);
						}
						break;
					case 12:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(240);
						((BinaContext)_localctx).op = match(EQUAL);
						setState(241);
						expr(13);
						}
						break;
					case 13:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(243);
						((BinaContext)_localctx).op = match(NOTEQUAL);
						setState(244);
						expr(12);
						}
						break;
					case 14:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(246);
						((BinaContext)_localctx).op = match(BAND);
						setState(247);
						expr(11);
						}
						break;
					case 15:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(249);
						((BinaContext)_localctx).op = match(BOR);
						setState(250);
						expr(10);
						}
						break;
					case 16:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(252);
						((BinaContext)_localctx).op = match(BXOR);
						setState(253);
						expr(9);
						}
						break;
					case 17:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(255);
						((BinaContext)_localctx).op = match(LOR);
						setState(256);
						expr(8);
						}
						break;
					case 18:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(258);
						((BinaContext)_localctx).op = match(LAND);
						setState(259);
						expr(7);
						}
						break;
					case 19:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						((BinaContext)_localctx).op = match(ASSIGN);
						setState(262);
						expr(3);
						}
						break;
					case 20:
						{
						_localctx = new FccallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(264);
						match(T__2);
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
							{
							setState(265);
							list();
							}
						}

						setState(268);
						match(T__3);
						}
						break;
					case 21:
						{
						_localctx = new AdacContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(270);
						match(T__4);
						setState(271);
						expr(0);
						setState(272);
						match(T__5);
						}
						break;
					case 22:
						{
						_localctx = new SelfaltContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(275);
						((SelfaltContext)_localctx).op = match(SELFPLUS);
						}
						break;
					case 23:
						{
						_localctx = new SelfaltContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(277);
						((SelfaltContext)_localctx).op = match(SELFMINUS);
						}
						break;
					case 24:
						{
						_localctx = new MbacContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(279);
						match(PIES);
						setState(280);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class LiteContext extends ParserRuleContext {
		public Token tp;
		public TerminalNode NUM() { return getToken(mxParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(mxParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mxParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(mxParser.NULL, 0); }
		public TerminalNode CHAIN() { return getToken(mxParser.CHAIN, 0); }
		public LiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterLite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitLite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitLite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteContext lite() throws RecognitionException {
		LiteContext _localctx = new LiteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lite);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((LiteContext)_localctx).tp = match(NUM);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((LiteContext)_localctx).tp = match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((LiteContext)_localctx).tp = match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				((LiteContext)_localctx).tp = match(NULL);
				}
				break;
			case CHAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				((LiteContext)_localctx).tp = match(CHAIN);
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

	public static class NewtypeContext extends ParserRuleContext {
		public NewtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtype; }
	 
		public NewtypeContext() { }
		public void copyFrom(NewtypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewnonarrayContext extends NewtypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewnonarrayContext(NewtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterNewnonarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitNewnonarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitNewnonarray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewarrayContext extends NewtypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DimContext> dim() {
			return getRuleContexts(DimContext.class);
		}
		public DimContext dim(int i) {
			return getRuleContext(DimContext.class,i);
		}
		public NewarrayContext(NewtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterNewarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitNewarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitNewarray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorContext extends NewtypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<DimContext> dim() {
			return getRuleContexts(DimContext.class);
		}
		public DimContext dim(int i) {
			return getRuleContext(DimContext.class,i);
		}
		public ErrorContext(NewtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewtypeContext newtype() throws RecognitionException {
		NewtypeContext _localctx = new NewtypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newtype);
		try {
			int _alt;
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ErrorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				type();
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(294);
						match(T__4);
						setState(295);
						dim();
						setState(296);
						match(T__5);
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(303);
				match(T__4);
				setState(304);
				match(T__5);
				{
				setState(305);
				match(T__4);
				setState(306);
				expr(0);
				setState(307);
				match(T__5);
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309);
						match(T__4);
						setState(310);
						dim();
						setState(311);
						match(T__5);
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new NewarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				type();
				setState(323); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(319);
						match(T__4);
						setState(320);
						dim();
						setState(321);
						match(T__5);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(325); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new NewnonarrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				type();
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

	public static class DimContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAIN))) != 0)) {
				{
				setState(330);
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

	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mxParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mxListener ) ((mxListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mxVisitor ) return ((mxVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			expr(0);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				expr(0);
				}
				}
				setState(340);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return arraytype_sempred((ArraytypeContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arraytype_sempred(ArraytypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 32);
		case 21:
			return precpred(_ctx, 31);
		case 22:
			return precpred(_ctx, 30);
		case 23:
			return precpred(_ctx, 28);
		case 24:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5D\n\5\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7V\n\7\3\b\3\b\5\bZ\n\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3"+
		"\t\3\t\3\t\5\tf\n\t\3\t\3\t\5\tj\n\t\3\t\3\t\5\tn\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\f\3\f\5\f"+
		"\u008f\n\f\3\r\3\r\3\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7"+
		"\16\u009d\n\16\f\16\16\16\u00a0\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00b5\n\21\3\22\5\22\u00b8\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00cf\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010d\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011c\n\23"+
		"\f\23\16\23\u011f\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u0126\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u012d\n\25\f\25\16\25\u0130\13\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013c\n\25\f\25\16\25\u013f"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\6\25\u0146\n\25\r\25\16\25\u0147\3\25"+
		"\5\25\u014b\n\25\3\26\5\26\u014e\n\26\3\27\3\27\3\27\7\27\u0153\n\27\f"+
		"\27\16\27\u0156\13\27\3\27\2\4\36$\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\2\u0189\2\61\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bC\3\2\2\2"+
		"\nE\3\2\2\2\fN\3\2\2\2\16`\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24\u0081\3"+
		"\2\2\2\26\u008e\3\2\2\2\30\u0090\3\2\2\2\32\u0099\3\2\2\2\34\u00a1\3\2"+
		"\2\2\36\u00a4\3\2\2\2 \u00b4\3\2\2\2\"\u00b7\3\2\2\2$\u00ce\3\2\2\2&\u0125"+
		"\3\2\2\2(\u014a\3\2\2\2*\u014d\3\2\2\2,\u014f\3\2\2\2.\60\5\4\3\2/.\3"+
		"\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2"+
		"\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66:\5\24\13\2\67:\5\30\r\28:\5\22\n\2"+
		"9\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\5\b\5\2<\7\3\2\2\2=D\5"+
		"\n\6\2>D\5\"\22\2?D\5\20\t\2@D\5\f\7\2AD\5\16\b\2BD\5\22\n\2C=\3\2\2\2"+
		"C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EI\7\3\2"+
		"\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2"+
		"\2LM\7\4\2\2M\13\3\2\2\2NO\7\'\2\2OP\7\5\2\2PQ\5$\23\2QR\7\6\2\2RU\5\6"+
		"\4\2ST\7(\2\2TV\5\6\4\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WY\7-\2\2XZ\5$\23"+
		"\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[a\7\61\2\2\\]\7+\2\2]a\7\61\2\2^_\7,"+
		"\2\2_a\7\61\2\2`W\3\2\2\2`\\\3\2\2\2`^\3\2\2\2a\17\3\2\2\2bc\7)\2\2ce"+
		"\7\5\2\2df\5$\23\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\61\2\2hj\5$\23\2"+
		"ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\61\2\2ln\5$\23\2ml\3\2\2\2mn\3\2\2"+
		"\2no\3\2\2\2op\7\6\2\2px\5\6\4\2qr\7*\2\2rs\7\5\2\2st\5$\23\2tu\7\6\2"+
		"\2uv\5\6\4\2vx\3\2\2\2wb\3\2\2\2wq\3\2\2\2x\21\3\2\2\2yz\5\36\20\2z}\7"+
		"\65\2\2{|\7\63\2\2|~\5$\23\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\61\2\2\u0080\23\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7\65\2\2\u0083"+
		"\u0087\7\3\2\2\u0084\u0086\5\26\f\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\4\2\2\u008b\25\3\2\2\2\u008c\u008f\5\22\n"+
		"\2\u008d\u008f\5\30\r\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\27\3\2\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7\65\2\2\u0092\u0094\7\5"+
		"\2\2\u0093\u0095\5\32\16\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\6\2\2\u0097\u0098\5\n\6\2\u0098\31\3\2\2"+
		"\2\u0099\u009e\5\34\17\2\u009a\u009b\7\62\2\2\u009b\u009d\5\34\17\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\33\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\36\20\2\u00a2"+
		"\u00a3\7\65\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\b\20\1\2\u00a5\u00a6\5 \21"+
		"\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\f\3\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00ab"+
		"\7\b\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b5\7 \2\2"+
		"\u00b0\u00b5\7!\2\2\u00b1\u00b5\7$\2\2\u00b2\u00b5\7\"\2\2\u00b3\u00b5"+
		"\7\65\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b8\5"+
		"$\23\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7\61\2\2\u00ba#\3\2\2\2\u00bb\u00bc\b\23\1\2\u00bc\u00bd\7\5\2"+
		"\2\u00bd\u00be\5$\23\2\u00be\u00bf\7\6\2\2\u00bf\u00cf\3\2\2\2\u00c0\u00c1"+
		"\7\t\2\2\u00c1\u00cf\5$\23\37\u00c2\u00c3\7\n\2\2\u00c3\u00cf\5$\23\35"+
		"\u00c4\u00c5\7\f\2\2\u00c5\u00cf\5$\23\34\u00c6\u00c7\7\34\2\2\u00c7\u00cf"+
		"\5$\23\33\u00c8\u00c9\7\35\2\2\u00c9\u00cf\5$\23\32\u00ca\u00cb\7.\2\2"+
		"\u00cb\u00cf\5(\25\2\u00cc\u00cf\7\65\2\2\u00cd\u00cf\5&\24\2\u00ce\u00bb"+
		"\3\2\2\2\u00ce\u00c0\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce"+
		"\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\u011d\3\2\2\2\u00d0\u00d1\f\31\2\2\u00d1"+
		"\u00d2\7\r\2\2\u00d2\u011c\5$\23\32\u00d3\u00d4\f\30\2\2\u00d4\u00d5\7"+
		"\16\2\2\u00d5\u011c\5$\23\31\u00d6\u00d7\f\27\2\2\u00d7\u00d8\7\17\2\2"+
		"\u00d8\u011c\5$\23\30\u00d9\u00da\f\26\2\2\u00da\u00db\7\13\2\2\u00db"+
		"\u011c\5$\23\27\u00dc\u00dd\f\25\2\2\u00dd\u00de\7\f\2\2\u00de\u011c\5"+
		"$\23\26\u00df\u00e0\f\24\2\2\u00e0\u00e1\7\20\2\2\u00e1\u011c\5$\23\25"+
		"\u00e2\u00e3\f\23\2\2\u00e3\u00e4\7\21\2\2\u00e4\u011c\5$\23\24\u00e5"+
		"\u00e6\f\22\2\2\u00e6\u00e7\7\22\2\2\u00e7\u011c\5$\23\23\u00e8\u00e9"+
		"\f\21\2\2\u00e9\u00ea\7\23\2\2\u00ea\u011c\5$\23\22\u00eb\u00ec\f\20\2"+
		"\2\u00ec\u00ed\7\24\2\2\u00ed\u011c\5$\23\21\u00ee\u00ef\f\17\2\2\u00ef"+
		"\u00f0\7\25\2\2\u00f0\u011c\5$\23\20\u00f1\u00f2\f\16\2\2\u00f2\u00f3"+
		"\7\26\2\2\u00f3\u011c\5$\23\17\u00f4\u00f5\f\r\2\2\u00f5\u00f6\7\27\2"+
		"\2\u00f6\u011c\5$\23\16\u00f7\u00f8\f\f\2\2\u00f8\u00f9\7\31\2\2\u00f9"+
		"\u011c\5$\23\r\u00fa\u00fb\f\13\2\2\u00fb\u00fc\7\33\2\2\u00fc\u011c\5"+
		"$\23\f\u00fd\u00fe\f\n\2\2\u00fe\u00ff\7\36\2\2\u00ff\u011c\5$\23\13\u0100"+
		"\u0101\f\t\2\2\u0101\u0102\7\32\2\2\u0102\u011c\5$\23\n\u0103\u0104\f"+
		"\b\2\2\u0104\u0105\7\30\2\2\u0105\u011c\5$\23\t\u0106\u0107\f\5\2\2\u0107"+
		"\u0108\7\63\2\2\u0108\u011c\5$\23\5\u0109\u010a\f\"\2\2\u010a\u010c\7"+
		"\5\2\2\u010b\u010d\5,\27\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u011c\7\6\2\2\u010f\u0110\f!\2\2\u0110\u0111\7\7"+
		"\2\2\u0111\u0112\5$\23\2\u0112\u0113\7\b\2\2\u0113\u011c\3\2\2\2\u0114"+
		"\u0115\f \2\2\u0115\u011c\7\t\2\2\u0116\u0117\f\36\2\2\u0117\u011c\7\n"+
		"\2\2\u0118\u0119\f\7\2\2\u0119\u011a\7\37\2\2\u011a\u011c\7\65\2\2\u011b"+
		"\u00d0\3\2\2\2\u011b\u00d3\3\2\2\2\u011b\u00d6\3\2\2\2\u011b\u00d9\3\2"+
		"\2\2\u011b\u00dc\3\2\2\2\u011b\u00df\3\2\2\2\u011b\u00e2\3\2\2\2\u011b"+
		"\u00e5\3\2\2\2\u011b\u00e8\3\2\2\2\u011b\u00eb\3\2\2\2\u011b\u00ee\3\2"+
		"\2\2\u011b\u00f1\3\2\2\2\u011b\u00f4\3\2\2\2\u011b\u00f7\3\2\2\2\u011b"+
		"\u00fa\3\2\2\2\u011b\u00fd\3\2\2\2\u011b\u0100\3\2\2\2\u011b\u0103\3\2"+
		"\2\2\u011b\u0106\3\2\2\2\u011b\u0109\3\2\2\2\u011b\u010f\3\2\2\2\u011b"+
		"\u0114\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e%\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0126\7\64\2\2\u0121\u0126\7%\2\2\u0122\u0126\7&\2\2\u0123"+
		"\u0126\7#\2\2\u0124\u0126\7\66\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2"+
		"\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\'\3\2\2\2\u0127\u012e\5 \21\2\u0128\u0129\7\7\2\2\u0129\u012a\5*\26\2"+
		"\u012a\u012b\7\b\2\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\7\7\2\2\u0132\u0133\7\b\2\2\u0133\u0134\7\7"+
		"\2\2\u0134\u0135\5$\23\2\u0135\u0136\7\b\2\2\u0136\u013d\3\2\2\2\u0137"+
		"\u0138\7\7\2\2\u0138\u0139\5*\26\2\u0139\u013a\7\b\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0137\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u014b\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0145\5 "+
		"\21\2\u0141\u0142\7\7\2\2\u0142\u0143\5*\26\2\u0143\u0144\7\b\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014b\5 \21\2\u014a"+
		"\u0127\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0149\3\2\2\2\u014b)\3\2\2\2"+
		"\u014c\u014e\5$\23\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e+\3"+
		"\2\2\2\u014f\u0154\5$\23\2\u0150\u0151\7\62\2\2\u0151\u0153\5$\23\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155-\3\2\2\2\u0156\u0154\3\2\2\2 \619CIUY`eimw}\u0087\u008e\u0094"+
		"\u009e\u00ac\u00b4\u00b7\u00ce\u010c\u011b\u011d\u0125\u012e\u013d\u0147"+
		"\u014a\u014d\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}