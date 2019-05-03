package Self_Assessment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Self_Assessment_Login  {
	    WebDriver driver;
	
	 
	public Self_Assessment_Login(WebDriver driver) throws InterruptedException {
		//this.driver=driver1;
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='taxYrCode']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='taxYrCode']/option[4]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[4]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='nino']")).sendKeys("zxcv1234");
        driver.findElement(By.xpath(".//*[@id='utr']")).sendKeys("770818");
        driver.findElement(By.xpath(".//*[@id='frmChkUser']/fieldset/div[4]/div/div/button")).click();
        System.out.println("Logged in Successfully");
	}

}
