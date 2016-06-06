package com.mauriciotogneri.dry.compiler.lexical.tokens.special;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class TypeReturnToken extends Token
{
    public TypeReturnToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isTypeOf()
    {
        return true;
    }
}