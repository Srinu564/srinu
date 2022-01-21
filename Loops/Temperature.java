package LoopsEx;


import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner temperature = new Scanner(System.in);
		
		System.out.print("Enter the Temperature in centigrade :");
		float temp = temperature.nextFloat();
		
		if((temp>16f)&&(temp<=36f))
		{
			System.out.println("Temperature is Very Cool");
		}
		else if(temp<=16f)
		{
			System.out.println("Temperature is Cool");
		}
		else
		{
			System.out.println("Temperature is Hot");
		}
	}

}

