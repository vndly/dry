package com.mauriciotogneri.dry.compiler.runtime.comparison;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class ComparisonGreaterEqual extends ComparisonExpression
{
    public ComparisonGreaterEqual(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return left.evaluate(context).asNumber().greaterEqual(right.evaluate(context).asNumber());
    }
}