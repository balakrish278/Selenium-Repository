package Illustration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hundred_Partial {
	
	public void margin(WebDriver driver) {
		
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='wrapper'] //table[@class='center white  margin-top-1']) [1]")));		
		int rowcount=driver.findElements(By.xpath("(//div[@class='wrapper'] //table[@class='center white  margin-top-1']) [1]")).size();
		for(int i=0;i<rowcount;i++) {
		String s=driver.findElements(By.xpath("(//div[@class='wrapper'] //table[@class='center white  margin-top-1']) [1]")).get(i).getText();
		System.out.println(s);
		}
		//int row=margin1.findElements(By.cssSelector("color-blue  td:nth-child(2)")).size();
	}

}
