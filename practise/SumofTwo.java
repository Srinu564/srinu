package Arrays;


//import java.util.Arrays;
//import java.util.Scanner;

public class SumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner(System.in);
		int[] a1=new int[5];
		int[] a2=new int[5];
		int[] sum=new int[5];
		int i,k;
		System.out.println("enter array :");
		for(i=0;i<a1.length;i++)
		{
			a1[i]=s.nextInt();
			a2[i]=s.nextInt();
		}
		
		
		for(k=0;k<a2.length;k++)
		{
			sum[k]=a1[k]+a2[k];
		}
		System.out.println();*/
		String[][] names= {
				{"qq","ee"},
				{"ss","ff"},
				{"dd","mm"}
				
		};
		for(String[] val : names)
		{
			for(String s : val)
			{
				System.out.println(s);
			}
			System.out.println();
		}

	}

}
