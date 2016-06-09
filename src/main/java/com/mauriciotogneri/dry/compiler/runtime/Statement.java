package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.Optional;

public interface Statement
{
    Optional<Constant> execute(Context context);
}