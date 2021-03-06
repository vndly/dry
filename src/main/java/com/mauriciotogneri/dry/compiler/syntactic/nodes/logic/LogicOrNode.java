package com.mauriciotogneri.dry.compiler.syntactic.nodes.logic;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.compiler.syntactic.nodes.ExpressionBinaryNode;

public class LogicOrNode extends ExpressionBinaryNode
{
    public LogicOrNode(Token token, TreeNode left, TreeNode right)
    {
        super(token, left, right);
    }

    @Override
    public String sourceCode()
    {
        return String.format("%s || %s", left.sourceCode(), right.sourceCode());
    }
}