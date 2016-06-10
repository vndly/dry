package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Floor extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.floor(arguments[0].number());
    }
}