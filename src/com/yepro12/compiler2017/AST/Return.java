package com.yepro12.compiler2017.AST;
public class Return extends Stmt{
    public Expr value;
    public Return(Expr value){
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
