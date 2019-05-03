package Outsourcing_Automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outsourcing {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
		 System.out.println("1.Login 2.Login_Check 3.Job Estimate 4.Invoices 5. Job 6.Pricing 7.Clients 8.Settings 9.Users 10.Creating a User");
		 System.out.println("Enter your choice");  
		   int choice=sc.nextInt(); 
		   switch(choice){
		   case 1:
			   Outsourcing_Login();
			   break;
		   case 2:
			   Outsourcing_Login_Check();
			   break;
		   case 4:
			   Outsourcing_Login();
			   Outsourcing_Invoices();
	           break;	  
		   case 6:
			   Outsourcing_Login();
			   Outsourcing_Pricing_Services();
			   break;
		   case 7:
			   Outsourcing_Login();
			   Outsourcing_Client();
		       break;
		   case 8:
			   Outsourcing_Login();
			   Outsourcing_Settings();
			   break;
		   case 9:
			   Outsourcing_Login();
			   Outsourcing_Users();
			   break;
		   case 10:
			   Outsourcing_Creating_a_User();
			   break;
		   }
	}

	static void Outsourcing_Login() throws InterruptedException {
	
	    String url= "http://elshaddai-tech.co.uk/outsourcing/login";
        // Create a new instance of the Firefox or Chrome driver
	    driver = new ChromeDriver();
        //Launch the Self Assessment Checklist
		driver.get(url);
		//To maximize browser window
        driver.manage().window().maximize();
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website"+url);
        String Title = driver.getTitle();
        System.out.println("Title:" + Title);
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='login-form']/section/form/div[1]/input")).sendKeys("obadmin");
        driver.findElement(By.xpath(".//*[@id='inputPassword']")).sendKeys("becloser");
        driver.findElement(By.xpath(".//*[@id='login-form']/section/form/button")).click();
        System.out.println("Successfully Logged as Admin");
        
	}

static void Outsourcing_Login_Check() throws InterruptedException {
	 String url= "http://elshaddai-tech.co.uk/outsourcing/login";
     
	    driver = new ChromeDriver();
    
		driver.get(url);
		
        driver.manage().window().maximize();
     
	    String email[]= {"","Shriram","mn@mn.in","mn@mn.in","obadmin"};
        String[] password= {"","123456","becloser","123456","becloser"};
        for( int i = 0; i < email.length; i++)
	       {
	          String no = email[i];
	          String text = password[i];    
    
    
      Thread.sleep(3000);
      driver.findElement(By.xpath(".//*[@id='login-form']/section/form/div[1]/input")).clear();
      driver.findElement(By.xpath(".//*[@id='login-form']/section/form/div[1]/input")).sendKeys(no);
      driver.findElement(By.xpath(".//*[@id='inputPassword']")).clear();
      driver.findElement(By.xpath(".//*[@id='inputPassword']")).sendKeys(text);
      driver.findElement(By.xpath(".//*[@id='login-form']/section/form/button")).click();
	       }
    System.out.println("Successfully Logged as Admin");
}

static void Outsourcing_Settings() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='nav']/section/section/div/div[1]/nav/ul/li[7]/a")).click();


    }  

static void Outsourcing_Creating_a_User() throws InterruptedException {
	 String url= "http://elshaddai-tech.co.uk/outsourcing/login";
     driver = new ChromeDriver();
     driver.get(url);
	 driver.manage().window().maximize();
		
	 Thread.sleep(3000);
	 //Get Started button
	 driver.findElement(By.xpath(".//*[@id='login-form']/section/form/a[2]")).click();
	 Thread.sleep(1000);
	 //Continue button
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[3]/div[1]/button")).click();
	 Thread.sleep(1000);
	 //Choosing a service
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[1]/div/div/table/tbody/tr[4]/td[2]/div/div/label/input")).click();
	 //Continue button
	 driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[6]/div[1]/button")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[1]/div/input")).sendKeys("Q2M Chennai");
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[3]/div/input")).sendKeys("2");
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[4]/div/input")).sendKeys("2000");
	 //Continue button
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[6]/div[1]/button")).click();
	 System.out.println("Client's Business Details given successfully");
	 //Request for Approval button
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[4]/div[1]/button")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[1]/div[1]/input")).sendKeys("Q2M Chennai");
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[1]/div[2]/input")).sendKeys("123456789");
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[2]/div[1]/input")).sendKeys("q2m@q2m.in");
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[2]/div[2]/input")).sendKeys("q2mchennai");
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/section/form/div[2]/div[3]/input")).sendKeys("q2mchennai");
	 System.out.println("Account Details given successfully");

      }

static void Outsourcing_Client() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='nav']/section/section/div/div[1]/nav/ul/li[6]/a")).click();
    //New Client button
	driver.findElement(By.xpath(".//*[@id='content']/section/aside/section/header/a")).click();
	Thread.sleep(3000);  
	driver.findElement(By.xpath(".//*[@id='tab-client-general']/div[1]/input")).sendKeys("Q2M Chennai");
	driver.findElement(By.xpath(".//*[@id='tab-client-general']/div[3]/input")).sendKeys("2");
	driver.findElement(By.xpath(".//*[@id='tab-client-general']/div[4]/input")).sendKeys("2000");
	driver.findElement(By.xpath(".//*[@id='tab-client-general']/div[5]/input")).sendKeys("3000");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/ul/li[2]/a")).click();
	Thread.sleep(3000); 
	driver.findElement(By.xpath(".//*[@id='tab-client-contact']/div[1]/input")).sendKeys("q2m@q2m.in");
	driver.findElement(By.xpath(".//*[@id='tab-client-contact']/div[3]/input")).sendKeys("987654321");
    //Save button
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("New client created successfully");

     }

static void Outsourcing_Pricing_Services() throws InterruptedException {
	Thread.sleep(3000);
	//Pricing button
	driver.findElement(By.xpath(".//*[@id='nav']/section/section/div/div[1]/nav/ul/li[5]/a")).click();
	Thread.sleep(2000);
	//Services button
	driver.findElement(By.xpath(".//*[@id='nav']/section/section/div/div[1]/nav/ul/li[5]/ul/li[1]/a")).click();
    //New Service button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='content']/section/section/div[1]/div[1]/section/header/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[1]/div/input")).sendKeys("Service 7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[2]/div/textarea")).sendKeys("Service 7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[3]/div/input")).sendKeys("700");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[4]/div/input")).sendKeys("7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[5]/div/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[5]/div/select/option[2]")).click();
	//Add Service button
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("New Service created successfully");
	Thread.sleep(7000);
	//Service delete button
	driver.findElement(By.xpath(".//*[@id='table-templates-2']/tbody/tr[3]/td[4]/a[3]")).click();
    //Proceed button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("Service deleted successfully");

    //New Band button
	Thread.sleep(7000);
	driver.findElement(By.xpath(".//*[@id='content']/section/section/div[2]/div/section/header/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[1]/div/input")).sendKeys("Band7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[2]/div/textarea")).sendKeys("Band 7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[3]/div/input")).sendKeys("700");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[4]/div/input")).sendKeys("7000");
	//Save button
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("New Band created successfully");
	Thread.sleep(7000);
	//Band delete button
	driver.findElement(By.xpath(".//*[@id='table-templates-3']/tbody/tr[9]/td[4]/a[2]")).click();
	//Proceed button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("Band deleted successfully");

    //Add Task button
	Thread.sleep(7000);
	driver.findElement(By.xpath(".//*[@id='content']/section/section/div[1]/div[2]/section/header/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[1]/div/input")).sendKeys("Task 7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[2]/div/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[2]/div/select/option[2]")).click();
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[4]/div/input")).sendKeys("7");
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[1]/div[5]/div/textarea")).sendKeys("Task 7");
	//Save button
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("New Task created successfully");
	Thread.sleep(7000);
	//Task delete button
	driver.findElement(By.xpath(".//*[@id='table-templates-1']/tbody/tr[3]/td[4]/a[2]")).click();                    
	//Proceed button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("Task deleted successfully");

    }

static void Outsourcing_Users() throws InterruptedException {
    //Users module button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='nav']/section/section/div/div[1]/nav/ul/li[8]/a")).click();
	Thread.sleep(2000);
	//New User button
	driver.findElement(By.xpath(".//*[@id='content']/section/aside[1]/section/header/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[1]/input")).sendKeys("abcdefg");
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[2]/input")).sendKeys("abcdefg");
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[3]/input")).sendKeys("abcdefg@abcdefg.in");
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[4]/input")).sendKeys("abcdefg");
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[5]/input")).sendKeys("abcdefg");
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[7]/input")).sendKeys("9876543210");
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[8]/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[8]/select/option[2]")).click();

    //Register User button
	driver.findElement(By.xpath(".//*[@id='aside']/section/section/form/div[9]/button")).click();
	System.out.println("New User created successfully");
    //User delete button
	Thread.sleep(7000);
	driver.findElement(By.xpath(".//*[@id='table-users']/tbody/tr[1]/td[6]/a[4]")).click();
    //Proceed button
    Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("User deleted successfully");

     }

static void Outsourcing_Invoices() throws InterruptedException {
    //Invoice module button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='nav']/section/section/div/div[1]/nav/ul/li[3]/a")).click();
	//Create Invoice button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='content']/section/aside/section/section/section/header/a")).click();
	Thread.sleep(3000);				
	driver.findElement(By.xpath(".//*[@id='content']/section/aside[2]/section/section/div/section/div/form/div[2]/div/span/span[1]/span/span[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys("GBKCompany");
	driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath(".//*[@id='content']/section/aside[2]/section/section/div/section/div/form/div[4]/div/div/input")).clear();
    //Create Invoice button
	driver.findElement(By.xpath(".//*[@id='content']/section/aside[2]/section/section/div/section/div/form/button")).click();
	System.out.println("New Invoice created successfully");
   
	Thread.sleep(10000);
    //Invoice delete button
	driver.findElement(By.xpath(".//*[@id='content']/section/aside/section/header/div/div/a[5]")).click();
	//Proceed button
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='ajaxModal']/div/div/form/div[2]/button")).click();
	System.out.println("Invoice deleted successfully");
    
    }

}