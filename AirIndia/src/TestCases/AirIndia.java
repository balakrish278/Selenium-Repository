package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AirIndia {
	
	public WebDriver driver;
	
	@BeforeTest
	public void URL()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.className("bookFlight"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(dd)).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",dd);
	}
	@Test(enabled=false)
	public void BookingTicket() throws InterruptedException
	{
		
		
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement oneway=driver.findElement(By.xpath("//label[contains(text(),'One Way')]"));
		wait.until(ExpectedConditions.visibilityOf(oneway)).click();	   
		WebElement From= driver.findElement(By.id("from"));
		wait.until(ExpectedConditions.visibilityOf(From)).click();
		From.sendKeys("Che");
		Thread.sleep(1000);
		From.sendKeys(Keys.DOWN,Keys.RETURN);
		WebElement To=driver.findElement(By.xpath("//input[@id='to']"));
		To.sendKeys("del");
		Thread.sleep(1000);
		To.sendKeys(Keys.DOWN,Keys.RETURN);
		driver.findElement(By.xpath("//input[@title='Departing']")).sendKeys("03/06/2019");
		driver.findElement(By.xpath("//label[@for='fixedDate']")).click();
		driver.findElement(By.id("btnbooking")).click();
	}
	@Test(enabled=false)
	public void DropDown()
	{
		Select Adults=new Select(driver.findElement(By.xpath("//select[@title='Adults']")));
		Select Childrens=new Select(driver.findElement(By.xpath("//select[@title='Children']")));
		Select Infants=new Select(driver.findElement(By.id("ddlinfants1")));
		Select ClassType=new Select(driver.findElement(By.id("_classType1")));
		ArrayList<Select> al=new ArrayList<Select>();
		al.add(Adults);
		al.add(Childrens);
		al.add(Infants);
		al.add(ClassType);
		for(int i=0;i<al.size();i++)
		{
		List<WebElement> options =al.get(i).getOptions();
		for(WebElement item:options) 
        { 
        
             System.out.println(item.getText());           
        }
		}
			
	}
	@Test
	public void Concession() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,30);		
		WebElement Yes=driver.findElement(By.xpath("//label[@for='rdrules1']"));
		wait.until(ExpectedConditions.visibilityOf(Yes)).click();
		Select ConcessionType=new Select(driver.findElement(By.xpath("//select[@title='Concessionary Type']")));
		List<WebElement> options =ConcessionType.getOptions();
		for(WebElement item:options) 
        { 
        
             System.out.println(item.getText());           
        }
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='js-marquee-wrapper']")).getText();
		
	}
	

}
