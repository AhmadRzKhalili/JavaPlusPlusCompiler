// Generated from JavaPlusPlus.g4 by ANTLR 4.9.2
package ir.ac.kntu.khalili.javapluspluscompiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaPlusPlusParser}.
 */
public interface JavaPlusPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(JavaPlusPlusParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(JavaPlusPlusParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(JavaPlusPlusParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(JavaPlusPlusParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(JavaPlusPlusParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(JavaPlusPlusParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(JavaPlusPlusParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(JavaPlusPlusParser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExp4(JavaPlusPlusParser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExp4(JavaPlusPlusParser.Exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#exp5}.
	 * @param ctx the parse tree
	 */
	void enterExp5(JavaPlusPlusParser.Exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#exp5}.
	 * @param ctx the parse tree
	 */
	void exitExp5(JavaPlusPlusParser.Exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#ioSt}.
	 * @param ctx the parse tree
	 */
	void enterIoSt(JavaPlusPlusParser.IoStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#ioSt}.
	 * @param ctx the parse tree
	 */
	void exitIoSt(JavaPlusPlusParser.IoStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#defSt}.
	 * @param ctx the parse tree
	 */
	void enterDefSt(JavaPlusPlusParser.DefStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#defSt}.
	 * @param ctx the parse tree
	 */
	void exitDefSt(JavaPlusPlusParser.DefStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#assignmentSt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentSt(JavaPlusPlusParser.AssignmentStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#assignmentSt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentSt(JavaPlusPlusParser.AssignmentStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#ifElseSt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseSt(JavaPlusPlusParser.IfElseStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#ifElseSt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseSt(JavaPlusPlusParser.IfElseStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#compareSt}.
	 * @param ctx the parse tree
	 */
	void enterCompareSt(JavaPlusPlusParser.CompareStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#compareSt}.
	 * @param ctx the parse tree
	 */
	void exitCompareSt(JavaPlusPlusParser.CompareStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#elseSt}.
	 * @param ctx the parse tree
	 */
	void enterElseSt(JavaPlusPlusParser.ElseStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#elseSt}.
	 * @param ctx the parse tree
	 */
	void exitElseSt(JavaPlusPlusParser.ElseStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#switchSt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSt(JavaPlusPlusParser.SwitchStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#switchSt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSt(JavaPlusPlusParser.SwitchStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#caseSt}.
	 * @param ctx the parse tree
	 */
	void enterCaseSt(JavaPlusPlusParser.CaseStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#caseSt}.
	 * @param ctx the parse tree
	 */
	void exitCaseSt(JavaPlusPlusParser.CaseStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#loopSt}.
	 * @param ctx the parse tree
	 */
	void enterLoopSt(JavaPlusPlusParser.LoopStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#loopSt}.
	 * @param ctx the parse tree
	 */
	void exitLoopSt(JavaPlusPlusParser.LoopStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void enterWhileSt(JavaPlusPlusParser.WhileStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#whileSt}.
	 * @param ctx the parse tree
	 */
	void exitWhileSt(JavaPlusPlusParser.WhileStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#forSt}.
	 * @param ctx the parse tree
	 */
	void enterForSt(JavaPlusPlusParser.ForStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#forSt}.
	 * @param ctx the parse tree
	 */
	void exitForSt(JavaPlusPlusParser.ForStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#doWhileSt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileSt(JavaPlusPlusParser.DoWhileStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#doWhileSt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileSt(JavaPlusPlusParser.DoWhileStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#funcCallSt}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallSt(JavaPlusPlusParser.FuncCallStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#funcCallSt}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallSt(JavaPlusPlusParser.FuncCallStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#retSt}.
	 * @param ctx the parse tree
	 */
	void enterRetSt(JavaPlusPlusParser.RetStContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#retSt}.
	 * @param ctx the parse tree
	 */
	void exitRetSt(JavaPlusPlusParser.RetStContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(JavaPlusPlusParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(JavaPlusPlusParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(JavaPlusPlusParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(JavaPlusPlusParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(JavaPlusPlusParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(JavaPlusPlusParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaPlusPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaPlusPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaPlusPlusParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(JavaPlusPlusParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaPlusPlusParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(JavaPlusPlusParser.ArgContext ctx);
}