// Generated from GSP.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GSPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, NEGATION=13, TOKEN=14, EQUALS=15, WS=16, COMMENT=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "LETTER", "NEGATION", "TOKEN", "EQUALS", "WS", 
		"COMMENT"
	};


	public GSPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GSP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\6\22v\n\22\r\22\16\22w\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0080\n\23"+
		"\f\23\16\23\u0083\13\23\3\23\5\23\u0086\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u008d\n\23\f\23\16\23\u0090\13\23\3\23\3\23\5\23\u0094\n\23\3\23"+
		"\3\23\3\u008e\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\2\35\17\37\20!\21#\22%\23\3\2\5\4\2C\\c|\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\60\3\2\2\2\79\3\2\2\2\t?\3\2\2\2"+
		"\13A\3\2\2\2\rC\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2"+
		"\2\27\\\3\2\2\2\31^\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2"+
		"\2\2#u\3\2\2\2%\u0093\3\2\2\2\'(\7K\2\2()\7P\2\2)*\7K\2\2*+\7V\2\2+,\7"+
		"K\2\2,-\7C\2\2-.\7N\2\2./\7<\2\2/\4\3\2\2\2\60\61\7G\2\2\61\62\7H\2\2"+
		"\62\63\7H\2\2\63\64\7G\2\2\64\65\7E\2\2\65\66\7V\2\2\66\67\7U\2\2\678"+
		"\7<\2\28\6\3\2\2\29:\7I\2\2:;\7Q\2\2;<\7C\2\2<=\7N\2\2=>\7<\2\2>\b\3\2"+
		"\2\2?@\7<\2\2@\n\3\2\2\2AB\7`\2\2B\f\3\2\2\2CD\7C\2\2DE\7E\2\2EF\7V\2"+
		"\2FG\7K\2\2GH\7Q\2\2HI\7P\2\2IJ\7U\2\2J\16\3\2\2\2KL\7*\2\2L\20\3\2\2"+
		"\2MN\7+\2\2N\22\3\2\2\2OP\7.\2\2P\24\3\2\2\2QR\7R\2\2RS\7T\2\2ST\7G\2"+
		"\2TU\7F\2\2UV\7K\2\2VW\7E\2\2WX\7C\2\2XY\7V\2\2YZ\7G\2\2Z[\7U\2\2[\26"+
		"\3\2\2\2\\]\7/\2\2]\30\3\2\2\2^_\7R\2\2_`\7T\2\2`a\7G\2\2ab\7E\2\2bc\7"+
		"Q\2\2cd\7P\2\2de\7F\2\2ef\7K\2\2fg\7V\2\2gh\7K\2\2hi\7Q\2\2ij\7P\2\2j"+
		"k\7<\2\2k\32\3\2\2\2lm\t\2\2\2m\34\3\2\2\2no\7#\2\2o\36\3\2\2\2pq\5\33"+
		"\16\2q \3\2\2\2rs\7?\2\2s\"\3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\22\2\2z$\3\2\2\2{|\7\61\2\2|}\7\61\2\2"+
		"}\u0081\3\2\2\2~\u0080\n\4\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0086\7\17\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0094\7\f\2\2\u0088\u0089\7\61\2\2\u0089\u008a\7"+
		",\2\2\u008a\u008e\3\2\2\2\u008b\u008d\13\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0094\7\61\2\2\u0093"+
		"{\3\2\2\2\u0093\u0088\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\23\2\2"+
		"\u0096&\3\2\2\2\b\2w\u0081\u0085\u008e\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}