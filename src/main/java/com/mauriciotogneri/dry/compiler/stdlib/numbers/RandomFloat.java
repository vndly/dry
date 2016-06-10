package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

import java.util.Random;

public class RandomFloat extends NumberFunction
{
    private final Random random = new Random();

    @Override
    public double compute(Constant... arguments)
    {
        return random.nextDouble();
    }
}