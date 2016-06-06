package com.mauriciotogneri.dry.compiler;

import com.mauriciotogneri.dry.base.TestSuite;

import org.junit.Test;

public class CompilerTest extends TestSuite
{
    @Test
    public void test() throws Exception
    {
        Compiler compiler = new Compiler();
        compiler.compile(file("test4.ply"), "com.mauriciotogneri.apply.tmp", "Test");
    }
}