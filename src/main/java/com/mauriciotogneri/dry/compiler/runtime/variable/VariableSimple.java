package com.mauriciotogneri.dry.compiler.runtime.variable;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class VariableSimple extends Variable
{
    public VariableSimple(String name)
    {
        super(name);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return context.get(this);
    }
}