package com.mauriciotogneri.dry.compiler.syntactic.nodes;

import com.mauriciotogneri.dry.compiler.lexical.Token;
import com.mauriciotogneri.dry.compiler.syntactic.TreeNode;
import com.mauriciotogneri.dry.experiment.Runtime.AnyOperations;

import java.util.ArrayList;
import java.util.List;

import static com.mauriciotogneri.dry.experiment.Runtime.NumberOperations.mul;
import static com.mauriciotogneri.dry.experiment.Runtime.NumberOperations.sub;

public class FunctionDefNode extends TreeNode
{
    private final List<TreeNode> parameters;
    private final TreeNode returnType;
    private final TreeNode body;

    private FunctionDefNode(Token token, List<TreeNode> parameters, TreeNode returnType, TreeNode body)
    {
        super(token);

        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public FunctionDefNode(Token token)
    {
        this(token, new ArrayList<>(), null, null);
    }

    public FunctionDefNode withTypes(List<TreeNode> parameters, TreeNode returnType)
    {
        return new FunctionDefNode(token, parameters, returnType, body);
    }

    public FunctionDefNode withBody(TreeNode body)
    {
        return new FunctionDefNode(token, parameters, returnType, body);
    }

    @Override
    public boolean isFunctionDef()
    {
        return true;
    }

    @Override
    public List<TreeNode> children()
    {
        return new ArrayList<TreeNode>()
        {{
            addAll(parameters);
            add(returnType);
            add(body);
        }};
    }

    public static Number factorial(Number n)
    {
        if (AnyOperations.equal(n, 0))
        {
            return 1;
        }
        else
        {
            return mul(n, factorial(sub(n, 1)));
        }
    }

    @Override
    public String sourceCode()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("public static %s %s", returnType.sourceCode(), token.lexeme().substring(1)));

        if (!parameters.isEmpty())
        {
            builder.append("(");

            for (int i = 0; i < parameters.size(); i++)
            {
                if (i != 0)
                {
                    builder.append(", ");
                }

                builder.append(parameters.get(i).sourceCode());
            }

            builder.append(")\n");
        }

        builder.append("{\n");
        builder.append(String.format("%s", body.sourceCode()));
        builder.append("}\n");

        return builder.toString();
    }
}