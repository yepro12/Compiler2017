package com.yepro12.compiler2017.Front;
import com.yepro12.compiler2017.AST.*;
import com.yepro12.compiler2017.Table.*;
/**
 * Created by yepro12 on 2017/4/4.
 */
public class FunctionScanner implements ASTVisitor{
    public GlobalTable global;
    public FunctionScanner(GlobalTable global){
        this.global = global;
    }
    @Override
    public void visit(ArrayAccess node){
    }
    @Override
    public void visit(Binary node){
    }
    @Override
    public void visit(Block node){
    }
    @Override
    public void visit(BoolConst node){
    }
    @Override
    public void visit(Break node){
    }
    @Override
    public void visit(ClassDeclare node){
        ClassType nowtype = (ClassType) global.map.get(node.name);
        for(FunctionDeclare now: node.memberFunc){
            if(nowtype.member.map.get(now.name)==null){
                VariableType ttype = global.getType(now.returnType);
                if(ttype==null)throw new RuntimeException("Cannot resolve the func");
                nowtype.member.map.put(now.name, ttype);
            }
        }
        for(VariableDeclare now: node.memberVar){
            if(nowtype.member.map.get(now.name)==null){
                VariableType ttype = global.getType(now.variableType);
                if(ttype==null)throw new RuntimeException("Cannot resolve the func");
                nowtype.member.map.put(now.name, ttype);
            }
        }
    }
    @Override
    public void visit(Continue node){
    }
    @Override
    public void visit(Declare node){
    }
    @Override
    public void visit(Empty node){
    }
    @Override
    public void visit(Expr node){
    }
    @Override
    public void visit(For node){
    }
    @Override
    public void visit(FunctionCall node){
    }
    @Override
    public void visit(FunctionDeclare node){
        if(global.map.get(node.name)!=null)throw new RuntimeException("Change the function name");
        VariableType nowtype = global.getType(node.returnType);
        if(nowtype == null)throw new RuntimeException("No such function type");
        if(node.name=="main"&&(node.arguments.size()!=0||node.returnType.type!= Type.TheType.INT))throw new RuntimeException("Incorrect Main");
        FunctionType ret = new FunctionType(nowtype, node.name);
        for(VariableDeclare now :node.arguments){
            if(now.init!=null)throw new RuntimeException("No init in func");
            VariableType ttype = global.getType(now.variableType);
            if(ttype==null)throw new RuntimeException("Cannot resolve parameter");
            ret.argumentType.add(ttype);
            ret.argumentName.add(now.name);
        }
        global.map.put(node.name, ret);
    }
    @Override
    public void visit(Identifier node){
    }
    @Override
    public void visit(If node){
    }
    @Override
    public void visit(IntConst node){
    }
    @Override
    public void visit(MemberAccess node){
    }
    @Override
    public void visit(NewProcess node){
    }
    @Override
    public void visit(Node node){
    }
    @Override
    public void visit(NullConst node){
    }
    @Override
    public void visit(Program node){
        for(Declare now: node.declare)now.accept(this);
    }
    @Override
    public void visit(Return node){
    }
    @Override
    public void visit(SelfMinus node){
    }
    @Override
    public void visit(SelfPlus node){
    }
    @Override
    public void visit(Stmt node){
    }
    @Override
    public void visit(StringConst node){
    }
    @Override
    public void visit(Unary node){
    }
    @Override
    public void visit(VariableDeclare node){
    }
    @Override
    public void visit(VariableDeclareStmt node){
    }
    @Override
    public void visit(While node){
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
