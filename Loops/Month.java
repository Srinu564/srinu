package LoopsEx;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		
		System.out.print("Enter the month : ");
		
		int month = m.nextInt();
		
		switch(month)
		{
		case 1 : 
		case 3:
		case 5 : 
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("31 DAYS");
		break;
		case 4 : 
		case 6 : 
		case 9 :
		case 11: System.out.println("30 DAYS");
		break;
		case 2 : System.out.println("28 DAYS");
		break;
		default: System.out.println("Enter the valid month");
		}
	}

}
