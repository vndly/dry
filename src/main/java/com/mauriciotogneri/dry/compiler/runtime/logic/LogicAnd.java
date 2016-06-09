package com.mauriciotogneri.dry.compiler.runtime.logic;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;

public class LogicAnd extends LogicExpression
{
    public LogicAnd(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return left.evaluate(context).asBoolean().and(right.evaluate(context).asBoolean());
    }
}