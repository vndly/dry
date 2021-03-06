package com.mauriciotogneri.dry.compiler.runtime.constant;

import java.util.Arrays;

public class StringConstant extends Constant
{
    private final String value;

    public StringConstant(String value)
    {
        this.value = value;
    }

    public String value()
    {
        return value;
    }

    @Override
    public NumberConstant asNumber()
    {
        try
        {
            return new NumberConstant(Double.parseDouble(value));
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
    }

    @Override
    public StringConstant asString()
    {
        return this;
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return new BooleanConstant(!value.isEmpty());
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

        StringConstant that = (StringConstant) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

    @Override
    public String toString()
    {
        return value;
    }
}