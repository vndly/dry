package com.mauriciotogneri.dry.compiler.lexical.tokens.conditional;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;

public class ConditionalElseToken extends ConditionalToken
{
    public ConditionalElseToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isElse()
    {
        return true;
    }
}