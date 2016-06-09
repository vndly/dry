package com.mauriciotogneri.dry.compiler.runtime.arithmetic;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;

public class ArithmeticMul extends ArithmeticExpression
{
    public ArithmeticMul(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return left.evaluate(context).asNumber().mul(right.evaluate(context).asNumber());
    }
}