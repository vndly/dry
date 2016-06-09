package com.mauriciotogneri.dry.compiler.runtime.constant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayConstant extends Constant
{
    private final Map<String, Constant> value = new HashMap<>();

    public ArrayConstant(List<Constant> values)
    {
        int size = values.size();

        for (int i = 0; i < size; i++)
        {
            this.value.put(String.valueOf(i), values.get(i));
        }
    }

    @Override
    public NumberConstant asNumber()
    {
        return null; // TODO
    }

    @Override
    public StringConstant asString()
    {
        return null; // TODO
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return null; // TODO
    }

    @Override
    public ArrayConstant asArray()
    {
        return this;
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

        ArrayConstant that = (ArrayConstant) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }
}