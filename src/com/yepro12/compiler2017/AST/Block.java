package com.yepro12.compiler2017.AST;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Block extends Stmt{
    public List<Stmt> statement = new LinkedList<>();
    public Block(List<Stmt> statement){
        this.statement = statement;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
