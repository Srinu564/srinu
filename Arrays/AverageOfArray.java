
import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = scan.nextInt();
		float[] num = new float[size];
		float sum = 0;
		float avg =0;
		System.out.println("Enter the array input :");
		for(int i=0; i<size; i++)
		{
			num[i] = scan.nextInt();
			sum=sum+num[i];		
		}
		avg = sum/size;	
		System.out.println("The average of array is "+avg);
	}


}
