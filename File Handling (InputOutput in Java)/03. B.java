// read  the whole content from the file "123.txt" using Buffered Input Stream

import java.io.*;
import  java.util.*;

class B{
	public static void main(String args[]) throws IOException 
	{
		FileInputStream fis = new FileInputStream("123.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int x = 0;
		
		while((x = bis.read())  !=  -1)
		{ 
			System.out.print((char)x);
		}
		
		bis.close(); 
	}
}
