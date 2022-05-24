// write the data in the file "out.txt" using Buffered Output Stream

import java.io.*;
import  java.util.*;

class C{
	public static void main(String args[]) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("out.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String s = "How r u?";
		byte b[] = s.getBytes();
		
		bos.write(b);
		bos.close(); 
	}
}


