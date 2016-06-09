package com.mauriciotogneri.dry.compiler.runtime.constant;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.Expression;

public abstract class Constant implements Expression
{
    public abstract NumberConstant asNumber();

    public abstract StringConstant asString();

    public abstract BooleanConstant asBoolean();

    @Override
    public Constant evaluate(Context context)
    {
        return this;
    }
}