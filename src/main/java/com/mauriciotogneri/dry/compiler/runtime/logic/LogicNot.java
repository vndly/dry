package com.mauriciotogneri.dry.compiler.runtime.logic;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class LogicNot implements Expression
{
    private final Expression expression;

    public LogicNot(Expression expression)
    {
        this.expression = expression;
    }

    @Override
    public Constant evaluate(Context context)
    {
        return null; // TODO
    }
}