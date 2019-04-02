import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver {

	public void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wb = new ChromeDriver(); // The Class
		wb.manage().window().maximize();
		
		wb.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
		Thread.sleep(2000);
	}

}
