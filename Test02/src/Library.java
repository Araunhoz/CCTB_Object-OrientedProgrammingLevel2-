import java.util.ArrayList;
import java.util.List;

public class Library {
	
	// Create two Arraylist, one of type Book and second of type Student
    List<Book> books;
    List<Student> students;
    
    //Create a List of Book
    private Book[] checkedOutBooks;
    
    
    //Create constructor with parameter FullCheckedOutBooks
    public Library(int FullCheckedOutBooks) {
    	
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.checkedOutBooks = new Book[FullCheckedOutBooks];
        
    }
     
    //Create methods
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    
    public void checkoutBook(Student student, Book book) {
    	
        if (book.getStatus() == Book.Status.AVAILABLE) {
        	
            for (int i = 0; i < checkedOutBooks.length; i++) {
            	
                if (checkedOutBooks[i] == null) {
                	
                    checkedOutBooks[i] = book;
                    book.setStatus(Book.Status.CHECKED_OUT);
                    student.addBook(book);
                    System.out.println("Book checked out!!");
                    return;
                    
                }
            }
            
            System.out.println("No books could be checked out!");
            
        } else {
        	
            System.out.println("Book is checked out!");
            
        }
    }

    public void returnBook(Book book) {
    	
        for (int x = 0; x < checkedOutBooks.length; x++) {
        	
            if (checkedOutBooks[x] != null && checkedOutBooks[x].equals(book)) {
            	
                checkedOutBooks[x] = null;
                book.setStatus(Book.Status.AVAILABLE);
                System.out.println("Book was returned");
                
                return;
            }
        }
        
        System.out.println("The book was not found among the removed books.");
        
    }

    public void listAvailableBooks() {
    	
        for (Book book : books) {
        	
            if (book.getStatus() == Book.Status.AVAILABLE) {
            	
                System.out.println(book);
                
            }
        }
    }

    public void listCheckedOutBooks() {
    	
        for (Book book : checkedOutBooks) {
        	
            if (book != null) {
            	
                System.out.println(book);
                
            }
        }
    }
}
