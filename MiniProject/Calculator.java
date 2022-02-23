package CalculatorPackage;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Calculator {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Select Calculator : BASIC-B  or SCIENTIFIC-S");
		String option=b.readLine();
		
		
		
		if(option.equals("b") || option.equals("B"))
		{
			BasicCalculator bc=new BasicCalculator();
			bc.Calculation();
			
		}
		
		else if (option.equals("s")  || option.equals("S"))
		{
			ScientificCalculator sc=new ScientificCalculator();
			sc.Calculation();
		}
	
		else 
		{
			System.out.println("Invalid Option");
			System.out.println("Please Enter B or S");
		
		
		}
		
		
		
	}

}

