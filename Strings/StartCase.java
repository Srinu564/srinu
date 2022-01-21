import java.util.Scanner;

public class StartCase {

	public static String printCapitalized(String str) {

		String words[] = str.split(" ");
		for (String word : words) {
			// Capitalizing First letter
			String firstLetter = word.substring(0, 1);
			// Get remaining letter
			String remainingLetters = word.substring(1);
			System.out.print(firstLetter.toUpperCase() + remainingLetters + " ");
		}

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printCapitalized(str);           

	}

}
