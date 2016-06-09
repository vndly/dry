package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class Variable implements Expression
{
    private final String name;

    public Variable(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }

    @Override
    public Constant evaluate(Context context)
    {
        return context.get(this);
    }
}