package com.mauriciotogneri.dry.compiler.lexical.tokens.arithmetic;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class ArithmeticToken extends Token
{
    public ArithmeticToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isArithmetic()
    {
        return true;
    }
}