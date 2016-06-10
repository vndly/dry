package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Log1p extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.log1p(arguments[0].number());
    }
}