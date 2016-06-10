package com.mauriciotogneri.dry.compiler.runtime.assignment;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.statements.Statement;
import com.mauriciotogneri.dry.compiler.runtime.variable.VariableSimple;

import java.util.Optional;

public class AssignmentSimple implements Statement
{
    private final VariableSimple variable;
    private final Expression expression;

    public AssignmentSimple(VariableSimple variable, Expression expression)
    {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        variable.set(expression.evaluate(context), context);

        return Optional.empty();
    }
}