import java.util.Scanner;

public class AppRunner  {
	// Create new objects
    private static Scanner in = new Scanner(System.in);
    private static Library library = new Library(50); 
    
    //Method to "clear" the Screen terminal
    
    private static void clearScreen() {
    	System.out.println("\033[H\033[2J");
    	System.out.flush();
//    	for(int clear = 0; clear < 10000; clear++) {
//    	    System.out.println("\b") ;
//    	    
//    	}
    }
    
    // Create a little menu to user
    private static void Menu() {
    	
        System.out.println("Menu:");
        System.out.println("1 - Add Book");
        System.out.println("2 - Add Student");
        System.out.println("3 - Check Out Book");
        System.out.println("4 - Return Book");
        System.out.println("5 - Display Available Books");
        System.out.println("6 - Display Checked Out Books");
        System.out.println("7 - Display Books");
        System.out.println("8 - Display Students");
        System.out.println("0 - Exit");
        System.out.print("Insert the value:");
        
    }

    private static void addBook() {
    	
    	clearScreen();
        System.out.print("Insert the book title: ");
        String title = in.nextLine();
        System.out.print("Insert the book author: ");
        String author = in.nextLine();
        
        Book book = new Book(title, author);
        library.addBook(book);
        System.out.println("Book was added!");
        System.out.println("Press a key to continue...");
        in.nextLine();
        clearScreen();
    
    }
    
    private static void addStudent() {
    	
    	clearScreen();
        System.out.print("Enter student name: ");
        String name = in.nextLine();
        System.out.print("Enter student ID: ");
        int id = in.nextInt();
        in.nextLine(); 
        Student student = new Student(name, id);
        library.addStudent(student);
        System.out.println("Student was added!");
        System.out.println("Press a key to continue...");
        in.nextLine();
        clearScreen();
        
    }

    private static void checkoutBook() {
    	
    	clearScreen();
        System.out.print("Enter with student ID: ");
        int studentID = in.nextInt();
        in.nextLine(); 
        Student student = findStudent(studentID);
        if (student == null) {
        	
            System.out.println("Student not found.");
            return;
            
        }

        System.out.print("Insert the book title: ");
        String title = in.nextLine();
        Book book = findBook(title);
        if (book == null) {
        	
            System.out.println("Book not found.");
            return;
            
        }

        library.checkoutBook(student, book);
    }

    private static void returnBook() {
    	
    	clearScreen();
        System.out.print("Insert the book title: ");
        String title = in.nextLine();
        Book book = findBook(title);
        
        if (book == null) {
        	
            System.out.println("Book not found.");
            return;
            
        }

        library.returnBook(book);
    }

    private static Book findBook(String title) {
    	
    	clearScreen();
    	
        for (Book book : library.books) {
        	
            if (book.getTitle().equalsIgnoreCase(title)) {
            	
                return book;
                
            }
        }
        
        return null;
        
    }

    private static Student findStudent(int studentID) {
    	
    	clearScreen();
        for (Student student : library.students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
    	
        boolean running = true;
        while (running) {
            Menu();
            char choice = in.next().charAt(0);
            in.nextLine();            
            switch (choice) {
            
                    
                case '1': 
                	
                    addBook();
                    break;
                    
                case '2':
                	
                    addStudent();
                    break;
                    
                case '3':
                	
                    checkoutBook();
                    break;
                    
                case '4':
                	
                    returnBook();
                    break;
                    
                case '5':
                	
                    library.listAvailableBooks();
                    break;
                    
                case '6':
                	
                    library.listCheckedOutBooks();
                    break;
                    
                case '7':
                	
                    library.listBooks();
                    break;
                    
                case '8':
                	
                    library.listStudents();
                    break;
                    
                case '0':
                	
                    running = false;
                    break;
                    
                default:
                	
                    System.out.println("Please insert accepted value!");
                    
            }
        }
    }
    
}
