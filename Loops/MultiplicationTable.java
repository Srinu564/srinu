package LoopsEx;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a positive number");
		n=s.nextInt();
		for(i=1;i<=10;i++)
		{
			
			System.out.println(n+" x " + i + " = " + (n*i) );
			
		}
		
		
	}

}
