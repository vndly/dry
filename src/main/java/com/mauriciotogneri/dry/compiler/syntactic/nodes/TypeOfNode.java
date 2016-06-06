package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;

public class TypeOfNode extends ExpressionBinaryNode
{
    public TypeOfNode(Token token, TreeNode name, TreeNode type)
    {
        super(token, name, type);
    }

    @Override
    public boolean isTypeOf()
    {
        return true;
    }

    @Override
    public String sourceCode()
    {
        return String.format("%s %s", right.sourceCode(), left.sourceCode());
    }
}