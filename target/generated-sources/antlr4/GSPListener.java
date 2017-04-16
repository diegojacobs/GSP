// Generated from GSP.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GSPParser}.
 */
public interface GSPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GSPParser#init_goals}.
	 * @param ctx the parse tree
	 */
	void enterInit_goals(@NotNull GSPParser.Init_goalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#init_goals}.
	 * @param ctx the parse tree
	 */
	void exitInit_goals(@NotNull GSPParser.Init_goalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(@NotNull GSPParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(@NotNull GSPParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#init_states}.
	 * @param ctx the parse tree
	 */
	void enterInit_states(@NotNull GSPParser.Init_statesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#init_states}.
	 * @param ctx the parse tree
	 */
	void exitInit_states(@NotNull GSPParser.Init_statesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#multiple_action_params}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_action_params(@NotNull GSPParser.Multiple_action_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#multiple_action_params}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_action_params(@NotNull GSPParser.Multiple_action_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#initial_state}.
	 * @param ctx the parse tree
	 */
	void enterInitial_state(@NotNull GSPParser.Initial_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#initial_state}.
	 * @param ctx the parse tree
	 */
	void exitInitial_state(@NotNull GSPParser.Initial_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#precond}.
	 * @param ctx the parse tree
	 */
	void enterPrecond(@NotNull GSPParser.PrecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#precond}.
	 * @param ctx the parse tree
	 */
	void exitPrecond(@NotNull GSPParser.PrecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull GSPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull GSPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull GSPParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull GSPParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#action_params}.
	 * @param ctx the parse tree
	 */
	void enterAction_params(@NotNull GSPParser.Action_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#action_params}.
	 * @param ctx the parse tree
	 */
	void exitAction_params(@NotNull GSPParser.Action_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#predicates}.
	 * @param ctx the parse tree
	 */
	void enterPredicates(@NotNull GSPParser.PredicatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#predicates}.
	 * @param ctx the parse tree
	 */
	void exitPredicates(@NotNull GSPParser.PredicatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#effects}.
	 * @param ctx the parse tree
	 */
	void enterEffects(@NotNull GSPParser.EffectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#effects}.
	 * @param ctx the parse tree
	 */
	void exitEffects(@NotNull GSPParser.EffectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#singular_predicate}.
	 * @param ctx the parse tree
	 */
	void enterSingular_predicate(@NotNull GSPParser.Singular_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#singular_predicate}.
	 * @param ctx the parse tree
	 */
	void exitSingular_predicate(@NotNull GSPParser.Singular_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull GSPParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull GSPParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#action_name}.
	 * @param ctx the parse tree
	 */
	void enterAction_name(@NotNull GSPParser.Action_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#action_name}.
	 * @param ctx the parse tree
	 */
	void exitAction_name(@NotNull GSPParser.Action_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#goal_state}.
	 * @param ctx the parse tree
	 */
	void enterGoal_state(@NotNull GSPParser.Goal_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#goal_state}.
	 * @param ctx the parse tree
	 */
	void exitGoal_state(@NotNull GSPParser.Goal_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull GSPParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull GSPParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#multiple_params}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_params(@NotNull GSPParser.Multiple_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#multiple_params}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_params(@NotNull GSPParser.Multiple_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#init_goal}.
	 * @param ctx the parse tree
	 */
	void enterInit_goal(@NotNull GSPParser.Init_goalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#init_goal}.
	 * @param ctx the parse tree
	 */
	void exitInit_goal(@NotNull GSPParser.Init_goalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(@NotNull GSPParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(@NotNull GSPParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#singular_action}.
	 * @param ctx the parse tree
	 */
	void enterSingular_action(@NotNull GSPParser.Singular_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#singular_action}.
	 * @param ctx the parse tree
	 */
	void exitSingular_action(@NotNull GSPParser.Singular_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GSPParser#init_state}.
	 * @param ctx the parse tree
	 */
	void enterInit_state(@NotNull GSPParser.Init_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GSPParser#init_state}.
	 * @param ctx the parse tree
	 */
	void exitInit_state(@NotNull GSPParser.Init_stateContext ctx);
}