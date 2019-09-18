package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover extends Base {
	
	@Test
	public void tab() throws InterruptedException {
	base();
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mousehover"))).click();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.id("mousehover"))).moveToElement(driver.findElement(By.linkText("Top"))).click().build().perform();
	//act.moveToElement(driver.findElement(By.id("mousehover"))).moveToElement(driver.findElement(By.linkText("Reload"))).click().build().perform();
	
	}

}
