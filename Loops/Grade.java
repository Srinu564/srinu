package LoopsEx;


import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner grd = new Scanner(System.in);
		
		System.out.print("Enter the Grade of the student : ");
		char grade = grd.next().charAt(0);
		
		switch(grade)
		{
		case 'A':
			System.out.println("You have choosen : Average");
			break;
		case 'E':
			System.out.println("You have choosen : Excellent");
			break;	
		case 'V':
			System.out.println("You have choosen : Very Good");
			break;
		case 'G':
			System.out.println("You have choosen : Good");
			break;
		case 'F':
			System.out.println("You have choosen : Fail");
			break;
		default:
			System.out.println("Enter the valid grade");
		}
	
	}

}
