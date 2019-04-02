import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bcflogin {

	public static void main(String[] args) throws InterruptedException {

		//First step is to set which Browser you want to use and how to invoke it
		//The following two Steps tells the webdriver where to find Chrome and how to open it
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //The Class
		
		driver.get("https://www.optimus-nt-new.slc.co.uk/login"); //tells the driver what to do with Chrome when open
		Thread.sleep(7000); //Gives the page 7 seconds to find the code
		driver.findElement(By.id("username")).sendKeys("bcfmanager"); //ID's the username box and populates it
		driver.findElement(By.id("password")).sendKeys("password61"); //ID's the password box and populates it
		driver.findElement(By.id("btn-confirm")).click(); //IDs the log in button and clicks it
		
			
		//driver.close(); //How to close the current browser once the test is finished.
		//driver.quit(); //Closes down all the browsers opened by Selinium script
	}

}
