package com.mauriciotogneri.dry.compiler.lexical.tokens.conditional;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;

public class ConditionalElseIfToken extends ConditionalToken
{
    public ConditionalElseIfToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isIfElse()
    {
        return true;
    }
}