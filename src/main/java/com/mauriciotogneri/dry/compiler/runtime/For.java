package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.List;
import java.util.Optional;

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
    public Optional<Constant> execute(Context context)
    {
        List<Constant> array = range.evaluate(context).asArray().value();

        for (Constant element : array)
        {
            context.set(variable, element);

            Optional<Constant> result = statements.execute(context);

            if (result.isPresent())
            {
                return result;
            }
        }

        return Optional.empty();
    }
}