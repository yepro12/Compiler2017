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
		CLASS=45, THIS=46, SEMICOLON=47, COMMA=48, ASSIGN=49, CONST=50, NUM=51, 
		ID=52, CHAIN=53, DIGIT=54, ALPHA=55, COMMENT=56, NEWLINE=57, WS=58, CHAR=59;
	public static final int
		RULE_code = 0, RULE_section = 1, RULE_stmt = 2, RULE_block = 3, RULE_branch = 4, 
		RULE_jump = 5, RULE_loop = 6, RULE_vardefine = 7, RULE_classdefine = 8, 
		RULE_member = 9, RULE_function = 10, RULE_paralist = 11, RULE_arraytype = 12, 
		RULE_type = 13, RULE_exprstmt = 14, RULE_expr = 15, RULE_list = 16;
	public static final String[] ruleNames = {
		"code", "section", "stmt", "block", "branch", "jump", "loop", "vardefine", 
		"classdefine", "member", "function", "paralist", "arraytype", "type", 
		"exprstmt", "expr", "list"
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
		"CONST", "NUM", "ID", "CHAIN", "DIGIT", "ALPHA", "COMMENT", "NEWLINE", 
		"WS", "CHAR"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				section();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ClassdefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				classdefine();
				}
				break;
			case 2:
				_localctx = new FuncdefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				function();
				}
				break;
			case 3:
				_localctx = new GlbvardefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
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
	public static class BlkContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlkContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class ExpressionContext extends StmtContext {
		public ExprstmtContext exprstmt() {
			return getRuleContext(ExprstmtContext.class,0);
		}
		public ExpressionContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class BranContext extends StmtContext {
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public BranContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class LpContext extends StmtContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LpContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class JpContext extends StmtContext {
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public JpContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class VardefContext extends StmtContext {
		public VardefineContext vardefine() {
			return getRuleContext(VardefineContext.class,0);
		}
		public VardefContext(StmtContext ctx) { copyFrom(ctx); }
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

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BlkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				block();
				}
				break;
			case 2:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				exprstmt();
				}
				break;
			case 3:
				_localctx = new LpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				loop();
				}
				break;
			case 4:
				_localctx = new BranContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				branch();
				}
				break;
			case 5:
				_localctx = new JpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				jump();
				}
				break;
			case 6:
				_localctx = new VardefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << SEMICOLON) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(56);
				stmt();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		enterRule(_localctx, 8, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			match(T__2);
			setState(66);
			expr(0);
			setState(67);
			match(T__3);
			setState(68);
			stmt();
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69);
				match(ELSE);
				setState(70);
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
		enterRule(_localctx, 10, RULE_jump);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(RETURN);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NEW) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					setState(74);
					expr(0);
					}
				}

				setState(77);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(BREAK);
				setState(79);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(CONTINUE);
				setState(81);
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
		public TerminalNode FOR() { return getToken(mxParser.FOR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public VardefineContext vardefine() {
			return getRuleContext(VardefineContext.class,0);
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
		enterRule(_localctx, 12, RULE_loop);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(FOR);
				setState(85);
				match(T__2);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NEW) | (1L << CONST) | (1L << ID))) != 0)) {
						{
						setState(86);
						expr(0);
						}
					}

					setState(89);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(90);
					vardefine();
					}
					break;
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NEW) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					setState(93);
					expr(0);
					}
				}

				setState(96);
				match(SEMICOLON);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NEW) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					setState(97);
					expr(0);
					}
				}

				setState(100);
				match(T__3);
				setState(101);
				stmt();
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(WHILE);
				setState(103);
				match(T__2);
				setState(104);
				expr(0);
				setState(105);
				match(T__3);
				setState(106);
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
		enterRule(_localctx, 14, RULE_vardefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			arraytype(0);
			setState(111);
			match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(112);
				match(ASSIGN);
				setState(113);
				expr(0);
				}
			}

			setState(116);
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
		enterRule(_localctx, 16, RULE_classdefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CLASS);
			setState(119);
			match(ID);
			setState(120);
			match(T__0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(121);
				member();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
		enterRule(_localctx, 18, RULE_member);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ClsvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				vardefine();
				}
				break;
			case 2:
				_localctx = new ClsfuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			type();
			setState(134);
			match(ID);
			setState(135);
			match(T__2);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(136);
				paralist();
				}
			}

			setState(139);
			match(T__3);
			setState(140);
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
		public List<ArraytypeContext> arraytype() {
			return getRuleContexts(ArraytypeContext.class);
		}
		public ArraytypeContext arraytype(int i) {
			return getRuleContext(ArraytypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(mxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mxParser.ID, i);
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
		enterRule(_localctx, 22, RULE_paralist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			arraytype(0);
			setState(143);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				arraytype(0);
				setState(146);
				match(ID);
				}
				}
				setState(152);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arraytype, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NonarrayContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(154);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArtpContext(new ArraytypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arraytype);
					setState(156);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(157);
					match(T__4);
					setState(158);
					match(T__5);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((TypeContext)_localctx).tp = match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((TypeContext)_localctx).tp = match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((TypeContext)_localctx).tp = match(VOID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				((TypeContext)_localctx).tp = match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
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
		enterRule(_localctx, 28, RULE_exprstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NEW) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				setState(171);
				expr(0);
				}
			}

			setState(174);
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
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
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
	public static class MbacContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PIES() { return getToken(mxParser.PIES, 0); }
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
		public TerminalNode CONST() { return getToken(mxParser.CONST, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(T__2);
				setState(178);
				expr(0);
				setState(179);
				match(T__3);
				}
				break;
			case SELFPLUS:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				((UnaContext)_localctx).op = match(SELFPLUS);
				setState(182);
				expr(29);
				}
				break;
			case SELFMINUS:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				((UnaContext)_localctx).op = match(SELFMINUS);
				setState(184);
				expr(27);
				}
				break;
			case MINUS:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				((UnaContext)_localctx).op = match(MINUS);
				setState(186);
				expr(26);
				}
				break;
			case LNOT:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				((UnaContext)_localctx).op = match(LNOT);
				setState(188);
				expr(25);
				}
				break;
			case BNOT:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				((UnaContext)_localctx).op = match(BNOT);
				setState(190);
				expr(24);
				}
				break;
			case NEW:
				{
				_localctx = new NewpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(NEW);
				setState(192);
				arraytype(0);
				}
				break;
			case ID:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(ID);
				}
				break;
			case CONST:
				{
				_localctx = new CstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(198);
						((BinaContext)_localctx).op = match(TIMES);
						setState(199);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(201);
						((BinaContext)_localctx).op = match(DIVIDE);
						setState(202);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(204);
						((BinaContext)_localctx).op = match(MODULE);
						setState(205);
						expr(22);
						}
						break;
					case 4:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(207);
						((BinaContext)_localctx).op = match(PLUS);
						setState(208);
						expr(21);
						}
						break;
					case 5:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(210);
						((BinaContext)_localctx).op = match(MINUS);
						setState(211);
						expr(20);
						}
						break;
					case 6:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(213);
						((BinaContext)_localctx).op = match(LSHIFT);
						setState(214);
						expr(19);
						}
						break;
					case 7:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(216);
						((BinaContext)_localctx).op = match(RSHIFT);
						setState(217);
						expr(18);
						}
						break;
					case 8:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(219);
						((BinaContext)_localctx).op = match(LESSEQUALTHAN);
						setState(220);
						expr(17);
						}
						break;
					case 9:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(222);
						((BinaContext)_localctx).op = match(GREATEREQUALTHAN);
						setState(223);
						expr(16);
						}
						break;
					case 10:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(225);
						((BinaContext)_localctx).op = match(LESSTHAN);
						setState(226);
						expr(15);
						}
						break;
					case 11:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(228);
						((BinaContext)_localctx).op = match(GREATERTHAN);
						setState(229);
						expr(14);
						}
						break;
					case 12:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(231);
						((BinaContext)_localctx).op = match(EQUAL);
						setState(232);
						expr(13);
						}
						break;
					case 13:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(234);
						((BinaContext)_localctx).op = match(NOTEQUAL);
						setState(235);
						expr(12);
						}
						break;
					case 14:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(237);
						((BinaContext)_localctx).op = match(BAND);
						setState(238);
						expr(11);
						}
						break;
					case 15:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(240);
						((BinaContext)_localctx).op = match(BOR);
						setState(241);
						expr(10);
						}
						break;
					case 16:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(243);
						((BinaContext)_localctx).op = match(BXOR);
						setState(244);
						expr(9);
						}
						break;
					case 17:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(246);
						((BinaContext)_localctx).op = match(LOR);
						setState(247);
						expr(8);
						}
						break;
					case 18:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(249);
						((BinaContext)_localctx).op = match(LAND);
						setState(250);
						expr(7);
						}
						break;
					case 19:
						{
						_localctx = new MbacContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(252);
						match(PIES);
						setState(253);
						expr(6);
						}
						break;
					case 20:
						{
						_localctx = new BinaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(255);
						((BinaContext)_localctx).op = match(ASSIGN);
						setState(256);
						expr(3);
						}
						break;
					case 21:
						{
						_localctx = new FccallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(258);
						match(T__2);
						setState(260);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << MINUS) | (1L << LNOT) | (1L << BNOT) | (1L << NEW) | (1L << CONST) | (1L << ID))) != 0)) {
							{
							setState(259);
							list();
							}
						}

						setState(262);
						match(T__3);
						}
						break;
					case 22:
						{
						_localctx = new AdacContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(264);
						match(T__4);
						setState(265);
						expr(0);
						setState(266);
						match(T__5);
						}
						break;
					case 23:
						{
						_localctx = new SelfaltContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(269);
						((SelfaltContext)_localctx).op = match(SELFPLUS);
						}
						break;
					case 24:
						{
						_localctx = new SelfaltContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(271);
						((SelfaltContext)_localctx).op = match(SELFMINUS);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 32, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expr(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				expr(0);
				}
				}
				setState(284);
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
		case 12:
			return arraytype_sempred((ArraytypeContext)_localctx, predIndex);
		case 15:
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
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 32);
		case 22:
			return precpred(_ctx, 31);
		case 23:
			return precpred(_ctx, 30);
		case 24:
			return precpred(_ctx, 28);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\48\n\4\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7U\n\7\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\5\b^\n\b\3\b\5\ba\n\b\3\b\3\b\5\b"+
		"e\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\5\tu\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3\n\3\13\3"+
		"\13\5\13\u0086\n\13\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00ac\n\17\3\20\5\20\u00af\n\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00c6\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0113\n\21"+
		"\f\21\16\21\u0116\13\21\3\22\3\22\3\22\7\22\u011b\n\22\f\22\16\22\u011e"+
		"\13\22\3\22\2\4\32 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u014d"+
		"\2\'\3\2\2\2\4/\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nB\3\2\2\2\fT\3\2\2\2"+
		"\16n\3\2\2\2\20p\3\2\2\2\22x\3\2\2\2\24\u0085\3\2\2\2\26\u0087\3\2\2\2"+
		"\30\u0090\3\2\2\2\32\u009b\3\2\2\2\34\u00ab\3\2\2\2\36\u00ae\3\2\2\2 "+
		"\u00c5\3\2\2\2\"\u0117\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,\60\5\22\n\2-"+
		"\60\5\26\f\2.\60\5\20\t\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61"+
		"8\5\b\5\2\628\5\36\20\2\638\5\16\b\2\648\5\n\6\2\658\5\f\7\2\668\5\20"+
		"\t\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2"+
		"\2\2\67\66\3\2\2\28\7\3\2\2\29=\7\3\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\4\2\2A\t\3\2\2\2BC\7\'\2"+
		"\2CD\7\5\2\2DE\5 \21\2EF\7\6\2\2FI\5\6\4\2GH\7(\2\2HJ\5\6\4\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\13\3\2\2\2KM\7-\2\2LN\5 \21\2ML\3\2\2\2MN\3\2\2\2NO\3\2"+
		"\2\2OU\7\61\2\2PQ\7+\2\2QU\7\61\2\2RS\7,\2\2SU\7\61\2\2TK\3\2\2\2TP\3"+
		"\2\2\2TR\3\2\2\2U\r\3\2\2\2VW\7)\2\2W]\7\5\2\2XZ\5 \21\2YX\3\2\2\2YZ\3"+
		"\2\2\2Z[\3\2\2\2[^\7\61\2\2\\^\5\20\t\2]Y\3\2\2\2]\\\3\2\2\2^`\3\2\2\2"+
		"_a\5 \21\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\61\2\2ce\5 \21\2dc\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fg\7\6\2\2go\5\6\4\2hi\7*\2\2ij\7\5\2\2jk\5 \21"+
		"\2kl\7\6\2\2lm\5\6\4\2mo\3\2\2\2nV\3\2\2\2nh\3\2\2\2o\17\3\2\2\2pq\5\32"+
		"\16\2qt\7\66\2\2rs\7\63\2\2su\5 \21\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw"+
		"\7\61\2\2w\21\3\2\2\2xy\7/\2\2yz\7\66\2\2z~\7\3\2\2{}\5\24\13\2|{\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0082\7\4\2\2\u0082\23\3\2\2\2\u0083\u0086\5\20\t\2\u0084"+
		"\u0086\5\26\f\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\25\3\2\2"+
		"\2\u0087\u0088\5\34\17\2\u0088\u0089\7\66\2\2\u0089\u008b\7\5\2\2\u008a"+
		"\u008c\5\30\r\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\7\6\2\2\u008e\u008f\5\b\5\2\u008f\27\3\2\2\2\u0090"+
		"\u0091\5\32\16\2\u0091\u0098\7\66\2\2\u0092\u0093\7\62\2\2\u0093\u0094"+
		"\5\32\16\2\u0094\u0095\7\66\2\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2"+
		"\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\31"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\b\16\1\2\u009c\u009d\5\34\17"+
		"\2\u009d\u00a3\3\2\2\2\u009e\u009f\f\3\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a2"+
		"\7\b\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ac\7 \2\2"+
		"\u00a7\u00ac\7!\2\2\u00a8\u00ac\7$\2\2\u00a9\u00ac\7\"\2\2\u00aa\u00ac"+
		"\7\66\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\35\3\2\2\2\u00ad\u00af"+
		"\5 \21\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\61\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\b\21\1\2\u00b3\u00b4\7\5"+
		"\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\7\6\2\2\u00b6\u00c6\3\2\2\2\u00b7"+
		"\u00b8\7\t\2\2\u00b8\u00c6\5 \21\37\u00b9\u00ba\7\n\2\2\u00ba\u00c6\5"+
		" \21\35\u00bb\u00bc\7\f\2\2\u00bc\u00c6\5 \21\34\u00bd\u00be\7\34\2\2"+
		"\u00be\u00c6\5 \21\33\u00bf\u00c0\7\35\2\2\u00c0\u00c6\5 \21\32\u00c1"+
		"\u00c2\7.\2\2\u00c2\u00c6\5\32\16\2\u00c3\u00c6\7\66\2\2\u00c4\u00c6\7"+
		"\64\2\2\u00c5\u00b2\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u0114\3\2\2\2\u00c7"+
		"\u00c8\f\31\2\2\u00c8\u00c9\7\r\2\2\u00c9\u0113\5 \21\32\u00ca\u00cb\f"+
		"\30\2\2\u00cb\u00cc\7\16\2\2\u00cc\u0113\5 \21\31\u00cd\u00ce\f\27\2\2"+
		"\u00ce\u00cf\7\17\2\2\u00cf\u0113\5 \21\30\u00d0\u00d1\f\26\2\2\u00d1"+
		"\u00d2\7\13\2\2\u00d2\u0113\5 \21\27\u00d3\u00d4\f\25\2\2\u00d4\u00d5"+
		"\7\f\2\2\u00d5\u0113\5 \21\26\u00d6\u00d7\f\24\2\2\u00d7\u00d8\7\20\2"+
		"\2\u00d8\u0113\5 \21\25\u00d9\u00da\f\23\2\2\u00da\u00db\7\21\2\2\u00db"+
		"\u0113\5 \21\24\u00dc\u00dd\f\22\2\2\u00dd\u00de\7\22\2\2\u00de\u0113"+
		"\5 \21\23\u00df\u00e0\f\21\2\2\u00e0\u00e1\7\23\2\2\u00e1\u0113\5 \21"+
		"\22\u00e2\u00e3\f\20\2\2\u00e3\u00e4\7\24\2\2\u00e4\u0113\5 \21\21\u00e5"+
		"\u00e6\f\17\2\2\u00e6\u00e7\7\25\2\2\u00e7\u0113\5 \21\20\u00e8\u00e9"+
		"\f\16\2\2\u00e9\u00ea\7\26\2\2\u00ea\u0113\5 \21\17\u00eb\u00ec\f\r\2"+
		"\2\u00ec\u00ed\7\27\2\2\u00ed\u0113\5 \21\16\u00ee\u00ef\f\f\2\2\u00ef"+
		"\u00f0\7\31\2\2\u00f0\u0113\5 \21\r\u00f1\u00f2\f\13\2\2\u00f2\u00f3\7"+
		"\33\2\2\u00f3\u0113\5 \21\f\u00f4\u00f5\f\n\2\2\u00f5\u00f6\7\36\2\2\u00f6"+
		"\u0113\5 \21\13\u00f7\u00f8\f\t\2\2\u00f8\u00f9\7\32\2\2\u00f9\u0113\5"+
		" \21\n\u00fa\u00fb\f\b\2\2\u00fb\u00fc\7\30\2\2\u00fc\u0113\5 \21\t\u00fd"+
		"\u00fe\f\7\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0113\5 \21\b\u0100\u0101\f"+
		"\5\2\2\u0101\u0102\7\63\2\2\u0102\u0113\5 \21\5\u0103\u0104\f\"\2\2\u0104"+
		"\u0106\7\5\2\2\u0105\u0107\5\"\22\2\u0106\u0105\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u0113\7\6\2\2\u0109\u010a\f!\2\2\u010a"+
		"\u010b\7\7\2\2\u010b\u010c\5 \21\2\u010c\u010d\7\b\2\2\u010d\u0113\3\2"+
		"\2\2\u010e\u010f\f \2\2\u010f\u0113\7\t\2\2\u0110\u0111\f\36\2\2\u0111"+
		"\u0113\7\n\2\2\u0112\u00c7\3\2\2\2\u0112\u00ca\3\2\2\2\u0112\u00cd\3\2"+
		"\2\2\u0112\u00d0\3\2\2\2\u0112\u00d3\3\2\2\2\u0112\u00d6\3\2\2\2\u0112"+
		"\u00d9\3\2\2\2\u0112\u00dc\3\2\2\2\u0112\u00df\3\2\2\2\u0112\u00e2\3\2"+
		"\2\2\u0112\u00e5\3\2\2\2\u0112\u00e8\3\2\2\2\u0112\u00eb\3\2\2\2\u0112"+
		"\u00ee\3\2\2\2\u0112\u00f1\3\2\2\2\u0112\u00f4\3\2\2\2\u0112\u00f7\3\2"+
		"\2\2\u0112\u00fa\3\2\2\2\u0112\u00fd\3\2\2\2\u0112\u0100\3\2\2\2\u0112"+
		"\u0103\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"!\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011c\5 \21\2\u0118\u0119\7\62\2\2"+
		"\u0119\u011b\5 \21\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d#\3\2\2\2\u011e\u011c\3\2\2\2\33\'/"+
		"\67=IMTY]`dnt~\u0085\u008b\u0098\u00a3\u00ab\u00ae\u00c5\u0106\u0112\u0114"+
		"\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}