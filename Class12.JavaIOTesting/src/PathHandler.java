import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathHandler {

	public static Path getFilename(Path filepath) {
		return filepath.getFileName();

	}

	public static Path getAbsolutePath(Path relativePath) {
		return relativePath.toAbsolutePath();
	}

	public static void displayTree(Path dirPath) throws IOException {
		System.out.println("Directory structure for: " + dirPath.toString());
		Files.walk(dirPath).forEach(path -> {
     
		int depth = path.getNameCount()-dirPath.getNameCount();	
		System.out.println("".repeat(depth)+(Files.isDirectory(path)? "[DIR]": "[FILE]")+path.getFileName());
		});
	}

}