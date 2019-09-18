package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iPhone {
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.amazon.in/";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,30);				                                                                                        
		WebElement iPhone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='iPhone X - 64 gb']")));
		iPhone.click();
		

	}

}
