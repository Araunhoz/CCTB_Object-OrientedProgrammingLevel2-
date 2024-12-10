
//Library to Date

import java.time.LocalDate;

// This is default or template 

public interface DiaryEntry<T> {
	
	T getContent();

	LocalDate getDate();

	String getEntryType();
}
