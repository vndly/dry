package com.mauriciotogneri.dry.compiler.runtime;

public class While implements Statement
{
    private final Expression condition;
    private final Block statements;

    public While(Expression condition, Block statements)
    {
        this.condition = condition;
        this.statements = statements;
    }

    @Override
    public Value execute(Context context)
    {
        return null; // TODO
    }
}