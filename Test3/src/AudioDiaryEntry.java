//Library for the sound

import javax.sound.sampled.Clip;

// // The AudioDiaryEntry inherit AbstractDiary Entry

public class AudioDiaryEntry extends AbstractDiaryEntry<Clip> {
    
    // constructor

	public AudioDiaryEntry(Clip content) {

		super(content);

	}
 
	@Override
	public String getEntryType() {

		return "audio";

	}
}
