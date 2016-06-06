package com.mauriciotogneri.dry.compiler.lexical.tokens.conditional;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;

public class ConditionalEndIfToken extends ConditionalToken
{
    public ConditionalEndIfToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isEndIf()
    {
        return true;
    }
}