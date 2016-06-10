package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.BooleanConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public abstract class BooleanFunction extends Function
{
    @Override
    public Constant apply(Constant... arguments)
    {
        return new BooleanConstant(compute(arguments));
    }

    public abstract boolean compute(Constant... arguments);
}