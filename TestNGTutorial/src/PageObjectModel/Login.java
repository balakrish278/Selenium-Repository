package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void login() {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,30);;
		driver.manage().window().maximize();
		driver.get("http://18.130.12.231/dns/index.php");
		LoginPage lp=new LoginPage(driver);		
		wait.until(ExpectedConditions.visibilityOf(lp.Username()));
		lp.Username().sendKeys("rex");
		lp.Password().sendKeys("Newpwd4321@");
		lp.SignIn().click();
	}

	

}
