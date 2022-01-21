package LoopsEx;

import java.util.Scanner;
import java.util.Scanner;

public class PositivePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=2;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a positive number");
		n=s1.nextInt();
		if(n>0)
		{
			if(n%i==0)
			{
				System.out.println("the number is prime: "+n);
			}
			else
				System.out.println("not a prime number");
			
			
		}
		else
			System.out.println("please enter a positive number ");
			
	}

}
