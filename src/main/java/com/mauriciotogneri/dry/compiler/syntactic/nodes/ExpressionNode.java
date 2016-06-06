package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;

public abstract class ExpressionNode extends TreeNode
{
    public ExpressionNode(Token token)
    {
        super(token);
    }

    @Override
    public boolean isExpression()
    {
        return true;
    }
}