package com.mauriciotogneri.dry.compiler.runtime.variable;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class VariableSimple extends Variable
{
    public VariableSimple(String name)
    {
        super(name);
    }

    public void set(Constant constant, Context context)
    {
        context.set(this, constant);
    }

    @Override
    public Constant evaluate(Context context)
    {
        return context.get(this);
    }
}