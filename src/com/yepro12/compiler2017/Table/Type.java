package com.yepro12.compiler2017.Table;
public abstract class Type{
    public enum TheType{
        BOOL, INT, VOID, STRING, ARRAY, CLASS, FUNCTION, NULL
    }
    public TheType type;
    public abstract boolean isSame(Type arg);
}
