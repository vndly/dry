package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class For implements Statement
{
    private final Variable variable;
    private final Expression range;
    private final Block statements;

    public For(Variable variable, Expression range, Block statements)
    {
        this.variable = variable;
        this.range = range;
        this.statements = statements;
    }

    @Override
    public Constant execute(Context context)
    {
        return null; // TODO
    }
}