import javax.swing.*;

public class MultipleCatchSwingExample {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter a whole number");
		
		try {
			int number = Integer.parseInt(input);
			
			JOptionPane.showMessageDialog(null, "You entered: " +number);
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "That's not a whole number");
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Something unxepected went wrong");
			
		} finally {
			JOptionPane.showMessageDialog(null, "Thanks for trying");
			
		}
	}

}
