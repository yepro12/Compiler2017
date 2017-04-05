package com.yepro12.compiler2017.AST;
public abstract class Declare extends Node{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
