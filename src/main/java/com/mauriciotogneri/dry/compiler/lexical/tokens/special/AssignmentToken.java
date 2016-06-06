package com.mauriciotogneri.dry.compiler.lexical.tokens.special;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class AssignmentToken extends Token
{
    public AssignmentToken(Lexeme lexeme)
    {
        super(lexeme);
    }

    @Override
    public boolean isAssignment()
    {
        return true;
    }
}