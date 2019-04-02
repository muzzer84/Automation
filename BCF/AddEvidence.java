import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 

public class AddEvidence {

    WebDriver wd = null;
	
	public AddEvidence (WebDriver w) {
	
	this.wd = w;
	}

	public void evidence() throws InterruptedException {

		//getting the current date
		LocalDate todaysDate = LocalDate.now(); //Getting the current Date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Getting the format
		String date1 = todaysDate.format(formatter); //Applying the Date and the format together
		 
		Thread.sleep(2000); 
		
		wd.findElement(By.id("addEvidence")).click();
		
		//Adding Customer Declaration Evidance
		Select drpEv1 = new Select(wd.findElement(By.id("evidenceTypeOption")));
		drpEv1.selectByValue("CUSTOMER_DECLARATION");
		
		wd.findElement(By.id("evidenceReceivedDate")).sendKeys(date1);
		
		Thread.sleep(2000); 
		wd.findElement(By.xpath("//*[@id=\"addEvidenceForm\"]/form/div[3]/div/button")).click();
		Thread.sleep(2000); 
		
		wd.findElement(By.id("evidence.customerDeclaration.details")).click();
		wd.findElement(By.xpath("//input[@name='isValid' and @id='true']")).click();
		
		Select drpacy = new Select(wd.findElement(By.id("customerDeclarationStartingAcademicYear")));
		drpacy.selectByValue("2018");
		
		wd.findElement(By.xpath("//*[@id=\"editCustomerDeclaration\"]/form/div[3]/div/button[1]")).click();
		
		wd.findElement(By.id("backToEvidenceList")).click();
		
		//Adding ID Evidance
        Thread.sleep(2000); 
		
		wd.findElement(By.id("addEvidence")).click();
		
		//Adding Customer Declaration Evidance
		Select drpEv2 = new Select(wd.findElement(By.id("evidenceTypeOption")));
		drpEv2.selectByValue("UK_ID_EXCEPTION");
		
		wd.findElement(By.id("evidenceReceivedDate")).sendKeys(date1);
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"addEvidenceForm\"]/form/div[3]/div/button")).click();
		Thread.sleep(2000);
		
		//Box Number
		Thread.sleep(2000);
		wd.findElement(By.id("boxNumber")).click();
		wd.findElement(By.id("evidenceBoxNumber")).sendKeys("12345");
		wd.findElement(By.xpath("//*[@id=\"box-number-form\"]/form/div[2]/div/button[1]")).click();
		
		//Details and Validation
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"evidence.uk.id.details\"]/div/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@name='isValid' and @id='true']")).click();
		Thread.sleep(2000);
		Select drpDoc = new Select(wd.findElement(By.id("ukIdDetailsDocumentType")));
		drpDoc.selectByValue("UK_PHYSICAL_PASSPORT");
		
		wd.findElement(By.id("ukIdDetails")).sendKeys("Details Go Here");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"editUKIdDetails\"]/form/div[3]/div/button[1]")).click();
		
		//Returned
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"returnEvidence\"]/div/a")).click();
		wd.findElement(By.id("evidenceReturnedDate")).sendKeys(date1);
		
		JavascriptExecutor je = (JavascriptExecutor) wd;
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		wd.findElement(By.xpath("//*[@id=\"return-evidence-form\"]/form/div[4]/div/button[1]")).click();
		
		wd.findElement(By.id("backToEvidenceList")).click();

	}

}
