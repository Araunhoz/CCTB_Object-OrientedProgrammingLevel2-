//Library to Date

import java.time.LocalDate;

public abstract class AbstractDiaryEntry<T> implements DiaryEntry<T> {
    
	//Attributes
	
	private LocalDate date;
	private T content;
	
    //Constructor
	
	public AbstractDiaryEntry(T content) {

		this.date = LocalDate.now();
		this.content = content;

	}
	
    // Methods
	
	@Override
	public LocalDate getDate() {

		return date;

	}

	@Override
	public T getContent() {

		return content;

	}

	@Override
	public abstract String getEntryType();

}
