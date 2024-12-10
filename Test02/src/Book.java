public class Book {
	// Create an enumeration of Status
	
    public enum Status {
        AVAILABLE, CHECKED_OUT
    }
	
    //Create the attributes  
    
	private String title;
    private String author;
    private Status status;


    //Create a constructor with parameters title and author 
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = Status.AVAILABLE;
    }
    
    //Get and Set
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    //Method to return title, author and status of Book
    
    public String toString() {
    	
        return "Book["+"title:" + title +", author:" + author + ", status:" + status +"]";
    
    }
}
