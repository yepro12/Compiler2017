package com.yepro12.compiler2017.AST;
public class StringConst extends Expr{
    public String value;
    public StringConst(String value){
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
