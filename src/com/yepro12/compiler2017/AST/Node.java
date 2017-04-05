package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public abstract class Node{
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    public typetable currentScope;
}




























