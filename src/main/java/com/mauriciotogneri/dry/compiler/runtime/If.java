package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.Optional;

public class If implements Statement
{
    private final Expression condition;
    private final Block ifTrue;
    private final Optional<If> ifFalse;

    public If(Expression condition, Block ifTrue, Optional<If> ifFalse)
    {
        this.condition = condition;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        if (condition.evaluate(context).asBoolean().value())
        {
            Optional<Constant> result = ifTrue.execute(context);

            if (result.isPresent())
            {
                return result;
            }
        }
        else if (ifFalse.isPresent())
        {
            return ifFalse.get().execute(context);
        }

        return Optional.empty();
    }
}