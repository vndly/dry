package com.mauriciotogneri.dry.compiler.runtime.constant;

import java.util.Collection;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ArrayConstant extends Constant
{
    private final SortedMap<String, Constant> value = new TreeMap<>();

    public ArrayConstant()
    {
    }

    public ArrayConstant(List<Constant> values)
    {
        int size = values.size();

        for (int i = 0; i < size; i++)
        {
            this.value.put(String.valueOf(i), values.get(i));
        }
    }

    public ArrayConstant(String key, Constant value)
    {
        this.value.put(key, value);
    }

    public Collection<Constant> value()
    {
        return value.values();
    }

    public Constant get(String key)
    {
        if (value.containsKey(key))
        {
            return value.get(key);
        }
        else
        {
            return UndefinedConstant.INSTANCE;
        }
    }

    public ArrayConstant set(String key, Constant constant)
    {
        value.put(key, constant);

        return this;
    }

    @Override
    public NumberConstant asNumber()
    {
        throw new RuntimeException();
    }

    @Override
    public StringConstant asString()
    {
        throw new RuntimeException();
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return new BooleanConstant(!value.isEmpty());
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

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (Constant element : value.values())
        {
            if (builder.length() != 0)
            {
                builder.append(", ");
            }

            builder.append(element.toString());
        }

        return String.format("[%s]", builder.toString());
    }
}