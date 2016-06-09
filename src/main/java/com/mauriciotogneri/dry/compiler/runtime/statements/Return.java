package com.mauriciotogneri.dry.compiler.runtime.statements;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
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