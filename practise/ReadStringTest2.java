package FileHandling;

import java.io.Console;

public class ReadStringTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Console c=System.console();
		 System.out.println("Enter Your Name :");
		//char[] ch=c.readPassword();
		 String n=c.readLine(); //String.valueOf(ch);
		 System.out.println("Welcome"+n);
		
		

	}

}
