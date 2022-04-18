/*  9. Create two dimensional integer array and insert, search and traverse this array.
       Note: Use Scanner class to insert data.
*/


package com.company;
import java.util.Scanner;

public class Array 
{
    public static void main(String[] args)
    {
        int rows, col, flag = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no. of rows : ");
        rows = s.nextInt();

        System.out.print("Enter the no. of columns : ");
        col = s.nextInt();

        int arr[][] = new int[rows][col];

        System.out.println("\nEnter the elements in the array : ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("\nElements in the array are : ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the element which you want searched : ");
        int ele = s.nextInt();

        // for searching element
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(arr[i][j] == ele)
                    flag = 1;
            }
        }

        if(flag != 0)
            System.out.println("Element Found.");
        else
            System.out.println("Element not Found!!!");
    }
}


