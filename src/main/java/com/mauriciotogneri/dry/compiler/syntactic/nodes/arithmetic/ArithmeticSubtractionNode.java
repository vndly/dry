package com.mauriciotogneri.dry.compiler.syntactic.nodes.arithmetic;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.compiler.syntactic.nodes.ExpressionBinaryNode;

public class ArithmeticSubtractionNode extends ExpressionBinaryNode
{
    public ArithmeticSubtractionNode(Token token, TreeNode left, TreeNode right)
    {
        super(token, left, right);
    }

    @Override
    public String sourceCode()
    {
        return String.format("sub(%s, %s)", left.sourceCode(), right.sourceCode());
    }
}