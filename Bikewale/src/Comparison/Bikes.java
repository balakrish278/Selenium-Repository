package Comparison;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bikes {
	
    WebDriver driver;
	
	@BeforeTest
	public void URL() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.bikewale.com/comparebikes/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void ChoosingBike1() {
		
		String CB300R[]= {"","Honda","CB300R","Standard"};
		String R3[]= {"","Yamaha","R3","Standard"};
		String Continental[]= {"","Royal","Continental","Standard"};
		String Z250[]= {"","Kawasaki","Z250","Standard"};
		
	    Actions act=new Actions(driver);
	    
	    WebDriverWait wait=new WebDriverWait(driver,30);
		
	    for(int i=1;i<=4;i++)
	    {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='add-icon'])["+i+"]"))).click();
	    for(int j=1;j<=3;j++)
	    {
		WebElement dd=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li["+i+"]/div[2]/div["+j+"]/div[1]"));		
		wait.until(ExpectedConditions.visibilityOf(dd));
		if(i==1)
		{
		act.moveToElement(dd).click().sendKeys(CB300R[j],Keys.RETURN).build().perform();
		}
		else if(i==2)
		{
			act.moveToElement(dd).click().sendKeys(R3[j],Keys.RETURN).build().perform();
		}
		else if(i==3)
		{
			act.moveToElement(dd).click().sendKeys(Continental[j],Keys.RETURN).build().perform();
		}
		else if(i==4)
		{
			act.moveToElement(dd).click().sendKeys(Z250[j],Keys.RETURN).build().perform();
		}
		}
	    }	
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnCompare']"))).click();
	}
					
	@AfterTest
	public void SavaData()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/section[1]/div[1]/div[1]/div[1]/div[6]/ul[1]/li[1]/div[1]"))).getText());
		for(int i=2;i<=17;i++)
		{
			for(int j=1;j<=5;j++)
			{
				String message = "";
				String ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[2]/section[1]/div[1]/div[1]/div[1]/div[6]/ul[1]/li[1]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]"))).getText();
				System.out.print(ele+"\t");
			}
			System.out.println("\n");
		}
	}
}
