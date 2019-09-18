package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Auto_Suggestion extends Base {
	
	
	@Test
	public void auto() throws InterruptedException {
		base();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.RETURN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.SHIFT,"hello");		
	}

}
