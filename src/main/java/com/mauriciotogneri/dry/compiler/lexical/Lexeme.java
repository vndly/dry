package com.mauriciotogneri.dry.compiler.lexical;

import com.mauriciotogneri.dry.compiler.lexical.base.Position;

public class Lexeme implements Position
{
    private final String value;
    private final Position position;

    public Lexeme(String value, Position position)
    {
        this.value = value;
        this.position = position;
    }

    public Lexeme appended(Character character)
    {
        return new Lexeme(value + character.toString(), position);
    }

    public boolean matches(String pattern)
    {
        return value.matches(pattern);
    }

    @Override
    public int line()
    {
        return position.line();
    }

    @Override
    public int column()
    {
        return position.column();
    }

    @Override
    public String toString()
    {
        return value;
    }
}