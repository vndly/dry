package com.mauriciotogneri.dry.compiler.runtime.constant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public ArrayConstant(String key, Constant value)
    {
        this.value.put(key, value);
    }

    public List<Constant> value()
    {
        List<String> keys = new ArrayList<>();
        keys.addAll(value.keySet());
        Collections.sort(keys, String::compareTo);

        return keys.stream().map(value::get).collect(Collectors.toList());
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

    public ArrayConstant put(String key, Constant constant)
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
        throw new RuntimeException();
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

        List<Constant> list = value();

        for (Constant element : list)
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