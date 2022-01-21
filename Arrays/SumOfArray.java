import java.util.Arrays;
import java.util.Scanner;

	public class SumOfArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			int[] arr1 = new int[5];
			int[] arr2 = new int[5];
			int i,j;
			int[] sum = new int[5];
			
			System.out.println("Enter the array values :");
			for(i=0; i<arr1.length; i++)
			{
				arr1[i] = scan.nextInt();
				arr2[i] = scan.nextInt();
			}
			for(j=0; j<arr2.length; j++) {
				
				sum[j]=arr1[j]+arr2[j];
			}
			for(int Array1 : arr1)
				System.out.print(Array1+" ");
			System.out.println();
			for(int Array1 : arr2)
				System.out.print(Array1+" ");
			System.out.println();
				
			System.out.println("The sum of two arrays are "+(Arrays.toString(sum)));
		

	}
	
}
