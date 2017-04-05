package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public class ClassTypeNode extends TypeNode{
    public String name;
    public ClassTypeNode(String name){
        this.name = name;
        this.type = Type.TheType.CLASS;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}