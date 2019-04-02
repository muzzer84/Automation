import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDetailsCapture {
		
	    WebDriver wd = null;
		
		public CustomerDetailsCapture (WebDriver w) {
		
		this.wd = w;
		}

		public void capture() throws InterruptedException {
		
			Thread.sleep(5000);
			System.out.println("Customer Name: " + wd.findElement(By.id("forenames")).getText() + " " + wd.findElement(By.id("surname")).getText());	     
			System.out.println("Customer CRN: " + wd.findElement(By.id("customerCrn")).getText());
			System.out.println("Customer SSN: " + wd.findElement(By.id("ssn")).getText());
			Thread.sleep(2000);
			wd.quit();

	}

		
}
