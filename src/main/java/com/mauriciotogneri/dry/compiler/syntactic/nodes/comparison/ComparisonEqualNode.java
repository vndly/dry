package com.mauriciotogneri.dry.compiler.syntactic.nodes.comparison;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.compiler.syntactic.nodes.ExpressionBinaryNode;

public class ComparisonEqualNode extends ExpressionBinaryNode
{
    public ComparisonEqualNode(Token token, TreeNode left, TreeNode right)
    {
        super(token, left, right);
    }

    @Override
    public String sourceCode()
    {
        return String.format("equal(%s, %s)", left.sourceCode(), right.sourceCode());
    }
}