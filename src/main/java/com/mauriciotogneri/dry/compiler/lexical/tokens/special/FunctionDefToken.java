package com.mauriciotogneri.dry.compiler.lexical.tokens.special;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class FunctionDefToken extends Token
{
    public FunctionDefToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isFunctionDef()
    {
        return true;
    }
}