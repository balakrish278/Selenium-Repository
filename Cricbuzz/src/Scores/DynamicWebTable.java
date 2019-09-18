package Scores;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTable {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20246/aus-vs-wi-match-10-icc-cricket-world-cup-2019");
	    driver.manage().window().maximize();	   
	    WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("innings_1"))));
		List <WebElement> cols=driver.findElements(By.xpath(".//*[@id='innings_1']/div[1]/div[3]/div"));
		int colCount=cols.size();
		System.out.println(colCount);
		List <WebElement> rows=driver.findElements(By.xpath(".//*[@id='innings_1']/div[1]/div"));
		int rowCount=rows.size();
		System.out.println(rowCount);
		for(int i=3;i<=rowCount;i++)
		{
			WebElement b=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[1]"));
			String bats=b.getText();
			if(bats.equals("Glenn Maxwell")) 
			{
				driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[1]")).click();
				break;
			}
		}
		
	}
	}


