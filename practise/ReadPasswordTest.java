package FileHandling;

import java.io.Console;

public class ReadPasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c=System.console();
		//System.out.println();
		System.out.println("Enter password :");
		char[] ch=c.readPassword();
		String p=String.valueOf(ch);
		System.out.println("password is :"+p);
		
		
		
	}

}
