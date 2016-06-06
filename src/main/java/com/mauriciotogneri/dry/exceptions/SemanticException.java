package com.mauriciotogneri.dry.exceptions;

import com.mauriciotogneri.dry.compiler.lexical.Token;

public class SemanticException extends CompilationException
{
    public SemanticException(String message, Token token)
    {
        super(message + " '" + token + "' at: [" + token.line() + ", " + token.column() + "]");
    }

    public SemanticException(String message)
    {
        super(message);
    }
}