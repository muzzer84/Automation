import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code goes here
		
		//First step is to set which Browser you want to use and how to invoke it
		//The following two Steps tells the webdriver where to find Chrome and how to open it
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //The Class
		
		driver.get("http://www.google.com"); //tells the driver what to do with Chrome when open
		System.out.println(driver.getTitle()); //returns the title of the page
		
		System.out.println(driver.getCurrentUrl()); //Returns the current URL of the page. Validates you have landed on correct page.
		
		// System.out.println(driver.getPageSource()); //Gets & prints the page source of the webpage
		
		//driver.get("http://yahoo.com"); //Changes the URL
		//driver.navigate().back(); //how to navivgate back to the previous webpage.
		//driver.navigate().forward(); //how to navigate forward to the next page
		
		driver.close(); //How to close the current browser once the test is finished.
		//driver.quit(); //Closes down all the browsers opened by Selinium script
	}

}
