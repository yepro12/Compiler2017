package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public abstract class TypeNode extends Node{
    public Type.TheType type;
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
