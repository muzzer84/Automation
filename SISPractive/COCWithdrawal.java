import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class COCWithdrawal {

	public static void main(String[] args) throws InterruptedException {
	
		//Asking the user for a SSN
		JFrame frame = new JFrame();
		String ssn1 = JOptionPane.showInputDialog(frame, "Please enter a SSN:");
	
		//Checking if a SSN has been entered
		if(ssn1.length() == 0)
		{ 
			JFrame frame3 = new JFrame();
			JOptionPane.showMessageDialog(frame3, "No SSN entered");
			System.exit(0); 	
		
		}
		else //Cancel button pressed
		{ 
			//System.exit(0); 
		}	
		
		//Setting the Webdriver as Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();	
		
		//Opening the SIS Log in Page
		wb.get("http://nexttestlogin.heiportal.co.uk/pls/orasso/oaupk002.p_get_username?site2pstoretoken=v1.2~BBBA610A~B7FE921FE6FE09734865008DBE6BAC8CB3AE6419990CD064A6158FBBF9B72071CC9587700A82B9DC14530A3DE7435946F58F1511222B0B38CA28B23A25EA2356D09B311B8D40CEBAD310512B3EC41423B13F42C02F98594DBE4AF02DDCFA815B9416361DAEC33DD878C39219F869453CD12DF0F0ED8BE02C529686F1597407B0B4348A612CBF74EEB229F85E2D9DBD783120AA47F50D85C74DBB847BD94D37506FD815BF157D221469AA021D527EDCAA6F89091F9A4F4F289107B9D414AC60D16EF34913A7FA18FA0268DAC7FF8046783085D9CB2BAEE6742D5CE4070AB03D64921B26CD1F741F5C&p_error_code=&p_submit_url=http%3A%2F%2Fnexttestlogin.heiportal.co.uk%2Fsso%2Fauth&p_cancel_url=http%3A%2F%2Fnexttestsecure.heiportal.co.uk%2Fpls%2Fportal%2FPORTAL.home&ssousername=");

		//Entering the Username
	    wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div/div[2]/input")).sendKeys("UNLESS1");
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[2]/div[2]/button")).click();
				
		//Entering the password and secret question
		wb.findElement((By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div[1]/div[2]/input"))).sendKeys("pa55word1");
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div[2]/div[2]/input")).sendKeys("wonderwoman");
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[2]/div[2]/button")).click();
				
		//Selecting the SIS link
		wb.findElement(By.xpath("//*[@id=\"navbar\"]/li[7]/a")).click();
		
		//Selecting COC Screen
		wb.findElement(By.id("_id12__id13_item17")).click();
		wb.findElement(By.id("_id12__id13_item17_item19")).click();
				
		//Filling in Section 1 of COC
		Select drplof = new Select(wb.findElement(By.id("dataForm:levelOfStudy")));
		drplof.selectByValue("PG");
				
		Select drpcoc = new Select(wb.findElement(By.id("dataForm:selectCategory")));
		drpcoc.selectByValue("Withdrawal");
				
		Select drpacycoc = new Select(wb.findElement(By.id("dataForm:selectAcademicYear")));
		drpacycoc.selectByValue("2018");

		wb.findElement(By.id("dataForm:submitButton")).click();
				
		//Filling in Section 2 of the COC
				
		wb.findElement(By.id("dataForm:studentsPg:0:ssnPg")).sendKeys(ssn1);
		wb.findElement(By.id("dataForm:studentsPg:0:populatePg")).click();
		wb.findElement(By.id("dataForm:nextButton")).click();

		//Filling in Section 3 of the COC
		//Getting the date for the Withdrawal Effective Date field
		LocalDate todaysDate = LocalDate.now(); //Getting the current Date
		LocalDate pastdate = todaysDate.minusDays(10); //Taking 10 days off the current date 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Getting the format
		String withdrawDate = pastdate.format(formatter); //Applying the Date and the format together
				
		wb.findElement(By.id("dataForm:WithdrawaEffectiveDate")).sendKeys(withdrawDate);
		
		Select drpReason = new Select(wb.findElement(By.id("dataForm:withdrawReason")));
		drpReason.selectByValue("1");
		
		wb.findElement(By.id("dataForm:nextButton")).click();
		
		//Selecting the contact details
		wb.findElement(By.id("dataForm:contactResults:0:contactSelectRadio")).click();
		wb.findElement(By.id("dataForm:nextButton")).click();
		
		//Select Save
		wb.findElement(By.id("dataForm:saveButton")).click();
		
		//Returning the Status on the screen
		String status1 = wb.findElement(By.xpath("//*[@id=\"dataForm:status\"]/option[@selected=\"selected\"]")).getText();
		
		JFrame frame1 = new JFrame();
		JOptionPane.showMessageDialog(frame1, "Application has been " + status1);
		
		//Submitting the Application
		wb.findElement(By.id("dataForm:submitButton")).click();
		
		//Returning the Status on the screen
		String status2 = wb.findElement(By.xpath("//*[@id=\"dataForm:status\"]/option[@selected=\"selected\"]")).getText();
				
		JFrame frame2 = new JFrame();
		JOptionPane.showMessageDialog(frame2, "Application has been " + status2);
		
		// close down the browser
		wb.quit();		
		
		
		
	}

}
