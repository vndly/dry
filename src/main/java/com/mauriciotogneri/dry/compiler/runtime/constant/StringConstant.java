package com.mauriciotogneri.dry.compiler.runtime.constant;

public class StringConstant extends Constant
{
    private final String value;

    public StringConstant(String value)
    {
        this.value = value;
    }

    @Override
    public NumberConstant asNumber()
    {
        return new NumberConstant(Double.parseDouble(value));
    }

    @Override
    public StringConstant asString()
    {
        return this;
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return null; // TODO
    }

    @Override
    public ArrayConstant asArray()
    {
        return null; // TODO
    }
}