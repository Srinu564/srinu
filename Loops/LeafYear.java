package LoopsEx;

import java.util.Scanner;
public class LeafYear {
	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year");
		year=s.nextInt();
		if((year%4==0) || (year%400==0)&&(year%100!=0))
		System.out.println("leaf");
		else
		System.out.println("not leaf");
		
		
	}
}
