package LoopsEx;

import java.util.Scanner;

public class FactorialOfNumber{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a  number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
			fact=fact*i;
		System.out.println(fact);
			
	}

}
