import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BCFtwo {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting the Webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		//Setting Chrome to fill the screen
		wd.manage().window().maximize();
		
		//Getting the URL
		wd.get("https://www.optimus-nt-new.slc.co.uk/login");
		
		Thread.sleep(3000);
		
		//Inserting the username
		wd.findElement(By.id("username")).sendKeys("bcfmanager");
		wd.findElement(By.id("password")).sendKeys("password61");
		wd.findElement(By.id("btn-confirm")).click();
		
		Thread.sleep(3000);
		
		//Selecting Create Customer
		wd.findElement(By.id("createCustomer")).click();
		
		Thread.sleep(3000);
		
		//Selecting Title
		Select drpTitle = new Select(wd.findElement(By.id("editTitle")));
		drpTitle.selectByValue("MR");
		
		Thread.sleep(3000);
		
		//Setting first Name
		wd.findElement(By.id("editFirstname")).sendKeys("PGD");
		
		//Setting the Random Letters String
		String ranName = RandomStringUtils.randomAlphabetic(10);
		//Setting the Surname
		wd.findElement(By.id("editLastname")).sendKeys("ENG" + ranName);
		
		//Setting the Sex button
		WebElement radio1 = wd.findElement(By.id("M"));
		radio1.click();
		
		//Entering the Date Of Birth
		wd.findElement(By.id("editDateOfBirth")).sendKeys("01/06/1999");
		
		//Entering the Place of birth
		wd.findElement(By.id("editTownOfBirth")).sendKeys("Leeds");
		
		//Setting the country of residence
		wd.findElement(By.id("editNationality")).sendKeys("United Kingdom");
		wd.findElement(By.id("editNationality")).sendKeys(Keys.ENTER);
		
		//Entering Home Address
		wd.findElement(By.id("homeAddresspostcodeSearch")).sendKeys("LS2 8BQ");
		wd.findElement(By.xpath("//*[@id=\"homeAddresspostcodeLookup\"]/button")).click();
		Thread.sleep(2000);
		Select drpAddress = new Select(wd.findElement(By.id("homeAddressaddressSelector")));
		drpAddress.selectByIndex(1);
		
		//Selecting Create a Customer
		wd.findElement(By.id("createCustomer")).click();
		
		
		
	}

}