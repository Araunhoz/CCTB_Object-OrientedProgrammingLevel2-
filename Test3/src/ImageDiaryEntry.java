//Library for the Image 

import java.awt.Image;

// The ImageDiaryEntry inherit AbstractDiary Entry

public class ImageDiaryEntry extends AbstractDiaryEntry<Image> {
    
	// constructor

	public ImageDiaryEntry(Image content) {

		super(content);
	}

	@Override
	public String getEntryType() {

		return "image";

	}
}
