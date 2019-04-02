import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Creating a pop up to ask the user for an Application type
		JFrame frame = new JFrame();
		
		Object[] possibilities = {"Select", "England PGD FT 18/19", "England PGD PT 18/19", "Wales PGD FT 18/19", "Wales PGD PT 18/19"};
		
		String option = (String)JOptionPane.showInputDialog(
		                    frame,
		                    "Please Select an Application Type",
		                    "Application Type",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null, possibilities,
		                    "Select");
	

		
		if (option == "England PGD FT 18/19") {
			
			Options.EngFT(args);
		}
		
		if (option == "England PGD PT 18/19") {
			
			Options.EngPT(args);
		
		}
		
		if (option == "Wales PGD FT 18/19") {
			
			Options.WalFT(args);
		}
		
		if (option == "Wales PGD PT 18/19") {
			
			Options.WalPT(args);
		}
		if (option == "Select") {
				
				JOptionPane.showMessageDialog(frame,
					    "Invalid Selection");
		}
	}

}
