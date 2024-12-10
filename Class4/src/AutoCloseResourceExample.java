import java.io.*;

public class AutoCloseResourceExample {
	public static void main(String[] args) {
		
		String filename = "//path.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
			String line;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e){
			System.err.println("Error: file not found" +filename);
			
		} catch(IOException e) {
			System.err.println("Error reading file: "+ e.getMessage());
			
		}
	}

}
