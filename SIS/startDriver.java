import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startDriver {

	public WebDriver main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\V2.36\\chromedriver.exe");
		WebDriver wb = new ChromeDriver(); // The Class
		wb.manage().window().maximize();
		
		wb.get("http://nexttestlogin.heiportal.co.uk/pls/orasso/oaupk002.p_get_username?site2pstoretoken=v1.2~BBBA610A~B7FE921FE6FE09734865008DBE6BAC8CB3AE6419990CD064A6158FBBF9B72071CC9587700A82B9DC14530A3DE7435946F58F1511222B0B38CA28B23A25EA2356D09B311B8D40CEBAD310512B3EC41423B13F42C02F98594DBE4AF02DDCFA815B9416361DAEC33DD878C39219F869453CD12DF0F0ED8BE02C529686F1597407B0B4348A612CBF74EEB229F85E2D9DBD783120AA47F50D85C74DBB847BD94D37506FD815BF157D221469AA021D527EDCAA6F89091F9A4F4F289107B9D414AC60D16EF34913A7FA18FA0268DAC7FF8046783085D9CB2BAEE6742D5CE4070AB03D64921B26CD1F741F5C&p_error_code=&p_submit_url=http%3A%2F%2Fnexttestlogin.heiportal.co.uk%2Fsso%2Fauth&p_cancel_url=http%3A%2F%2Fnexttestsecure.heiportal.co.uk%2Fpls%2Fportal%2FPORTAL.home&ssousername="); // tells the driver what to do with Chrome when open
		Thread.sleep(2000);
		return wb;
	}

}
