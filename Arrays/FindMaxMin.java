import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of elements:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int arr[]=new int[num];
		int large=0,small=0;
		System.out.println("enter elements:");
		for(int n=0;n<num;n++)
		{
			arr[n]=s.nextInt();
		}
		large=small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
			else if(arr[i]<small)
			{
				small=arr[i];
			}
		
		}
		System.out.println();
		System.out.println("large :"+large);
		System.out.println("small :"+small);
		
	}

}
