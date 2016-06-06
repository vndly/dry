package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;

public class NumberNode extends ExpressionNode
{
    public NumberNode(Token token)
    {
        super(token);
    }

    @Override
    public String sourceCode()
    {
        return token.lexeme();
    }
}