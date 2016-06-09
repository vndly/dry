package com.mauriciotogneri.dry.compiler.runtime.statements;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.ArrayList;
import java.util.Optional;

public class Block extends ArrayList<Statement> implements Statement
{
    @Override
    public Optional<Constant> execute(Context context)
    {
        for (Statement statement : this)
        {
            Optional<Constant> result = statement.execute(context);

            if (result.isPresent())
            {
                return result;
            }
        }

        return Optional.empty();
    }
}