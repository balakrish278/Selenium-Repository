package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert extends Base {
	
	@Test
	public void alert() throws InterruptedException {
	base();
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']"))).sendKeys("Test");
	driver.findElement(By.id("alertbtn")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test");
	driver.findElement(By.id("confirmbtn")).click();
	driver.switchTo().alert().dismiss();
	
	}

}
