package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Window extends Base{
	
	//@Test
	public void window() throws InterruptedException {
		
		base();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("openwindow"))).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("openwindow"))).click();
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> i=allWindowHandles.iterator();
		while(i.hasNext()){
			 String childWindow=i.next();
			   
			 if(!mainWindow.equals(childWindow)){
			 driver.switchTo().window(childWindow);
			 driver.navigate().refresh();
			 }
		}
		/*String parent=i.next();
		String child=i.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(parent);
		driver.close();	*/	
		
	}
	@Test
	public void window1() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]"))).click();
		Set<String> win=driver.getWindowHandles();
		Iterator<String> i=win.iterator();
		//String parent=i.next();
		String child=i.next();
		driver.switchTo().window(child);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='RveJvd snByac']"))).click();
		
		
	}

}
