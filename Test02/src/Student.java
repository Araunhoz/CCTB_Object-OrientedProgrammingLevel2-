import java.util.ArrayList;
import java.util.List;

public class Student {
	
	//Create the attributes
    private String name;
    private int studentID;
    
    // Create ArrayList of type Book to Check out Books
    
    private List<Book> checkedOutBooks;
    
    //Constructor with parameters name and studentID
    
    public Student(String name, int studentID) {
    	
        this.name = name;
        this.studentID = studentID;
        this.checkedOutBooks = new ArrayList<>();
        
    }
    
    //get and set
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }
    
    // Create the Methods 
    
    public void addBook(Book book) {
    	
        checkedOutBooks.add(book);
        
    }

    public void removeBook(Book book) {
    	
        checkedOutBooks.remove(book);
        
    }

    public String toString() {
    	
        return "Student[" +"name:'" + name + "," + "studentID:" + studentID +",checkedOutBooks:" + checkedOutBooks+"]";
    
    }
}
