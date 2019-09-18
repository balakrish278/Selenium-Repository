package Comparison;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Biketest {
	WebDriver driver;
	
	@BeforeTest
	public void URL() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.bikewale.com/comparebikes/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void biketest() 
	{
		String CB300R[]= {"","Honda","CB300R","Standard"};
		String R3[]= {"","Yamaha","R3","Standard"};
		String Continental[]= {"","Royal","Continental","Standard"};
		String Z250[]= {"","Kawasaki","Z250","Standard"};
		
	    Actions act=new Actions(driver);
	    
	    WebDriverWait wait=new WebDriverWait(driver,30);	    
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='add-icon'])[1]"))).click();
	    for(int i=1;i<=3;i++)
	    {
		WebElement dd=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div["+i+"]/div[1]"));		
		wait.until(ExpectedConditions.visibilityOf(dd));		
		act.moveToElement(dd).click().sendKeys(CB300R[i],Keys.RETURN).build().perform();
		}
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='add-icon'])[2]"))).click();	   
	    for(int i=1;i<=3;i++)
	    {
		WebElement dd=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div["+i+"]/div[1]"));		
		wait.until(ExpectedConditions.visibilityOf(dd));		
		act.moveToElement(dd).click().sendKeys(R3[i],Keys.RETURN).build().perform();
		}
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='add-icon'])[3]"))).click();
	    for(int i=1;i<=3;i++)
	    {
		WebElement dd=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/div["+i+"]/div[1]"));		
		wait.until(ExpectedConditions.visibilityOf(dd));		
		act.moveToElement(dd).click().sendKeys(Continental[i],Keys.RETURN).build().perform();
		}
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='add-icon'])[4]"))).click();
	    for(int i=1;i<=3;i++)
	    {
		WebElement dd=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[2]/div["+i+"]/div[1]"));		
		wait.until(ExpectedConditions.visibilityOf(dd));		
		act.moveToElement(dd).click().sendKeys(Z250[i],Keys.RETURN).build().perform();
		}
			
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnCompare']"))).click();	
	
	}

}
