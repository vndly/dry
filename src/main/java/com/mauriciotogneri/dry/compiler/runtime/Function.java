package com.mauriciotogneri.dry.compiler.runtime;

import java.util.List;

public abstract class Function extends Node
{
    private final String name;
    private final List<String> parameters;
    private final Block statements;

    public Function(String name, List<String> parameters, Block statements)
    {
        this.name = name;
        this.parameters = parameters;
        this.statements = statements;
    }

    public abstract Block apply(Context context);
}