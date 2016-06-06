package com.mauriciotogneri.dry.compiler.lexical.tokens.logic;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class LogicToken extends Token
{
    public LogicToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isLogic()
    {
        return true;
    }
}