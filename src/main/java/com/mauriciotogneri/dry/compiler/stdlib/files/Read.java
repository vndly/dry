package com.mauriciotogneri.dry.compiler.stdlib.files;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.StringFunction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read extends StringFunction
{
    @Override
    public String compute(Constant... arguments)
    {
        try
        {
            return new Scanner(new File(arguments[0].string())).useDelimiter("\\Z").next();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}