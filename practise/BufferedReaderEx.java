package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("sample.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1)
		{
			
			System.out.println((char)i);
		}
		br.close();
		fr.close();
	}

}
