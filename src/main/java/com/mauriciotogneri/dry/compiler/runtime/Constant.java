package com.mauriciotogneri.dry.compiler.runtime;

public class Constant implements Expression
{
    private final Value value;

    public Constant(Value value)
    {
        this.value = value;
    }

    @Override
    public Value evaluate(Context context)
    {
        return null; // TODO
    }
}