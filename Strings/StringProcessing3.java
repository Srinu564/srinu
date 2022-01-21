

import java.util.Scanner;

public class StringProcessing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String str=sn.next();
		String str1=str.replaceAll("[x]", "");
		String str2=str.replaceAll("[^x]", "");
		
		System.out.println(str1+str2);

	}

}
