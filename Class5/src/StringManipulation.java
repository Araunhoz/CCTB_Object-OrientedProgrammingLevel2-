import java.util.Scanner;


public class StringManipulation {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String phrase;
		phrase = in.nextLine();
		
		Integer n = 10;
		int b = n;
		System.out.println(b);
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.length());
		in.close();
	}

}
