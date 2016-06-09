package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

public interface Statement
{
    Constant execute(Context context);
}