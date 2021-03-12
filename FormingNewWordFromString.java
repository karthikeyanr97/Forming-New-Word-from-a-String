import java.util.Scanner;

public class FormingNewWordFromString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String word = scanner.nextLine();
		System.out.println("Enter the positive integer:");
		int number = scanner.nextInt();
		String res = formNewWord(word, number);

		System.out.println(res);

		scanner.close();
	}
}

class UserMainCode {
	public static String formNewWord(String word, int number) {
		if (!(word.length() >= 2 * number))
			return "invalid input";
		else
			return word.substring(0, number) + word.substring(word.length() - number);
	}
}