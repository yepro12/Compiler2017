package com.yepro12.compiler2017.Table;
import java.util.ArrayList;
import java.util.List;
public class FunctionType extends Type{
    public Type returnType;
    public String name;
    public List<Type> argumentType = new ArrayList<>();
    public List<String> argumentName = new ArrayList<>();
    public FunctionType(Type returnType, String name){
        this.type = TheType.FUNCTION;
        this.returnType = returnType;
        this.name = name;
    }
    public void addArgument(Type type, String name){
        argumentType.add(type);
        argumentName.add(name);
    }
    public FunctionType(TheType type){
        this.type = type;
    }
    
    @Override
    public boolean isSame(Type arg){
        return this == arg;
    }

}
