package com.mauriciotogneri.dry.tmp;

import static com.mauriciotogneri.dry.experiment.Runtime.NumberOperations.equal;
import static com.mauriciotogneri.dry.experiment.Runtime.NumberOperations.mul;
import static com.mauriciotogneri.dry.experiment.Runtime.NumberOperations.sub;

public class Test
{
    public static Number factorial(Number n)
    {
        if (equal(n, 0))
        {
            return 1;
        }
        else
        {
            return mul(n, factorial(sub(n, 1)));
        }
    }

    public static void main(String[] args)
    {
        System.out.print(factorial(5));
    }
}