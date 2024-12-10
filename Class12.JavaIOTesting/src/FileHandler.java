import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {
	
	public static String readFile(String filename) {
		try {
			return new String(Files.readAllBytes(Paths.get(filename)));
		} catch (IOException e) {
			e.printStackTrace();
			return "Error reading from file";
		}
	}
	
	public static void writeFile(String filename, String content) {
		try {
			Files.write(Paths.get(filename), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean fileExists(String filename) {
		return Files.exists(Paths.get(filename));
	}
	

}