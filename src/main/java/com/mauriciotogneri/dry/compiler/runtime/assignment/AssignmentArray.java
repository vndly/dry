package com.mauriciotogneri.dry.compiler.runtime.assignment;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.Statement;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.variable.Variable;

import java.util.Optional;

public class AssignmentArray implements Statement
{
    private final Variable variable;
    private final Expression key;
    private final Expression expression;

    public AssignmentArray(Variable variable, Expression key, Expression expression)
    {
        this.variable = variable;
        this.key = key;
        this.expression = expression;
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        context.set(variable, key.evaluate(context), expression.evaluate(context));

        return Optional.empty();
    }
}