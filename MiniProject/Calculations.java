package CalculatorPackage;

public class Calculations {
	double Dnum;
	double Fnum;
	double Snum; 
	char operator;
	double result;

	public Calculations()
	{
		
	}
	public Calculations(double num,char Soperator)
	{
		
		Dnum=num;
		operator=Soperator;
		
	}
	
	public Calculations(double firstNum, char Boperator,double secondNum) {
		Fnum=firstNum;
		Snum=secondNum;
		operator=Boperator;
		
		
		
	}
	
	
	public void doCalculations() {
		result=0;
		
		switch(operator)
		{
		case '+':
			
			result=Fnum+Snum;
			break;
		case '-':
			
			result=Fnum-Snum;
			break;
		case '*':
			
			result=Fnum*Snum;
			break;
		case '/':
			if(!checkSnum())
			{
				result=Fnum/Snum;
				break;
			}
		
		case '1':
			
			result=Math.sin(Dnum);
			break;
		
		case '2':
			
			result=Math.cos(Dnum);
			break;
		case '3':
			
			result=Math.tan(Dnum);
			break;
		case '4':
			
			result=1/Math.sin(Dnum);;
			break;
		
		case '5':
			result=1/Math.cos(Dnum);;
			break;
		case '6':
			
			result=1/Math.tan(Dnum);
			break;
		
		case 's':
		case 'S':
			
			result=Math.sqrt(Dnum);
			break;
			
		case 'c':
		case 'C':
			
			result=Math.cbrt(Dnum);
			break;
		default:
			
			System.out.println("***Operation not Avaliable *** ");
			break;
			
			
		}
		
	}

	public void getResult() {
		
		System.out.println(result);
	}
	public boolean checkSnum()
	{
		if(Snum==0)
		{
			System.out.println("Zero is not allowed ");
			System.exit(0);
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
}
