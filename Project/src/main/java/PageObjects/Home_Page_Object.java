package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page_Object {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='btn btn-primary'][1]")
	WebElement Home;
	 	
	public Home_Page_Object(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Home() {
		return Home;
	}
	

}
