package com.mauriciotogneri.dry.compiler.lexical.tokens.blocks;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class ParenthesisOpenToken extends Token
{
    public ParenthesisOpenToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isOpenParenthesis()
    {
        return true;
    }
}