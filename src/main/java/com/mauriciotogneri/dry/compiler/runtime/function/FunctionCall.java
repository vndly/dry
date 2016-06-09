package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.UndefinedConstant;
import com.mauriciotogneri.dry.compiler.runtime.statements.Statement;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionCall implements Expression, Statement
{
    private final Function function;
    private final List<Expression> arguments;

    public FunctionCall(Function function, List<Expression> arguments)
    {
        this.function = function;
        this.arguments = arguments;
    }

    @Override
    public Constant evaluate(Context context)
    {
        return function.apply(arguments.stream().map(e -> e.evaluate(context)).collect(Collectors.toList()));
    }

    @Override
    public Optional<Constant> execute(Context context)
    {
        Constant result = evaluate(context);

        if (result != UndefinedConstant.INSTANCE)
        {
            return Optional.of(result);
        }
        else
        {
            return Optional.empty();
        }
    }
}