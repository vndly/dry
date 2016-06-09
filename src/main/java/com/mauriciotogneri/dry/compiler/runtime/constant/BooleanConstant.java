package com.mauriciotogneri.dry.compiler.runtime.constant;

import java.util.Arrays;

public class BooleanConstant extends Constant
{
    private final boolean value;

    public BooleanConstant(boolean value)
    {
        this.value = value;
    }

    public BooleanConstant and(BooleanConstant number)
    {
        return new BooleanConstant(value && number.value);
    }

    public BooleanConstant or(BooleanConstant number)
    {
        return new BooleanConstant(value || number.value);
    }

    public BooleanConstant not()
    {
        return new BooleanConstant(!value);
    }

    public boolean value()
    {
        return value;
    }

    @Override
    public NumberConstant asNumber()
    {
        throw new RuntimeException();
    }

    @Override
    public StringConstant asString()
    {
        return new StringConstant(String.valueOf(value));
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return this;
    }

    @Override
    public ArrayConstant asArray()
    {
        return new ArrayConstant(Arrays.asList(this));
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

        BooleanConstant that = (BooleanConstant) o;

        return value == that.value;

    }

    @Override
    public int hashCode()
    {
        return (value ? 1 : 0);
    }
}