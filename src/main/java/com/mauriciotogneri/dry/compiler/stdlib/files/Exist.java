package com.mauriciotogneri.dry.compiler.stdlib.files;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.BooleanFunction;

import java.io.File;

public class Exist extends BooleanFunction
{
    @Override
    public boolean compute(Constant... arguments)
    {
        return new File(arguments[0].string()).exists();
    }
}