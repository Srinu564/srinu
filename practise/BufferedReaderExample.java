package FileHandling;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter your name :");
		String name=br.readLine();
		System.out.println("WELCOME	"+name);

	}

}
