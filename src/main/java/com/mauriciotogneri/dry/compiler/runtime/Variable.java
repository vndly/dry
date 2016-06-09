package com.mauriciotogneri.dry.compiler.runtime;

public class Variable
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
}