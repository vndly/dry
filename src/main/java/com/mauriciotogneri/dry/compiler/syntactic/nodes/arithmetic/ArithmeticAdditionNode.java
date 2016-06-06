package com.mauriciotogneri.dry.compiler.syntactic.nodes.arithmetic;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.compiler.syntactic.nodes.ExpressionBinaryNode;

public class ArithmeticAdditionNode extends ExpressionBinaryNode
{
    public ArithmeticAdditionNode(Token token, TreeNode left, TreeNode right)
    {
        super(token, left, right);
    }

    @Override
    public String sourceCode()
    {
        return String.format("add(%s, %s)", left.sourceCode(), right.sourceCode());
    }
}