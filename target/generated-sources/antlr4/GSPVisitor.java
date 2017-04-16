// Generated from GSP.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GSPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GSPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GSPParser#init_goals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_goals(@NotNull GSPParser.Init_goalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(@NotNull GSPParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#init_states}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_states(@NotNull GSPParser.Init_statesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#multiple_action_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_action_params(@NotNull GSPParser.Multiple_action_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#initial_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_state(@NotNull GSPParser.Initial_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#precond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecond(@NotNull GSPParser.PrecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull GSPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull GSPParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#action_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_params(@NotNull GSPParser.Action_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#predicates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicates(@NotNull GSPParser.PredicatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#effects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffects(@NotNull GSPParser.EffectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#singular_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingular_predicate(@NotNull GSPParser.Singular_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull GSPParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#action_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_name(@NotNull GSPParser.Action_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#goal_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal_state(@NotNull GSPParser.Goal_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull GSPParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#multiple_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_params(@NotNull GSPParser.Multiple_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#init_goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_goal(@NotNull GSPParser.Init_goalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(@NotNull GSPParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#singular_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingular_action(@NotNull GSPParser.Singular_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GSPParser#init_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_state(@NotNull GSPParser.Init_stateContext ctx);
}