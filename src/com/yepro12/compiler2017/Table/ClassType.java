package com.yepro12.compiler2017.Table;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ClassType extends VariableType{
    public String name;
    public typetable member;
    public ClassType(String name){
        this.type = TheType.CLASS;
        this.name = name;
        this.member = new typetable(null);
    }

    @Override
    public boolean isSame(Type arg){
        return this == arg;
    }
}