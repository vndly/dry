package com.mauriciotogneri.dry.compiler.lexical.tokens.blocks;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class ParenthesisCloseToken extends Token
{
    public ParenthesisCloseToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isCloseParenthesis()
    {
        return true;
    }
}