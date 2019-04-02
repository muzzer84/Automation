import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver wd = null;
	
	public Login (WebDriver w) {
	
	this.wd = w;
	}
	
	
	public void login() throws InterruptedException {
		
		Thread.sleep(3000);
		
		wd.findElement(By.id("username")).sendKeys("bcfmanager");
		wd.findElement(By.id("password")).sendKeys("password61");
		wd.findElement(By.id("btn-confirm")).click();

	}

}
