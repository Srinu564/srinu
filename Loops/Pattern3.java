package LoopsEx;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int a=8;
		for(int i=1; i<=5; i++)
		{
			for(int s =1; s<=a; s++)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=k; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			k+=2;
			a-=2;
		}
	}
}
