// Generated from ./src/CmmLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_10=1, INT_8=2, INT_16=3, FLOAT=4, TYPE=5, RETURN=6, STRUCT=7, IF=8, 
		ELSE=9, WHILE=10, ID=11, CHAR=12, SEMI=13, COMMA=14, RELOP=15, ASSIGNOP=16, 
		PLUS=17, MINUS=18, SIGN=19, STAR=20, DIV=21, AND=22, OR=23, DOT=24, NOT=25, 
		LP=26, RP=27, LB=28, RB=29, LC=30, RC=31, WS=32, SL_COMMENT=33, ML_COMMENT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_10", "INT_8", "INT_16", "FLOAT", "TYPE", "RETURN", "STRUCT", "IF", 
			"ELSE", "WHILE", "ID", "CHAR", "SEMI", "COMMA", "RELOP", "ASSIGNOP", 
			"PLUS", "MINUS", "SIGN", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", 
			"RP", "LB", "RB", "LC", "RC", "WS", "SL_COMMENT", "ML_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'return'", "'struct'", "'if'", "'else'", 
			"'while'", null, null, "';'", "','", null, "'='", "'+'", "'-'", null, 
			"'*'", "'/'", "'&&'", "'||'", "'.'", "'!'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_10", "INT_8", "INT_16", "FLOAT", "TYPE", "RETURN", "STRUCT", 
			"IF", "ELSE", "WHILE", "ID", "CHAR", "SEMI", "COMMA", "RELOP", "ASSIGNOP", 
			"PLUS", "MINUS", "SIGN", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", 
			"RP", "LB", "RB", "LC", "RC", "WS", "SL_COMMENT", "ML_COMMENT"
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


	public CmmLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\5\2P\n\2\3\3\3\3"+
		"\6\3T\n\3\r\3\16\3U\3\4\3\4\3\4\6\4[\n\4\r\4\16\4\\\3\5\7\5`\n\5\f\5\16"+
		"\5c\13\5\3\5\3\5\6\5g\n\5\r\5\16\5h\3\5\3\5\5\5m\n\5\3\5\6\5p\n\5\r\5"+
		"\16\5q\3\5\6\5u\n\5\r\5\16\5v\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\5\3\5"+
		"\5\5\u0082\n\5\3\5\6\5\u0085\n\5\r\5\16\5\u0086\3\5\6\5\u008a\n\5\r\5"+
		"\16\5\u008b\3\5\3\5\6\5\u0090\n\5\r\5\16\5\u0091\5\5\u0094\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\5\f\u00be\n\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5"+
		"\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00d6\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\6!\u00fb\n!\r!"+
		"\16!\u00fc\3!\3!\3\"\3\"\3\"\3\"\7\"\u0105\n\"\f\"\16\"\u0108\13\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u0112\n#\f#\16#\u0115\13#\3#\3#\3#\3#\3#\4"+
		"\u0106\u0113\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$\3\2\r\3\2\63;\3\2\62;\3\2\629\4\2ZZzz\5\2"+
		"\62;CHch\4\2GGgg\4\2\62;aa\4\2C\\c|\4\2>>@@\4\2--//\5\2\13\f\17\17\"\""+
		"\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3O\3\2\2\2\5Q\3\2\2\2\7W\3\2\2\2\t\u0093\3\2\2\2\13\u009d\3\2\2\2\r\u009f"+
		"\3\2\2\2\17\u00a6\3\2\2\2\21\u00ad\3\2\2\2\23\u00b0\3\2\2\2\25\u00b5\3"+
		"\2\2\2\27\u00bd\3\2\2\2\31\u00c6\3\2\2\2\33\u00c8\3\2\2\2\35\u00ca\3\2"+
		"\2\2\37\u00d5\3\2\2\2!\u00d7\3\2\2\2#\u00d9\3\2\2\2%\u00db\3\2\2\2\'\u00dd"+
		"\3\2\2\2)\u00df\3\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e6\3\2\2\2\61"+
		"\u00e9\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2\2\2A\u00fa\3\2\2\2C"+
		"\u0100\3\2\2\2E\u010d\3\2\2\2GP\7\62\2\2HL\t\2\2\2IK\t\3\2\2JI\3\2\2\2"+
		"KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OG\3\2\2\2OH\3\2\2\2"+
		"P\4\3\2\2\2QS\7\62\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2V\6\3\2\2\2WX\7\62\2\2XZ\t\5\2\2Y[\t\6\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]\b\3\2\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2bd\3\2\2\2ca\3\2\2\2df\5\61\31\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\t\7\2\2km\5\'\24\2lk\3\2\2\2lm\3\2"+
		"\2\2mo\3\2\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0094"+
		"\3\2\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2x"+
		"|\5\61\31\2y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2"+
		"\2\2~|\3\2\2\2\177\u0081\t\7\2\2\u0080\u0082\5\'\24\2\u0081\u0080\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\t\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0094\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\5\61\31\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093a\3\2\2\2\u0093t\3\2\2\2\u0093\u0089\3\2\2\2\u0094\n\3\2\2\2"+
		"\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u009e\7v\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7n\2\2\u009a\u009b\7q\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009e\7v\2\2\u009d\u0095\3\2\2\2\u009d\u0098\3\2\2\2\u009e\f\3\2\2\2"+
		"\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3"+
		"\7w\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7p\2\2\u00a5\16\3\2\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7v\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\22\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6"+
		"\u00b7\7j\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\26\3\2\2\2\u00bb\u00be\5\31\r\2\u00bc\u00be\7a\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c3\3\2\2\2\u00bf\u00c2\5\31\r\2"+
		"\u00c0\u00c2\t\b\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\30\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\t\t\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7=\2\2"+
		"\u00c9\34\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb\36\3\2\2\2\u00cc\u00d6\t\n"+
		"\2\2\u00cd\u00ce\7>\2\2\u00ce\u00d6\7?\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d6"+
		"\7?\2\2\u00d1\u00d2\7?\2\2\u00d2\u00d6\7?\2\2\u00d3\u00d4\7#\2\2\u00d4"+
		"\u00d6\7?\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00cf\3\2"+
		"\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6 \3\2\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7-\2\2\u00da$\3\2\2\2\u00db\u00dc"+
		"\7/\2\2\u00dc&\3\2\2\2\u00dd\u00de\t\13\2\2\u00de(\3\2\2\2\u00df\u00e0"+
		"\7,\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2,\3\2\2\2\u00e3\u00e4"+
		"\7(\2\2\u00e4\u00e5\7(\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7\u00e8"+
		"\7~\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\62\3\2\2\2\u00eb\u00ec"+
		"\7#\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee\66\3\2\2\2\u00ef\u00f0"+
		"\7+\2\2\u00f08\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7"+
		"_\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7\177"+
		"\2\2\u00f8@\3\2\2\2\u00f9\u00fb\t\f\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\b!\2\2\u00ffB\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7\61\2\2"+
		"\u0102\u0106\3\2\2\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\""+
		"\2\2\u010cD\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f\u0113"+
		"\3\2\2\2\u0110\u0112\13\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0117\7,\2\2\u0117\u0118\7\61\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\b#\2\2\u011aF\3\2\2\2\32\2LOU\\ahlqv|\u0081\u0086\u008b\u0091\u0093"+
		"\u009d\u00bd\u00c1\u00c3\u00d5\u00fc\u0106\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}