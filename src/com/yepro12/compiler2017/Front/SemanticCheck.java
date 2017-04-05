package com.yepro12.compiler2017.Front;
import com.yepro12.compiler2017.AST.*;
import com.yepro12.compiler2017.Table.*;
import java.util.Stack;
/**
 * Created by yepro12 on 2017/4/4.
 */
public class SemanticCheck implements ASTVisitor{
    public GlobalTable global;
    private Stack<Node> ASTStack = new Stack<>();
    private Node currentFunction;
    private FunctionType currentType;
    public typetable currentTable;
    public SemanticCheck(GlobalTable global){
        this.global = global;
        currentTable = global.globals;
    }
    @Override
    public void visit(ArrayAccess node){
        node.currentScope = currentTable;
        visit(node.array);
        if(node.array.returnType.type!= Type.TheType.ARRAY)throw new RuntimeException("Not an array");
        visit(node.index);
        if(node.index.returnType.type!= Type.TheType.INT)throw new RuntimeException("Invalid index");
        node.isLvalue = true;
        node.returnType = ((ArrayType)node.array.returnType).dataType;
    }
    @Override
    public void visit(Binary node){
        node.currentScope = currentTable;
        visit(node.lhs);
        visit(node.rhs);
        if(node.lhs.returnType.isSame(node.rhs.returnType)){
            Type.TheType nowtype = node.lhs.returnType.type;
            Binary.bop op = node.op;
            if(op == Binary.bop.Plus){
                if(nowtype != Type.TheType.INT && nowtype != Type.TheType.STRING)throw new RuntimeException("Plus needs int or string");
                node.isLvalue = false;
                if(nowtype == Type.TheType.INT)node.returnType = GlobalTable.inttype; else node.returnType = GlobalTable.stringtype;
            }
            if(op == Binary.bop.Module||op == Binary.bop.Times||op == Binary.bop.Minus||op == Binary.bop.Divide||
                    op == Binary.bop.Bxor||op == Binary.bop.Band||op == Binary.bop.Bor||op == Binary.bop.Lshift
                    ||op == Binary.bop.Rshift){
                if(nowtype != Type.TheType.INT)throw new RuntimeException("Operation needs int");
                node.isLvalue = false;
                node.returnType = GlobalTable.inttype;
            }
            if(op == Binary.bop.Greaterthan||op == Binary.bop.GreaterEqualThan||op == Binary.bop.LessThan||
                    op == Binary.bop.LessEqualThan){
                if(nowtype != Type.TheType.INT && nowtype != Type.TheType.STRING)throw new RuntimeException("Compare needs int or string");
                node.isLvalue = false;
                node.returnType = GlobalTable.booltype;
            }
            if(op == Binary.bop.Equal||op == Binary.bop.NotEqual){
                node.isLvalue = false;
                node.returnType = GlobalTable.booltype;
            }
            if(op == Binary.bop.Assign){
                if(!node.isLvalue)throw new RuntimeException("Assign needs lvalue");
                node.isLvalue = false;
                node.returnType = node.lhs.returnType;
            }
            if(op == Binary.bop.Land||op == Binary.bop.Lor){
                if(nowtype != Type.TheType.BOOL)throw new RuntimeException("Logical operation needs bool");
            }
        }
        else
            throw new RuntimeException("Binary exp needs same type");
    }
    @Override
    public void visit(Block node){
        node.currentScope = currentTable;
        for(Stmt now : node.statement){
            visit(now);
        }
    }
    @Override
    public void visit(BoolConst node){
        node.currentScope = currentTable;
        node.returnType = GlobalTable.booltype;
        node.isLvalue = false;

    }
    @Override
    public void visit(Break node){
        node.currentScope = currentTable;
        if(ASTStack.empty())throw new RuntimeException("Only break in loop");
    }
    @Override
    public void visit(ClassDeclare node){
        node.currentScope = global.globals;
    }
    @Override
    public void visit(Continue node){
        node.currentScope = currentTable;
        if(ASTStack.empty())throw new RuntimeException("Only continue in loop");
    }
    @Override
    public void visit(Declare node){

    }
    @Override
    public void visit(Empty node){
        node.currentScope = currentTable;
        node.returnType = GlobalTable.voidtype;
        node.isLvalue = false;
    }
    @Override
    public void visit(Expr node){

    }
    @Override
    public void visit(For node){
        node.currentScope = currentTable;
        currentTable = new typetable(currentTable);
        if(node.init!=null)visit(node.init);
        if(node.cond!=null){visit(node.cond);
        if(node.cond.returnType.type!= Type.TheType.BOOL)throw new RuntimeException("Wrong cond for forloop");
        }
        if(node.step!=null)visit(node.step);
        ASTStack.push(node);
        visit(node.content);
        ASTStack.pop();
        currentTable = currentTable.heritage;
    }
    @Override
    public void visit(FunctionCall node){
        node.currentScope = currentTable;
        visit(node.func);
        if(node.func.returnType.type!= Type.TheType.FUNCTION)throw new RuntimeException("Not a function");
        FunctionType nowtype = (FunctionType) node.func.returnType;
        if(nowtype.argumentType.size()!=node.arguments.size())throw new RuntimeException("Wrong argument list");
        for (int i = 0; i < nowtype.argumentType.size(); i++){
            visit(node.arguments.get(i));
            if(node.arguments.get(i).returnType.isSame(nowtype.argumentType.get(i)))throw new RuntimeException("Wrong argument list");
        }
        node.returnType = nowtype.returnType;
        node.isLvalue = false;
    }
    @Override
    public void visit(FunctionDeclare node){
        node.currentScope = currentTable;
        currentTable = new typetable(global.globals);
        currentFunction = node;
        currentType = (FunctionType) global.map.get(node.name);
        for(VariableDeclare now : node.arguments){
            currentTable.map.put(now.name, global.getType(now.variableType));
            now.currentScope = currentTable;

        }
        visit(node.content);
        currentFunction = null;
        currentType = null;
        currentTable = currentTable.heritage;
    }
    @Override
    public void visit(Identifier node){
        node.currentScope = currentTable;
        Type nowtype =  currentTable.getType(node.name);
        if(nowtype==null||nowtype.type== Type.TheType.VOID)throw new RuntimeException("Undefined Identifier");
        node.returnType = nowtype;
        node.isLvalue = (nowtype.type==Type.TheType.FUNCTION);
    }
    @Override
    public void visit(If node){
        node.currentScope = currentTable;
        visit(node.cond);
        if(node.cond.returnType.type!= Type.TheType.BOOL)throw new RuntimeException("Invalid condition");
        currentTable = new typetable(currentTable);
        visit(node.st1);
        currentTable = currentTable.heritage;
        if(node.st2!=null){
            currentTable = new typetable(currentTable);
            visit(node.st2);
            currentTable = currentTable.heritage;
        }
    }
    @Override
    public void visit(IntConst node){
        node.currentScope = currentTable;
        node.returnType = GlobalTable.inttype;
        node.isLvalue = false;
    }
    @Override
    public void visit(MemberAccess node){
        node.currentScope = currentTable;
        visit(node.boss);
        Type.TheType nowtype = node.boss.returnType.type;
        if(nowtype == Type.TheType.ARRAY){
            if(global.builtinArrayFunc.get(node.name)==null)throw new RuntimeException("No such array method");
            node.returnType = global.builtinArrayFunc.get(node.name);
            node.isLvalue = false;
        }
        if(nowtype == Type.TheType.STRING){
            if(global.builtinStringFunc.get(node.name)==null)throw new RuntimeException("No such string method");
            node.returnType = global.builtinStringFunc.get(node.name);
            node.isLvalue = false;
        }
        if(nowtype == Type.TheType.CLASS){
            ClassType nowclass = (ClassType)node.boss.returnType;
            if(nowclass.member.getType(node.name)==null)throw new RuntimeException("No such class member");
            node.returnType = nowclass.member.getType(node.name);
            node.isLvalue = true;
        }

    }
    @Override
    public void visit(NewProcess node){
        node.currentScope = currentTable;
        Type nowtype = global.getType(node.type);
        for(int i = 0; i < node.dimension.size(); i++){
            Expr now = node.dimension.get(i);
            visit(now);
            if(now.returnType.type != Type.TheType.INT)throw new RuntimeException("Incorrect Index");
            nowtype = new ArrayType(nowtype);
        }
        node.returnType = nowtype;
        node.isLvalue = false;
    }
    @Override
    public void visit(Node node){

    }
    @Override
    public void visit(NullConst node){
        node.currentScope = currentTable;
        node.returnType = GlobalTable.nulltype;
        node.isLvalue = false;
    }
    @Override
    public void visit(Program node){
        node.currentScope = global.globals;
        for(Declare now: node.declare)now.accept(this);
    }
    @Override
    public void visit(Return node){
        node.currentScope = currentTable;
        if (currentFunction == null)throw new RuntimeException("Return stmt needs function");
        Type returnType;
        if(node.value == null)returnType = GlobalTable.voidtype; else{
            visit(node.value);
            returnType = node.value.returnType;
        }
        if(!returnType.isSame(currentType.returnType))throw new RuntimeException("return wrongtype");
    }
    @Override
    public void visit(SelfMinus node){
        node.currentScope = currentTable;
        visit(node.perse);
        if(!node.isLvalue)throw new RuntimeException("Self dec needs lvalue");
        if(node.perse.returnType.type != Type.TheType.INT)throw new RuntimeException("Self dec needs int");
        node.isLvalue = false;
        node.returnType = GlobalTable.inttype;
    }
    @Override
    public void visit(SelfPlus node){
        node.currentScope = currentTable;
        visit(node.perse);
        if(!node.isLvalue)throw new RuntimeException("Self inc needs lvalue");
        if(node.perse.returnType.type != Type.TheType.INT)throw new RuntimeException("Self inc needs int");
        node.isLvalue = false;
        node.returnType = GlobalTable.inttype;
    }
    @Override
    public void visit(Stmt node){

    }
    @Override
    public void visit(StringConst node){
        node.currentScope = currentTable;
        node.returnType = GlobalTable.stringtype;
        node.isLvalue = false;

    }
    @Override
    public void visit(Unary node){
        node.currentScope = currentTable;
        visit(node.perse);
        if(node.op == Unary.uop.SelfP || node.op == Unary.uop.SelfM){
            if(!node.perse.isLvalue)throw new RuntimeException("Self inc or dec needs lvalue!");
            if(node.perse.returnType.type!=Type.TheType.INT)throw new RuntimeException("Self inc or dec needs int!");
            node.returnType = GlobalTable.inttype;
            node.isLvalue = true;
        }
        if(node.op == Unary.uop.Oppo||node.op == Unary.uop.Bnot){
            if(node.perse.returnType.type!=Type.TheType.INT)throw new RuntimeException("Oppo or Binary not needs int!");
            node.returnType = GlobalTable.inttype;
            node.isLvalue = false;
        }
        if(node.op == Unary.uop.Lnot){
            if(node.perse.returnType.type!=Type.TheType.BOOL)throw new RuntimeException("Logical not needs bool");
            node.returnType =GlobalTable.booltype;
            node.isLvalue =false;
        }
    }
    @Override
    public void visit(VariableDeclare node){
        node.currentScope = currentTable;
        if(node.currentScope.getTypeCurrent(node.name)!=null)throw new RuntimeException("You have declared it in this section");
        VariableType nowtype = global.getType(node.variableType);
        if(nowtype==null)throw new RuntimeException("Cannot resolve");
        if(node.init!=null){
            visit(node.init);
            if(!node.init.returnType.isSame(nowtype))throw new RuntimeException("Cannot init");
        }
        currentTable.map.put(node.name, nowtype);
    }
    @Override
    public void visit(VariableDeclareStmt node){
        node.currentScope = currentTable;
        visit(node.dec);
    }
    @Override
    public void visit(While node){
        node.currentScope = currentTable;
        currentTable = new typetable(currentTable);
        if(node.cond==null)throw new RuntimeException("where is your cond?");else {
            visit(node.cond);
            if (node.cond.returnType.type != Type.TheType.BOOL) throw new RuntimeException("Wrong cond for forloop");
        }
        ASTStack.push(node);
        visit(node.content);
        ASTStack.pop();
        currentTable = currentTable.heritage;
    }
    @Override
    public void visit(TypeNode node){

    }
    @Override
    public void visit(InitialTypeNode node){

    }
    @Override
    public void visit(ArrayTypeNode node){

    }
    @Override
    public void visit(FunctionTypeNode node){

    }
    @Override
    public void visit(ClassTypeNode node){

    }
}
