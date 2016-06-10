package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class Float extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return arguments[0].number();
    }
}