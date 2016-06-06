package com.mauriciotogneri.dry.compiler.syntactic;

import com.mauriciotogneri.dry.compiler.lexical.Token;

import java.util.ArrayList;
import java.util.List;

public abstract class TreeNode
{
    protected final Token token;

    public TreeNode(Token token)
    {
        this.token = token;
    }

    public List<TreeNode> children()
    {
        return new ArrayList<>();
    }

    public boolean isExpression()
    {
        return false;
    }

    public boolean isSymbol()
    {
        return false;
    }

    public boolean isTypeOf()
    {
        return false;
    }

    public boolean isFunctionDef()
    {
        return false;
    }

    public boolean isOpenParenthesis()
    {
        return false;
    }

    public abstract String sourceCode();

    public String printPretty(String indent, boolean last)
    {
        String newIndent = indent;
        StringBuilder builder = new StringBuilder();

        builder.append(indent);

        if (last)
        {
            builder.append("└─");
            newIndent += "   ";
        }
        else
        {
            builder.append("├─");
            newIndent += "│ ";
        }

        builder.append(String.format(" %s\n", token));

        List<TreeNode> children = children();

        for (int i = 0; i < children.size(); i++)
        {
            TreeNode child = children.get(i);
            builder.append(child.printPretty(newIndent, i == children.size() - 1));
        }

        return builder.toString();
    }

    @Override
    public String toString()
    {
        return printPretty("", true);
    }
}