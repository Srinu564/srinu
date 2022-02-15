package Arrays;


	import java.util.Scanner;
	

	public class TwoDimensional {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[][] marks= new int[][]{
			{2,70},
			{3,60},
			{4,75},
			{1,78}
	};

	System.out.println(marks[2][1]);
	marks[3][1]=100;
	System.out.println(marks[3][1]);

	/*for(int i=0;i<marks.length;i++)//4<4 
	{
		for(int j=0;j<2;j++)//0<2
		{
			System.out.print(marks[i][j]+" ");//marks[3][0]
		}
		System.out.println();*/
	
	Scanner sn=new Scanner(System.in);

	/*double[][] marks1=new double[4][3];

	for(int i=0;i<marks1.length;i++)//4<4 
	{
		for(int j=0;j<3;j++)//0<2
		{
			marks1[i][j]=sn.nextDouble();
		}
	}*/
	
	}
}
