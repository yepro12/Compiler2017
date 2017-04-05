package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public class InitialTypeNode extends TypeNode{
    public InitialTypeNode(Type.TheType type){
        this.type = type;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}