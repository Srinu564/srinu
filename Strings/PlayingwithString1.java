
import java.util.Scanner;

public class PlayingwithString1 {

	static StringBuffer buf=new StringBuffer();
	public static String pickNthChar(int num, String[] values,int pos)//ABC XYZ EFG MN
	{
		for(String str : values)
		{
			try {
			char ch=str.charAt(pos-1);
			if((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z')){
			buf.append(ch);
			}else {
				buf.append('$');
			}
			}
			catch(StringIndexOutOfBoundsException ex) {
				buf.append('$');
				return buf.toString();
			}
			/*char[] ch=str.toCharArray();
			for(int i=0;i<ch.length;)
			{
				
			}*/
		}
		return  buf.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String[] values=new String[4];
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the size and string array");
		num=sn.nextInt();
		for(int i=0;i<num;i++)
		{
			values[i]=sn.next();
		}
		int pos;
		pos=sn.nextInt();
		
		System.out.println(pickNthChar(num, values,pos));
		
	}

}