import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cocType {
	
	public String getCocType() throws InterruptedException {

	//cocSelection select = new cocSelection();
	
	//Creating a pop up to ask the user for an Application type
			JFrame frame = new JFrame();
			
			Object[] possibilities = {"Select", "Withdrawal", "Suspsnsion", "Resumption", "Course Transfer", "Provider Transfer"};
			
			String cocType= (String)JOptionPane.showInputDialog(
			                    frame,
			                    "Please Select an COC Type",
			                    "COC Type",
			                    JOptionPane.PLAIN_MESSAGE,
			                    null, possibilities,
			                    "Select");{
			
			//Checking if a COC type has been selected
			if(cocType.length() == 0)
			{ 
				JFrame frame2 = new JFrame();
				JOptionPane.showMessageDialog(frame2, "No COC type selected");
				System.exit(0); 	
				return "";
			}
			else 
			{ 
				//select.Selection(cocType, null);
				return cocType;
			}
	
}
		
							
			
}


}

