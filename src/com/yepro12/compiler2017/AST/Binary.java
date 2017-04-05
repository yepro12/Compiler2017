package com.yepro12.compiler2017.AST;
public class Binary extends Expr{
    public enum bop{
        Plus, Minus, Times, Divide, Module, Lshift, Rshift,
        LessEqualThan, GreaterEqualThan, LessThan, Greaterthan,
        Equal, NotEqual, Band, Bor, Bxor, Lor, Land, Assign, Nonsense
    }
    public bop op;
    public Expr lhs;
    public Expr rhs;
    public Binary(Expr lhs, bop op, Expr rhs){
        this.lhs = lhs;
        this.op = op;
        this.rhs = rhs;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
