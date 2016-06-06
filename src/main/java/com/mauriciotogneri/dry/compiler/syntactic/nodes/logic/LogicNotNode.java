package com.mauriciotogneri.dry.compiler.syntactic.nodes.logic;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.compiler.syntactic.nodes.ExpressionUnaryNode;

public class LogicNotNode extends ExpressionUnaryNode
{
    public LogicNotNode(Token token, TreeNode expression)
    {
        super(token, expression);
    }

    @Override
    public String sourceCode()
    {
        return String.format("!%s", expression.sourceCode());
    }
}