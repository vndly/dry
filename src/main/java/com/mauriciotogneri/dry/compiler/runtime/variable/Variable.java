package com.mauriciotogneri.dry.compiler.runtime.variable;

import com.mauriciotogneri.dry.compiler.runtime.Expression;

public abstract class Variable implements Expression
{
    private final String name;

    protected Variable(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }
}