package com.mauriciotogneri.dry;

import java.io.File;

public class Dry
{
    public static void main(String[] args) throws Exception
    {
        File scriptPath = new File(args[0]);
        System.out.println("Script: " + scriptPath.getCanonicalPath());

        for (int i = 1; i < args.length; i++)
        {
            System.out.println("Parameter: " + args[i]);
        }
    }
}