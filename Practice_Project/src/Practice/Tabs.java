package Practice;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tabs extends Base {
	
	@Test
	public void tab() throws InterruptedException {
	base();
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("opentab"))).click();	
	
	//String mainWindow=driver.getWindowHandle();
	
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	Thread.sleep(2000);
	driver.switchTo().window(tabs.get(1));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("COURSES"))).click();
	}

}
