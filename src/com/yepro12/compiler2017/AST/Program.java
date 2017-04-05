package com.yepro12.compiler2017.AST;
import java.util.ArrayList;
import java.util.List;
public class Program extends Node{
    public List<Declare> declare;
    public Program(List<Declare> declare){
        this.declare = declare;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
