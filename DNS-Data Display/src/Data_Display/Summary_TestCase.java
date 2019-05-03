package Data_Display;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Login.BrowserFatory;
import Login.Login;

@Listeners(Data_Display.TestNG_Listener.class)
public class Summary_TestCase {
	
	
	@Test
	public void testcase() {
		WebDriver driver=BrowserFatory.StartBrowser("Chrome","http://18.130.12.231/dns/index.php");
		Login login=PageFactory.initElements(driver,Login.class);
		login.login(driver);
		driver.navigate().to("http://18.130.12.231/dns/index.php?module=Accounts&view=Detail&record=2252147&mode=showDetailViewByMode&requestMode=full");
		//List<WebElement> links=(List<WebElement>) driver.findElement(By.tagName("a"));
		//int linkcount=links.size();
		//System.out.println(linkcount);
		try {
		Summary summary=PageFactory.initElements(driver,Summary.class);
		summary.Elements(driver);
		}
		catch(Exception e){
			System.out.println("Element is missing");
			}
			
		
		
	}

}
