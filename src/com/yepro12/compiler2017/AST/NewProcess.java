package com.yepro12.compiler2017.AST;
import java.util.ArrayList;
import java.util.List;

public class NewProcess extends Expr{
    public TypeNode type;
    public List<Expr> dimension;
    public NewProcess(TypeNode type, List<Expr> dimension){
        this.type = type;
        this.dimension = dimension;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
