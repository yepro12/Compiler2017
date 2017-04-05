package com.yepro12.compiler2017.AST;
public class Identifier extends Expr{
    public String name;
    public Identifier(String name){
        this.name = name;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
