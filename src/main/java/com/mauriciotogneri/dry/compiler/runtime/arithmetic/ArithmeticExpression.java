package com.mauriciotogneri.dry.compiler.runtime.arithmetic;

import com.mauriciotogneri.dry.compiler.runtime.Expression;

public abstract class ArithmeticExpression implements Expression
{
    protected final Expression left;
    protected final Expression right;

    public ArithmeticExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
}