package com.mauriciotogneri.dry.compiler.stdlib.numbers;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.function.NumberFunction;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Round extends NumberFunction
{
    @Override
    public double compute(Constant... arguments)
    {
        return new BigDecimal(arguments[0].number()).setScale((int) arguments[1].number(), RoundingMode.HALF_UP).doubleValue();
    }
}