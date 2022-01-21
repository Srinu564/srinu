import java.util.*;
	public class NameShrinking {

		public static String getFormattedString(String fn,String mn,String ln)
		{
			char ch1 = mn.charAt(0);
			char ch2 = fn.charAt(0);
			System.out.println(ln+" "+ch1+"."+ch2);
			return fn;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			String fn = scan.next();
			String mn = scan.next();
			String ln = scan.next();
			
			getFormattedString(fn,mn,ln);             
			
		}
		

	}



