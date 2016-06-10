package com.mauriciotogneri.dry.compiler.stdlib.generic;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.VoidFunction;

public class Print extends VoidFunction
{
    @Override
    public void compute(Constant... arguments)
    {
        System.out.print(arguments[0].toString());
    }
}