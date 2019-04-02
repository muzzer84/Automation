import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class runAssessment {
	
    WebDriver wd = null;
	
	public runAssessment (WebDriver w) {
	
	this.wd = w;
	}

	public void assessment() throws InterruptedException {
		
		Thread.sleep(2000);
		wd.findElement(By.id("submitAssessment")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("pgd-information-panel-customer-fullname")).click();
}
}