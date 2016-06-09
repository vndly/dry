package com.mauriciotogneri.dry.compiler.runtime.comparison;

import com.mauriciotogneri.dry.compiler.runtime.Expression;

public abstract class ComparisonExpression implements Expression
{
    protected final Expression left;
    protected final Expression right;

    public ComparisonExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
}