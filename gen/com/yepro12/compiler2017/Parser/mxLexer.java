// Generated from /Users/yepro12/compiler2017/src/com/yepro12/compiler2017/Parser/mx.g4 by ANTLR 4.6
package com.yepro12.compiler2017.Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mxLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "SELFPLUS", "SELFMINUS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "MODULE", "LSHIFT", "RSHIFT", "LESSEQUALTHAN", 
		"GREATEREQUALTHAN", "LESSTHAN", "GREATERTHAN", "EQUAL", "NOTEQUAL", "LAND", 
		"BAND", "LOR", "BOR", "LNOT", "BNOT", "BXOR", "PIES", "BOOL", "INT", "STRING", 
		"NULL", "VOID", "TRUE", "FALSE", "IF", "ELSE", "FOR", "WHILE", "BREAK", 
		"CONTINUE", "RETURN", "NEW", "CLASS", "THIS", "SEMICOLON", "COMMA", "ASSIGN", 
		"CONST", "NUM", "ID", "CHAIN", "DIGIT", "ALPHA", "COMMENT", "NEWLINE", 
		"WS", "CHAR"
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


	public mxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u0125\n\63\3\64\6\64\u0128\n"+
		"\64\r\64\16\64\u0129\3\65\3\65\3\65\3\65\7\65\u0130\n\65\f\65\16\65\u0133"+
		"\13\65\3\66\3\66\7\66\u0137\n\66\f\66\16\66\u013a\13\66\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\39\39\79\u0146\n9\f9\169\u0149\139\39\39\3:\5:\u014e"+
		"\n:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\5<\u015b\n<\3\u0147\2=\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=\3\2\7\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\5\2$$^^pp\4\2$$^^\u0167\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{"+
		"\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17"+
		"\u0085\3\2\2\2\21\u0088\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27\u008f"+
		"\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u0098\3"+
		"\2\2\2!\u009b\3\2\2\2#\u009e\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a8\3\2\2\2-\u00ab\3\2\2\2/\u00ae\3\2\2\2\61\u00b0\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bb"+
		"\3\2\2\2=\u00bd\3\2\2\2?\u00c2\3\2\2\2A\u00c6\3\2\2\2C\u00cd\3\2\2\2E"+
		"\u00d2\3\2\2\2G\u00d7\3\2\2\2I\u00dc\3\2\2\2K\u00e2\3\2\2\2M\u00e5\3\2"+
		"\2\2O\u00ea\3\2\2\2Q\u00ee\3\2\2\2S\u00f4\3\2\2\2U\u00fa\3\2\2\2W\u0103"+
		"\3\2\2\2Y\u010a\3\2\2\2[\u010e\3\2\2\2]\u0114\3\2\2\2_\u0119\3\2\2\2a"+
		"\u011b\3\2\2\2c\u011d\3\2\2\2e\u0124\3\2\2\2g\u0127\3\2\2\2i\u012b\3\2"+
		"\2\2k\u0134\3\2\2\2m\u013d\3\2\2\2o\u013f\3\2\2\2q\u0141\3\2\2\2s\u014d"+
		"\3\2\2\2u\u0153\3\2\2\2w\u015a\3\2\2\2yz\7}\2\2z\4\3\2\2\2{|\7\177\2\2"+
		"|\6\3\2\2\2}~\7*\2\2~\b\3\2\2\2\177\u0080\7+\2\2\u0080\n\3\2\2\2\u0081"+
		"\u0082\7]\2\2\u0082\f\3\2\2\2\u0083\u0084\7_\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\7-\2\2\u0086\u0087\7-\2\2\u0087\20\3\2\2\2\u0088\u0089\7/\2\2\u0089"+
		"\u008a\7/\2\2\u008a\22\3\2\2\2\u008b\u008c\7-\2\2\u008c\24\3\2\2\2\u008d"+
		"\u008e\7/\2\2\u008e\26\3\2\2\2\u008f\u0090\7,\2\2\u0090\30\3\2\2\2\u0091"+
		"\u0092\7\61\2\2\u0092\32\3\2\2\2\u0093\u0094\7\'\2\2\u0094\34\3\2\2\2"+
		"\u0095\u0096\7>\2\2\u0096\u0097\7>\2\2\u0097\36\3\2\2\2\u0098\u0099\7"+
		"@\2\2\u0099\u009a\7@\2\2\u009a \3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d"+
		"\7?\2\2\u009d\"\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0$\3"+
		"\2\2\2\u00a1\u00a2\7>\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4(\3\2"+
		"\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7?\2\2\u00a7*\3\2\2\2\u00a8\u00a9"+
		"\7#\2\2\u00a9\u00aa\7?\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\u00ad"+
		"\7(\2\2\u00ad.\3\2\2\2\u00ae\u00af\7(\2\2\u00af\60\3\2\2\2\u00b0\u00b1"+
		"\7~\2\2\u00b1\u00b2\7~\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7~\2\2\u00b4\64"+
		"\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7\u0080\2\2\u00b8"+
		"8\3\2\2\2\u00b9\u00ba\7`\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc"+
		"<\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7i\2\2"+
		"\u00ccB\3\2\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7n\2"+
		"\2\u00d0\u00d1\7n\2\2\u00d1D\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7"+
		"q\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7f\2\2\u00d6F\3\2\2\2\u00d7\u00d8"+
		"\7V\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7W\2\2\u00da\u00db\7G\2\2\u00db"+
		"H\3\2\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7N\2\2\u00df"+
		"\u00e0\7U\2\2\u00e0\u00e1\7G\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7h\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9N\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7t\2\2\u00edP\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef"+
		"\u00f0\7j\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2"+
		"\u00f3R\3\2\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2"+
		"\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7m\2\2\u00f9T\3\2\2\2\u00fa\u00fb\7"+
		"e\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2\u0102"+
		"V\3\2\2\2\u0103\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u0108\7t\2\2\u0108\u0109\7p\2\2\u0109X\3\2\2\2\u010a"+
		"\u010b\7p\2\2\u010b\u010c\7g\2\2\u010c\u010d\7y\2\2\u010dZ\3\2\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7n\2\2\u0110\u0111\7c\2\2\u0111\u0112\7u\2\2"+
		"\u0112\u0113\7u\2\2\u0113\\\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7j"+
		"\2\2\u0116\u0117\7k\2\2\u0117\u0118\7u\2\2\u0118^\3\2\2\2\u0119\u011a"+
		"\7=\2\2\u011a`\3\2\2\2\u011b\u011c\7.\2\2\u011cb\3\2\2\2\u011d\u011e\7"+
		"?\2\2\u011ed\3\2\2\2\u011f\u0125\5g\64\2\u0120\u0125\5G$\2\u0121\u0125"+
		"\5I%\2\u0122\u0125\5C\"\2\u0123\u0125\5k\66\2\u0124\u011f\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125f\3\2\2\2\u0126\u0128\5m\67\2\u0127\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012ah\3\2\2\2\u012b"+
		"\u0131\5o8\2\u012c\u0130\5m\67\2\u012d\u0130\5o8\2\u012e\u0130\7a\2\2"+
		"\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132j\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0138\7$\2\2\u0135\u0137\5w<\2\u0136\u0135\3\2\2"+
		"\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013cl\3\2\2\2\u013d\u013e"+
		"\t\2\2\2\u013en\3\2\2\2\u013f\u0140\t\3\2\2\u0140p\3\2\2\2\u0141\u0142"+
		"\7\61\2\2\u0142\u0143\7\61\2\2\u0143\u0147\3\2\2\2\u0144\u0146\13\2\2"+
		"\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\b9\2\2\u014b"+
		"r\3\2\2\2\u014c\u014e\7\17\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\7\f\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\b:\2\2\u0152t\3\2\2\2\u0153\u0154\t\4\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\b;\2\2\u0156v\3\2\2\2\u0157\u0158\7^\2\2\u0158\u015b\t\5\2\2\u0159\u015b"+
		"\n\6\2\2\u015a\u0157\3\2\2\2\u015a\u0159\3\2\2\2\u015bx\3\2\2\2\13\2\u0124"+
		"\u0129\u012f\u0131\u0138\u0147\u014d\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}