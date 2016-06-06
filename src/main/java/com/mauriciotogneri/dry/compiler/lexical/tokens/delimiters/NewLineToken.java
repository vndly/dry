package com.mauriciotogneri.dry.compiler.lexical.tokens.delimiters;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class NewLineToken extends Token
{
    public NewLineToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    public boolean isNewLine()
    {
        return true;
    }
}