package com.yepro12.compiler2017.Front;
import com.yepro12.compiler2017.AST.*;
import com.yepro12.compiler2017.Table.*;
/**
 * Created by yepro12 on 2017/4/4.
 */
public class ClassScanner implements ASTVisitor{
    public GlobalTable global;
    public ClassScanner(GlobalTable global){
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
        if(global.map.get(node.name)==null){
            global.map.put(node.name, new ClassType(node.name));
        }else throw new RuntimeException("You have used such name!");
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
