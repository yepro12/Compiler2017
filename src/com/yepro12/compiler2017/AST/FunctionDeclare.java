package com.yepro12.compiler2017.AST;
import java.util.ArrayList;
import java.util.List;

public class FunctionDeclare extends Declare{
    public TypeNode returnType;
    public String name;
    public List<VariableDeclare> arguments;
    public Block content;
    public FunctionDeclare(TypeNode returnType, String name, List<VariableDeclare> arguments, Block content){
        this.returnType = returnType;
        this.name = name;
        this.arguments = arguments;
        this.content = content;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
