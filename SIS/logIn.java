import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logIn {
	
  WebDriver wb;
	
	public void login2 (WebDriver w) {

		this.wb = w;
		}


	public void userLogin() {
		
		
		//Entering the Username
	    wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div/div[2]/input")).sendKeys("UNLESS1");
	    
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[2]/div[2]/button")).click();
				
		//Entering the password and secret question
		wb.findElement((By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div[1]/div[2]/input"))).sendKeys("pa55word1");
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[1]/div/div[2]/div[2]/input")).sendKeys("wonderwoman");
		wb.findElement(By.xpath("//*[@id=\"Content\"]/div/form/div[2]/div[2]/button")).click();
				
		//Selecting the SIS link
		wb.findElement(By.xpath("//*[@id=\"navbar\"]/li[7]/a")).click();

	}

}
