package Outsourcing_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Outsourcing_Login   {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='login-form']/section/form/div[1]/input")
	@CacheLookup
	WebElement Email;
	@FindBy(how=How.XPATH,using=".//*[@id='inputPassword']")
	@CacheLookup
	WebElement Password;
	@FindBy(how=How.XPATH,using=".//*[@id='login-form']/section/form/button")
	@CacheLookup
	WebElement SignIn_button;
	
	
public void Login_Credential(String email,String password) {	

	
    Email.sendKeys(email);
	Password.sendKeys(password);
	SignIn_button.click();
	
}
}
