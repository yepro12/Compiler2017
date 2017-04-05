package com.yepro12.compiler2017.AST;
public class MemberAccess extends Expr{
    public Expr boss;
    public String name;
    public MemberAccess(Expr boss, String name){
        this.boss = boss;
        this.name = name;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
