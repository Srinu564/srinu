package CalculatorPackage;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BasicCalculator {
	
	 
	public void Calculation() throws NumberFormatException, IOException 
	 {
		{
			boolean repeat;
		
			
			do
			{
				 
					double Firstnum=0;
					double Secondnum=0;
				 
				  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				 
				  System.out.println("Enter First number : ");
				  
				  try
				  {
					  Firstnum=Double.valueOf(br.readLine());
					 
				  }
				  catch(NumberFormatException e)
				  {
					  System.out.println("PLEASE ENTER NUMERIC VALUES");
					  System.exit(0);
				  }
		 
				System.out.println("Select Operation:");
				System.out.println(" + for ADDITION");
				System.out.println(" - for SUBTRACTION");
				System.out.println(" * for MULTIPLICATION");
				System.out.println("/ for DIVISION");
				String Boperator=br.readLine();
				
				System.out.println("Enter Second number :");
				
				try
				{
					Secondnum=Double.valueOf(br.readLine());
					
				}
				catch(NumberFormatException e)
				{
					System.out.println("PLEASE ENTER NUMERIC VALUE");
					System.exit(0);
				}
				
				if(Boperator.length()==1)
				{
					Calculations c=new Calculations(Firstnum,Boperator.charAt(0),Secondnum);
					c.doCalculations();
					c.getResult();
				}
				else
				{
					System.out.println("INVALID OPERATION ");
				}
				System.out.println("Calculate Again  y/n ");
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

	
	
	

}
