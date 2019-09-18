package Group_Data_Check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
    public void login(WebDriver driver) {
	String url="https://crm.nomismasolution.co.uk/livednsgroup/";
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='username']")));
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("rex");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("@Newpwd4321@@");
	driver.findElement(By.xpath(".//*[@id='forgotPassword']/button")).click();
	//Navigation
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menubar_item_Accounts']/span")));
	
		
	}
}
	
