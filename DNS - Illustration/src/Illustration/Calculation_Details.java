package Illustration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculation_Details {
	
	public void details(WebDriver driver) throws InterruptedException {
		
		driver.navigate().to("http://18.130.12.231/dns/calculator/index.php?record_no=2252154&user=1&module=Accounts");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selection")));
		Select s =new Select(driver.findElement(By.id("selection")));
		s.selectByIndex(1);
		driver.findElement(By.xpath("//input[@placeholder='Turnover']")).sendKeys("100000");
		driver.findElement(By.id("btnSubmit")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number'][@id='expense_one']")));
		driver.findElement(By.xpath("//input[@type='number'][@id='expense_one']")).sendKeys("766.67");
		driver.findElement(By.id("btnSubmit")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-toggle='toggle']")));		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
