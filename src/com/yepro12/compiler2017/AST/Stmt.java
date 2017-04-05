package com.yepro12.compiler2017.AST;
public abstract class Stmt extends Node{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
