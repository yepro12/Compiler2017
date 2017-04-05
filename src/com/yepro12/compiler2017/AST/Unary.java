package com.yepro12.compiler2017.AST;
public class Unary extends Expr{
    public enum uop{
        SelfP, SelfM, Lnot, Bnot, Oppo, Nonsense;
    }
    public uop op;
    public Expr perse;
    public Unary(uop op, Expr perse){
        this.op = op;
        this.perse = perse;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
