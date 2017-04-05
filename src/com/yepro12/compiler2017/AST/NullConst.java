package com.yepro12.compiler2017.AST;
public class NullConst extends Expr{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
