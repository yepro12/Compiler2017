package com.yepro12.compiler2017.AST;
public class IntConst extends Expr{
    public int value;
    public IntConst(int value){
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
