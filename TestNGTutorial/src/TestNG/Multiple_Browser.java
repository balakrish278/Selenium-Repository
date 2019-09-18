package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multiple_Browser {
	
	WebDriver driver;
	@Test
	public void Login() throws IOException {
	Properties pro=new Properties();
	FileInputStream fis= new FileInputStream("E:\\Workspace\\TestNGTutorial\\Credential.properties");
	pro.load(fis);	
	if(pro.getProperty("Browser").equals("Chrome")) {
		driver=new ChromeDriver();
	}
	else if(pro.getProperty("Browser").equals("Firefox")) {
		driver=new FirefoxDriver();
	}
	driver.get(pro.getProperty("URL"));
	}

}
