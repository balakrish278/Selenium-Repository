package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Table {
	
	WebDriver driver;
	
	@Test
	public void table() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='w3-responsive']")));
		List<WebElement> tableheaders=driver.findElements(By.xpath("//div[@class='w3-responsive']/table/tbody/tr/th"));
		List<WebElement> rows=driver.findElements(By.xpath("//div[@class='w3-responsive']/table/tbody/tr"));
		System.out.println(rows.size());
		System.out.println(tableheaders.size());
		for(WebElement hd:tableheaders) {
			System.out.print(hd.getText());
			System.out.print("  ");
		}
		System.out.println("  ");
		for(int i=2;i<=rows.size();i++) {
		for (int j=1;j<=tableheaders.size();j++) {			 
		 
			 System.out.print(driver.findElement(By.xpath("//div[@class='w3-responsive']/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			 System.out.print("  ");
		}
		System.out.println("");
		
		}
		
		
	}

}
