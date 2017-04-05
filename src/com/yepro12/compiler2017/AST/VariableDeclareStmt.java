package com.yepro12.compiler2017.AST;
public class VariableDeclareStmt extends Stmt{
    public VariableDeclare dec;
    public VariableDeclareStmt(VariableDeclare dec){
        this.dec = dec;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
