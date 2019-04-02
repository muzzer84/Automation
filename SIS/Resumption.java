import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Resumption {

    WebDriver wb;
	
	public void Suspension (WebDriver w) {

		this.wb = w;
		}
	
	public void resumptionProcess(String ssn1) throws InterruptedException {
	
		        //Selecting COC Screen
				wb.findElement(By.id("_id12__id13_item17")).click();
				wb.findElement(By.id("_id12__id13_item17_item19")).click();
						
				//Filling in Section 1 of COC
				Select drplof = new Select(wb.findElement(By.id("dataForm:levelOfStudy")));
				drplof.selectByValue("PG");
						
				Select drpcoc = new Select(wb.findElement(By.id("dataForm:selectCategory")));
				drpcoc.selectByValue("Resumption");
						
				Select drpacycoc = new Select(wb.findElement(By.id("dataForm:selectAcademicYear")));
				drpacycoc.selectByValue("2018");

				wb.findElement(By.id("dataForm:submitButton")).click();
				
				//Filling in Section 2 of the COC
				
				wb.findElement(By.id("dataForm:studentsPg:0:ssnPg")).sendKeys(ssn1);
				wb.findElement(By.id("dataForm:studentsPg:0:populatePg")).click();
				wb.findElement(By.id("dataForm:nextButton")).click();
				
				//Filling in Section 3 of the COC
				
				Select drpYear = new Select(wb.findElement(By.id("dataForm:resumeCourseYear")));
				drpYear.selectByValue("1");
				
				//Getting the date for the Resumption Effective Date field
				LocalDate todaysDate = LocalDate.now(); //Getting the current Date
				LocalDate pastdate = todaysDate.minusDays(10); //Taking 10 days off the current date 
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Getting the format
				String resumeDate = pastdate.format(formatter); //Applying the Date and the format together
						
				wb.findElement(By.id("dataForm:ResumptionEffectiveDate")).sendKeys(resumeDate);
				
				//geeting the date for the course End date.
				LocalDate pastdate2 = todaysDate.plusYears(1);
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/yyyy");
				String courseEnddate = pastdate2.format(formatter2);
				
				wb.findElement(By.id("dataForm:CourseEndDate")).sendKeys(courseEnddate);
				
				Select drpSus = new Select(wb.findElement(By.id("dataForm:resumeConditionType")));
				drpSus.selectByValue("Never Attended Submitted in Error");
				
				wb.findElement(By.id("dataForm:nextButton")).click();
				
				//Selecting the contact
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