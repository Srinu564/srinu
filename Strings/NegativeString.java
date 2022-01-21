import java.util.Scanner;

public class NegativeString {

	public static String negativeString(String str) {
		String replace = str.replaceAll(" is ", " is not "); 
		System.out.println(replace);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine(); 
		negativeString(str);          

}


}
