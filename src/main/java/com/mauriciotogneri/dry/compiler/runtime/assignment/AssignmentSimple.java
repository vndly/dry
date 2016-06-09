package com.mauriciotogneri.dry.compiler.runtime.assignment;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.statements.Statement;
import com.mauriciotogneri.dry.compiler.runtime.variable.Variable;

import java.util.Optional;

public class AssignmentSimple implements Statement
{
    private final Variable variable;
    private final Expression expression;

    public AssignmentSimple(Variable variable, Expression expression)
    {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        context.set(variable, expression.evaluate(context));

        return Optional.empty();
    }
}