package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Ceil extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return Math.ceil(arguments[0].number());
    }
}