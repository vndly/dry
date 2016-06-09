package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCall implements Expression
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
}