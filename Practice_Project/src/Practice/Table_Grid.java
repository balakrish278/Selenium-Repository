package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Table_Grid extends Base{
	
	@Test
	public void grid() throws InterruptedException {
	base();
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product"))).click();
	for(int i=2;i<12;i++) {
		for(int j=1;j<4;j++) {
			System.out.print(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]")).getText());
			System.out.print("  ");
		}
		System.out.println();
	}
	
	}

}
