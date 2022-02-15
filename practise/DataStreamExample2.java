package FileHandling;

import java.io.*;

public class DataStreamExample2 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		InputStream input=new FileInputStream("Demo.txt");
		DataInputStream ip=new DataInputStream(input);
		int count=ip.available();
		//System.out.println( count=ip.available());
		byte[] ary=new byte[count];
		ip.read(ary);
		//System.out.println(ip.read(ary));
		for(byte bt:ary)
		{
			
			char k=(char)bt;
			System.out.println(k+"-");
		}
		ip.close();
	}

}
