package LoopsEx;

import java.util.Scanner;

public class Hcfcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor,dividend,remainder,hcf=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number :");
		dividend=s.nextInt();
		System.out.println("enter second number :");
		divisor=s.nextInt();
		do
		{
			remainder=dividend%divisor;
			if(remainder==0)
			{
				hcf=divisor;
			}
			else
			{
				dividend=divisor;
				divisor=remainder;
			}
		}while(remainder!=0);
		System.out.println("Hcf is :"+hcf);
		

	}

}
