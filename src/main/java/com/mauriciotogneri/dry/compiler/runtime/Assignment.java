package com.mauriciotogneri.dry.compiler.runtime;

public class Assignment implements Statement
{
    private final Variable variable;
    private final Expression expression;

    public Assignment(Variable variable, Expression expression)
    {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public Value execute(Context context)
    {
        return null; // TODO
    }
}