package com.mauriciotogneri.dry.exceptions.lexical;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.exceptions.CompilationException;

public class InvalidTokenException extends CompilationException
{
    public InvalidTokenException(Token token)
    {
        super("Invalid token '" + token + "' at: [" + token.line() + ", " + token.column() + "]");
    }
}