package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.StringFunction;

public class ToString extends StringFunction
{
    @Override
    public String compute(Constant... arguments)
    {
        return arguments[0].string();
    }
}