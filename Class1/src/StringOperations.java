
public class StringOperations {
	public static void main(String[] args) {
		String str1, str2, str3;
		str1 = "Hello";
		str2 = "Paulo";
		str3 = "You are " + str2; 
		
	    System.out.println("Welcome "+ str3);
	    System.out.println("Length: "+ str1.length());
	    System.out.println("Substring: " +str3.substring(0,5));
        System.out.println("UpperCase: " +str2.toUpperCase());
        
        
        if(str1.compareTo(str2) < 0) {
        	System.out.println("Lexigrophical less");
        	System.out.println(str1.compareTo(str2));
        }
        
        if(str1.equals(str2)) {
        	System.out.println("The Strings are same: "+ str1.equals(str2));
        	
        }else {
        	System.out.println("The Strings are not same: "+str1.equals(str2));
        
        }      
	}
}
