package com.yepro12.compiler2017.AST;
public class BoolConst extends Expr{
    public boolean value;
    public BoolConst(boolean value){
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
