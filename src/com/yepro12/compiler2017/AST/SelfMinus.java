package com.yepro12.compiler2017.AST;
public class SelfMinus extends Expr{
    public Expr perse;
    public SelfMinus(Expr perse){
        this.perse = perse;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
