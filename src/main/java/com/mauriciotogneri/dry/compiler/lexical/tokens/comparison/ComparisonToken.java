package com.mauriciotogneri.dry.compiler.lexical.tokens.comparison;

import com.mauriciotogneri.dry.compiler.lexical.Lexeme;
import com.mauriciotogneri.dry.compiler.lexical.Token;

public class ComparisonToken extends Token
{
    public ComparisonToken(Lexeme lexeme)
    {
        super(lexeme);
    }

     @Override
     public boolean isComparison()
     {
         return true;
     }
}