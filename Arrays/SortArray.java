
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner arr = new Scanner(System.in);
		int i,j,k;
		System.out.print("Enter the length of an array: ");
		int z = arr.nextInt();
		int[] a = new int[z];
		int[] b = new int[z];
		System.out.println("Enter the elements of Array");
		for(i=0; i<a.length;i++)
		{
			a[i]=arr.nextInt();
			b[i]= a[i];
			
		}
		for(j=0;j<a.length;j++) 
		{
			for(k=j+1;k<a.length;k++)
			{
				if(a[j]>a[k]) 
				{
					int temp = a[j]; 
					a[j] = a[k];   
					a[k] = temp;  
				}
			}
		}
		
		System.out.println("Array After sorting :"+ (Arrays.toString(a)));
	}

}


