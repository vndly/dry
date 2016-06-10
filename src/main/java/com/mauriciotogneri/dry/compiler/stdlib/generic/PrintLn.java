package com.mauriciotogneri.dry.compiler.stdlib.generic;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.VoidFunction;

public class PrintLn extends VoidFunction
{
    @Override
    public void compute(Constant... arguments)
    {
        System.out.println(arguments[0].toString());
    }
}