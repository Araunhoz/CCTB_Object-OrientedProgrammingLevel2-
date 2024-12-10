import java.util.Scanner;

public class InputVariables {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		String input = en.nextLine();
	    
		System.out.println("Insert a Boolean: ");
		boolean bool = en.hasNext();
		System.out.println("Insert a Byte: ");
		byte byt = en.nextByte(0);  
		System.out.println("Insert a Char: ");
		char c = en.next().charAt(0);
		System.out.println("Insert a Short: ");
		short sh = en.nextShort();
		System.out.println("Insert Int: ");
		int in = en.nextInt();
		System.out.println("Insert a Long: ");
		long lon = en.nextLong();
		System.out.println("Insert a Float: ");
		float flo = en.nextFloat();
		System.out.println("Insert a Double:");
		double doub = en.nextDouble();
		
		System.out.println(bool);
		System.out.println(byt);
		System.out.println(c);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lon);
		System.out.println(flo);
		System.out.println(doub);
		
	}

}
