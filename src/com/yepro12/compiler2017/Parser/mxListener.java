// Generated from /Users/yepro12/compiler2017/src/com/yepro12/compiler2017/Parser/mx.g4 by ANTLR 4.6
package com.yepro12.compiler2017.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mxParser}.
 */
public interface mxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mxParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(mxParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(mxParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(mxParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(mxParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcdef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(mxParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcdef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(mxParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glbvardef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 */
	void enterGlbvardef(mxParser.GlbvardefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glbvardef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 */
	void exitGlbvardef(mxParser.GlbvardefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement}
	 * labeled alternative in {@link mxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link mxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blk}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterBlk(mxParser.BlkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blk}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitBlk(mxParser.BlkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lp}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterLp(mxParser.LpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lp}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitLp(mxParser.LpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bran}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterBran(mxParser.BranContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bran}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitBran(mxParser.BranContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jp}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterJp(mxParser.JpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jp}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitJp(mxParser.JpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardef}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void enterVardef(mxParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardef}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 */
	void exitVardef(mxParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(mxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(mxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(mxParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(mxParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterReturn(mxParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitReturn(mxParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterBreak(mxParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitBreak(mxParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterContinue(mxParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitContinue(mxParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link mxParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterFor(mxParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link mxParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitFor(mxParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link mxParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile(mxParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link mxParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile(mxParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#vardefine}.
	 * @param ctx the parse tree
	 */
	void enterVardefine(mxParser.VardefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#vardefine}.
	 * @param ctx the parse tree
	 */
	void exitVardefine(mxParser.VardefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#classdefine}.
	 * @param ctx the parse tree
	 */
	void enterClassdefine(mxParser.ClassdefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#classdefine}.
	 * @param ctx the parse tree
	 */
	void exitClassdefine(mxParser.ClassdefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clsvar}
	 * labeled alternative in {@link mxParser#member}.
	 * @param ctx the parse tree
	 */
	void enterClsvar(mxParser.ClsvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clsvar}
	 * labeled alternative in {@link mxParser#member}.
	 * @param ctx the parse tree
	 */
	void exitClsvar(mxParser.ClsvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clsfunc}
	 * labeled alternative in {@link mxParser#member}.
	 * @param ctx the parse tree
	 */
	void enterClsfunc(mxParser.ClsfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clsfunc}
	 * labeled alternative in {@link mxParser#member}.
	 * @param ctx the parse tree
	 */
	void exitClsfunc(mxParser.ClsfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(mxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(mxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#paralist}.
	 * @param ctx the parse tree
	 */
	void enterParalist(mxParser.ParalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#paralist}.
	 * @param ctx the parse tree
	 */
	void exitParalist(mxParser.ParalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(mxParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(mxParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code artp}
	 * labeled alternative in {@link mxParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArtp(mxParser.ArtpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code artp}
	 * labeled alternative in {@link mxParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArtp(mxParser.ArtpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonarray}
	 * labeled alternative in {@link mxParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterNonarray(mxParser.NonarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonarray}
	 * labeled alternative in {@link mxParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitNonarray(mxParser.NonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#exprstmt}.
	 * @param ctx the parse tree
	 */
	void enterExprstmt(mxParser.ExprstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#exprstmt}.
	 * @param ctx the parse tree
	 */
	void exitExprstmt(mxParser.ExprstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(mxParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(mxParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newp}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewp(mxParser.NewpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newp}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewp(mxParser.NewpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bina}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBina(mxParser.BinaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bina}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBina(mxParser.BinaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fccall}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFccall(mxParser.FccallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fccall}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFccall(mxParser.FccallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mbac}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMbac(mxParser.MbacContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mbac}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMbac(mxParser.MbacContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iden}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIden(mxParser.IdenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iden}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIden(mxParser.IdenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cst}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCst(mxParser.CstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cst}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCst(mxParser.CstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adac}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdac(mxParser.AdacContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adac}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdac(mxParser.AdacContext ctx);
	/**
	 * Enter a parse tree produced by the {@code una}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUna(mxParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code una}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUna(mxParser.UnaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfalt}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelfalt(mxParser.SelfaltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfalt}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelfalt(mxParser.SelfaltContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#lite}.
	 * @param ctx the parse tree
	 */
	void enterLite(mxParser.LiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#lite}.
	 * @param ctx the parse tree
	 */
	void exitLite(mxParser.LiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code error}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 */
	void enterError(mxParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code error}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 */
	void exitError(mxParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newarray}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 */
	void enterNewarray(mxParser.NewarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newarray}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 */
	void exitNewarray(mxParser.NewarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newnonarray}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 */
	void enterNewnonarray(mxParser.NewnonarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newnonarray}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 */
	void exitNewnonarray(mxParser.NewnonarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(mxParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(mxParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link mxParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(mxParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mxParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(mxParser.ListContext ctx);
}