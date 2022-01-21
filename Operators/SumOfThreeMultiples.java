package OperatorsEx;
import java.util.Scanner;
public class SumOfThreeMultiples {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int sum_of_threemul=0;
				int sum_of_fivemul=0;
		for(int i=100;i<=200;i++)//1    3<=200   sop  3
		{
			if(i%3==0) sum_of_threemul+=i;//0=0+101=101+
			
			else if(i%5==0) sum_of_fivemul+=i;//0=0+100=100
			
				
		}
		System.out.println(sum_of_threemul+"             "+sum_of_fivemul);
	}
}
