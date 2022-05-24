//  Take input from the user and write the data in the file "out.txt"

import java.io.*;
import  java.util.*;

class D{
	public static void main(String args[]) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("output.txt");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bos = new BufferedReader(isr);
		
		System.out.print("Enter a string : ");
		String s = bos.readLine();
		
		byte b[] = s.getBytes();
		
		fos.write(b);
		fos.close(); 
	}
}


