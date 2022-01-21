package LoopsEx;
import java.util.Scanner;

public class checkCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner ch = new Scanner(System.in);
      
      System.out.print("Enter the character :");
      char c = ch.next().charAt(0);
      
      if((c >= 97 && c <= 122) || (c >= 65 && c <= 90))
      {
    	  System.out.println(c+ " is a Alphabet"); 
      }
      else if(c >= 48 && c <= 57)
      {
    	  System.out.println(c+ " is a Number"); 
      }
      else
      {
    	  System.out.println(c+ " is a Special Character");  
      }

	}

}
