package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Radians extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.toRadians(arguments[0].number());
    }
}