/*  6. Apply following functions on the String "Java".
       (i) Try to concat "Welcome" and write down your observation.
       (ii) Find character at index 1
       (iii) Find index of first 'a'.
       (iv) Find index of second 'a'
       (v) Compare "Java" to "JAVA"
       (vi) Compare "Java" to "JAVA" ignoring the case
       (vii) Find the index of first 'a' from last
*/



package com.company;

public class String_Functions
{
    public static void main(String[] args)
    {
        String str = "Java";

        System.out.println(str.concat(" Welcome"));

        System.out.println(str.charAt(1));

        System.out.println(str.indexOf("a"));

        System.out.println(str.indexOf("a", str.indexOf("a") + 1));

        System.out.println(str.equals("JAVA"));

        System.out.println(str.equalsIgnoreCase("JAVA"));

        System.out.println(str.lastIndexOf('a'));
    }
}


