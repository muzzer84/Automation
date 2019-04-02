import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.lang3.RandomStringUtils;


public class WalCreateCustomer {

    WebDriver wd = null;
	
	public WalCreateCustomer (WebDriver w) {
	
	this.wd = w;
	}
	
	
	public void create() throws InterruptedException {
		String ran = RandomStringUtils.randomAlphabetic(10);
		
		
		Thread.sleep(3000); 
		wd.findElement(By.id("createCustomer")).click(); 
		
		Thread.sleep(3000);
		Select drpTitle = new Select(wd.findElement(By.id("editTitle"))); 
		drpTitle.selectByIndex(1);
		
		wd.findElement(By.id("editFirstname")).sendKeys("PGLDOC");
		
		wd.findElement(By.id("editLastname")).sendKeys("WALES" + ran); 
		
		WebElement radio1 = wd.findElement(By.id("M")); 
		radio1.click();
		
		wd.findElement(By.id("editDateOfBirth")).sendKeys("01/01/1999");
		wd.findElement(By.id("editTownOfBirth")).sendKeys("Cardiff");
		
		wd.findElement(By.id("editNationality")).sendKeys("United Kingdom");
		wd.findElement(By.id("editNationality")).sendKeys(Keys.ENTER);
		
		wd.findElement(By.id("homeAddresspostcodeSearch")).sendKeys("CF10 2HE");
		wd.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		Select drpAddress = new Select(wd.findElement(By.xpath("//select[@name='homeAddress']")));
		drpAddress.selectByIndex(1);
		
		wd.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
