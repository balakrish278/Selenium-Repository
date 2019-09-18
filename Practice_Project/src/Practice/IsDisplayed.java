package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IsDisplayed extends Base {
	
	@Test
	public void isdisplayed() throws InterruptedException {
	base();
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hide-textbox")));	
	System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
	driver.findElement(By.id("hide-textbox")).click();
	System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
	}

}
