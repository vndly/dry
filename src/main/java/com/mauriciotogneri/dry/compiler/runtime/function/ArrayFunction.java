package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.ArrayConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.List;

public abstract class ArrayFunction extends Function
{
    @Override
    public Constant apply(Constant... arguments)
    {
        return new ArrayConstant(compute(arguments));
    }

    public abstract List<Constant> compute(Constant... arguments);
}