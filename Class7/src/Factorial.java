import java.util.Scanner;

public class Factorial {
	
	public static int multiplyNumbers(int num)
    {
        if (num >= 1)
        	
            return num * multiplyNumbers(num - 1);
        
        else
        	
            return 1;
    }
	
	
	public static void main(String[] args) {
		
		System.out.println("Insert a number: ");
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		System.out.print(multiplyNumbers((y)));
		in.close();
		
	}
	

}
