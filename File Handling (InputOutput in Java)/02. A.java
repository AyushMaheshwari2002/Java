// read  the whole content from the file "123.txt"

import java.io.*;
import  java.util.*;

class A{
	public static void main(String args[]) throws IOException 
	{
		FileInputStream fis = new FileInputStream("123.txt");
		int x = 0;
		
		while((x = fis.read())  !=  -1)
		{ 
			System.out.print((char)x);
		}
		
		fis.close(); 
	}
}
