import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateEngPTApplication {

	WebDriver wd = null;

	public CreateEngPTApplication (WebDriver w) {

		this.wd = w;
		}
	public void create() throws InterruptedException {
		
		Thread.sleep(2000); 
		wd.findElement(By.id("createApplication")).click();
		
		
		Thread.sleep(2000); 
		//Select Doctoral Application Type
		Select drpTitle = new Select(wd.findElement(By.id("universalApplicationSupportPackage"))); 
		drpTitle.selectByVisibleText("Doctoral");
		
		//Select the ACY
		Select drpTitle2 = new Select(wd.findElement(By.id("universalApplicationStartingAcademicYear")));
		drpTitle2.selectByVisibleText("2018/2019");
		
		//Select the Awarding Body
		WebElement radio1 = wd.findElement(By.id("SFE")); 
		radio1.click();
		
	    //Select Save
		wd.findElement(By.xpath("//*[@id=\"createApplicationForm\"]/form/div[5]/div/button[1]")).click();
		
		
		//**Application Sections**
		//Bank Details
		Thread.sleep(2000);
		wd.findElement(By.id("bankDetails")).click(); 
		wd.findElement(By.id("editSortCode")).sendKeys("209696");
		wd.findElement(By.id("editAccountNumber")).sendKeys("10873160");
		wd.findElement(By.xpath("//*[@id=\"bankDetails\"]/div/div/div/form/div[4]/div/button[1]")).click();
		
		//Previous Study
		Thread.sleep(2000);
		wd.findElement(By.id("previousStudySection")).click();
		WebElement radio2 = wd.findElement(By.id("false")); 
		radio2.click();
		wd.findElement(By.xpath("//*[@id=\"previousStudySection\"]/div/div/div/form/div[2]/div/button[1]")).click();
		
		//Full PG Doctoral Course
		Thread.sleep(2000);
		wd.findElement(By.id("fullPostgraduateDoctoralSection")).click();
		WebElement radio3 = wd.findElement(By.id("true"));
		radio3.click();
		wd.findElement(By.xpath("//*[@id=\"fullPostgraduateDoctoralSection\"]/div/div/div/form/div[2]/div/button[1]")).click();
		
		//Course Details
		wd.findElement(By.id("courseDetailsSection")).click();
		
		//Actions mimics the mouse actions.
		Actions act = new Actions(wd);
		act.moveToElement(wd.findElement(By.id("provider"))).build().perform();
		act.click().build().perform();
		act.sendKeys("University Of Leeds").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		Actions act2 = new Actions(wd);
		act2.moveToElement(wd.findElement(By.id("course"))).build().perform();
		act2.click().build().perform();
		act2.sendKeys("SIS-PGD-PT").build().perform();
		Thread.sleep(2000);
		act2.sendKeys(Keys.ENTER).build().perform();
		
		JavascriptExecutor je = (JavascriptExecutor) wd;
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id='editHepProvider']/form/div[5]/div/button[1]")).click();
		
		//Other Funding
		wd.findElement(By.id("otherFundingSection")).click();
		wd.findElement(By.xpath("//input[@name='eligibleForSocialWorkBursary' and @id='NOT_ELIGIBLE']")).click();
		wd.findElement(By.xpath("//input[@name='eligibleForNhsBursary' and @id='NOT_ELIGIBLE']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@name='hasResearchCouncilFunding' and @id='false']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"otherFundingSection\"]/div/div/div/form/div[4]/div/button[1]")).click();
		
		//Armed Forces
		wd.findElement(By.xpath("//*[@id=\"armedForcesSection\"]/div")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@name='servicePersonnel' and @id='false']")).click();
		wd.findElement(By.xpath("//*[@id=\"pgd-application-module\"]/div/ol/div/div/form/div[2]/div/button[1]")).click();
		
		//Studying Overseas
		wd.findElement(By.xpath("//*[@id=\"studyingOverseasSection\"]/div/h3/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@name='studyingOverseas' and @id='false']")).click();
		wd.findElement(By.xpath("//*[@id=\"studyingOverseasSection\"]/div/div/div/form/div[2]/div/button[1]")).click();
		
		//Residency
		wd.findElement(By.xpath("//*[@id=\"nationalityAndResidencySection\"]/div/h3/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("UK")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("HAS_UK_PASSPORT_NO_DETAILS_PROVIDED")).click();
		
		wd.findElement(By.id("addresses[0]postcodeSearch")).sendKeys("LS2 8BQ");
		wd.findElement(By.xpath("//*[@id=\"addresses[0]postcodeLookup\"]/button")).click();
		Thread.sleep(2000);
		Select drpAddress = new Select(wd.findElement(By.xpath("//*[@id=\"addresses[0]addressSelector\"]")));
		drpAddress.selectByIndex(1);
		
		wd.findElement(By.name("addresses[0].residentFromDate")).sendKeys("01/01/2000");
		wd.findElement(By.name("addresses[0].residentToDate")).sendKeys("01/01/2020");
		
		wd.findElement(By.xpath("//*[@id=\"nationalityAndResidencySection\"]/div/div/div/form/div[4]/div/button[1]")).click();
		
		JavascriptExecutor je2 = (JavascriptExecutor) wd;
		je2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Living in Domicile
		wd.findElement(By.xpath("//*[@id=\"livingInDomicileSection\"]/div/h3/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input[@name='livingInDomicile' and @id='true']")).click();
		
		wd.findElement(By.xpath("//*[@id=\"livingInDomicileSection\"]/div/div/div/form/div[2]/div/button[1]")).click();
		
		//Loan Amount
		wd.findElement(By.xpath("//*[@id=\"loanRequest\"]/div/h3/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//div[@id='editLoanRequestRadio']//label[@class='binary-button formdata']/input[@id='true']")).click();
		wd.findElement(By.xpath("//*[@id=\"editLoanRequest\"]/form/div[2]/div/button[1]")).click();
		
		//Contact References
		wd.findElement(By.xpath("//*[@id=\"contactReference\"]/div/h3/a/span")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"editContactReference0Firstname\"]")).sendKeys("Contact");
		wd.findElement(By.xpath("//*[@id=\"editContactReference0Surname\"]")).sendKeys("One");
		
		Select drpRelationshop = new Select(wd.findElement(By.xpath("//*[@id=\"editContactReference0RelationshipToApplicant\"]")));
		drpRelationshop.selectByValue("PARENT");
		
		wd.findElement(By.id("contactAddress0postcodeSearch")).sendKeys("LS2 8BQ");
		wd.findElement(By.xpath("//*[@id=\"contactAddress0postcodeLookup\"]/button")).click();
		Thread.sleep(2000);
		Select drpAddress2 = new Select(wd.findElement(By.id("contactAddress0addressSelector")));
		drpAddress2.selectByIndex(1);
		
		JavascriptExecutor je3 = (JavascriptExecutor) wd;
		je3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		wd.findElement(By.xpath("//*[@id=\"contactReference\"]/div/div/div/form/div[3]/div/button[1]")).click();
		
				
		
		
	

	}

}
