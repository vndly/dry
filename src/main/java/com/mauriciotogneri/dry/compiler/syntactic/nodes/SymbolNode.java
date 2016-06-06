package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;

public class SymbolNode extends ExpressionNode
{
    public SymbolNode(Token token)
    {
        super(token);
    }

    @Override
    public boolean isSymbol()
    {
        return true;
    }

    @Override
    public String sourceCode()
    {
        return token.lexeme();
    }
}