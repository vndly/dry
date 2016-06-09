package com.mauriciotogneri.dry.compiler.runtime.logic;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;

public class LogicOr extends LogicExpression
{
    public LogicOr(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return left.evaluate(context).asBoolean().or(right.evaluate(context).asBoolean());
    }
}