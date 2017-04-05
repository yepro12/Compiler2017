package com.yepro12.compiler2017.AST;
public class For extends Stmt{
    public Expr init;
    public Expr cond;
    public Expr step;
    public Stmt content;
    public For(Expr init, Expr cond, Expr step, Stmt content){
        this.init = init;
        this.cond = cond;
        this.step = step;
        this.content = content;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
