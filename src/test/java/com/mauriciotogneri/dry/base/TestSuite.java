package com.mauriciotogneri.dry.base;

import java.io.File;

public class TestSuite
{
    protected File file(String path)
    {
        return new File("src/test/resources/" + path);
    }
}