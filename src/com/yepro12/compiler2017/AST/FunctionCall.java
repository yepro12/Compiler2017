package com.yepro12.compiler2017.AST;
import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Expr{
    public Expr func;
    public List<Expr> arguments;
    public FunctionCall(Expr func, List<Expr> arguments){
        this.func = func;
        this.arguments = arguments;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
