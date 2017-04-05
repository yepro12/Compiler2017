package com.yepro12.compiler2017.AST;
public class Continue extends Stmt{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
