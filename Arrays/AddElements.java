import java.util.Scanner;
public class AddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		int n=0;
		System.out.println("enter array values:");
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=s.nextInt();
			n=n+arr[j];
		}
		System.out.println("the total sum is :"+n);
	}


}