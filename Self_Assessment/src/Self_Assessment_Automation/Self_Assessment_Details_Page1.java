package Self_Assessment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 

public class Self_Assessment_Details_Page1 {

	WebElement chooseFile;
	void Page1(WebDriver driver) throws InterruptedException{
		
    	Thread.sleep(5000);
		String[] myNo= {"1","2","3","4","5","6","7","8","9","10"};
        String[] myText = {"Director/Shareholder","Self employed","Partnership Income","Employment income","Rental Income","Interest Income","Benefit in Kind","Dividends","State Pension","Private Pension"};
        for( int i = 0; i < myNo.length; i++)
		   {
		    String no = myNo[i];
		    String text = myText[i];    
	
		    driver.findElement(By.id("option"+no)).click();
		    driver.findElement(By.id("txComments"+no)).clear();
			driver.findElement(By.id("txComments"+no)).sendKeys(""+text);
			//File_upload_QNo_5
			if (i==5)
			{
				chooseFile= driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[5]/div[4]/div[2]/div/span[1]/input"));
				Thread.sleep(3000);
			    chooseFile.sendKeys("E:\\Downloads\\download (1).jpg");
			    System.out.println("File uploaded successfully");
			    continue;
			}
		   }
			   
			    Thread.sleep(3000);
			    System.out.println("Page1 details given successfully");
			    //Next button
			    driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[12]/div[1]/ul/li[3]/div/button")).click();
				               
            
	}		
}
