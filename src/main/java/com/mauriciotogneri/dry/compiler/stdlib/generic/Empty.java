package com.mauriciotogneri.dry.compiler.stdlib.generic;

import com.mauriciotogneri.dry.compiler.runtime.constant.ArrayConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.StringConstant;
import com.mauriciotogneri.dry.compiler.runtime.function.BooleanFunction;

public class Empty extends BooleanFunction
{
    @Override
    public boolean compute(Constant... arguments)
    {
        Constant argument = arguments[0];

        if (argument instanceof StringConstant)
        {
            return argument.string().isEmpty();
        }
        else if (argument instanceof ArrayConstant)
        {
            return argument.array().isEmpty();
        }
        else
        {
            throw new RuntimeException();
        }
    }
}