package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.StringConstant;

public abstract class StringFunction extends Function
{
    @Override
    public Constant apply(Constant... arguments)
    {
        return new StringConstant(compute(arguments));
    }

    public abstract String compute(Constant... arguments);
}