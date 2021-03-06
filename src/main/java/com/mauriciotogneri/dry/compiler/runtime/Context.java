package com.mauriciotogneri.dry.compiler.runtime;

import com.mauriciotogneri.dry.compiler.runtime.constant.ArrayConstant;
import com.mauriciotogneri.dry.compiler.runtime.constant.Constant;
import com.mauriciotogneri.dry.compiler.runtime.constant.UndefinedConstant;
import com.mauriciotogneri.dry.compiler.runtime.variable.Variable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Context
{
    private final Map<String, Constant> variables = new HashMap<>();

    public Context()
    {
    }

    public Context(List<String> parameters, Constant... constants)
    {
        int parametersSize = parameters.size();
        int constantsSize = constants.length;

        for (int i = 0; i < parametersSize; i++)
        {
            String name = parameters.get(i);
            Constant value = (i < constantsSize) ? constants[i] : UndefinedConstant.INSTANCE;

            variables.put(name, value);
        }
    }

    public Constant get(Variable variable)
    {
        if (contains(variable))
        {
            return variables.get(variable.name());
        }
        else
        {
            return UndefinedConstant.INSTANCE;
        }
    }

    public Constant get(Variable variable, Constant key)
    {
        if (contains(variable))
        {
            return get(variable).asArray().get(key.asString().value());
        }
        else
        {
            return UndefinedConstant.INSTANCE;
        }
    }

    public void set(Variable variable, Constant constant)
    {
        variables.put(variable.name(), constant);
    }

    public void set(Variable variable, Constant key, Constant constant)
    {
        String name = variable.name();
        String keyName = key.asString().value();

        if (contains(variable))
        {
            variables.put(name, variables.get(name).asArray().set(keyName, constant));
        }
        else
        {
            variables.put(name, new ArrayConstant(keyName, constant));
        }
    }

    private boolean contains(Variable variable)
    {
        return variables.containsKey(variable.name());
    }
}