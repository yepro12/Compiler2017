package com.yepro12.compiler2017.AST;
public class If extends Stmt{
    public Expr cond;
    public Stmt st1;
    public Stmt st2;
    public If(Expr cond, Stmt st1, Stmt st2){
        this.cond = cond;
        this.st1 = st1;
        this.st2 = st2;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
