package com.mauriciotogneri.dry.compiler.runtime.arithmetic;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class ArithmeticPow extends ArithmeticExpression
{
    public ArithmeticPow(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return null; // TODO
    }
}