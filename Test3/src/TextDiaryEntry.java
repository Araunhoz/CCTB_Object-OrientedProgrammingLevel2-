
// The TextDiaryEntry inherit AbstractDiary Entry


public class TextDiaryEntry extends AbstractDiaryEntry<String> {
    
	// constructor
	
	public TextDiaryEntry(String content) {

		super(content);

	}

	@Override
	public String getEntryType() {

		return "text";

	}
}
