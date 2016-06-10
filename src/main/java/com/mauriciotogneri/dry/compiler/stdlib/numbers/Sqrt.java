package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Sqrt extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.sqrt(arguments[0].number());
    }
}