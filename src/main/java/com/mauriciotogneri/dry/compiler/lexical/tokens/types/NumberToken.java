package com.mauriciotogneri.dry.compiler.lexical.tokens.types;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class NumberToken extends Token
{
    public NumberToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isNumber()
    {
        return true;
    }
}