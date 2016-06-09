package com.mauriciotogneri.dry.compiler.runtime.logic;

import com.mauriciotogneri.dry.compiler.runtime.Expression;

public abstract class LogicExpression implements Expression
{
    protected final Expression left;
    protected final Expression right;

    public LogicExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
}