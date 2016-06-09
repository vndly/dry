package com.mauriciotogneri.dry.runtime;

import com.mauriciotogneri.dry.base.TestSuite;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.Variable;
import com.mauriciotogneri.dry.compiler.runtime.arithmetic.ArithmeticAdd;
import com.mauriciotogneri.dry.compiler.runtime.arithmetic.ArithmeticMul;
import com.mauriciotogneri.dry.compiler.runtime.comparison.ComparisonEqual;
import com.mauriciotogneri.dry.compiler.runtime.constant.BooleanConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.NumberConstant;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RuntimeTest extends TestSuite
{
    @Test
    public void testAdd1() throws Exception
    {
        // 1 + 3
        Context context = new Context();
        Expression expression = new ArithmeticAdd(new NumberConstant(1),
                                                  new NumberConstant(3));
        assertEquals(expression.evaluate(context), new NumberConstant(4));
    }

    @Test
    public void testAdd2() throws Exception
    {
        // (2 + 3) * 5
        Context context = new Context();
        Expression expression = new ArithmeticMul(new ArithmeticAdd(new NumberConstant(2),
                                                                    new NumberConstant(3)),
                                                  new NumberConstant(5));
        assertEquals(expression.evaluate(context), new NumberConstant(25));
    }

    @Test
    public void testComparison() throws Exception
    {
        // (2 + 3) == 5
        Context context = new Context();
        Expression expression = new ComparisonEqual(new ArithmeticAdd(new NumberConstant(2),
                                                                      new NumberConstant(3)),
                                                    new NumberConstant(5));
        assertEquals(expression.evaluate(context), new BooleanConstant(true));
    }

    @Test
    public void testContext() throws Exception
    {
        // (2 + a) == 2
        Context context = new Context(Arrays.asList("a"), Arrays.asList(new NumberConstant(3)));
        Expression expression = new ComparisonEqual(new ArithmeticAdd(new NumberConstant(2),
                                                                      new Variable("a")),
                                                    new NumberConstant(5));
        assertEquals(expression.evaluate(context), new BooleanConstant(true));
    }
}