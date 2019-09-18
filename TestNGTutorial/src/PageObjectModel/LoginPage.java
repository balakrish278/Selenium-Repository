package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;	
	@FindBy(how=How.ID,using="username")
	WebElement username;
	@FindBy(how=How.XPATH,using=".//*[@id='password']")
	WebElement password;
	@FindBy(how=How.XPATH,using=".//*[@id='forgotPassword']/button")
	WebElement signin;
	@FindBy(xpath="")
	WebElement xyz;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement Username() {
		return username;
	}
	public WebElement Password() {
		return password;
	}
	public WebElement SignIn() {
		return signin;
	}
	

}
