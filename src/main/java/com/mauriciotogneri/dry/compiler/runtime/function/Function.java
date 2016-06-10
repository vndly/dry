package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public abstract class Function
{
    public abstract Constant apply(Constant... arguments);
}