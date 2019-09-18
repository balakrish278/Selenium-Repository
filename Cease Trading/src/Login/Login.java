package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='username']")
	WebElement Username;
	@FindBy(how=How.XPATH,using=".//*[@id='password']")
	WebElement Password;
	@FindBy(how=How.XPATH,using=".//*[@id='forgotPassword']/button")
	WebElement SignIn;
	
	public void login(WebDriver driver) {
		
		WebDriverWait wait;
		wait=new WebDriverWait(driver,30);
		WebElement Username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		Username.sendKeys("rex");
		Password.sendKeys("Newpwd4321@");
		SignIn.click();
		
	}

}
