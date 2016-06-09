package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.Optional;

public class Return implements Statement
{
    private final Expression expression;

    public Return(Expression expression)
    {
        this.expression = expression;
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        return Optional.of(expression.evaluate(context));
    }
}