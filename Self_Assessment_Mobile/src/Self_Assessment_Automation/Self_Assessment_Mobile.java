package Self_Assessment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Self_Assessment_Mobile {

  public static final String USERNAME = "afm5";
  public static final String AUTOMATE_KEY = "v19XS9L3qjzEgBAHp9Wp";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("os_version", "11.0");
	  caps.setCapability("device", "iPhone 8 Plus");
	  caps.setCapability("real_mobile", "true");
	  //caps.setCapability("browserstack.local", "true");
	  caps.setCapability("browserstack.debug", "true");
	  caps.setCapability("browserstack.networkLogs", "true");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://www.q2m.in/home");     
    System.out.println(driver.getTitle());
    
	/*  //Login using xpath
	 Thread.sleep(5000);		
	 driver.findElement(By.xpath(".//*[@id='taxYrCode']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath(".//*[@id='taxYrCode']/option[3]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[4]/button")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath(".//*[@id='nino']")).sendKeys("zxcv1234");
     driver.findElement(By.xpath(".//*[@id='utr']")).sendKeys("770818");
     driver.findElement(By.xpath(".//*[@id='frmChkUser']/fieldset/div[4]/div/div/button")).click();
     System.out.println("Logged in Successfully");
     
	
   // static void Self_Assessment_Details_Page1() throws InterruptedException{
    
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
			}
            System.out.println("Page1 details given successfully");              	
            driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[12]/div[1]/ul/li[3]/div/button")).click();
        		    
    //static void Self_Assessment_Details_Page2() throws InterruptedException{
        Thread.sleep(5000);
		String[] myNo1= {"11","12","13","14","15","16","17","18","19","20"};
        String[] myText1 = {"Sold any Assets","Child Benefit","Other Income","loan to finance","Gift aid donations to Charities","Pension Contributions","EIS, SEIS and VCT","Blind Personal Allowance","£11,000"," Student Loan"};
        for( int i = 0; i < myNo1.length; i++)
		   {
		    String no1 = myNo1[i];
		    String text1 = myText1[i];    
	
		    driver.findElement(By.id("option"+no1)).click();
		    driver.findElement(By.id("txComments"+no1)).clear();
			driver.findElement(By.id("txComments"+no1)).sendKeys(""+text1);
			}
           System.out.println("Page2 details given successfully");
           Thread.sleep(2000);
           //Next button  
           driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[12]/div[1]/ul/li[3]/div/button")).click();
	       
	// static void Self_Assessment_Details_Page3() throws InterruptedException{
        Thread.sleep(5000);
		String[] myNo2= {"21","22","23","24"};
        String[] myText2 = {"started/stopped","outside the UK","tax information","previous/future years"};
        for( int i = 0; i < myNo2.length; i++)
		   {
		    String no2 = myNo2[i];
		    String text2 = myText2[i];    
	
		    driver.findElement(By.id("option"+no2)).click();
		    driver.findElement(By.id("txComments"+no2)).clear();
			driver.findElement(By.id("txComments"+no2)).sendKeys(""+text2);
			
			}
           driver.findElement(By.id("txComments25")).clear();
           driver.findElement(By.id("txComments25")).sendKeys("records with HMRC");
           System.out.println("Page3 details given successfully");
		   driver.quit();*/
  }	

}