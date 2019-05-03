package Q2M;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {
	static WebDriver driver;
	static WebElement ele;
    		
	public static void main(String[] args) throws Exception {
		String url="http://q2m.in/home";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Successfully opened the website"+url);
        String Title = driver.getTitle();
        System.out.println("Title:" + Title);       
        //driver.navigate().to("http://www.facebook.com");
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        //driver.switchTo().window(tabs.get(0));
        //driver.navigate().to("http://www.facebook.com");
        for(int i=1;i<=3;i++)
        {
        	ele = driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/a"));        	
        	Thread.sleep(2000);
        	action.moveToElement(ele).moveToElement(driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/div/ul/li["+i+"]/a"))).click().build().perform();        	      	
        }
        for (int i=1;i<=6;i++)
        {
        	ele = driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[2]/a"));
        	Thread.sleep(2000);
        	action.moveToElement(ele).moveToElement(driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[2]/div/ul/li["+i+"]/a"))).click().build().perform();
        }
        for (int i=1;i<=5;i++)
        {
        	ele = driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[3]/a"));
        	Thread.sleep(2000);
        	action.moveToElement(ele).moveToElement(driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[3]/div/ul/li["+i+"]/a"))).click().build().perform();
        }
        Object TakeScreenshot;
        Thread.sleep(2000);       
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\admin\\Desktop\\screenshot.png"));
		
	}

}
