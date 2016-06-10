package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.StringFunction;

public class CharAt extends StringFunction
{
    @Override
    public String compute(Constant... arguments)
    {
        return String.valueOf(arguments[0].string().charAt((int)arguments[0].number()));
    }
}