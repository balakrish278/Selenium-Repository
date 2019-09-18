package Esign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DNS_Login {
	    
	    
	    void Login(WebDriver driver) throws InterruptedException{
	   
	    WebDriverWait wait;	    
	    wait=new WebDriverWait(driver,30);
		WebElement Username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		Username.sendKeys("rex");
		driver.findElement(By.id("password")).sendKeys("Newpwd4321@");
		driver.findElement(By.xpath(".//*[@id='forgotPassword']/button")).click();		
		}
	    
}
