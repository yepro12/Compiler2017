package com.yepro12.compiler2017.AST;
public class Empty extends Expr{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

