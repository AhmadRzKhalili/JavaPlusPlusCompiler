// Generated from JavaPlusPlus.g4 by ANTLR 4.9.2
package ir.ac.kntu.khalili.javapluspluscompiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaPlusPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_NO=2, INT=3, FLT_NO=4, FLT=5, AS=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		IF=11, ELSE=12, SWITCH=13, CASE=14, BREAK=15, EQ=16, NEQ=17, GTE=18, LTE=19, 
		GT=20, LT=21, WHILE=22, FOR=23, DO=24, WS=25, OPEN_PAR=26, CLOSE_PAR=27, 
		OPEN_CUR_BRA=28, CLOSE_CUR_BRA=29, CLASS=30, MAIN_FUNC=31, INPUT=32, OUTPUT=33, 
		FUNC=34, RET=35, SEMICOLON=36, COMMA=37, CLASS_ID=38, ID=39, COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT_NO", "INT", "FLT_NO", "FLT", "AS", "MUL", "DIV", "ADD", 
			"SUB", "IF", "ELSE", "SWITCH", "CASE", "BREAK", "EQ", "NEQ", "GTE", "LTE", 
			"GT", "LT", "WHILE", "FOR", "DO", "WS", "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR_BRA", 
			"CLOSE_CUR_BRA", "CLASS", "MAIN_FUNC", "INPUT", "OUTPUT", "FUNC", "RET", 
			"SEMICOLON", "COMMA", "CLASS_ID", "ID", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", null, "'int'", null, "'float'", "'='", "'*'", "'/'", "'+'", 
			"'-'", "'if'", "'else'", "'switch'", "'case'", "'break'", "'=='", "'!='", 
			"'>='", "'<='", "'>'", "'<'", "'while'", "'for'", "'do'", null, "'('", 
			"')'", "'{'", "'}'", "'class'", "'main'", "'input'", "'output'", null, 
			"'return'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT_NO", "INT", "FLT_NO", "FLT", "AS", "MUL", "DIV", "ADD", 
			"SUB", "IF", "ELSE", "SWITCH", "CASE", "BREAK", "EQ", "NEQ", "GTE", "LTE", 
			"GT", "LT", "WHILE", "FOR", "DO", "WS", "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR_BRA", 
			"CLOSE_CUR_BRA", "CLASS", "MAIN_FUNC", "INPUT", "OUTPUT", "FUNC", "RET", 
			"SEMICOLON", "COMMA", "CLASS_ID", "ID", "COMMENT"
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


	public JavaPlusPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaPlusPlus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\6\3X\n\3\r\3\16\3Y\3\4\3\4\3\4\3\4\3\5\3\5\7\5b\n\5\f\5\16\5e\13\5"+
		"\3\5\3\5\6\5i\n\5\r\5\16\5j\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\6\32\u00b7\n\32\r\32\16\32\u00b8\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u00f8\n#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\7\'\u0107\n\'\f"+
		"\'\16\'\u010a\13\'\3(\3(\7(\u010e\n(\f(\16(\u0111\13(\3)\3)\3)\3)\7)\u0117"+
		"\n)\f)\16)\u011a\13)\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\n\5\2\"\""+
		"--//\3\2\62;\5\2\13\f\17\17\"\"\3\2C\\\5\2\62;C\\c|\5\2C\\aac|\6\2\62"+
		";C\\aac|\7\2\13\13\"\"\62;C\\c|\2\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t_\3\2\2"+
		"\2\13n\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25|\3\2"+
		"\2\2\27~\3\2\2\2\31\u0081\3\2\2\2\33\u0086\3\2\2\2\35\u008d\3\2\2\2\37"+
		"\u0092\3\2\2\2!\u0098\3\2\2\2#\u009b\3\2\2\2%\u009e\3\2\2\2\'\u00a1\3"+
		"\2\2\2)\u00a4\3\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00ae\3\2\2\2\61"+
		"\u00b2\3\2\2\2\63\u00b6\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00c0"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00ca\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d5\3\2\2\2E\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u0100\3\2\2\2K\u0102\3\2"+
		"\2\2M\u0104\3\2\2\2O\u010b\3\2\2\2Q\u0112\3\2\2\2ST\7<\2\2T\4\3\2\2\2"+
		"UW\t\2\2\2VX\t\3\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\6\3\2\2"+
		"\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\b\3\2\2\2_c\t\2\2\2`b\t\3\2\2a`\3\2\2"+
		"\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fh\7\60\2\2gi\t\3"+
		"\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7h\2\2m\n\3\2"+
		"\2\2no\7h\2\2op\7n\2\2pq\7q\2\2qr\7c\2\2rs\7v\2\2s\f\3\2\2\2tu\7?\2\2"+
		"u\16\3\2\2\2vw\7,\2\2w\20\3\2\2\2xy\7\61\2\2y\22\3\2\2\2z{\7-\2\2{\24"+
		"\3\2\2\2|}\7/\2\2}\26\3\2\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080\30\3"+
		"\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085\32\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7y\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b\7e\2\2\u008b\u008c\7j\2\2"+
		"\u008c\34\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7c\2\2\u008f\u0090\7"+
		"u\2\2\u0090\u0091\7g\2\2\u0091\36\3\2\2\2\u0092\u0093\7d\2\2\u0093\u0094"+
		"\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7m\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a\"\3\2\2\2\u009b"+
		"\u009c\7#\2\2\u009c\u009d\7?\2\2\u009d$\3\2\2\2\u009e\u009f\7@\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"(\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7,"+
		"\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad.\3\2\2\2\u00ae\u00af\7h\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7f\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\62\3\2\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\b\32\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7+\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7}\2\2\u00c1"+
		":\3\2\2\2\u00c2\u00c3\7\177\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7u\2\2"+
		"\u00c9>\3\2\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7k\2"+
		"\2\u00cd\u00ce\7p\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7"+
		"p\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7v\2\2\u00d4B"+
		"\3\2\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7r\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7v\2\2\u00dbD\3\2\2\2\u00dc"+
		"\u00dd\7x\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7f\2\2"+
		"\u00e0\u00e1\7a\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4\u00f8\7e\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8\u00e9\7a\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7w\2\2"+
		"\u00eb\u00ec\7p\2\2\u00ec\u00f8\7e\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7a\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7p\2\2"+
		"\u00f6\u00f8\7e\2\2\u00f7\u00dc\3\2\2\2\u00f7\u00e5\3\2\2\2\u00f7\u00ed"+
		"\3\2\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"H\3\2\2\2\u0100\u0101\7=\2\2\u0101J\3\2\2\2\u0102\u0103\7.\2\2\u0103L"+
		"\3\2\2\2\u0104\u0108\t\5\2\2\u0105\u0107\t\6\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109N\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010f\t\7\2\2\u010c\u010e\t\b\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"P\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\61\2\2\u0113\u0114\7\61\2"+
		"\2\u0114\u0118\3\2\2\2\u0115\u0117\t\t\2\2\u0116\u0115\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\b)\2\2\u011cR\3\2\2\2\13\2Ycj\u00b8\u00f7\u0108"+
		"\u010f\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}