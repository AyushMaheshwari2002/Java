// read the first character from the file "123.txt"

import java.io.*;
import  java.util.*;

class ABC {
	public static void main(String args[]) throws IOException 
	{
		FileInputStream fis = new FileInputStream("123.txt");
		int x = fis.read();
		
		System.out.println((char)x);
		
		fis.close(); 
	}
}
