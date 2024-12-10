
// I used this libraries to Audio and video clip to read and catch the exception
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// I used this libraries to Image, File, IO Exception and LocalDate
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Create diary instances
		
		Diary<TextDiaryEntry> textDiary = new Diary<>();
		Diary<ImageDiaryEntry> imageDiary = new Diary<>();
		Diary<AudioDiaryEntry> audioDiary = new Diary<>();

		System.out.println("=====javaFinalExam_Finalweek_instructions.md=====");

		// Add text entries

		TextDiaryEntry textEntry1 = new TextDiaryEntry("I like Pizza!");
		textDiary.addEntry(textEntry1);
		TextDiaryEntry textEntry2 = new TextDiaryEntry("The Canada is very beatiful");
		textDiary.addEntry(textEntry2);
		TextDiaryEntry textEntry3 = new TextDiaryEntry("Give your jumps");
		textDiary.addEntry(textEntry3);

		// Add image entries

		Image Image = null; // Replace with an actual image
		ImageDiaryEntry imageEntry = new ImageDiaryEntry(Image);
		imageDiary.addEntry(imageEntry);

		// I used try catch to IO Exception
		try {
			
			// Load audio file
			File audioFile = new File("ninelie.wav"); // I insert a audio file in the SRC to test this read
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			Clip audioClip = AudioSystem.getClip();
			AudioDiaryEntry audioEntry = new AudioDiaryEntry(audioClip);

			// Add the audio file
			audioDiary.addEntry(audioEntry);
			// Close the audio stream
			audioStream.close();

		// Here I take the Exception if I had.
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
			System.err.println("Error loading audio: " + e.getMessage());
		}

		// Retrieve entries by date
		List<TextDiaryEntry> textEntriesToday = textDiary.getEntriesByDate(LocalDate.now());
		System.out.println("Number of entries today: " + textEntriesToday.size());

		// Search for entries
		List<TextDiaryEntry> searchedTextEntries = textDiary
				.searchEntries(entry -> entry.getContent().contains("Canada"));
		System.out.println("Text entries containing the word 'Canada': " + searchedTextEntries.size());

		// Delete an entry, I delete the first entry
		textDiary.deleteEntry(textEntry1);
		System.out.println("Number of entries after deletion: " + textDiary.getAllEntries().size());

	}

}
