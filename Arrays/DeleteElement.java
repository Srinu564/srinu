import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter index num");
		Scanner s=new Scanner(System.in);
		int index=s.nextInt();
		
		int[] num= {10,20,30,40,50,60,70};
		
		int[] arr=new int[num.length-1];
		for(int i=0;i<num.length-1;i++)
		{
			if(i<index)
			{
				arr[i]=num[i];
			}
			else if(i>=index)
			{
				arr[i]=num[i+1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

