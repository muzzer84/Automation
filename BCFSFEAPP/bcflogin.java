import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.lang3.RandomStringUtils; //Needed to generate Random String

public class bcflogin {

	public static void main(String[] args) throws InterruptedException {
		String ran = RandomStringUtils.randomAlphabetic(20);// How to generate Random String

		// First step is to set which Browser you want to use and how to invoke it
		// The following two Steps tells the webdriver where to find Chrome and how to
		// open it
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // The Class

		driver.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
		Thread.sleep(7000); // Gives the page 7 seconds to find the code
		driver.findElement(By.id("username")).sendKeys("bcfmanager"); // ID's the username box and populates it
		driver.findElement(By.id("password")).sendKeys("password61"); // ID's the password box and populates it
		// driver.findElement(By.id("btn-confirm")).click(); //IDs the log in button and and clicks it
		
		/* driver.findElement(By.xpath("//*[@id='btn-confirm']")).click();
		 *Using Xpath as ID, Inspect on Browser, then Rightclick then Copy to Xpath. 
		 * Make sure it's  single quotes around the text
		 */
		
	 
		//driver.findElement(By.cssSelector("#btn-confirm")).click(); // Using CSS ID, Inspect on Browser, then Rightclick
																	// then Copy to Selector
		driver.findElement(By.xpath("//button[@text='Confirm']")).click(); //Using Custom Xpath
		Thread.sleep(7000);
		
		//System.out.println(driver.findElement(By.cssSelector("#loginErrorMessage")).getText()); //how to print text from the screen to the console
		
        /*To Validate a CSS path or a Xpath
         * On Inspect, Copy the CSS/Xpath
         * Select 'Console' 
         * In the input field at the bottom
         * For CSS enter $("<CSS path>")
         * For Xpath enter $x("<xpath>")
         * Select Return
         * An Element will be returned if the paths are valid
         * 
         * Custom Xpath - On Inspect, Spy on a element and go to the HTML code and pull an unique value to Identify the field
         * Xpath Syntax = //<tagname>[@attrubute='value'] eg //input[@id='username']
         * 
         * Custom CSS - On Inspect, Spy on a element and go to the HTML code and pull an unique value to Identify the field
         * CSS Syntax = tagname[attrubute='value] 
         * 
         */
		
		/*
		// User is now logged into the BCF System
		// Now to create a customer
		Thread.sleep(7000); // Gives the page 7 seconds to find the code
		driver.findElement(By.id("createCustomer")).click(); // Selecting the Create Customer Link
		Thread.sleep(7000);
		Select drpTitle = new Select(driver.findElement(By.id("editTitle"))); //Selecting the Drop Down menu
		drpTitle.selectByIndex(1);
		driver.findElement(By.id("editFirstname")).sendKeys("PGL");
		driver.findElement(By.id("editLastname")).sendKeys(ran); //Entering a Random String
		WebElement radio1 = driver.findElement(By.id("M")); //Selecting the Radio Button
		radio1.click();
		driver.findElement(By.id("editDateOfBirth")).sendKeys("01/01/1999");
		driver.findElement(By.id("editTownOfBirth")).sendKeys("Leeds");
		
		// driver.close(); //How to close the current browser once the test is finished.
		// driver.quit(); //Closes down all the browsers opened by Selinium script
		 * 
		 */
	}

}
