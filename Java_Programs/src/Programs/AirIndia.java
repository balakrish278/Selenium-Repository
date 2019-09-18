package Programs;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirIndia {
	
	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://www.airindia.in/");
	   driver.manage().window().maximize();
	   WebElement dd = driver.findElement(By.className("bookFlight"));
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOf(dd)).click();
	   JavascriptExecutor je = (JavascriptExecutor) driver;
	   je.executeScript("arguments[0].scrollIntoView(true);",dd);
	   Thread.sleep(3000);
	   WebElement oneway=driver.findElement(By.xpath("//label[contains(text(),'One Way')]"));
	   wait.until(ExpectedConditions.visibilityOf(oneway)).click();	   
	   WebElement From= driver.findElement(By.id("from"));
	   wait.until(ExpectedConditions.visibilityOf(From)).click();
	   From.sendKeys("Che");
	   From.sendKeys(Keys.DOWN,Keys.RETURN);
	   FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
		        .withTimeout(30, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
			 
			 // WebElement foo = wait1.until(new Function() {
			 
			 //   public WebElement apply(WebDriver driver) {
			 
			 //   return driver.findElement(By.id("foo"));
			 
			    //}
			 
			 //  });
	  
	   
	
	}

}
