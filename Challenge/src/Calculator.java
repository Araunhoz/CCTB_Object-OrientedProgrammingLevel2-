import java.util.Scanner;


class Calculator {
	
	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);

		int a, b;
		double r;
		char o;

		System.out.print("Num1: ");
		a = s.nextInt();
		System.out.print("Operator (+,-,*,/): ");
		o = s.next().charAt(0);
		System.out.print("Num2: ");
		b = s.nextInt();
        
		switch(o) {
			case '+':
				r = a + b;
				System.out.println("Result: " + r);
				break;
			
			case '-': 
				r = a - b;
				System.out.println("Result: " + r);
				break;
			
			case '*':
				r = a * b;
				System.out.println("Result: " + r);
				break;
			
			case '/':
				r = a/b;
				System.out.println("Result: " + r);
				break;
				
			default:
				System.out.println("Function is not working!");
				break;
		}
		s.close();
	}
}