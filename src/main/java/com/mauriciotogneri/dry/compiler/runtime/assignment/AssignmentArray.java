package com.mauriciotogneri.dry.compiler.runtime.assignment;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.statements.Statement;
import com.mauriciotogneri.dry.compiler.runtime.variable.VariableArray;

import java.util.Optional;

public class AssignmentArray implements Statement
{
    private final VariableArray variable;
    private final Expression key;
    private final Expression expression;

    public AssignmentArray(VariableArray variable, Expression key, Expression expression)
    {
        this.variable = variable;
        this.key = key;
        this.expression = expression;
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        variable.set(key.evaluate(context), expression.evaluate(context), context);

        return Optional.empty();
    }
}