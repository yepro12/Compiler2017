package com.yepro12.compiler2017.AST;

import com.yepro12.compiler2017.Table.InitialType;

public interface ASTVisitor {
    void visit(ArrayAccess node);
    void visit(Binary node);
    void visit(Block node);
    void visit(BoolConst node);
    void visit(Break node);
    void visit(ClassDeclare node);
    void visit(Continue node);
    void visit(Declare node);
    void visit(Empty node);
    void visit(Expr node);
    void visit(For node);
    void visit(FunctionCall node);
    void visit(FunctionDeclare node);
    void visit(Identifier node);
    void visit(If node);
    void visit(IntConst node);
    void visit(MemberAccess node);
    void visit(NewProcess node);
    void visit(Node node);
    void visit(NullConst node);
    void visit(Program node);
    void visit(Return node);
    void visit(SelfMinus node);
    void visit(SelfPlus node);
    void visit(Stmt node);
    void visit(StringConst node);
    void visit(Unary node);
    void visit(VariableDeclare node);
    void visit(VariableDeclareStmt node);
    void visit(While node);
    void visit(TypeNode node);
    void visit(InitialTypeNode node);
    void visit(ArrayTypeNode node);
    void visit(FunctionTypeNode node);
    void visit(ClassTypeNode node);
}