package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.Optional;

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
    public Optional<Constant> execute(Context context)
    {
        context.set(variable, expression.evaluate(context));

        return Optional.empty();
    }
}