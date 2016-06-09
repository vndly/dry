package com.mauriciotogneri.dry.compiler.runtime.comparison;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class ComparisonLessEqual extends ComparisonExpression
{
    public ComparisonLessEqual(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return left.evaluate(context).asNumber().lessEqual(right.evaluate(context).asNumber());
    }
}