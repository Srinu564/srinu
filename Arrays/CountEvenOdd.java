public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,3,2,4,5,62,9,44,99};
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
		int count1=0,count2=0;
		for(int i=0;i<num.length;i++)
			if(num[i]%2==0)
			{
				count1+=1;
			}
			else
			{
				count2+=1;
			}
		System.out.println("number of even numbers are :"+count1);
		System.out.println("number of odd numbers are :"+count2);

	}

}
