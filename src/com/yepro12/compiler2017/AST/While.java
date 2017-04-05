package com.yepro12.compiler2017.AST;
public class While extends Stmt{
    public Expr cond;
    public Stmt content;
    public While(Expr cond, Stmt content){
        this.cond = cond;
        this.content = content;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
