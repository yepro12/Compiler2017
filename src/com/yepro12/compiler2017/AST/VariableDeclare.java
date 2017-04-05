package com.yepro12.compiler2017.AST;
public class VariableDeclare extends Declare{
    public TypeNode variableType;
    public String name;
    public Expr init;
    public VariableDeclare(TypeNode variableType, String name, Expr init){
        this.variableType = variableType;
        this.name = name;
        this.init = init;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
