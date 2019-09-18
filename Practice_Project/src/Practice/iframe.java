package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class iframe extends Base {
	
	@Test
	public void iFrame() throws InterruptedException {
	base();
	wait=new WebDriverWait(driver,30);
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
	WebElement f=driver.findElement(By.xpath("//iframe[@id='sumome-jquery-iframe']"));
	driver.switchTo().frame(f);
	driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("qwerty");
	
	}

}
