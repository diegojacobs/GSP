// Generated from GSP.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GSPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, NEGATION=11, TOKEN=12, EQUALS=13, WS=14, COMMENT=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'INITIAL:'", "'ACTIONS'", "'EFFECTS:'", "'('", "')'", "'GOAL:'", 
		"','", "'PREDICATES'", "'^'", "'PRECONDITION:'", "'!'", "TOKEN", "'='", 
		"WS", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_predicates = 1, RULE_singular_predicate = 2, RULE_name = 3, 
		RULE_action_name = 4, RULE_multiple_params = 5, RULE_params = 6, RULE_action_params = 7, 
		RULE_multiple_action_params = 8, RULE_actions = 9, RULE_singular_action = 10, 
		RULE_precond = 11, RULE_conjunction = 12, RULE_negation = 13, RULE_effects = 14, 
		RULE_initial_state = 15, RULE_init_states = 16, RULE_init_state = 17, 
		RULE_goal_state = 18, RULE_init_goals = 19, RULE_init_goal = 20;
	public static final String[] ruleNames = {
		"program", "predicates", "singular_predicate", "name", "action_name", 
		"multiple_params", "params", "action_params", "multiple_action_params", 
		"actions", "singular_action", "precond", "conjunction", "negation", "effects", 
		"initial_state", "init_states", "init_state", "goal_state", "init_goals", 
		"init_goal"
	};

	@Override
	public String getGrammarFileName() { return "GSP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GSPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Goal_stateContext goal_state() {
			return getRuleContext(Goal_stateContext.class,0);
		}
		public PredicatesContext predicates() {
			return getRuleContext(PredicatesContext.class,0);
		}
		public Initial_stateContext initial_state() {
			return getRuleContext(Initial_stateContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); predicates();
			setState(43); initial_state();
			setState(44); goal_state();
			setState(45); actions();
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

	public static class PredicatesContext extends ParserRuleContext {
		public Singular_predicateContext singular_predicate(int i) {
			return getRuleContext(Singular_predicateContext.class,i);
		}
		public List<Singular_predicateContext> singular_predicate() {
			return getRuleContexts(Singular_predicateContext.class);
		}
		public PredicatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterPredicates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitPredicates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitPredicates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatesContext predicates() throws RecognitionException {
		PredicatesContext _localctx = new PredicatesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_predicates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__2);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); singular_predicate();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN );
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

	public static class Singular_predicateContext extends ParserRuleContext {
		public Multiple_paramsContext multiple_params() {
			return getRuleContext(Multiple_paramsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Singular_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singular_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterSingular_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitSingular_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitSingular_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Singular_predicateContext singular_predicate() throws RecognitionException {
		Singular_predicateContext _localctx = new Singular_predicateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singular_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); name();
			setState(54); match(T__6);
			setState(55); multiple_params();
			setState(56); match(T__5);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode TOKEN(int i) {
			return getToken(GSPParser.TOKEN, i);
		}
		public List<TerminalNode> TOKEN() { return getTokens(GSPParser.TOKEN); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); match(TOKEN);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN );
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

	public static class Action_nameContext extends ParserRuleContext {
		public TerminalNode TOKEN(int i) {
			return getToken(GSPParser.TOKEN, i);
		}
		public List<TerminalNode> TOKEN() { return getTokens(GSPParser.TOKEN); }
		public Action_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterAction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitAction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitAction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_nameContext action_name() throws RecognitionException {
		Action_nameContext _localctx = new Action_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63); match(TOKEN);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN );
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

	public static class Multiple_paramsContext extends ParserRuleContext {
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public Multiple_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterMultiple_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitMultiple_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitMultiple_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_paramsContext multiple_params() throws RecognitionException {
		Multiple_paramsContext _localctx = new Multiple_paramsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiple_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN) {
				{
				{
				setState(68); params();
				}
				}
				setState(73);
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(GSPParser.TOKEN, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(TOKEN);
			setState(76);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(75); match(T__3);
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

	public static class Action_paramsContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(GSPParser.TOKEN, 0); }
		public Action_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterAction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitAction_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitAction_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_paramsContext action_params() throws RecognitionException {
		Action_paramsContext _localctx = new Action_paramsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(TOKEN);
			setState(80);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(79); match(T__3);
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

	public static class Multiple_action_paramsContext extends ParserRuleContext {
		public Action_paramsContext action_params(int i) {
			return getRuleContext(Action_paramsContext.class,i);
		}
		public List<Action_paramsContext> action_params() {
			return getRuleContexts(Action_paramsContext.class);
		}
		public Multiple_action_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_action_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterMultiple_action_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitMultiple_action_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitMultiple_action_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_action_paramsContext multiple_action_params() throws RecognitionException {
		Multiple_action_paramsContext _localctx = new Multiple_action_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiple_action_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN) {
				{
				{
				setState(82); action_params();
				}
				}
				setState(87);
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

	public static class ActionsContext extends ParserRuleContext {
		public List<Singular_actionContext> singular_action() {
			return getRuleContexts(Singular_actionContext.class);
		}
		public Singular_actionContext singular_action(int i) {
			return getRuleContext(Singular_actionContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(T__8);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89); singular_action();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN );
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

	public static class Singular_actionContext extends ParserRuleContext {
		public EffectsContext effects() {
			return getRuleContext(EffectsContext.class,0);
		}
		public PrecondContext precond() {
			return getRuleContext(PrecondContext.class,0);
		}
		public Action_nameContext action_name() {
			return getRuleContext(Action_nameContext.class,0);
		}
		public Multiple_action_paramsContext multiple_action_params() {
			return getRuleContext(Multiple_action_paramsContext.class,0);
		}
		public Singular_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singular_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterSingular_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitSingular_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitSingular_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Singular_actionContext singular_action() throws RecognitionException {
		Singular_actionContext _localctx = new Singular_actionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_singular_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); action_name();
			setState(95); match(T__6);
			setState(96); multiple_action_params();
			setState(97); match(T__5);
			setState(98); precond();
			setState(99); effects();
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

	public static class PrecondContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public PrecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterPrecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitPrecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitPrecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecondContext precond() throws RecognitionException {
		PrecondContext _localctx = new PrecondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_precond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(T__0);
			setState(102); conjunction();
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public Action_paramsContext action_params(int i) {
			return getRuleContext(Action_paramsContext.class,i);
		}
		public List<Action_nameContext> action_name() {
			return getRuleContexts(Action_nameContext.class);
		}
		public Action_nameContext action_name(int i) {
			return getRuleContext(Action_nameContext.class,i);
		}
		public List<Action_paramsContext> action_params() {
			return getRuleContexts(Action_paramsContext.class);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(105);
					_la = _input.LA(1);
					if (_la==NEGATION) {
						{
						setState(104); negation();
						}
					}

					setState(107); action_name();
					setState(108); match(T__6);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TOKEN) {
						{
						{
						setState(109); action_params();
						}
						}
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(115); match(T__5);
					}
					setState(118);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(117); match(T__1);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class NegationContext extends ParserRuleContext {
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(NEGATION);
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

	public static class EffectsContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public EffectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterEffects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitEffects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitEffects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectsContext effects() throws RecognitionException {
		EffectsContext _localctx = new EffectsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_effects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(T__7);
			setState(127); conjunction();
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

	public static class Initial_stateContext extends ParserRuleContext {
		public Init_statesContext init_states() {
			return getRuleContext(Init_statesContext.class,0);
		}
		public Initial_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterInitial_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitInitial_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitInitial_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_stateContext initial_state() throws RecognitionException {
		Initial_stateContext _localctx = new Initial_stateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initial_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(T__9);
			setState(130); init_states();
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

	public static class Init_statesContext extends ParserRuleContext {
		public List<Init_stateContext> init_state() {
			return getRuleContexts(Init_stateContext.class);
		}
		public Init_stateContext init_state(int i) {
			return getRuleContext(Init_stateContext.class,i);
		}
		public Init_statesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterInit_states(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitInit_states(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitInit_states(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_statesContext init_states() throws RecognitionException {
		Init_statesContext _localctx = new Init_statesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_init_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN) {
				{
				{
				setState(132); init_state();
				setState(134);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(133); match(T__1);
					}
				}

				}
				}
				setState(140);
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

	public static class Init_stateContext extends ParserRuleContext {
		public Multiple_paramsContext multiple_params() {
			return getRuleContext(Multiple_paramsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Init_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterInit_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitInit_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitInit_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_stateContext init_state() throws RecognitionException {
		Init_stateContext _localctx = new Init_stateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); name();
			setState(142); match(T__6);
			setState(143); multiple_params();
			setState(144); match(T__5);
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

	public static class Goal_stateContext extends ParserRuleContext {
		public Init_statesContext init_states() {
			return getRuleContext(Init_statesContext.class,0);
		}
		public Goal_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterGoal_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitGoal_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitGoal_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goal_stateContext goal_state() throws RecognitionException {
		Goal_stateContext _localctx = new Goal_stateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_goal_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(T__4);
			setState(147); init_states();
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

	public static class Init_goalsContext extends ParserRuleContext {
		public List<Init_goalContext> init_goal() {
			return getRuleContexts(Init_goalContext.class);
		}
		public Init_goalContext init_goal(int i) {
			return getRuleContext(Init_goalContext.class,i);
		}
		public Init_goalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterInit_goals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitInit_goals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitInit_goals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_goalsContext init_goals() throws RecognitionException {
		Init_goalsContext _localctx = new Init_goalsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_init_goals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN) {
				{
				{
				setState(149); init_goal();
				setState(151);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(150); match(T__1);
					}
				}

				}
				}
				setState(157);
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

	public static class Init_goalContext extends ParserRuleContext {
		public Multiple_paramsContext multiple_params() {
			return getRuleContext(Multiple_paramsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Init_goalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).enterInit_goal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GSPListener ) ((GSPListener)listener).exitInit_goal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GSPVisitor ) return ((GSPVisitor<? extends T>)visitor).visitInit_goal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_goalContext init_goal() throws RecognitionException {
		Init_goalContext _localctx = new Init_goalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); name();
			setState(159); match(T__6);
			setState(160); multiple_params();
			setState(161); match(T__5);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6"+
		"\3\64\n\3\r\3\16\3\65\3\4\3\4\3\4\3\4\3\4\3\5\6\5>\n\5\r\5\16\5?\3\6\6"+
		"\6C\n\6\r\6\16\6D\3\7\7\7H\n\7\f\7\16\7K\13\7\3\b\3\b\5\bO\n\b\3\t\3\t"+
		"\5\tS\n\t\3\n\7\nV\n\n\f\n\16\nY\13\n\3\13\3\13\6\13]\n\13\r\13\16\13"+
		"^\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\5\16l\n\16\3\16\3\16\3"+
		"\16\7\16q\n\16\f\16\16\16t\13\16\3\16\3\16\3\16\5\16y\n\16\6\16{\n\16"+
		"\r\16\16\16|\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\5\22\u0089"+
		"\n\22\7\22\u008b\n\22\f\22\16\22\u008e\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\5\25\u009a\n\25\7\25\u009c\n\25\f\25\16\25\u009f"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\2\u00a0\2,\3\2\2\2\4\61\3\2\2\2\6\67\3\2\2\2\b="+
		"\3\2\2\2\nB\3\2\2\2\fI\3\2\2\2\16L\3\2\2\2\20P\3\2\2\2\22W\3\2\2\2\24"+
		"Z\3\2\2\2\26`\3\2\2\2\30g\3\2\2\2\32z\3\2\2\2\34~\3\2\2\2\36\u0080\3\2"+
		"\2\2 \u0083\3\2\2\2\"\u008c\3\2\2\2$\u008f\3\2\2\2&\u0094\3\2\2\2(\u009d"+
		"\3\2\2\2*\u00a0\3\2\2\2,-\5\4\3\2-.\5 \21\2./\5&\24\2/\60\5\24\13\2\60"+
		"\3\3\2\2\2\61\63\7\n\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\678\5\b\5\289\7\6\2\29:\5\f\7\2"+
		":;\7\7\2\2;\7\3\2\2\2<>\7\16\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@\t\3\2\2\2AC\7\16\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\13\3"+
		"\2\2\2FH\5\16\b\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\r\3\2\2\2K"+
		"I\3\2\2\2LN\7\16\2\2MO\7\t\2\2NM\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PR\7\16"+
		"\2\2QS\7\t\2\2RQ\3\2\2\2RS\3\2\2\2S\21\3\2\2\2TV\5\20\t\2UT\3\2\2\2VY"+
		"\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YW\3\2\2\2Z\\\7\4\2\2[]\5\26\f"+
		"\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\25\3\2\2\2`a\5\n\6\2ab\7"+
		"\6\2\2bc\5\22\n\2cd\7\7\2\2de\5\30\r\2ef\5\36\20\2f\27\3\2\2\2gh\7\f\2"+
		"\2hi\5\32\16\2i\31\3\2\2\2jl\5\34\17\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2m"+
		"n\5\n\6\2nr\7\6\2\2oq\5\20\t\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"su\3\2\2\2tr\3\2\2\2uv\7\7\2\2vx\3\2\2\2wy\7\13\2\2xw\3\2\2\2xy\3\2\2"+
		"\2y{\3\2\2\2zk\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\33\3\2\2\2~\177"+
		"\7\r\2\2\177\35\3\2\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\32\16\2\u0082"+
		"\37\3\2\2\2\u0083\u0084\7\3\2\2\u0084\u0085\5\"\22\2\u0085!\3\2\2\2\u0086"+
		"\u0088\5$\23\2\u0087\u0089\7\13\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d#\3\2\2\2\u008e\u008c\3\2\2\2"+
		"\u008f\u0090\5\b\5\2\u0090\u0091\7\6\2\2\u0091\u0092\5\f\7\2\u0092\u0093"+
		"\7\7\2\2\u0093%\3\2\2\2\u0094\u0095\7\b\2\2\u0095\u0096\5\"\22\2\u0096"+
		"\'\3\2\2\2\u0097\u0099\5*\26\2\u0098\u009a\7\13\2\2\u0099\u0098\3\2\2"+
		"\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e)\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5\f"+
		"\7\2\u00a3\u00a4\7\7\2\2\u00a4+\3\2\2\2\22\65?DINRW^krx|\u0088\u008c\u0099"+
		"\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}