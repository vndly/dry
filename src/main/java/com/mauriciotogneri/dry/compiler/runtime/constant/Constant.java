package com.mauriciotogneri.dry.compiler.runtime.constant;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;

import java.util.List;

public abstract class Constant implements Expression
{
    public abstract NumberConstant asNumber();

    public abstract StringConstant asString();

    public abstract BooleanConstant asBoolean();

    public abstract ArrayConstant asArray();

    public double number()
    {
        return asNumber().value();
    }

    public String string()
    {
        return asString().value();
    }

    public boolean bool()
    {
        return asBoolean().value();
    }

    public List<Constant> array()
    {
        return asArray().value();
    }

    public BooleanConstant equal(Constant constant)
    {
        if (this instanceof NumberConstant)
        {
            return new BooleanConstant(asNumber().equals(constant.asNumber()));
        }
        else if (this instanceof StringConstant)
        {
            return new BooleanConstant(asString().equals(constant.asString()));
        }
        else if (this instanceof BooleanConstant)
        {
            return new BooleanConstant(asBoolean().equals(constant.asBoolean()));
        }
        else if (this instanceof ArrayConstant)
        {
            return new BooleanConstant(asArray().equals(constant.asArray()));
        }

        throw new RuntimeException();
    }

    public BooleanConstant notEqual(Constant constant)
    {
        return equal(constant).not();
    }

    @Override
    public Constant evaluate(Context context)
    {
        return this;
    }
}