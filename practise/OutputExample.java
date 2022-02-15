package FileHandling;

import java.io.*;

public class OutputExample {
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fis=new FileOutputStream("testout.txt");
		
		DataOutputStream f=new DataOutputStream(fis);
		f.writeInt(99);
		f.flush();
		f.close();
		System.out.println("success....");
		//System.out.println(f.size());
		
		
	}

}
