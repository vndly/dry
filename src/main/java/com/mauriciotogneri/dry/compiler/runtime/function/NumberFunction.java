package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.NumberConstant;

public abstract class NumberFunction extends Function
{
    @Override
    public Constant apply(Constant... arguments)
    {
        return new NumberConstant(compute(arguments));
    }

    public abstract double compute(Constant... arguments);
}