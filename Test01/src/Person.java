/* Paulo Henrique A. Munhoz
*/

public class Person {
	
	// Create the attributes in private
	
	private String name;  
	private int age;
    
	// Create the get and set of name and age
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Create a main function to test the get and set
	
	public static void main(String[] args) {
		
		// I instance a class Person and create the object person 
		Person person = new Person();
		
		// Set the values via Set, the name to Alice and age to 30;
		person.setName("Alice");
		person.setAge(30);
		
		// I take the values via get and display your values.
		System.out.println("Name: "+person.getName());
		System.out.println("Age: "+person.getAge());	
	}
}
