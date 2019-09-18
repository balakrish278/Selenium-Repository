package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;

public class Base {
	
	public WebDriver driver;
	Properties prop;
	
	public void Choosing_Browser() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Workspace\\Project\\src\\main\\java\\Resources\\Browser.properties");
		prop.load(fis);
		String BrowserName=prop.getProperty("Browser");
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equals("IE"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\Drivers\\1msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void takescreenshot(String result) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\admin\\Desktop\\"+result+".png"));
		
	}

}
