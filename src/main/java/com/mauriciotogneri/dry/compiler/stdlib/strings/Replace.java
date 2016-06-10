package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.StringFunction;

public class Replace extends StringFunction
{
    @Override
    public String compute(Constant... arguments)
    {
        return arguments[0].string().replace(arguments[1].string(), arguments[2].string());
    }
}