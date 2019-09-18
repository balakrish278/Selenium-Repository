package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Radio_Button extends Base {
	
	
	@Test
	public void radio()  {
		
		base();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='radioButton']")));
		int size=driver.findElements(By.xpath("//input[@name='radioButton']")).size();
		//size from 0,1,2
		for(int i=0;i<size;i++) {				
				
				if(i==1) {
					
					driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
					break;
				}
				
		}
		
		driver.close();
	}

}
