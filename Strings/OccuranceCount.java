import java.util.Scanner;
public class OccuranceCount {

	public static int countWords(String str, String word)
	{
		int num=0;
		String[] arrofstr = str.split(" ");  
		for(String words : arrofstr)
		{
			if(word.equals(words))       
			{
				num++;
			}
		}
		System.out.println(num);
		
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String word = scan.next();
		countWords(str,word);
	}

}

