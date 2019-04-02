import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;

public class cocSelection {
	



	public void Selection(String cocType, String ssn1) throws InterruptedException {

				
	if (cocType == "Withdrawal") {
			
		
			WebDriver wb = new startDriver().main();

			logIn log = new logIn();
			log.login2(wb);
			log.userLogin();
			
			Withdrawal w = new Withdrawal();
			w.Withdrawal(wb);
			w.withdrawProcess(ssn1);
			System.exit(0);
			
		}
		
		if (cocType == "Suspsnsion") {
			
			WebDriver wb = new startDriver().main();

			logIn log = new logIn();
			log.login2(wb);
			log.userLogin();
			
			Suspension s = new Suspension();
			s.Suspension(wb);
			s.suspensionProcess(ssn1);
			System.exit(0);
		
		}
		
		if (cocType == "Resumption") {
			
			WebDriver wb = new startDriver().main();
			
			logIn log = new logIn();
			log.login2(wb);
			log.userLogin();
			
			Resumption r = new Resumption();
			r.Suspension(wb);
			r.resumptionProcess(ssn1);
		}
		
		if (cocType == "Course Transfer") {
			
			System.out.println("Course Transfer Selected");
		}
		
	    if (cocType == "Provider Transfer") {
			
			System.out.println("Provider Transfer Selected");
		}
		
		if (cocType == "Select") {
			    
			  JFrame frame = new JFrame();
				
				JOptionPane.showMessageDialog(frame,
					    "Invalid Selection");
		}
	}


}

