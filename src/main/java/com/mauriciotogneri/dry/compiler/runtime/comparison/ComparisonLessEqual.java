package com.mauriciotogneri.dry.compiler.runtime.comparison;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;

public class ComparisonLessEqual extends ComparisonExpression
{
    public ComparisonLessEqual(Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return null; // TODO
    }
}