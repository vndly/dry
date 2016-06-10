package com.mauriciotogneri.dry.compiler.stdlib.generic;

import com.mauriciotogneri.dry.compiler.runtime.constant.ArrayConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.StringConstant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Length extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        Constant argument = arguments[0];

        if (argument instanceof StringConstant)
        {
            return argument.string().length();
        }
        else if (argument instanceof ArrayConstant)
        {
            return argument.array().size();
        }
        else
        {
            throw new RuntimeException();
        }
    }
}