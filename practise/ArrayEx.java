package Arrays;

public class ArrayEx {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//static array initialization
			int[]  marks= {2,3,4,5,6};
			
			for(int cnt=0;cnt<marks.length;cnt++)
			{
				marks[cnt]=marks[cnt]+10;
			
			}
			
			for(int cnt=0;cnt<marks.length;cnt++)
			{
				System.out.println(marks[cnt]);
				
			}
			/*System.out.println(marks[1]);
			System.out.println(marks[2]);
			System.out.println(marks[3]);
			System.out.println(marks[4]);*/
			
			char[] grades= {'a','b','c','d'};
			
			for(int i=0;i<grades.length;i++)
			{
				System.out.println((char)(grades[i]+1));
			}
			
			String[] names= {"neha","komal","sneha","raju"};
			
			boolean flag=false;
			int pos=-1;
			for(int i=0;i<names.length;i++) {
				if(names[i]=="komal")
				{
					flag=true;
					pos=i;
					break;
					//System.out.println("found");
				}
			}
			if(flag)
			{
				System.out.println("found"+(pos+1));
			}else
				
				System.out.println("not found"+pos);
			
			
			
			
		}


	}




