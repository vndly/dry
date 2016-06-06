package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;

public class AssignmentNode extends ExpressionBinaryNode
{
    public AssignmentNode(Token token, TreeNode definition, TreeNode expression)
    {
        super(token, definition, expression);
    }

    @Override
    public String sourceCode()
    {
        return String.format("%s = %s", left.sourceCode(), right.sourceCode());
    }
}