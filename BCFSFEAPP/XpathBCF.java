import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBCF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // The Class

		driver.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
		Thread.sleep(7000);
		
		//Xpath Method - //<tagname>[@attrubute='value']
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bcfmanager");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password61");
		//driver.findElement(By.xpath("//button[@text='Confirm']")).click();
		
		//CSS Selector - tagname[attrubute='value] 
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("bcfmanager");
		//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password61");
		//driver.findElement(By.cssSelector("button[title='Sign in to Optimus']")).click();
		
		//CSS Selector Alt - tagname#id / #id / #email etc (only works if there is an ID/email etc attrubute)
		driver.findElement(By.cssSelector("#username")).sendKeys("bcfmanager");
		driver.findElement(By.cssSelector("#password")).sendKeys("password61");
		driver.findElement(By.cssSelector("#btn-confirm")).click();

	}
	

}
