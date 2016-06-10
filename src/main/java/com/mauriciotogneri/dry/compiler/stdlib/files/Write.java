package com.mauriciotogneri.dry.compiler.stdlib.files;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.BooleanFunction;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Write extends BooleanFunction
{
    @Override
    public boolean compute(Constant... arguments)
    {
        try
        {
            Files.write(Paths.get(arguments[0].string()), arguments[1].string().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            return true;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}