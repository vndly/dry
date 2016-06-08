package com.mauriciotogneri.dry.compiler.runtime;

public interface Statement
{
    Value execute(Context context);
}