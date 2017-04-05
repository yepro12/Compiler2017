package com.yepro12.compiler2017.Table;
import java.util.LinkedHashMap;
import java.util.Map;

public class typetable{
    public Map<String, Type> map = new LinkedHashMap<>();
    public typetable heritage;
    public boolean isGlobal = false;
    public typetable(typetable heritage){
        this.heritage = heritage;
    }
    public typetable typetable(){
        this.heritage = null;
        this.map = new LinkedHashMap<>();
        this.isGlobal = true;
        return this;
    }
    public void declare(String name, Type type){
        map.put(name, type);
    }
    public Type getType(String name){
        Type now = map.get(name);
        return now == null ? now : heritage.getType(name);
    }
    public Type getTypeCurrent(String name){
        return map.get(name);
    }
}
