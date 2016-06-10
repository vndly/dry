package com.mauriciotogneri.dry.compiler.runtime.constant;

public class UndefinedConstant extends Constant
{
    public static final Constant INSTANCE = new UndefinedConstant();

    private UndefinedConstant()
    {
    }

    @Override
    public NumberConstant asNumber()
    {
        return new NumberConstant(0);
    }

    @Override
    public StringConstant asString()
    {
        return new StringConstant("");
    }

    @Override
    public BooleanConstant asBoolean()
    {
        return new BooleanConstant(false);
    }

    @Override
    public ArrayConstant asArray()
    {
        return new ArrayConstant();
    }

    @Override
    public String toString()
    {
        return "undefined";
    }
}