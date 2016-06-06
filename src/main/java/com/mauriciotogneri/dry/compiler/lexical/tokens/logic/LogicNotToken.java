package com.mauriciotogneri.dry.compiler.lexical.tokens.logic;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;

public class LogicNotToken extends LogicToken
{
    public LogicNotToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    public boolean isNegation()
    {
        return true;
    }
}