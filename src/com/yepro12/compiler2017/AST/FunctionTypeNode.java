package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public abstract class FunctionTypeNode extends TypeNode{
    public FunctionTypeNode(){
        this.type = Type.TheType.FUNCTION;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
