package com.mauriciotogneri.dry.compiler.runtime;

public class Return implements Statement
{
    private final Expression expression;

    public Return(Expression expression)
    {
        this.expression = expression;
    }

    @Override
    public Value execute(Context context)
    {
        return null; // TODO
    }
}