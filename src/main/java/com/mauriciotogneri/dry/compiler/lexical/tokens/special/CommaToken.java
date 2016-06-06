package com.mauriciotogneri.dry.compiler.lexical.tokens.special;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class CommaToken extends Token
{
    public CommaToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isComma()
    {
        return true;
    }
}