package Comparison;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpcomingBikes {
	
	WebDriver driver;
	@BeforeTest
	public void URL() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.bikewale.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Upcomingbike()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement upcomingtab=driver.findElement(By.xpath("(//div[@class='bw-tabs bw-tabs-flex'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",upcomingtab);		
		Actions act=new Actions(driver);
		for(int i=0;i<=3;i++) {
		String text=driver.findElements(By.xpath("(//div[@class='bw-tabs bw-tabs-flex'])[2]")).get(i).getAttribute("class");
		if(upcomingtab.getAttribute("class").contains("")) {
			act.moveToElement(upcomingtab).click().build().perform();
		}
		}
		try {
		wait.until(ExpectedConditions.visibilityOf(upcomingtab));
		upcomingtab.click();
		act.moveToElement(upcomingtab).click().build().perform();
		System.out.println(driver.findElement(By.xpath("//li[@data-tabs='ctrlMostPopularBikes']")).getAttribute("class"));
        System.out.println(upcomingtab.getAttribute("class"));	
		}
		catch(Exception e) {
	 	System.out.println(e);
	 	throw(e);
		}
		
		
		
	}

}
