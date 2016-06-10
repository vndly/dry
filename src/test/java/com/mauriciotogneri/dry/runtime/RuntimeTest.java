package com.mauriciotogneri.dry.runtime;

import com.mauriciotogneri.dry.base.TestSuite;
import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;
import com.mauriciotogneri.dry.compiler.runtime.arithmetic.ArithmeticAdd;
import com.mauriciotogneri.dry.compiler.runtime.arithmetic.ArithmeticMul;
import com.mauriciotogneri.dry.compiler.runtime.assignment.AssignmentSimple;
import com.mauriciotogneri.dry.compiler.runtime.comparison.ComparisonEqual;
import com.mauriciotogneri.dry.compiler.runtime.comparison.ComparisonLess;
import com.mauriciotogneri.dry.compiler.runtime.constant.BooleanConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.NumberConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.UndefinedConstant;
import com.mauriciotogneri.dry.compiler.runtime.function.Function;
import com.mauriciotogneri.dry.compiler.runtime.function.FunctionCall;
import com.mauriciotogneri.dry.compiler.runtime.statements.Block;
import com.mauriciotogneri.dry.compiler.runtime.statements.While;
import com.mauriciotogneri.dry.compiler.runtime.variable.VariableSimple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
                                                                      new VariableSimple("a")),
                                                    new NumberConstant(5));
        assertEquals(expression.evaluate(context), new BooleanConstant(true));
    }

    @Test
    public void testWhile() throws Exception
    {
        // a = 1
        // while(a < 10)
        // {
        //     a = a + 1
        //     print(a)
        // }
        Context context = new Context();

        Function print = new Function()
        {
            @Override
            public Constant apply(List<Constant> arguments)
            {
                System.out.println(arguments.get(0));

                return UndefinedConstant.INSTANCE;
            }
        };

        VariableSimple a = new VariableSimple("a");

        List<Expression> functionParameters = new ArrayList<>();
        functionParameters.add(a);

        Block whileBlock = new Block();
        whileBlock.add(new AssignmentSimple(a,
                                            new ArithmeticAdd(a,
                                                              new NumberConstant(1))));
        whileBlock.add(new FunctionCall(print, functionParameters));

        Block block = new Block();
        block.add(new AssignmentSimple(a,
                                       new NumberConstant(1)));
        block.add(new While(new ComparisonLess(a,
                                               new NumberConstant(10)),
                            whileBlock));

        assertEquals(block.execute(context), Optional.empty());
    }
}