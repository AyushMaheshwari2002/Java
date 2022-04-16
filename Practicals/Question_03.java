// 3. Write a program to sum two numbers. Here inputs are provided through command line argument.


package com.company;

public class Sum_of_Two_Numbers {
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("Sum of two number through Command Line Argument is : " + sum);
    }
}


