package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;

public class OpenParenthesisNode extends TreeNode
{
    public OpenParenthesisNode(Token token)
    {
        super(token);
    }

    @Override
    public boolean isOpenParenthesis()
    {
        return true;
    }

    @Override
    public String sourceCode()
    {
        throw new RuntimeException();
    }
}