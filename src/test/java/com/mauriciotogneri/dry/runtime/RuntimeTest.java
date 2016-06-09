package com.mauriciotogneri.dry.runtime;

import com.mauriciotogneri.dry.base.TestSuite;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.arithmetic.ArithmeticAdd;
import com.mauriciotogneri.dry.compiler.runtime.constant.NumberConstant;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuntimeTest extends TestSuite
{
    @Test
    public void test() throws Exception
    {
        // 1 + 3
        Context context = new Context();
        Expression expression = new ArithmeticAdd(new NumberConstant(1), new NumberConstant(3));
        assertEquals(expression.evaluate(context), new NumberConstant(4));
    }
}