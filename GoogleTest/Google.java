import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		//First step is to set which Browser you want to use and how to invoke it
		//The following two Steps tells the webdriver where to find Chrome and how to open it
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //The Class
		
		driver.get("https://www.optimus-nt-new.slc.co.uk/login"); //tells the driver what to do with Chrome when open
		
		
		
		driver.close(); //How to close the current browser once the test is finished.
		//driver.quit(); //Closes down all the browsers opened by Selinium script
	}

}
