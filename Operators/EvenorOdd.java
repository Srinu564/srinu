package OperatorsEx;

public class EvenorOdd {
	public static Boolean even(int num)
	   {
		   return (num&1)== 0;              
	   }
	   public static Boolean odd(int num)
	   {
		   return (num&1)== 1;               
	   }
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	          
			System.out.println(even(2));
			System.out.println(odd(6));
			
		}
}
