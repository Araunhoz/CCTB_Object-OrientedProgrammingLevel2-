import javax.swing.*;
import java.util.regex.*;

public class AsksName {
	public static void main(String[] args) {
		
		//To close the first screen
		
		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);
		
		//Fix this Regex
	    Pattern pt = Pattern.compile(" ^[a-zA-Z ] ");
	    Pattern pt2 = Pattern.compile("[0-9]");
	    int valor = 99;
	    
		String name="";
	    Matcher match= pt.matcher(name);
	    Matcher match2= pt2.matcher(name);
	    //System.out.println(match.find());


	    while(valor!=0) {
	    	
	    	System.out.println("Hello");
	    	
			name = JOptionPane.showInputDialog("Give me a name: ");
			match = pt.matcher(name);
			if(match.find()==true) {
				name = "";
			}else if(match2.find()==true) {
				name = "";
				
			}else {
				valor = 0;

				
			}
			
		}
		
		try {	
			if(!(name.isBlank())) {
				JOptionPane.showMessageDialog(null, "Hello: " +name);			
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Oops, something went wrong!");
			
			
		} finally {
			JOptionPane.showMessageDialog(null, "Goodbye!");
			
		}
		
	}

}
