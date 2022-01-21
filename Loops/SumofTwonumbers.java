package LoopsEx;

import java.util.Scanner;

public class SumofTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,sum;
		char choice;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("enter first number :");
		n1=s.nextInt();
		System.out.println("enter second number :");
		n2=s.nextInt();
		sum=n1+n2;
		System.out.println("sum is :"+sum);
		
		System.out.println("Do you want to continue y/n ?");
		choice=s.next().charAt(0);
		System.out.println();
		}while(choice=='y' || choice=='Y');

	}

}
