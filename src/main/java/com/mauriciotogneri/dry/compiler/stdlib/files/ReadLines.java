package com.mauriciotogneri.dry.compiler.stdlib.files;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.StringConstant;
import com.mauriciotogneri.dry.compiler.runtime.function.ArrayFunction;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReadLines extends ArrayFunction
{
    @Override
    public List<Constant> compute(Constant... arguments)
    {
        try
        {
            Path filePath = new File(arguments[0].string()).toPath();
            Charset charset = Charset.defaultCharset();
            List<String> list = Files.readAllLines(filePath, charset);

            return list.stream().map(StringConstant::new).collect(Collectors.toList());
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}