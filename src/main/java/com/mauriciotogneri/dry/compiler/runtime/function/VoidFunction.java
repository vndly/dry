package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.UndefinedConstant;

public abstract class VoidFunction extends Function
{
    @Override
    public Constant apply(Constant... arguments)
    {
        compute(arguments);

        return UndefinedConstant.INSTANCE;
    }

    public abstract void compute(Constant... arguments);
}