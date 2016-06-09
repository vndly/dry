package com.mauriciotogneri.dry.compiler.runtime.variable;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class VariableArray extends Variable
{
    private final Expression key;

    public VariableArray(String name, Expression key)
    {
        super(name);

        this.key = key;
    }

    @Override
    public Constant evaluate(Context context)
    {
        return context.get(this, key.evaluate(context));
    }
}