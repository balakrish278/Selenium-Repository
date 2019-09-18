package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropDown extends Base {
	
	@Test
	public void checkBox() {
		
		base();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown-class-example")));
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		//s.selectByValue("option2");
		/*int dd=driver.findElements(By.id("dropdown-class-example")).size();
		for(int i=0;i<dd;i++) {
			String value=driver.findElements(By.id("dropdown-class-example")).get(i).getText();
			if(value.equals("option2")) {
				driver.findElements(By.id("dropdown-class-example")).get(i).click();
			}
		}*/
		
		List<WebElement> oSize = s.getOptions();
		for(WebElement op : oSize) {
			if(op.getText().equals("option2")) {
				 s.selectByVisibleText(op.getText());
			}
			System.out.println(op.getText());
			
		}
		 int iListSize = oSize.size();
		
		 // Setting up the loop to print all the options
		 for(int i =0; i < iListSize ; i++){
		 // Storing the value of the option 
		 String sValue = s.getOptions().get(i).getText();
		 // Printing the stored value
		 System.out.println(sValue);
		 // Putting a check on each option that if any of the option is equal to 'Africa" then select it 
		 if(sValue.equals("option2")){
		 s.selectByIndex(i);
		 break;
		 }
		 }     
		/*List <WebElement> options = s.getOptions();
		int size = options.size();
		for(int i =0; i < size ; i++) {
			String value = s.getOptions().get(i).getText();
			if(value.equals("option2")){
				 s.selectByIndex(i);
				 break;
				 }
			
		}*/
		
		
	}

}
