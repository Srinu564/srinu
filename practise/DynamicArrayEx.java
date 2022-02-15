package Arrays;

import java.util.Scanner;

public class DynamicArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages=new int[] {12,32,23,22,20,19};
		
		Scanner sn=new Scanner(System.in);
		
		for(int i=0;i<ages.length;i++)
			System.out.println(ages[i]);
		
		ages=new int[3];
		
		for(int j=0;j<ages.length;j++)
			ages[j]=sn.nextInt();
		
		/*for(int j=0;j<ages.length;j++)
			System.out.println(ages[j]);*/
		
		for(int value : ages)
			System.out.println(value);
		
		
		char[] text=new char[] {'a','b','c'};
		
		for(char ch : text)
			System.out.println(ch);
		
		String[] citynames= {"Bangalore","Delhi"};
		for(String names : citynames)
			System.out.println(names);
		
		
		
		
	}	
		
	}
