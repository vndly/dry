package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionUnaryNode extends ExpressionNode
{
    protected final TreeNode expression;

    public ExpressionUnaryNode(Token token, TreeNode expression)
    {
        super(token);

        this.expression = expression;
    }

    @Override
    public List<TreeNode> children()
    {
        return new ArrayList<TreeNode>()
        {{
            add(expression);
        }};
    }
}