package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFatory {
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browsername,String URL) {
		if(browsername.equals("Chrome")) 
		{
			driver=new ChromeDriver();			
		}
		else if(browsername.equals("Firefox")) 
		{
			driver=new FirefoxDriver();			
		}
		else if(browsername.equals("IE")) 
		{
			driver=new InternetExplorerDriver();			
		}
		else if (browsername.equals("Edge")) 
		{
			driver=new EdgeDriver();			
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}

}
