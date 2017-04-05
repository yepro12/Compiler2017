package com.yepro12.compiler2017.AST;
public class Break extends Stmt{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
