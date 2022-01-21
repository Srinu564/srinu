import java.util.*;
public class ReverseArray6Elements {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scaner = new Scanner(System.in);
			int[] arr = new int[6];
			int[] rev = new int[6];
			System.out.println("Enter the Elements of Array :");
			
			   for(int i=0,j=arr.length-1; i<arr.length;i++,j--)
			   {
				   arr[i]=scaner.nextInt();
					rev[j]= arr[i];			
			   }		
			
			System.out.println(" array Elements after reversed : "+(Arrays.toString(rev)));
		}

	}

