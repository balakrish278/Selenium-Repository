package Client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Login.BrowserFatory;
import Login.Login;


public class Summary_TestCase {
	
	
	@Test
	public void testcase() {
		WebDriver driver=BrowserFatory.StartBrowser("Chrome","http://18.130.12.231/dns/index.php");
		Login login=PageFactory.initElements(driver,Login.class);
		login.login(driver);
		driver.navigate().to("http://18.130.12.231/dns/index.php?module=Accounts&view=List");
		
				
		}

}
