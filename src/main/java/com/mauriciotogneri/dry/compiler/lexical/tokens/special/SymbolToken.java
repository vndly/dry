package com.mauriciotogneri.dry.compiler.lexical.tokens.special;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class SymbolToken extends Token
{
    public SymbolToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isSymbol()
    {
        return true;
    }
}