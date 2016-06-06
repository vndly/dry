package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionBinaryNode extends ExpressionNode
{
    protected final TreeNode left;
    protected final TreeNode right;

    public ExpressionBinaryNode(Token token, TreeNode left, TreeNode right)
    {
        super(token);

        this.left = left;
        this.right = right;
    }

    @Override
    public List<TreeNode> children()
    {
        return new ArrayList<TreeNode>()
        {{
            add(left);
            add(right);
        }};
    }
}