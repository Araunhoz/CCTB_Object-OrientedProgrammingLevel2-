import java.util.Scanner;

public class Linear {
	
	public static int fibonacci(int n)  {
		
	    if (n < 2) {
	    	
	    	return n;	
	    	
	    } else {
	    	
		    return fibonacci(n - 1) + fibonacci(n - 2);	
		    
	    }

	}
	
	public static void main(String[] args) {
		
		System.out.println("Insert a number: ");
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		System.out.println("The total is: " +fibonacci(y+1));
		System.out.println("The numbers are: ");
		
		for(int x = 1; x <= y; x++) {
			
			System.out.printf("%d,",fibonacci(x));
						
		}
		
		in.close();
		
	}

}
