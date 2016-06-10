package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

public class IndexOf extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return arguments[0].string().indexOf(arguments[1].string());
    }
}