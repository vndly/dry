package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class Return implements Statement
{
    private final Expression expression;

    public Return(Expression expression)
    {
        this.expression = expression;
    }

    @Override
    public Constant execute(Context context)
    {
        return null; // TODO
    }
}