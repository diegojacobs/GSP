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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, NEGATION=11, TOKEN=12, EQUALS=13, WS=14, COMMENT=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "LETTER", "NEGATION", "TOKEN", "EQUALS", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\6\20n\n\20\r\20\16\20o\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\7\21x\n\21\f\21\16\21{\13\21\3\21\5\21~\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13\21\3\21\3\21\5\21\u008c"+
		"\n\21\3\21\3\21\3\u0086\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\2\31\r\33\16\35\17\37\20!\21\3\2\5\4\2C\\c|\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\3#\3\2\2\2\5,\3\2\2\2\7\64\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2"+
		"\2\17G\3\2\2\2\21I\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27d\3\2\2\2\31f\3\2"+
		"\2\2\33h\3\2\2\2\35j\3\2\2\2\37m\3\2\2\2!\u008b\3\2\2\2#$\7K\2\2$%\7P"+
		"\2\2%&\7K\2\2&\'\7V\2\2\'(\7K\2\2()\7C\2\2)*\7N\2\2*+\7<\2\2+\4\3\2\2"+
		"\2,-\7C\2\2-.\7E\2\2./\7V\2\2/\60\7K\2\2\60\61\7Q\2\2\61\62\7P\2\2\62"+
		"\63\7U\2\2\63\6\3\2\2\2\64\65\7G\2\2\65\66\7H\2\2\66\67\7H\2\2\678\7G"+
		"\2\289\7E\2\29:\7V\2\2:;\7U\2\2;<\7<\2\2<\b\3\2\2\2=>\7*\2\2>\n\3\2\2"+
		"\2?@\7+\2\2@\f\3\2\2\2AB\7I\2\2BC\7Q\2\2CD\7C\2\2DE\7N\2\2EF\7<\2\2F\16"+
		"\3\2\2\2GH\7.\2\2H\20\3\2\2\2IJ\7R\2\2JK\7T\2\2KL\7G\2\2LM\7F\2\2MN\7"+
		"K\2\2NO\7E\2\2OP\7C\2\2PQ\7V\2\2QR\7G\2\2RS\7U\2\2S\22\3\2\2\2TU\7`\2"+
		"\2U\24\3\2\2\2VW\7R\2\2WX\7T\2\2XY\7G\2\2YZ\7E\2\2Z[\7Q\2\2[\\\7P\2\2"+
		"\\]\7F\2\2]^\7K\2\2^_\7V\2\2_`\7K\2\2`a\7Q\2\2ab\7P\2\2bc\7<\2\2c\26\3"+
		"\2\2\2de\t\2\2\2e\30\3\2\2\2fg\7#\2\2g\32\3\2\2\2hi\5\27\f\2i\34\3\2\2"+
		"\2jk\7?\2\2k\36\3\2\2\2ln\t\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\b\20\2\2r \3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx"+
		"\n\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|"+
		"~\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u008c\7\f\2\2\u0080\u0081"+
		"\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a"+
		"\u008c\7\61\2\2\u008bs\3\2\2\2\u008b\u0080\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008e\b\21\2\2\u008e\"\3\2\2\2\b\2oy}\u0086\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}