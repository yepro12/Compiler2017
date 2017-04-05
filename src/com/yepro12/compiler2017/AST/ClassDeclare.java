package com.yepro12.compiler2017.AST;
import java.util.ArrayList;
import java.util.List;

public class ClassDeclare extends Declare{
    public String name;
    public List<VariableDeclare> memberVar;
    public List<FunctionDeclare> memberFunc;
    public ClassDeclare(String name, List<VariableDeclare> memberVar, List<FunctionDeclare> memberFunc){
        this.name = name;
        this.memberFunc = memberFunc;
        this.memberVar = memberVar;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
