/* Paulo Henrique A. Munhoz
*/

public class Arrays {
	public static void main(String[] args) {
		
		// I insert the values in an array of integer;
		int[] array = {5, 12, 8, 25, 3}; 
		
		//Set values integer of sum and max to 0;
		int sum = 0;
		int max = 0;
		
		//I walk by array using for, as I have an array with finite size, your length is 5. 
		//I sum in each iteration of loop
		
		for(int i=0; i< 5;i++) {
			sum = sum +array[i];
		}
		
		//I compare the value of array in the position with max, if array[in position]
		// is greater of max then max receive the value. 
		for(int x=0; x< 5;x++) {
			if (array[x] > max) {
	            max = array[x];
			}			
		}
	  
	  //To average is necessary an explicitly cast;	
	  double average = sum/5D; 	
	  
	  //I print the values here
      System.out.println("Sum of elements: " +sum);	
      System.out.println("Largest Element: " +max);
      System.out.println("Average: " +average);
	}
}