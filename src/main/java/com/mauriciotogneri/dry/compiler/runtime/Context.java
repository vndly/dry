package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;

import java.util.HashMap;
import java.util.Map;

public class Context
{
    private final Map<String, Constant> variables = new HashMap<>();
}