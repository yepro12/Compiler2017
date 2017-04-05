package com.yepro12.compiler2017.Table;

import java.sql.Struct;
import java.util.*;
import com.yepro12.compiler2017.AST.*;
/**
 * Created by yepro12 on 2017/4/4.
 */
public class GlobalTable {
    public static InitialType inttype = new InitialType(Type.TheType.INT);
    public static InitialType booltype = new InitialType(Type.TheType.BOOL);
    public static InitialType stringtype = new InitialType(Type.TheType.STRING);
    public static InitialType voidtype = new InitialType(Type.TheType.VOID);
    public static InitialType nulltype = new InitialType(Type.TheType.NULL);
    public static FunctionType arraysize = new FunctionType(inttype, "array.size") {{
        addArgument(null, "this");
    }};
    public static FunctionType voidprint = new FunctionType(voidtype, "print") {{
        addArgument(stringtype, "$0");
    }};
    public static FunctionType voidprintln = new FunctionType(voidtype, "println") {{
        addArgument(stringtype, "$0");
    }};
    public static FunctionType stringgetstring = new FunctionType(stringtype, "getString");
    public static FunctionType intgetint = new FunctionType(inttype, "getInt");
    public static FunctionType stringtostring = new FunctionType(stringtype, "toString") {{
        addArgument(inttype, "$0");
    }};
    public static FunctionType stringplus = new FunctionType(stringtype, "stringPlus") {{
        addArgument(stringtype, "$0");
        addArgument(stringtype, "$1");
    }};
    public static FunctionType stringcompare = new FunctionType(booltype, "stringCompare") {{
        addArgument(stringtype, "$0");
        addArgument(stringtype, "$1");
    }};
    public static FunctionType stringequal = new FunctionType(booltype, "stringEqual") {{
        addArgument(stringtype, "$0");
        addArgument(stringtype, "$1");
    }};

    public static FunctionType stringlength = new FunctionType(inttype, "string.length"){{
        addArgument(stringtype, "this");
    }};
    public static FunctionType stringsubstring = new FunctionType(stringtype, "string.substring") {{
        addArgument(stringtype, "this");
        addArgument(inttype, "$0");
        addArgument(inttype, "$1");
    }};
    public static FunctionType stringparseInt = new FunctionType(inttype, "string.parseInt") {{
        addArgument(stringtype, "this");
    }};
    public static FunctionType stringord = new FunctionType(inttype, "string.ord") {{
        addArgument(stringtype, "this");
        addArgument(inttype, "$0");
    }};
    public static Map<String, Type> typeRef = new LinkedHashMap<>();
    public static Map<String, FunctionType> builtinArrayFunc =new HashMap<String, FunctionType>(){{
        put(arraysize.name, arraysize);
    }};
    public static Map<String, FunctionType> builtinFunc =new HashMap<String, FunctionType>(){{
        put(arraysize.name, arraysize);
        put(stringlength.name, stringlength);
        put(stringsubstring.name, stringsubstring);
        put(stringparseInt.name, stringparseInt);
        put(stringord.name, stringord);
        put(stringplus.name, stringplus);
        put(stringcompare.name, stringcompare);
        put(stringequal.name, stringequal);
        put(voidprint.name, voidprint);
        put(voidprintln.name, voidprintln);
        put(stringgetstring.name, stringgetstring);
        put(intgetint.name, intgetint);
        put(stringtostring.name, stringtostring);
    }};
    public Map<String, FunctionType> builtinStringFunc =new HashMap<String, FunctionType>(){{
        put(stringlength.name, stringlength);
        put(stringsubstring.name, stringsubstring);
        put(stringparseInt.name, stringparseInt);
        put(stringord.name, stringord);
        put(stringplus.name, stringplus);
        put(stringcompare.name, stringcompare);
        put(stringequal.name, stringequal);
    }};
    public Set<FunctionType> functionSet = new HashSet<FunctionType>(){{
        add(arraysize);
        add(stringlength);
        add(stringsubstring);
        add(stringparseInt);
        add(stringord);
        add(stringplus);
        add(stringcompare);
        add(stringequal);
        add(voidprint);
        add(voidprintln);
        add(stringgetstring);
        add(intgetint);
        add(stringtostring);
    }};
    public Map<String, Type> map = new LinkedHashMap<>();
    public typetable globals = new typetable(null);
    public VariableType getType(TypeNode node){
        if(node.type == Type.TheType.INT) return GlobalTable.inttype;
        if(node.type == Type.TheType.BOOL) return GlobalTable.booltype;
        if(node.type == Type.TheType.STRING) return GlobalTable.stringtype;
        if(node.type == Type.TheType.VOID) return GlobalTable.voidtype;
        if(node.type == Type.TheType.NULL) return GlobalTable.nulltype;
        if(node.type == Type.TheType.ARRAY){
            VariableType base = getType(((ArrayTypeNode)node).base);
            if(base == null) return null; else return new ArrayType(base);
        }
        if(node.type == Type.TheType.CLASS){
            Type nowtype = typeRef.get(((ClassTypeNode)node).name);
            if(nowtype == null)return null;
            return (ClassType) nowtype;
        }
        return null;
    }


    public GlobalTable() {
        typeRef.put("int", inttype);
        typeRef.put("bool", booltype);
        typeRef.put("string", stringtype);
        typeRef.put("void", voidtype);
        typeRef.put("null", nulltype);
        builtinFunc.forEach(globals::declare);
    }
}
