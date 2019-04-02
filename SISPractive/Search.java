import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;


public class Search {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Setting the Webdriver as Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		//Opening the SIS Log in Page
		wb.get("http://nexttestlogin.heiportal.co.uk/pls/orasso/oaupk002.p_get_username?site2pstoretoken=v1.2~BBBA610A~B7FE921FE6FE09734865008DBE6BAC8CB3AE6419990CD064A6158FBBF9B72071CC9587700A82B9DC14530A3DE7435946F58F1511222B0B38CA28B23A25EA2356D09B311B8D40CEBAD310512B3EC41423B13F42C02F98594DBE4AF02DDCFA815B9416361DAEC33DD878C39219F869453CD12DF0F0ED8BE02C529686F1597407B0B4348A612CBF74EEB229F85E2D9DBD783120AA47F50D85C74DBB847BD94D37506FD815BF157D221469AA021D527EDCAA6F89091F9A4F4F289107B9D414AC60D16EF34913A7FA18FA0268DAC7FF8046783085D9CB2BAEE6742D5CE4070AB03D64921B26CD1F741F5C&p_error_code=&p_submit_url=http%3A%2F%2Fnexttestlogin.heiportal.co.uk%2Fsso%2Fauth&p_cancel_url=http%3A%2F%2Fnexttestsecure.heiportal.co.uk%2Fpls%2Fportal%2FPORTAL.home&ssousername=");

		//Entering the Username
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div/div[2]/input")).sendKeys("UNLESS1");
		
		//Take Screen shot
		File username1 = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(username1, new File("C:\\Users\\mcalpimu\\eclipse-output\\username1.png"));
		
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[2]/div[2]/button")).click();
		
		//Entering the password and secret question
		wb.findElement((By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div[1]/div[2]/input"))).sendKeys("pa55word1");
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div[2]/div[2]/input")).sendKeys("wonderwoman");
		
		//Take Screen shot
		File passwordandquestion1 = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(passwordandquestion1, new File("C:\\Users\\mcalpimu\\eclipse-output\\passwordandquestion1.png"));
		
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[2]/div[2]/button")).click();
		
		//Selecting the SIS link
		wb.findElement(By.xpath("//*[@id=\"navbar\"]/li[7]/a")).click();
		
		//selecting Student information
		wb.findElement(By.xpath("//*[@id=\"_id12__id13_item1\"]")).click();
		wb.findElement(By.xpath("//*[@id=\"_id12__id13_item1_item2\"]")).click();
		
		//selecting 'Course Search' screen
		wb.findElement(By.xpath("//*[@id=\"dataForm:tab2_headerCell\"]")).click();
		
		//Entering Course Code
		wb.findElement(By.id("dataForm:tab2:slcCourseCode")).sendKeys("501606");
		
		//Selecting ACY as 18/19
		Select drpacy = new Select(wb.findElement(By.id("dataForm:tab2:selectAcademicYearCrs")));
		drpacy.selectByVisibleText("18-19");
		
		//Selecting the Qualification for Doctoral
		Select drpquli = new Select(wb.findElement(By.id("dataForm:tab2:qualification")));
		drpquli.selectByVisibleText("PGRD-DOC");
		
		//Selecting 'Filter and Display'
		wb.findElement(By.id("dataForm:filterAndDisplay")).click();
		Thread.sleep(10000);
		
		//Take Screen shot
		File Searchoutput1 = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Searchoutput1, new File("C:\\Users\\mcalpimu\\eclipse-output\\Searchoutput1.png"));
		
		//Selecting the SSN Link
		wb.findElement(By.id("dataForm:results:3:ssnOutput")).click();
		
		
		//Storing the students details
		String first_name = wb.findElement(By.id("dataForm:forename")).getText();
		String surname = wb.findElement(By.id("dataForm:surname")).getText();
		String crn = wb.findElement(By.id("dataForm:customerReferenceNumber")).getText();
		String ssn = wb.findElement(By.id("dataForm:SSN")).getText();
		
		//Take a screen shot of customer details
		File CustDetails1 = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(CustDetails1, new File("C:\\Users\\mcalpimu\\eclipse-output\\CustDetails1.png"));
		
		// close down the browser
		//wb.quit();

				
		//Outputting the Student details as a pop up
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,
			    "Student Details\n "
		        + "Name: " + first_name + " " + surname 
			    + "\nCRN: " + crn 
			    + "\nSSN: " + ssn );
		
		// Producing the Student Details to Screen
		System.out.println("Students Details");
		System.out.println("First Name: " + first_name);
		System.out.println("Second Name: " + surname);
		System.out.println("CRN: " + crn);
		System.out.println("SSN: " + ssn);
		
		//Producing the Student Details as a Txt file
		try (PrintWriter out = new PrintWriter("C:\\Users\\mcalpimu\\eclipse-output\\Student Details.txt")) {
		    out.println("Students Details");
		    out.println("First Name: " + first_name);
			out.println("Second Name: " + surname);
			out.println("CRN: " + crn);
			out.println("SSN: " + ssn);
		}
	
	 
	
		
	
		

		
		

		
		
	}

}
