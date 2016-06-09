package com.mauriciotogneri.dry.compiler.runtime.statements;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.Optional;

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
    public Optional<Constant> execute(Context context)
    {
        while (condition.evaluate(context).asBoolean().value())
        {
            Optional<Constant> result = statements.execute(context);

            if (result.isPresent())
            {
                return result;
            }
        }

        return Optional.empty();
    }
}