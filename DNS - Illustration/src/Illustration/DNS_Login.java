package Illustration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DNS_Login {
	
	
	public void login(WebDriver driver) {
		
		driver.get("http://18.130.12.231/dns/index.php");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));		
		driver.findElement(By.id("username")).sendKeys("rex");
		driver.findElement(By.id("password")).sendKeys("Newpwd4321@");
		driver.findElement(By.xpath(".//*[@id='forgotPassword']/button"));		
	}

}
