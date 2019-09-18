package Esign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Esign {
	
	WebDriverWait wait;
	void Esign(WebDriver driver) throws InterruptedException {
		
		
		wait=new WebDriverWait(driver,30);
		WebElement Clients=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menubar_item_Pricing']/span")));
		Clients.click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//input[@type='text'][@name='subject']"));
		ele.sendKeys("Q2M_QC305");
		ele.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//*[@href='index.php?module=Pricing&view=Detail&record=2252055&mode=showDetailViewByMode&requestMode=full']"));
		ele1.click();
		WebElement Esign_Button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='E-sign']")));
		Esign_Button.click();
		
	}
	
	void CreateContract(WebDriver driver) {
		
		WebElement Contract=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='index.php?module=Esign&view=Create&record=2252055&sourceModule=Pricing']")));
		Contract.click();
		WebElement SendContract=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='contract_to_sign']")));
		SendContract.click();
	}
	

}
