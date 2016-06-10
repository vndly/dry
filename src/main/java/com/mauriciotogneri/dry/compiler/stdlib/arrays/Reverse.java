package com.mauriciotogneri.dry.compiler.stdlib.arrays;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.ArrayFunction;

import java.util.ArrayList;
import java.util.List;

public class Reverse extends ArrayFunction
{
    @Override
    public List<Constant> compute(Constant... arguments)
    {
        List<Constant> result = new ArrayList<>();
        List<Constant> list = arguments[0].array();

        for (int i = list.size() - 1; i >= 0; i--)
        {
            result.add(list.get(i));
        }

        return result;
    }
}