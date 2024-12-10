// Library of Date

import java.time.LocalDate;

//List and ArrayList
import java.util.ArrayList;
import java.util.List;

import java.util.function.Predicate;  // target for a lambda expression or method reference.
import java.util.stream.Collectors;   // implement various useful reduction operations, such as accumulating elements into collections.

public class Diary<T extends DiaryEntry<?>> {
	
	// Attributes
	
	private List<T> entries;
    
	// Constructor
	public Diary() {
		
		entries = new ArrayList<>();

	}
	
    // Method add Entry
	public void addEntry(T entry) {

		entries.add(entry);

	}
    
	// Method add by date
	public List<T> getEntriesByDate(LocalDate date) {

		return entries.stream().filter(entry -> entry.getDate().equals(date)).collect(Collectors.toList());

	}
    
	// Search in the List

	public List<T> searchEntries(Predicate<T> predicate) {

		return entries.stream().filter(predicate).collect(Collectors.toList());

	}
    
	//Delete the entries

	public void deleteEntry(T entry) {

		entries.remove(entry);

	}
    
	// Get all entries
	
	public List<T> getAllEntries() {

		return new ArrayList<>(entries);

	}
}
