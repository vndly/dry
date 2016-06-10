package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Abs extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.abs(arguments[0].number());
    }
}