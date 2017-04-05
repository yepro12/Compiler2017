package com.yepro12.compiler2017.Front;
import com.yepro12.compiler2017.AST.*;
import com.yepro12.compiler2017.Parser.mxBaseListener;
import com.yepro12.compiler2017.Parser.mxParser;
import com.yepro12.compiler2017.Table.InitialType;
import com.yepro12.compiler2017.Table.Type;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ASTGenerator extends mxBaseListener{
    public ParseTreeProperty<Object> map = new ParseTreeProperty<>();
    public Program program;
    @Override
    public void exitCode(mxParser.CodeContext ctx){
        program.declare = new ArrayList<>();
        for(mxParser.SectionContext now: ctx.section()){
            Object tmp = map.get(now);
            if(tmp instanceof  Declare)program.declare.add((Declare) tmp); else throw new RuntimeException("Not Declare");
        }
        map.put(ctx, program);
    }
    @Override
    public void exitClassdef(mxParser.ClassdefContext ctx){
        map.put(ctx, map.get(ctx.classdefine()));
    }
    @Override
    public void exitFuncdef(mxParser.FuncdefContext ctx){
        map.put(ctx, map.get(ctx.function()));
    }
    @Override
    public void exitGlbvardef(mxParser.GlbvardefContext ctx){
        map.put(ctx, map.get(ctx.vardefine()));
    }
    @Override
    public void exitClassdefine(mxParser.ClassdefineContext ctx){
        ClassDeclare tmp = (ClassDeclare) null;
        tmp.name = ctx.ID().getText();
        tmp.memberVar = new ArrayList<>();
        tmp.memberFunc = new ArrayList<>();
        for(mxParser.MemberContext now: ctx.member() ){
            if(map.get(now) instanceof  VariableDeclare) tmp.memberVar.add((VariableDeclare) map.get(now));
            if(map.get(now) instanceof  FunctionDeclare) tmp.memberFunc.add((FunctionDeclare) map.get(now));
        }
        map.put(ctx, tmp);
    }
    @Override
    public void exitFunction(mxParser.FunctionContext ctx){
        FunctionDeclare tmp = (FunctionDeclare) null;
        tmp.name = ctx.ID().getText();
        tmp.returnType = (TypeNode) map.get(ctx.arraytype());
        tmp.content = (Block) map.get(ctx.block());
        tmp.arguments = new ArrayList<>();
        for(mxParser.ArgumentContext now:  ctx.paralist().argument()){
            tmp.arguments.add(new VariableDeclare((TypeNode)map.get(ctx.arraytype()),ctx.ID().getText(),null));
        };
        map.put(ctx, tmp);
    }
    @Override
    public void exitClsvar(mxParser.ClsvarContext ctx){
        map.put(ctx, map.get(ctx.vardefine()));
    }
    @Override
    public void exitClsfunc(mxParser.ClsfuncContext ctx){
        map.put(ctx, map.get(ctx.function()));
    }
    @Override
    public void exitArgument(mxParser.ArgumentContext ctx){
        map.put(ctx, new VariableDeclare((TypeNode)map.get(ctx.arraytype()),ctx.ID().getText(),(Expr) null));
    }
    @Override
    public void exitStatement(mxParser.StatementContext ctx){
        map.put(ctx, map.get(ctx.sta()));
    }
    @Override
    public void exitVardef(mxParser.VardefContext ctx){
        map.put(ctx, map.get(ctx.vardefine()));
    }
    @Override
    public void exitExpression(mxParser.ExpressionContext ctx){
        map.put(ctx, map.get(ctx.exprstmt()));
    }
    @Override
    public void exitBlk(mxParser.BlkContext ctx){
        map.put(ctx, map.get(ctx.block()));
    }
    @Override
    public void exitLp(mxParser.LpContext ctx){
        map.put(ctx, map.get(ctx.loop()));
    }
    @Override
    public void exitJp(mxParser.JpContext ctx){
        map.put(ctx, map.get(ctx.jump()));
    }
    @Override
    public void exitBran(mxParser.BranContext ctx){
        map.put(ctx, map.get(ctx.branch()));
    }
    @Override
    public void exitVardefine(mxParser.VardefineContext ctx){
        if(map.get(ctx.expr())==null)
            map.put(ctx, new VariableDeclare((TypeNode)map.get(ctx.arraytype()), ctx.ID().getText(), (Expr)null));
        else
            map.put(ctx, new VariableDeclare((TypeNode)map.get(ctx.arraytype()), ctx.ID().getText(), (Expr)map.get(ctx.expr())));
    }
    @Override
    public void exitBlock(mxParser.BlockContext ctx){
        Block temp = (Block) null;
        temp.statement = new LinkedList<>();
        for(mxParser.StmtContext now: ctx.stmt()){
            Object tmp = map.get(now);
            if(tmp instanceof Stmt)temp.statement.add((Stmt) tmp); else throw new RuntimeException("Not Stmt in Block");
        }
        map.put(ctx, temp);
    }
    @Override
    public void exitBranch(mxParser.BranchContext ctx){
        Stmt tmp = (Stmt) null;
        if(map.get(ctx.stmt(1)) != null)tmp = (Stmt)map.get(ctx.stmt(1));
        map.put(ctx, new  If((Expr)map.get(ctx.expr()), (Stmt)map.get(ctx.stmt(0)), tmp
                ));
    }
    @Override
    public void exitExprstmt(mxParser.ExprstmtContext ctx){
        if(ctx.expr()==null) map.put(ctx, new Empty()); else map.put(ctx, map.get(ctx.expr()));
    }
    @Override
    public void exitReturn(mxParser.ReturnContext ctx){
        if(ctx.expr()==null) map.put(ctx, new Return((Expr)null)); else map.put(ctx, new Return((Expr)map.get(ctx.expr())));
    }
    @Override
    public void exitBreak(mxParser.BreakContext ctx){
        map.put(ctx, new Break());
    }
    @Override
    public void exitContinue(mxParser.ContinueContext ctx){
        map.put(ctx, new Continue());
    }
    @Override
    public void exitFor(mxParser.ForContext ctx){
            map.put(ctx, new For((Expr)map.get(ctx.init),
                    (Expr)map.get(ctx.cond),(Expr)map.get(ctx.step), (Stmt)map.get(ctx.stmt())));
    }
    @Override
    public void exitWhile(mxParser.WhileContext ctx){
        map.put(ctx, new While((Expr) map.get(ctx.expr()),(Stmt) map.get(ctx.stmt())));
    }
    @Override
    public void exitUna(mxParser.UnaContext ctx){
        Unary.uop op = Unary.uop.Nonsense;
        if(ctx.op.getType()==mxParser.SELFMINUS)op = Unary.uop.SelfM;
        if(ctx.op.getType()==mxParser.SELFPLUS)op = Unary.uop.SelfP;
        if(ctx.op.getType()==mxParser.BNOT)op = Unary.uop.Bnot;
        if(ctx.op.getType()==mxParser.LNOT)op = Unary.uop.Lnot;
        if(ctx.op.getType()==mxParser.MINUS)op = Unary.uop.Oppo;
        if(op==Unary.uop.Nonsense)throw new RuntimeException("No such operation");
        map.put(ctx, new Unary(op, (Expr)map.get(ctx.expr())));
    }
    @Override
    public void exitBina(mxParser.BinaContext ctx){
        Binary.bop op = Binary.bop.Nonsense;
        if(ctx.op.getType()==mxParser.TIMES)op = Binary.bop.Times;
        if(ctx.op.getType()==mxParser.DIVIDE)op = Binary.bop.Divide;
        if(ctx.op.getType()==mxParser.MODULE)op = Binary.bop.Module;
        if(ctx.op.getType()==mxParser.PLUS)op = Binary.bop.Plus;
        if(ctx.op.getType()==mxParser.MINUS)op = Binary.bop.Minus;
        if(ctx.op.getType()==mxParser.LSHIFT)op = Binary.bop.Lshift;
        if(ctx.op.getType()==mxParser.RSHIFT)op = Binary.bop.Rshift;
        if(ctx.op.getType()==mxParser.LESSEQUALTHAN)op = Binary.bop.LessEqualThan;
        if(ctx.op.getType()==mxParser.GREATEREQUALTHAN)op = Binary.bop.GreaterEqualThan;
        if(ctx.op.getType()==mxParser.LESSTHAN)op = Binary.bop.LessThan;
        if(ctx.op.getType()==mxParser.GREATERTHAN)op = Binary.bop.Greaterthan;
        if(ctx.op.getType()==mxParser.EQUAL)op = Binary.bop.Equal;
        if(ctx.op.getType()==mxParser.NOTEQUAL)op = Binary.bop.NotEqual;
        if(ctx.op.getType()==mxParser.BAND)op = Binary.bop.Band;
        if(ctx.op.getType()==mxParser.BOR)op = Binary.bop.Bor;
        if(ctx.op.getType()==mxParser.BXOR)op = Binary.bop.Bxor;
        if(ctx.op.getType()==mxParser.LOR)op = Binary.bop.Lor;
        if(ctx.op.getType()==mxParser.LAND)op = Binary.bop.Land;
        if(ctx.op.getType()==mxParser.ASSIGN)op = Binary.bop.Assign;
        if(op==Binary.bop.Nonsense)throw new RuntimeException("No such operation");
        map.put(ctx,new Binary((Expr)map.get(ctx.expr(0)),op,(Expr)map.get(ctx.expr(1))));
    }
    @Override
    public void exitParen(mxParser.ParenContext ctx){
        map.put(ctx, map.get(ctx.expr()));
    }
    @Override
    public void exitFccall(mxParser.FccallContext ctx){
        FunctionCall tmp = (FunctionCall) null;
        tmp.func = (Expr)map.get(ctx.expr());
        for(mxParser.ExprContext now : ctx.list().expr()){
            tmp.arguments.add((Expr)map.get(now));
        }
        map.put(ctx, tmp);
    }
    @Override
    public void exitAdac(mxParser.AdacContext ctx){
        map.put(ctx,  new ArrayAccess((Expr)map.get(ctx.expr(0)),(Expr)map.get(ctx.expr(1))));
    }
    @Override
    public void exitMbac(mxParser.MbacContext ctx){
        map.put(ctx, new MemberAccess ((Expr)map.get(ctx.expr()),ctx.ID().getText()));
    }
    @Override
    public void exitNewp(mxParser.NewpContext ctx){
        map.put(ctx, map.get(ctx.newtype()));
    }
    @Override
    public void exitSelfalt(mxParser.SelfaltContext ctx){
        if(ctx.op.getType()==mxParser.SELFPLUS)map.put(ctx, new SelfPlus((Expr) map.get(ctx.expr())));
        if(ctx.op.getType()==mxParser.SELFMINUS)map.put(ctx, new SelfMinus((Expr) map.get(ctx.expr())));
    }
    @Override
    public void exitIden(mxParser.IdenContext ctx){
        map.put(ctx, new Identifier(ctx.getText()));
    }
    @Override
    public void exitCst(mxParser.CstContext ctx){
        String now = ctx.lite().tp.getText();
        if(ctx.lite().tp.getType()==mxParser.INT)map.put(ctx, new IntConst(Integer.valueOf(now)));
        if(ctx.lite().tp.getType()==mxParser.TRUE)map.put(ctx, new BoolConst(true));
        if(ctx.lite().tp.getType()==mxParser.FALSE)map.put(ctx, new BoolConst(false));
        if(ctx.lite().tp.getType()==mxParser.NULL)map.put(ctx, new NullConst());
        if(ctx.lite().tp.getType()==mxParser.CHAIN)map.put(ctx, new StringConst(now.substring(1,now.length()-1)));
    }
    @Override
    public void exitNonarray(mxParser.NonarrayContext ctx){
        map.put(ctx, map.get(ctx.type()));
    }
    @Override
    public void exitArtp(mxParser.ArtpContext ctx){
        map.put(ctx, new ArrayTypeNode((TypeNode)map.get(ctx.arraytype())));
    }
    @Override
    public void exitNewarray(mxParser.NewarrayContext ctx){
        NewProcess tmp = (NewProcess)null;
        tmp.dimension = new ArrayList<>();
        tmp.type = (TypeNode)map.get(ctx.type());
        for(mxParser.DimContext now: ctx.dim()) {
            tmp.dimension.add((Expr) map.get(now.expr()));
        }
        map.put(ctx, tmp);
    }
    @Override
    public void exitError(mxParser.ErrorContext ctx){
        throw new RuntimeException("Wrong array definition");
    }
    @Override
    public void exitNewnonarray(mxParser.NewnonarrayContext ctx){
        NewProcess tmp = (NewProcess)null;
        tmp.dimension = new ArrayList<>();
        tmp.type = (TypeNode)map.get(ctx.type());
        map.put(ctx, tmp);
    }
    @Override
    public void exitType(mxParser.TypeContext ctx){
        if(ctx.tp.getType() == mxParser.INT)map.put(ctx, new InitialTypeNode(Type.TheType.INT));
        if(ctx.tp.getType() == mxParser.BOOL)map.put(ctx, new InitialTypeNode(Type.TheType.BOOL));
        if(ctx.tp.getType() == mxParser.STRING)map.put(ctx, new InitialTypeNode(Type.TheType.STRING));
        if(ctx.tp.getType() == mxParser.VOID)map.put(ctx, new InitialTypeNode(Type.TheType.VOID));
        if(ctx.tp.getType() == mxParser.ID)map.put(ctx, new ClassTypeNode(ctx.ID().getText()));
    }
}
