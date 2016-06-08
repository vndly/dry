package com.mauriciotogneri.dry.compiler.runtime;

public interface Expression
{
    Value evaluate(Context context);
}