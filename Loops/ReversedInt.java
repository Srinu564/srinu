package LoopsEx;

import java.util.Scanner;

public class ReversedInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0,r;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a number");
		n=s1.nextInt();
		
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
	}

}

