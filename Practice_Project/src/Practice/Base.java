package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public void base() {
	
	//System.setProperty("webdriver.sa.driver", "E:\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/practice.php");
	driver.manage().window().maximize();
	
	}

}
