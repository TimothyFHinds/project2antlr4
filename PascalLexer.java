// Generated from Pascal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BEGIN=7, ELSE=8, END=9, 
		IF=10, DIV=11, MULT=12, PLUS=13, MINUS=14, EQUAL=15, NOT_EQUAL=16, LT=17, 
		GT=18, GE=19, LE=20, BOOLINPUT=21, PROGRAM=22, THEN=23, TYPE=24, VAR=25, 
		TRUE=26, FALSE=27, READLN=28, WRITELN=29, SQRT=30, SIN=31, COS=32, LN=33, 
		EXP=34, CASE=35, WHILE=36, DO=37, FOR=38, TO=39, OF=40, RETURN=41, LET=42, 
		BOOLEAN=43, REAL=44, PROCEDURE=45, FUNCTION=46, NOT=47, AND=48, OR=49, 
		NUM=50, ID=51, STRING=52, LINE_COMMENT=53, COMMENT=54, COMMENTTWO=55, 
		COMMENTTHREE=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "BEGIN", "ELSE", "END", "IF", "DIV", 
			"MULT", "PLUS", "MINUS", "EQUAL", "NOT_EQUAL", "LT", "GT", "GE", "LE", 
			"BOOLINPUT", "PROGRAM", "THEN", "TYPE", "VAR", "TRUE", "FALSE", "READLN", 
			"WRITELN", "SQRT", "SIN", "COS", "LN", "EXP", "CASE", "WHILE", "DO", 
			"FOR", "TO", "OF", "RETURN", "LET", "BOOLEAN", "REAL", "PROCEDURE", "FUNCTION", 
			"NOT", "AND", "OR", "DIGIT", "NUM", "ID", "STRING", "LINE_COMMENT", "COMMENT", 
			"COMMENTTWO", "COMMENTTHREE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "':'", "','", "'('", "')'", null, null, null, null, 
			"'/'", "'*'", "'+'", "'-'", "'='", "'<>'", "'<'", "'>'", "'>='", "'<='", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BEGIN", "ELSE", "END", "IF", 
			"DIV", "MULT", "PLUS", "MINUS", "EQUAL", "NOT_EQUAL", "LT", "GT", "GE", 
			"LE", "BOOLINPUT", "PROGRAM", "THEN", "TYPE", "VAR", "TRUE", "FALSE", 
			"READLN", "WRITELN", "SQRT", "SIN", "COS", "LN", "EXP", "CASE", "WHILE", 
			"DO", "FOR", "TO", "OF", "RETURN", "LET", "BOOLEAN", "REAL", "PROCEDURE", 
			"FUNCTION", "NOT", "AND", "OR", "NUM", "ID", "STRING", "LINE_COMMENT", 
			"COMMENT", "COMMENTTWO", "COMMENTTHREE", "WS"
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3."+
		"\3/\3/\3/\3\60\3\60\5\60\u0117\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3K\5K\u01a8\n"+
		"K\3L\3L\3L\3L\5L\u01ae\nL\3M\3M\3N\6N\u01b3\nN\rN\16N\u01b4\3N\3N\7N\u01b9"+
		"\nN\fN\16N\u01bc\13N\3N\3N\6N\u01c0\nN\rN\16N\u01c1\3N\6N\u01c5\nN\rN"+
		"\16N\u01c6\5N\u01c9\nN\3O\3O\7O\u01cd\nO\fO\16O\u01d0\13O\3P\3P\7P\u01d4"+
		"\nP\fP\16P\u01d7\13P\3P\3P\3Q\3Q\7Q\u01dd\nQ\fQ\16Q\u01e0\13Q\3Q\5Q\u01e3"+
		"\nQ\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\7R\u01ee\nR\fR\16R\u01f1\13R\3R\3R\3R\3"+
		"R\3R\3S\3S\3S\3S\7S\u01fc\nS\fS\16S\u01ff\13S\3S\3S\3S\3S\3S\3T\3T\3T"+
		"\3T\7T\u020a\nT\fT\16T\u020d\13T\3T\3T\3T\3T\3U\6U\u0214\nU\rU\16U\u0215"+
		"\3U\3U\7\u01d5\u01de\u01ef\u01fd\u020b\2V\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W"+
		"\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177"+
		"\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093"+
		"\61\u0095\62\u0097\63\u0099\2\u009b\64\u009d\65\u009f\66\u00a1\67\u00a3"+
		"8\u00a59\u00a7:\u00a9;\3\2 \4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPp"+
		"p\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u020e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2"+
		"\2\5\u00ad\3\2\2\2\7\u00af\3\2\2\2\t\u00b1\3\2\2\2\13\u00b3\3\2\2\2\r"+
		"\u00b5\3\2\2\2\17\u00b7\3\2\2\2\21\u00b9\3\2\2\2\23\u00bb\3\2\2\2\25\u00bd"+
		"\3\2\2\2\27\u00bf\3\2\2\2\31\u00c1\3\2\2\2\33\u00c3\3\2\2\2\35\u00c5\3"+
		"\2\2\2\37\u00c7\3\2\2\2!\u00c9\3\2\2\2#\u00cb\3\2\2\2%\u00cd\3\2\2\2\'"+
		"\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2"+
		"\2\2\61\u00d9\3\2\2\2\63\u00db\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2"+
		"\29\u00e1\3\2\2\2;\u00e3\3\2\2\2=\u00e5\3\2\2\2?\u00e7\3\2\2\2A\u00e9"+
		"\3\2\2\2C\u00eb\3\2\2\2E\u00f1\3\2\2\2G\u00f6\3\2\2\2I\u00fa\3\2\2\2K"+
		"\u00fd\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0105\3\2"+
		"\2\2U\u0107\3\2\2\2W\u010a\3\2\2\2Y\u010c\3\2\2\2[\u010e\3\2\2\2]\u0111"+
		"\3\2\2\2_\u0116\3\2\2\2a\u0118\3\2\2\2c\u0120\3\2\2\2e\u0125\3\2\2\2g"+
		"\u012a\3\2\2\2i\u012e\3\2\2\2k\u0133\3\2\2\2m\u0139\3\2\2\2o\u0140\3\2"+
		"\2\2q\u0148\3\2\2\2s\u014d\3\2\2\2u\u0151\3\2\2\2w\u0155\3\2\2\2y\u0158"+
		"\3\2\2\2{\u015c\3\2\2\2}\u0161\3\2\2\2\177\u0167\3\2\2\2\u0081\u016a\3"+
		"\2\2\2\u0083\u016e\3\2\2\2\u0085\u0171\3\2\2\2\u0087\u0174\3\2\2\2\u0089"+
		"\u017b\3\2\2\2\u008b\u017e\3\2\2\2\u008d\u0186\3\2\2\2\u008f\u018b\3\2"+
		"\2\2\u0091\u0195\3\2\2\2\u0093\u019e\3\2\2\2\u0095\u01a7\3\2\2\2\u0097"+
		"\u01ad\3\2\2\2\u0099\u01af\3\2\2\2\u009b\u01c8\3\2\2\2\u009d\u01ca\3\2"+
		"\2\2\u009f\u01d1\3\2\2\2\u00a1\u01da\3\2\2\2\u00a3\u01e9\3\2\2\2\u00a5"+
		"\u01f7\3\2\2\2\u00a7\u0205\3\2\2\2\u00a9\u0213\3\2\2\2\u00ab\u00ac\7\60"+
		"\2\2\u00ac\4\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\6\3\2\2\2\u00af\u00b0\7"+
		"<\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7"+
		"*\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6\16\3\2\2\2\u00b7\u00b8"+
		"\t\2\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\t\3\2\2\u00ba\22\3\2\2\2\u00bb\u00bc"+
		"\t\4\2\2\u00bc\24\3\2\2\2\u00bd\u00be\t\5\2\2\u00be\26\3\2\2\2\u00bf\u00c0"+
		"\t\6\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\t\7\2\2\u00c2\32\3\2\2\2\u00c3\u00c4"+
		"\t\b\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\t\t\2\2\u00c6\36\3\2\2\2\u00c7\u00c8"+
		"\t\n\2\2\u00c8 \3\2\2\2\u00c9\u00ca\t\13\2\2\u00ca\"\3\2\2\2\u00cb\u00cc"+
		"\t\f\2\2\u00cc$\3\2\2\2\u00cd\u00ce\t\r\2\2\u00ce&\3\2\2\2\u00cf\u00d0"+
		"\t\16\2\2\u00d0(\3\2\2\2\u00d1\u00d2\t\17\2\2\u00d2*\3\2\2\2\u00d3\u00d4"+
		"\t\20\2\2\u00d4,\3\2\2\2\u00d5\u00d6\t\21\2\2\u00d6.\3\2\2\2\u00d7\u00d8"+
		"\t\22\2\2\u00d8\60\3\2\2\2\u00d9\u00da\t\23\2\2\u00da\62\3\2\2\2\u00db"+
		"\u00dc\t\24\2\2\u00dc\64\3\2\2\2\u00dd\u00de\t\25\2\2\u00de\66\3\2\2\2"+
		"\u00df\u00e0\t\26\2\2\u00e08\3\2\2\2\u00e1\u00e2\t\27\2\2\u00e2:\3\2\2"+
		"\2\u00e3\u00e4\t\30\2\2\u00e4<\3\2\2\2\u00e5\u00e6\t\31\2\2\u00e6>\3\2"+
		"\2\2\u00e7\u00e8\t\32\2\2\u00e8@\3\2\2\2\u00e9\u00ea\t\33\2\2\u00eaB\3"+
		"\2\2\2\u00eb\u00ec\5\21\t\2\u00ec\u00ed\5\27\f\2\u00ed\u00ee\5\33\16\2"+
		"\u00ee\u00ef\5\37\20\2\u00ef\u00f0\5)\25\2\u00f0D\3\2\2\2\u00f1\u00f2"+
		"\5\27\f\2\u00f2\u00f3\5%\23\2\u00f3\u00f4\5\63\32\2\u00f4\u00f5\5\27\f"+
		"\2\u00f5F\3\2\2\2\u00f6\u00f7\5\27\f\2\u00f7\u00f8\5)\25\2\u00f8\u00f9"+
		"\5\25\13\2\u00f9H\3\2\2\2\u00fa\u00fb\5\37\20\2\u00fb\u00fc\5\31\r\2\u00fc"+
		"J\3\2\2\2\u00fd\u00fe\7\61\2\2\u00feL\3\2\2\2\u00ff\u0100\7,\2\2\u0100"+
		"N\3\2\2\2\u0101\u0102\7-\2\2\u0102P\3\2\2\2\u0103\u0104\7/\2\2\u0104R"+
		"\3\2\2\2\u0105\u0106\7?\2\2\u0106T\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109"+
		"\7@\2\2\u0109V\3\2\2\2\u010a\u010b\7>\2\2\u010bX\3\2\2\2\u010c\u010d\7"+
		"@\2\2\u010dZ\3\2\2\2\u010e\u010f\7@\2\2\u010f\u0110\7?\2\2\u0110\\\3\2"+
		"\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113^\3\2\2\2\u0114\u0117"+
		"\5i\65\2\u0115\u0117\5k\66\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"`\3\2\2\2\u0118\u0119\5-\27\2\u0119\u011a\5\61\31\2\u011a\u011b\5+\26"+
		"\2\u011b\u011c\5\33\16\2\u011c\u011d\5\61\31\2\u011d\u011e\5\17\b\2\u011e"+
		"\u011f\5\'\24\2\u011fb\3\2\2\2\u0120\u0121\5\65\33\2\u0121\u0122\5\35"+
		"\17\2\u0122\u0123\5\27\f\2\u0123\u0124\5)\25\2\u0124d\3\2\2\2\u0125\u0126"+
		"\5\65\33\2\u0126\u0127\5? \2\u0127\u0128\5-\27\2\u0128\u0129\5\27\f\2"+
		"\u0129f\3\2\2\2\u012a\u012b\59\35\2\u012b\u012c\5\17\b\2\u012c\u012d\5"+
		"\61\31\2\u012dh\3\2\2\2\u012e\u012f\5\65\33\2\u012f\u0130\5\61\31\2\u0130"+
		"\u0131\5\67\34\2\u0131\u0132\5\27\f\2\u0132j\3\2\2\2\u0133\u0134\5\31"+
		"\r\2\u0134\u0135\5\17\b\2\u0135\u0136\5%\23\2\u0136\u0137\5\63\32\2\u0137"+
		"\u0138\5\27\f\2\u0138l\3\2\2\2\u0139\u013a\5\61\31\2\u013a\u013b\5\27"+
		"\f\2\u013b\u013c\5\17\b\2\u013c\u013d\5\25\13\2\u013d\u013e\5%\23\2\u013e"+
		"\u013f\5)\25\2\u013fn\3\2\2\2\u0140\u0141\5;\36\2\u0141\u0142\5\61\31"+
		"\2\u0142\u0143\5\37\20\2\u0143\u0144\5\65\33\2\u0144\u0145\5\27\f\2\u0145"+
		"\u0146\5%\23\2\u0146\u0147\5)\25\2\u0147p\3\2\2\2\u0148\u0149\5\63\32"+
		"\2\u0149\u014a\5/\30\2\u014a\u014b\5\61\31\2\u014b\u014c\5\65\33\2\u014c"+
		"r\3\2\2\2\u014d\u014e\5\63\32\2\u014e\u014f\5\37\20\2\u014f\u0150\5)\25"+
		"\2\u0150t\3\2\2\2\u0151\u0152\5\23\n\2\u0152\u0153\5+\26\2\u0153\u0154"+
		"\5\63\32\2\u0154v\3\2\2\2\u0155\u0156\5%\23\2\u0156\u0157\5)\25\2\u0157"+
		"x\3\2\2\2\u0158\u0159\5\27\f\2\u0159\u015a\5=\37\2\u015a\u015b\5-\27\2"+
		"\u015bz\3\2\2\2\u015c\u015d\5\23\n\2\u015d\u015e\5\17\b\2\u015e\u015f"+
		"\5\63\32\2\u015f\u0160\5\27\f\2\u0160|\3\2\2\2\u0161\u0162\5;\36\2\u0162"+
		"\u0163\5\35\17\2\u0163\u0164\5\37\20\2\u0164\u0165\5%\23\2\u0165\u0166"+
		"\5\27\f\2\u0166~\3\2\2\2\u0167\u0168\5\25\13\2\u0168\u0169\5+\26\2\u0169"+
		"\u0080\3\2\2\2\u016a\u016b\5\31\r\2\u016b\u016c\5+\26\2\u016c\u016d\5"+
		"\61\31\2\u016d\u0082\3\2\2\2\u016e\u016f\5\65\33\2\u016f\u0170\5+\26\2"+
		"\u0170\u0084\3\2\2\2\u0171\u0172\5+\26\2\u0172\u0173\5\31\r\2\u0173\u0086"+
		"\3\2\2\2\u0174\u0175\5\61\31\2\u0175\u0176\5\27\f\2\u0176\u0177\5\65\33"+
		"\2\u0177\u0178\5\67\34\2\u0178\u0179\5\61\31\2\u0179\u017a\5)\25\2\u017a"+
		"\u0088\3\2\2\2\u017b\u017c\7<\2\2\u017c\u017d\7?\2\2\u017d\u008a\3\2\2"+
		"\2\u017e\u017f\5\21\t\2\u017f\u0180\5+\26\2\u0180\u0181\5+\26\2\u0181"+
		"\u0182\5%\23\2\u0182\u0183\5\27\f\2\u0183\u0184\5\17\b\2\u0184\u0185\5"+
		")\25\2\u0185\u008c\3\2\2\2\u0186\u0187\5\61\31\2\u0187\u0188\5\27\f\2"+
		"\u0188\u0189\5\17\b\2\u0189\u018a\5%\23\2\u018a\u008e\3\2\2\2\u018b\u018c"+
		"\5-\27\2\u018c\u018d\5\61\31\2\u018d\u018e\5+\26\2\u018e\u018f\5\23\n"+
		"\2\u018f\u0190\5\27\f\2\u0190\u0191\5\25\13\2\u0191\u0192\5\67\34\2\u0192"+
		"\u0193\5\61\31\2\u0193\u0194\5\27\f\2\u0194\u0090\3\2\2\2\u0195\u0196"+
		"\5\31\r\2\u0196\u0197\5\67\34\2\u0197\u0198\5)\25\2\u0198\u0199\5\23\n"+
		"\2\u0199\u019a\5\65\33\2\u019a\u019b\5\37\20\2\u019b\u019c\5+\26\2\u019c"+
		"\u019d\5)\25\2\u019d\u0092\3\2\2\2\u019e\u019f\5)\25\2\u019f\u01a0\5+"+
		"\26\2\u01a0\u01a1\5\65\33\2\u01a1\u0094\3\2\2\2\u01a2\u01a3\5\17\b\2\u01a3"+
		"\u01a4\5)\25\2\u01a4\u01a5\5\25\13\2\u01a5\u01a8\3\2\2\2\u01a6\u01a8\7"+
		"(\2\2\u01a7\u01a2\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u0096\3\2\2\2\u01a9"+
		"\u01aa\5+\26\2\u01aa\u01ab\5\61\31\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\7"+
		"~\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u0098\3\2\2\2\u01af"+
		"\u01b0\t\34\2\2\u01b0\u009a\3\2\2\2\u01b1\u01b3\5\u0099M\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01ba\7\60\2\2\u01b7\u01b9\5\u0099M\2\u01b8\u01b7"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01c9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\7\60\2\2\u01be\u01c0\5"+
		"\u0099M\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2"+
		"\u01c1\u01c2\3\2\2\2\u01c2\u01c9\3\2\2\2\u01c3\u01c5\5\u0099M\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01b2\3\2\2\2\u01c8\u01bd\3\2\2\2\u01c8"+
		"\u01c4\3\2\2\2\u01c9\u009c\3\2\2\2\u01ca\u01ce\t\35\2\2\u01cb\u01cd\t"+
		"\36\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u009e\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\7)"+
		"\2\2\u01d2\u01d4\13\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01d9\7)\2\2\u01d9\u00a0\3\2\2\2\u01da\u01de\7}\2\2\u01db\u01dd"+
		"\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01df\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3"+
		"\7\17\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2"+
		"\u01e4\u01e5\7\177\2\2\u01e5\u01e6\7\f\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\bQ\2\2\u01e8\u00a2\3\2\2\2\u01e9\u01ea\7*\2\2\u01ea\u01eb\7,\2\2\u01eb"+
		"\u01ef\3\2\2\2\u01ec\u01ee\13\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f3\7,\2\2\u01f3\u01f4\7+\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5\u01f6\bR\2\2\u01f6\u00a4\3\2\2\2\u01f7\u01f8\7}\2\2\u01f8\u01f9"+
		"\7,\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fc\13\2\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7,\2\2\u0201\u0202\7\177\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\bS\2\2\u0204\u00a6\3\2\2\2\u0205\u0206\7\61"+
		"\2\2\u0206\u0207\7\61\2\2\u0207\u020b\3\2\2\2\u0208\u020a\13\2\2\2\u0209"+
		"\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u020c\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7\f\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0211\bT\2\2\u0211\u00a8\3\2\2\2\u0212\u0214\t\37"+
		"\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\bU\2\2\u0218\u00aa\3\2"+
		"\2\2\23\2\u0116\u01a7\u01ad\u01b4\u01ba\u01c1\u01c6\u01c8\u01ce\u01d5"+
		"\u01de\u01e2\u01ef\u01fd\u020b\u0215\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}