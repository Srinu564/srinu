package CalculatorPackage;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class ScientificCalculator extends Calculations{
	
	public void Calculation() throws Exception
	{
		boolean repeat;
		
		do
		{
			double num=0;
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("Select operation:");
			System.out.println("1-sin, 2-cos, 3-tan, 4-sec, 5-cosec, 6-cot");
			System.out.println("S for square root");
			System.out.println("C for cube root"); 
			

			String Soperation=br.readLine();
			
			System.out.println("Enter a value");
			
			try
			{
				num=Double.valueOf(br.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("enter numeric values");
				System.exit(0);
			}
			
			if(Soperation.length()==1)
			{
				Calculations sc=new Calculations(num,Soperation.charAt(0));
				
				sc.doCalculations();
				sc.getResult();
				
			}
			else
			{
				System.out.println("Operation not valid ");
				
			}
			
			
			System.out.println("Calculate Again y/n ");
			char response=(char)br.read();
			
			if(response=='y' || response=='Y')
			{
				repeat=false;
			}
			else
			{
				repeat=true;
			}
			
			
		}while(!repeat);
	}
	
}
