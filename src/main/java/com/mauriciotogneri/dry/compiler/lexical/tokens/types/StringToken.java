package com.mauriciotogneri.dry.compiler.lexical.tokens.types;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class StringToken extends Token
{
    public StringToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isNumber()
    {
        return true;
    }
}