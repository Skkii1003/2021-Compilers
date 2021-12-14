// Generated from CmmLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_10=1, INT_8=2, INT_16=3, INT=4, FLOAT=5, TYPE=6, ID=7, CHAR=8, SEMI=9, 
		COMMA=10, ASSIGNOP=11, RELOP=12, PLUS=13, MINUS=14, SIGN=15, STAR=16, 
		DIV=17, AND=18, OR=19, DOT=20, NOT=21, LP=22, RP=23, LB=24, RB=25, LC=26, 
		RC=27, STRUCT=28, RETURN=29, IF=30, ELSE=31, WHILE=32, WS=33, SL_COMMENT=34, 
		ML_COMMENT=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_10", "INT_8", "INT_16", "INT", "FLOAT", "TYPE", "ID", "CHAR", "SEMI", 
			"COMMA", "ASSIGNOP", "RELOP", "PLUS", "MINUS", "SIGN", "STAR", "DIV", 
			"AND", "OR", "DOT", "NOT", "LP", "RP", "LB", "RB", "LC", "RC", "STRUCT", 
			"RETURN", "IF", "ELSE", "WHILE", "WS", "SL_COMMENT", "ML_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "';'", "','", "'='", 
			null, "'+'", "'-'", null, "'*'", "'/'", "'&'", "'||'", "'.'", "'!'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'struct'", "'return'", "'if'", 
			"'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_10", "INT_8", "INT_16", "INT", "FLOAT", "TYPE", "ID", "CHAR", 
			"SEMI", "COMMA", "ASSIGNOP", "RELOP", "PLUS", "MINUS", "SIGN", "STAR", 
			"DIV", "AND", "OR", "DOT", "NOT", "LP", "RP", "LB", "RB", "LC", "RC", 
			"STRUCT", "RETURN", "IF", "ELSE", "WHILE", "WS", "SL_COMMENT", "ML_COMMENT"
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


	public CmmLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmmLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\5\2R\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\5\3^\n\3\3\4\3\4\3\4\3\4\5"+
		"\4d\n\4\3\4\3\4\5\4h\n\4\3\4\7\4k\n\4\f\4\16\4n\13\4\5\4p\n\4\3\5\3\5"+
		"\3\5\5\5u\n\5\3\6\5\6x\n\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\6\6\u0082"+
		"\n\6\r\6\16\6\u0083\3\6\3\6\5\6\u0088\n\6\3\6\6\6\u008b\n\6\r\6\16\6\u008c"+
		"\5\6\u008f\n\6\3\6\5\6\u0092\n\6\3\6\6\6\u0095\n\6\r\6\16\6\u0096\3\6"+
		"\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\5\6\u00a2\n\6\3\6\6\6\u00a5"+
		"\n\6\r\6\16\6\u00a6\5\6\u00a9\n\6\5\6\u00ab\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00b5\n\7\3\b\3\b\5\b\u00b9\n\b\3\b\3\b\7\b\u00bd\n\b\f"+
		"\b\16\b\u00c0\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00d3\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\6\"\u0111\n\"\r\"\16\"\u0112\3\"\3\"\3"+
		"#\3#\3#\3#\7#\u011b\n#\f#\16#\u011e\13#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0128"+
		"\n$\f$\16$\u012b\13$\3$\3$\3$\3$\3$\4\u011c\u0129\2%\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\16"+
		"\3\2\63;\3\2\62;\3\2\639\3\2\629\6\2..\63;CHch\6\2..\62;CHch\4\2GGgg\4"+
		"\2\62;aa\5\2..C\\c|\4\2>>@@\4\2--//\4\2\13\f\"\"\2\u0151\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3Q\3\2\2\2\5"+
		"]\3\2\2\2\7c\3\2\2\2\tt\3\2\2\2\13\u00aa\3\2\2\2\r\u00b4\3\2\2\2\17\u00b8"+
		"\3\2\2\2\21\u00c1\3\2\2\2\23\u00c3\3\2\2\2\25\u00c5\3\2\2\2\27\u00c7\3"+
		"\2\2\2\31\u00d2\3\2\2\2\33\u00d4\3\2\2\2\35\u00d6\3\2\2\2\37\u00d8\3\2"+
		"\2\2!\u00da\3\2\2\2#\u00dc\3\2\2\2%\u00de\3\2\2\2\'\u00e0\3\2\2\2)\u00e3"+
		"\3\2\2\2+\u00e5\3\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2"+
		"\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2\2\2;\u00fa"+
		"\3\2\2\2=\u0101\3\2\2\2?\u0104\3\2\2\2A\u0109\3\2\2\2C\u0110\3\2\2\2E"+
		"\u0116\3\2\2\2G\u0123\3\2\2\2IR\7\62\2\2JN\t\2\2\2KM\t\3\2\2LK\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2QJ\3\2\2\2"+
		"R\4\3\2\2\2ST\7\62\2\2T^\7\62\2\2UV\7\62\2\2VZ\t\4\2\2WY\t\5\2\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]S\3\2\2\2]U\3"+
		"\2\2\2^\6\3\2\2\2_`\7\62\2\2`d\7z\2\2ab\7\62\2\2bd\7Z\2\2c_\3\2\2\2ca"+
		"\3\2\2\2do\3\2\2\2ep\7\62\2\2fh\t\6\2\2gf\3\2\2\2hl\3\2\2\2ik\t\7\2\2"+
		"ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oe\3\2\2\2"+
		"og\3\2\2\2p\b\3\2\2\2qu\5\3\2\2ru\5\5\3\2su\5\7\4\2tq\3\2\2\2tr\3\2\2"+
		"\2ts\3\2\2\2u\n\3\2\2\2vx\5\37\20\2wv\3\2\2\2wx\3\2\2\2x|\3\2\2\2y{\t"+
		"\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2"+
		"\177\u0081\5)\25\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008e\3\2\2\2\u0085"+
		"\u0087\t\b\2\2\u0086\u0088\5\37\20\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u0085\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00ab\3\2\2\2\u0090"+
		"\u0092\5\37\20\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3"+
		"\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\5)"+
		"\25\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a8\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a1\t\b\2\2\u00a0\u00a2\5\37\20\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aaw\3\2\2\2\u00aa\u0091\3\2\2\2\u00ab\f\3\2\2\2\u00ac\u00ad\7"+
		"k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00b5\7v\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b5\7v\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\16\3\2\2\2\u00b6\u00b9\5\21\t"+
		"\2\u00b7\u00b9\7a\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00be"+
		"\3\2\2\2\u00ba\u00bd\5\21\t\2\u00bb\u00bd\t\t\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\20\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\t\n\2\2\u00c2"+
		"\22\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6"+
		"\26\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\30\3\2\2\2\u00c9\u00d3\t\13\2\2\u00ca"+
		"\u00cb\7>\2\2\u00cb\u00d3\7?\2\2\u00cc\u00cd\7@\2\2\u00cd\u00d3\7?\2\2"+
		"\u00ce\u00cf\7?\2\2\u00cf\u00d3\7?\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d3"+
		"\7?\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7-\2\2"+
		"\u00d5\34\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\t\f"+
		"\2\2\u00d9 \3\2\2\2\u00da\u00db\7,\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7\61"+
		"\2\2\u00dd$\3\2\2\2\u00de\u00df\7(\2\2\u00df&\3\2\2\2\u00e0\u00e1\7~\2"+
		"\2\u00e1\u00e2\7~\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4*\3\2\2"+
		"\2\u00e5\u00e6\7#\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8.\3\2\2\2"+
		"\u00e9\u00ea\7+\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7]\2\2\u00ec\62\3\2\2"+
		"\2\u00ed\u00ee\7_\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7}\2\2\u00f0\66\3\2"+
		"\2\2\u00f1\u00f2\7\177\2\2\u00f28\3\2\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5"+
		"\7v\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7e\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7p\2\2"+
		"\u0100<\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103\7h\2\2\u0103>\3\2\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7n\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2"+
		"\u0108@\3\2\2\2\u0109\u010a\7y\2\2\u010a\u010b\7j\2\2\u010b\u010c\7k\2"+
		"\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010eB\3\2\2\2\u010f\u0111\t"+
		"\r\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b\"\2\2\u0115D\3\2\2\2"+
		"\u0116\u0117\7\61\2\2\u0117\u0118\7\61\2\2\u0118\u011c\3\2\2\2\u0119\u011b"+
		"\13\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120"+
		"\7\f\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b#\2\2\u0122F\3\2\2\2\u0123\u0124"+
		"\7\61\2\2\u0124\u0125\7,\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13\2\2\2"+
		"\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7,\2\2\u012d"+
		"\u012e\7\61\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b$\2\2\u0130H\3\2\2\2"+
		"\"\2NQZ]cgjlotw|\u0083\u0087\u008c\u008e\u0091\u0096\u009c\u00a1\u00a6"+
		"\u00a8\u00aa\u00b4\u00b8\u00bc\u00be\u00d2\u0112\u011c\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}