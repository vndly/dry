package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.BooleanFunction;

public class Matches extends BooleanFunction
{
    @Override
    public boolean compute(Constant... arguments)
    {
        return arguments[0].string().matches(arguments[1].string());
    }
}