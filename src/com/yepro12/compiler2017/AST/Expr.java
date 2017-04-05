package com.yepro12.compiler2017.AST;
import com.yepro12.compiler2017.Table.*;
public abstract class Expr extends Stmt{
    public Type returnType;
    public boolean isLvalue = true;
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
