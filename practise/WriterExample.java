package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Writer w=new FileWriter("output.txt");
			String c="I LOVE MY COUNTRY";
			w.write(c);
			w.close();
			System.out.println("DONE..");
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
