package Self_Assessment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Self_Assessment_Details_Page2 {
	
	void Page2(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		String[] myNo= {"11","12","13","14","15","16","17","18","19","20"};
        String[] myText = {"Sold any Assets","Child Benefit","Other Income","loan to finance","Gift aid donations to Charities","Pension Contributions","EIS, SEIS and VCT","Blind Personal Allowance","£11,000"," Student Loan"};
        for( int i = 0; i < myNo.length; i++)
		   {
		    String no = myNo[i];
		    String text = myText[i];    
	
		    driver.findElement(By.id("option"+no)).click();
		    driver.findElement(By.id("txComments"+no)).clear();
			driver.findElement(By.id("txComments"+no)).sendKeys(""+text);
			}
           System.out.println("Page2 details given successfully");
           Thread.sleep(2000);
           //Next button  
           driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[12]/div[1]/ul/li[3]/div/button")).click();
	}

}
