import java.util.Scanner;

public class AgeChecker {
	public static void main(String[] args) {
		boolean validate = true;
		Scanner in = new Scanner(System.in);

		int age = 0;
		while (validate == true) {
			if (age <= 0 || age >= 99) {
				System.out.println("Insert a age: ");
				age = in.nextInt();
			} else {
				validate = false;
			}
		}
		in.close();
		if (age >= 21) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are not an adult");

		}
	}
}
