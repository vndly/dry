package com.mauriciotogneri.dry.compiler.runtime.statements;

import com.mauriciotogneri.dry.compiler.runtime.Context;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.Optional;

public interface Statement
{
    Optional<Constant> execute(Context context);
}