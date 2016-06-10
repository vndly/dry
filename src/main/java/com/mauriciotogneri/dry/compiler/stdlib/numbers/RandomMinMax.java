package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

import java.util.Random;

public class RandomMinMax extends NumberFunction
{
    private final Random random = new Random();

    @Override
    public double compute(Constant... arguments)
    {
        long min = (long)arguments[0].number();
        long max = (long)arguments[1].number();

        return random.nextInt((int)(max - min)) + min;
    }
}