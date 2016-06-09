package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.UndefinedConstant;
import com.mauriciotogneri.dry.compiler.runtime.statements.Block;

import java.util.List;
import java.util.Optional;

public abstract class Function
{
    private final List<String> parameters;
    private final Block statements;

    public Function(List<String> parameters, Block statements)
    {
        this.parameters = parameters;
        this.statements = statements;
    }

    public Constant apply(List<Constant> arguments)
    {
        Context context = new Context(parameters, arguments);

        Optional<Constant> result = statements.execute(context);

        if (result.isPresent())
        {
            return result.get();
        }
        else
        {
            return UndefinedConstant.INSTANCE;
        }
    }
}