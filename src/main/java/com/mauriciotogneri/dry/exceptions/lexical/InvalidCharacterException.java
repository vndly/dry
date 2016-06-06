package com.mauriciotogneri.dry.exceptions.lexical;

import com.mauriciotogneri.dry.compiler.lexical.Character;
import com.mauriciotogneri.dry.exceptions.CompilationException;

public class InvalidCharacterException extends CompilationException
{
    public InvalidCharacterException(Character character)
    {
        super("Invalid character '" + character + "' at: [" + character.line() + ", " + character.column() + "]");
    }
}