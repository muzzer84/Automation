import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SSNInput {
	
	public String SSNinput() throws InterruptedException //throws InterruptedException 
{
		
		
	
	//Asking the user for a SSN
	JFrame frame = new JFrame();
	String ssn1 = JOptionPane.showInputDialog(frame, "Please enter a SSN:");
	

	//Checking if a SSN has been entered
	if(ssn1.length() == 0)
	{ 
		JFrame frame3 = new JFrame();
		JOptionPane.showMessageDialog(frame3, "No SSN entered");
		System.exit(0); 	
		return "";
	}
	else 
	{ 
		//System.exit(0); 
		return ssn1;
		
		//cocSelection select = new cocSelection();
		//select.Selection(ssn1, ssn1);
		
	}
	
	
}

}
	


