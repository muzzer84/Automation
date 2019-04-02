import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Options {
	

	public static void EngFT(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wb = new ChromeDriver(); // The Class
		wb.manage().window().maximize();
		
		wb.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
		Thread.sleep(2000);
		
	    Login log = new Login(wb); // Login = Class title, log = short name for object, new = since its a new object, login() = Class title  
	    EngCreateCustomer ccus = new EngCreateCustomer(wb);
	    CreateEngFTApplication capp = new CreateEngFTApplication(wb);
	    AddEvidence addevi = new AddEvidence(wb);
	    runAssessment runAss = new runAssessment(wb);
	    CustomerDetailsCapture cap = new CustomerDetailsCapture(wb);
	    
	  
	    log.login(); //log = what you nicked name the class, login(); = the method within the Login Class to be called
	    ccus.create();
	    capp.create();
	    addevi.evidence();
	    runAss.assessment();
	    cap.capture();
		
		
	}

public static void EngPT(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wb = new ChromeDriver(); // The Class
		wb.manage().window().maximize();
		
		wb.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
		Thread.sleep(2000);
		
	    Login log = new Login(wb); // Login = Class title, log = short name for object, new = since its a new object, login() = Class title  
	    EngCreateCustomer ccus = new EngCreateCustomer(wb);
	    CreateEngPTApplication capp = new CreateEngPTApplication(wb);
	    AddEvidence addevi = new AddEvidence(wb);
	    runAssessment runAss = new runAssessment(wb);
	    CustomerDetailsCapture cap = new CustomerDetailsCapture(wb);
	    
	    log.login(); //log = what you nicked name the class, login(); = the method within the Login Class to be called
	    ccus.create();
	    capp.create();
	    addevi.evidence();
	    runAss.assessment();
	    cap.capture();
		
		
	}

public static void WalFT(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
	WebDriver wb = new ChromeDriver(); // The Class
	wb.manage().window().maximize();
	
	wb.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
	Thread.sleep(2000);
	
    Login log = new Login(wb); // Login = Class title, log = short name for object, new = since its a new object, login() = Class title  
    WalCreateCustomer ccus = new WalCreateCustomer(wb);
    CreateWalFTApplication capp = new CreateWalFTApplication(wb);
    AddEvidence addevi = new AddEvidence(wb);
    runAssessment runAss = new runAssessment(wb);
    CustomerDetailsCapture cap = new CustomerDetailsCapture(wb);
    
    log.login(); //log = what you nicked name the class, login(); = the method within the Login Class to be called
    ccus.create();
    capp.create();
    addevi.evidence();
    runAss.assessment();
    cap.capture();
	
	
}

public static void WalPT(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
	WebDriver wb = new ChromeDriver(); // The Class
	wb.manage().window().maximize();
	
	wb.get("https://www.optimus-nt-new.slc.co.uk/login"); // tells the driver what to do with Chrome when open
	Thread.sleep(2000);
	
    Login log = new Login(wb); // Login = Class title, log = short name for object, new = since its a new object, login() = Class title  
    WalCreateCustomer ccus = new WalCreateCustomer(wb);
    CreateWalPTApplication capp = new CreateWalPTApplication(wb);
    AddEvidence addevi = new AddEvidence(wb);
    runAssessment runAss = new runAssessment(wb);
    CustomerDetailsCapture cap = new CustomerDetailsCapture(wb);
    
    log.login(); //log = what you nicked name the class, login(); = the method within the Login Class to be called
    ccus.create();
    capp.create();
    addevi.evidence();
    runAss.assessment();
    cap.capture();
	
	
}
	
	
}

