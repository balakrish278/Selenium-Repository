package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadPhones {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=headphones&s=price-asc-rank&qid=1567599774&ref=sr_st_price-asc-rank");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-color-price']")));
		java.util.List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-color-price']"));
		ArrayList<WebElement> al=new ArrayList<WebElement>();		
		for(WebElement wb : list) {				
			
				String str=wb.getText();
				al.add(str);
			
			
		}
		System.out.println(Collections.sort(al));
		

	}

}
