// Generated from /Users/yepro12/compiler2017/src/com/yepro12/compiler2017/Parser/mx.g4 by ANTLR 4.6
package com.yepro12.compiler2017.Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mxParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(mxParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classdef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(mxParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcdef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(mxParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code glbvardef}
	 * labeled alternative in {@link mxParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlbvardef(mxParser.GlbvardefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement}
	 * labeled alternative in {@link mxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(mxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blk}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlk(mxParser.BlkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(mxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lp}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLp(mxParser.LpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bran}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBran(mxParser.BranContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jp}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJp(mxParser.JpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardef}
	 * labeled alternative in {@link mxParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(mxParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(mxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(mxParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(mxParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(mxParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link mxParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(mxParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link mxParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(mxParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link mxParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(mxParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#vardefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardefine(mxParser.VardefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#classdefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdefine(mxParser.ClassdefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clsvar}
	 * labeled alternative in {@link mxParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsvar(mxParser.ClsvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clsfunc}
	 * labeled alternative in {@link mxParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsfunc(mxParser.ClsfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(mxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#paralist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalist(mxParser.ParalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(mxParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code artp}
	 * labeled alternative in {@link mxParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArtp(mxParser.ArtpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonarray}
	 * labeled alternative in {@link mxParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonarray(mxParser.NonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#exprstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprstmt(mxParser.ExprstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(mxParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newp}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewp(mxParser.NewpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bina}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBina(mxParser.BinaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fccall}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFccall(mxParser.FccallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mbac}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMbac(mxParser.MbacContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iden}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIden(mxParser.IdenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cst}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCst(mxParser.CstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code adac}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdac(mxParser.AdacContext ctx);
	/**
	 * Visit a parse tree produced by the {@code una}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(mxParser.UnaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfalt}
	 * labeled alternative in {@link mxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfalt(mxParser.SelfaltContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#lite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLite(mxParser.LiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code error}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(mxParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newarray}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewarray(mxParser.NewarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newnonarray}
	 * labeled alternative in {@link mxParser#newtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewnonarray(mxParser.NewnonarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(mxParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link mxParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(mxParser.ListContext ctx);
}