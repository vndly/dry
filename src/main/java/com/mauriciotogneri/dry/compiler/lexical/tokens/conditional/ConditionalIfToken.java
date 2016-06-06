package com.mauriciotogneri.dry.compiler.lexical.tokens.conditional;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;

public class ConditionalIfToken extends ConditionalToken
{
    public ConditionalIfToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isIf()
    {
        return true;
    }
}