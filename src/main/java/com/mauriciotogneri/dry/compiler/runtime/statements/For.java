package com.mauriciotogneri.dry.compiler.runtime.statements;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.variable.VariableSimple;

import java.util.List;
import java.util.Optional;

public class For implements Statement
{
    private final VariableSimple variable;
    private final Expression range;
    private final Block statements;

    public For(VariableSimple variable, Expression range, Block statements)
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
            variable.set(element, context);

            Optional<Constant> result = statements.execute(context);

            if (result.isPresent())
            {
                return result;
            }
        }

        return Optional.empty();
    }
}