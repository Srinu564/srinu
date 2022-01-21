package LoopsEx;

import java.util.Scanner;

public class PowerOfNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,power,result=1;
		Scanner console=new Scanner(System.in);
		System.out.println("enter base number");
		base=console.nextInt();
		System.out.println("enter power number");
		power=console.nextInt();
        for(int i = 1; i <= power; i++)
        {
	    result *= base;
        }

        System.out.println("Result: "+ result);
		
	}

}

