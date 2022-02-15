package FileHandling;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class BufferedReaderExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String name="";
		while(!name.equals("stop"))
		{
			System.out.println("Enter Data :");
			name=br.readLine();
			System.out.println("Data is :  "+name);
		}
		br.close();
		r.close();
	}

}
