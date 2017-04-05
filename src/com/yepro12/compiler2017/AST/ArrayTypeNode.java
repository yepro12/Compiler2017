package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public class ArrayTypeNode extends TypeNode{
    public TypeNode base;
    public ArrayTypeNode(TypeNode base){
        this.base = base;
        this.type = Type.TheType.ARRAY;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
