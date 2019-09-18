package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Check_box extends Base {
	
	@Test
	public void checkBox() {
		
		base();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		int size=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		for(int i=0;i<size;i++) {				
			
			if(i==1) {
				
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
				break;
			}
			
	}
		
	}

}
