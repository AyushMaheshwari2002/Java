/*  10. Create a jagged array having three rows. Where 1st row contains 3 columns, 2nd row contains 4 columns and 3rd row contains 2 columns.
        Insert and traverse it.
*/


package com.company;
import java.util.Scanner;

public class Jagged_Array 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        System.out.println("Enter the elements in the Jagged Array : ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("\nElements in the Jagged Array are : ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}


