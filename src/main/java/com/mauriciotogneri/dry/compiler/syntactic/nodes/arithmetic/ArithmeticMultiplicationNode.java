package com.mauriciotogneri.dry.compiler.syntactic.nodes.arithmetic;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.compiler.syntactic.nodes.ExpressionBinaryNode;

public class ArithmeticMultiplicationNode extends ExpressionBinaryNode
{
    public ArithmeticMultiplicationNode(Token token, TreeNode left, TreeNode right)
    {
        super(token, left, right);
    }

    @Override
    public String sourceCode()
    {
        return String.format("mul(%s, %s)", left.sourceCode(), right.sourceCode());
    }
}