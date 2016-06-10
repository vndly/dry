package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Max extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.max(arguments[0].number(), arguments[1].number());
    }
}