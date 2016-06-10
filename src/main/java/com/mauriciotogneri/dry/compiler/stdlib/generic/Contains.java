package com.mauriciotogneri.dry.compiler.stdlib.generic;

import com.mauriciotogneri.dry.compiler.runtime.constant.ArrayConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.StringConstant;
import com.mauriciotogneri.dry.compiler.runtime.function.BooleanFunction;

public class Contains extends BooleanFunction
{
    @Override
    public boolean compute(Constant... arguments)
    {
        Constant argument = arguments[0];
        Constant search = arguments[1];

        if (argument instanceof StringConstant)
        {
            return argument.string().contains(search.string());
        }
        else if (argument instanceof ArrayConstant)
        {
            return argument.array().contains(search);
        }
        else
        {
            throw new RuntimeException();
        }
    }
}