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

    public List<Constant> value()
    {
        List<String> keys = new ArrayList<>();
        keys.addAll(value.keySet());
        Collections.sort(keys, String::compareTo);

        return keys.stream().map(value::get).collect(Collectors.toList());
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