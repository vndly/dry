package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Tan extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.tan(arguments[0].number());
    }
}