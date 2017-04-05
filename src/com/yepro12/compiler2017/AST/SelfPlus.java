package com.yepro12.compiler2017.AST;
public class SelfPlus extends Expr{
    public Expr perse;
    public SelfPlus(Expr perse){
        this.perse = perse;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
