package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.airindia.in/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.className("bookFlight"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(dd)).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",dd);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_classType1")));
		Select select = new Select(driver.findElement(By.id("_classType1")));		
		List<WebElement> options = select.getOptions();
		for(WebElement item:options) 
        { 
        
             System.out.println(item.getText());           
        }


	}

}
