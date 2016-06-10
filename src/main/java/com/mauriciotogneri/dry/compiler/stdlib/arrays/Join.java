package com.mauriciotogneri.dry.compiler.stdlib.arrays;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.StringFunction;

import java.util.List;

public class Join extends StringFunction
{
    @Override
    public String compute(Constant... arguments)
    {
        StringBuilder builder = new StringBuilder();
        List<Constant> list = arguments[0].array();
        String separator = arguments[1].string();

        for (Constant constant : list)
        {
            if (builder.length() != 0)
            {
                builder.append(separator);
            }

            builder.append(constant.string());
        }

        return builder.toString();
    }
}