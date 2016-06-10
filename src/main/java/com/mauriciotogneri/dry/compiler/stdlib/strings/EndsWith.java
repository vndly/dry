package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.BooleanFunction;

public class EndsWith extends BooleanFunction
{
    @Override
    public boolean compute(Constant... arguments)
    {
        return arguments[0].string().endsWith(arguments[1].string());
    }
}