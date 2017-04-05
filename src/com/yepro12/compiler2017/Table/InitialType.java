package com.yepro12.compiler2017.Table;
public class InitialType extends VariableType{
    public InitialType(TheType type){
        this.type = type;
    }
    
    @Override
    public boolean isSame(Type arg){
        return type == arg.type;
    }
}
