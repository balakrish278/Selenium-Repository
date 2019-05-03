package Q2M;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class No_Of_Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebElement ele;
		 
		 driver.get("http://www.q2m.in/home");
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 Actions action = new Actions(driver);
		 for(int i=1;i<=3;i++)
	        {
	        	ele = driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/a"));        	
	        	Thread.sleep(2000);
	        	action.moveToElement(ele).build().perform();        	      	
	        }
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText());
		 
		 }
		 
		 }

	}


