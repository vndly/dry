package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public class If implements Statement
{
    private final Expression condition;
    private final Block ifTrue;
    private final Block ifFalse; // or another if

    public If(Expression condition, Block ifTrue, Block ifFalse)
    {
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    @Override
    public Constant execute(Context context)
    {
        return null; // TODO
    }
}