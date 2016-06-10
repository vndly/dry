package com.mauriciotogneri.dry.compiler.stdlib.strings;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.StringConstant;
import com.mauriciotogneri.dry.compiler.runtime.function.ArrayFunction;

import java.util.ArrayList;
import java.util.List;

public class Split extends ArrayFunction
{
    @Override
    public List<Constant> compute(Constant... arguments)
    {
        List<Constant> list = new ArrayList<>();

        String[] parts = arguments[0].string().split(arguments[1].string());

        for (String part : parts)
        {
            list.add(new StringConstant(part));
        }

        return list;
    }
}