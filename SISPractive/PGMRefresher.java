import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PGMRefresher {

	public static void main(String[] args) throws InterruptedException {
	
		//Setting up the Webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\ChromeDriver\\\\V2.36\\\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		//Setting so the web browser fills the screen
		wd.manage().window().maximize();
		
		//Pointing the web driver to the webpage
		wd.get("https://www.optimus-nt-new.slc.co.uk/login");
		
		Thread.sleep(2000);
		
		//Entering Username and Password
		wd.findElement(By.id("username")).sendKeys("bcfmanager");
		wd.findElement(By.id("password")).sendKeys("password61");
		wd.findElement(By.id("btn-confirm")).click();
		
		Thread.sleep(2000);
		
		//Selecting Create Customer
		wd.findElement(By.id("createCustomer")).click();
		
		Thread.sleep(2000);
		
		//Selecting Title
		Select drptitle = new Select(wd.findElement(By.id("editTitle")));
		drptitle.selectByValue("MRS");
		
		//Thread.sleep(3000); 
		
		//Selecting First Name
		wd.findElement(By.id("editFirstname")).sendKeys("PGM");
		
		//Thread.sleep(2000);
		
		//setting the random letter generator
		String ranName = RandomStringUtils.randomAlphabetic(10);
		//Populating the Surname with a unique value
		wd.findElement(By.id("editLastname")).sendKeys("Eng" + ranName);
		
		//selecting the female radio button
		WebElement radio1 = wd.findElement(By.id("F"));
		radio1.click();
		
		//entering the Date of birth & City of Birth
		wd.findElement(By.id("editDateOfBirth")).sendKeys("01/07/1999");
		wd.findElement(By.id("editTownOfBirth")).sendKeys("Leeds");
		//Entering Nationality
		wd.findElement(By.id("editNationality")).sendKeys("United Kingdom");
		wd.findElement(By.id("editNationality")).sendKeys(Keys.ENTER);
		
		/*Entering the NI Number
		String ranNumber = RandomStringUtils.randomNumeric(6);
		String ranLetters = RandomStringUtils.randomAlphabetic(2);
		String ranLetter = RandomStringUtils.randomAlphabetic(1);
		wd.findElement(By.id("editNino")).sendKeys(ranLetters+ranNumber+ranLetter);*/
		
		//Selecting Elegibility Radio Button
		WebElement radio2 = wd.findElement(By.id("NOT_APPLICABLE"));
		radio2.click();
		
		//Entering home address
		wd.findElement(By.id("homeAddresspostcodeSearch")).sendKeys("LS2 8BQ");
		wd.findElement(By.xpath("//*[@id=\"homeAddresspostcodeLookup\"]/button")).click();
		Thread.sleep(2000);
	    Select drpAddress = new Select(wd.findElement(By.id("homeAddressaddressSelector")));
	    drpAddress.selectByIndex(1);
	    
	    //Selecting Create Customer
	    wd.findElement(By.id("createCustomer")).click();
		
		
		
		
		
	}

}
