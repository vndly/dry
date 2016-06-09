package com.mauriciotogneri.dry.compiler.runtime.function;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.List;

public abstract class Function
{
    public abstract Constant apply(List<Constant> arguments);
}