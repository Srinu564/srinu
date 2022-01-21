package LoopsEx;

import java.util.Scanner;

public class SumofOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		int number,evensum=0,oddsum=0;
		char choice;
		do {
			System.out.println("enter a number");
			number=console.nextInt();
			if(number%2==0)
			{
				evensum +=number;
			}
			else
			{
				oddsum +=number;
			}
			System.out.println("do you want to contine y/n");
			choice=console.next().charAt(0);
			}while(choice=='y' || choice=='Y');
		
        System.out.println("Sum of even numbers: "+evensum);
        System.out.println("Sum of odd numbers: " +oddsum);


	}

}
