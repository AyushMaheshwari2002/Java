/*  7. Apply following functions on StringBuffer object "HELLO"
       (i) Append "Java"
       (ii) Insert "Java" at index 1
       (iii) Replace with "Java" with characters between index 1 to 2
       (iv) Delete characters between index 1 and 2
       (v) Reverse the string "HELLO"
*/


package com.company;

public class Functions_on_StringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Hello");
        s.append(" Java");
        System.out.println(s);

        s = new StringBuffer("Hello");
        s.insert(1, "Java");
        System.out.println(s);

        s = new StringBuffer("Hello");
        s.replace(1, 3, "Java");
        System.out.println(s);

        s = new StringBuffer("Hello");
        s.delete(1, 3);
        System.out.println(s);

        s = new StringBuffer("Hello");
        s.reverse();
        System.out.println(s);
    }
}


