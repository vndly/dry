package com.mauriciotogneri.dry.compiler.lexical.tokens.types;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class BooleanToken extends Token
{
    public BooleanToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isBoolean()
    {
        return true;
    }
}