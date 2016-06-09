package com.mauriciotogneri.dry.compiler.runtime.constant;

public class NumberConstant extends Constant
{
    private final double value;

    public NumberConstant(double value)
    {
        this.value = value;
    }

    public NumberConstant add(NumberConstant number)
    {
        return new NumberConstant(value + number.value);
    }

    public NumberConstant sub(NumberConstant number)
    {
        return new NumberConstant(value - number.value);
    }

    public NumberConstant mul(NumberConstant number)
    {
        return new NumberConstant(value * number.value);
    }

    public NumberConstant div(NumberConstant number)
    {
        return new NumberConstant(value / number.value);
    }

    public NumberConstant pow(NumberConstant number)
    {
        return new NumberConstant(Math.pow(value, number.value));
    }

    public NumberConstant mod(NumberConstant number)
    {
        return new NumberConstant(value % number.value);
    }

    public BooleanConstant less(NumberConstant number)
    {
        return new BooleanConstant(value < number.value);
    }

    public BooleanConstant lessEqual(NumberConstant number)
    {
        return new BooleanConstant(value <= number.value);
    }

    public BooleanConstant greater(NumberConstant number)
    {
        return new BooleanConstant(value > number.value);
    }

    public BooleanConstant greaterEqual(NumberConstant number)
    {
        return new BooleanConstant(value >= number.value);
    }

    @Override
    public NumberConstant asNumber()
    {
        return this;
    }

    @Override
    public StringConstant asString()
    {
        return new StringConstant(String.valueOf(value));
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return new BooleanConstant(Double.compare(value, 0) != 0);
    }

    @Override
    public ArrayConstant asArray()
    {
        return null; // TODO
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        else if ((o == null) || (getClass() != o.getClass()))
        {
            return false;
        }

        NumberConstant that = (NumberConstant) o;

        return Double.compare(that.value, value) == 0;

    }

    @Override
    public int hashCode()
    {
        long temp = Double.doubleToLongBits(value);

        return (int) (temp ^ (temp >>> 32));
    }
}