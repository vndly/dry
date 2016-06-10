package com.mauriciotogneri.dry.compiler.stdlib.files;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.VoidFunction;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Write extends VoidFunction
{
    @Override
    public void compute(Constant... arguments)
    {
        try
        {
            Files.write(Paths.get(arguments[0].string()), arguments[1].string().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}