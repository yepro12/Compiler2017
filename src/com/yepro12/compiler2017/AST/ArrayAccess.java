package com.yepro12.compiler2017.AST;
public class ArrayAccess extends Expr{
    public Expr array;
    public Expr index;
    public ArrayAccess(Expr array, Expr index){
        this.array = array;
        this.index = index;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
