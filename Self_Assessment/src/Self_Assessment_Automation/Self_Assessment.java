package Self_Assessment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Self_Assessment {
	static WebDriver driver;                          
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    String url= "http://sandbox.nomismasolution.co.uk:8080/SACheckListUI/#!/home";
       
	   // Create a new instance of the Firefox or Chrome driver
		//System.setProperty("webdriver.gecko.driver","E:\\WebDrivers\\geckodriver.exe");
		driver = new ChromeDriver();
        //Launch the Self Assessment Checklist
		driver.get(url);
		//To maximize browser window
        driver.manage().window().maximize();
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website"+url);
        String Title = driver.getTitle();
        System.out.println("Title:" + Title);
        
        Self_Assessment_Login login=new Self_Assessment_Login(driver);//Calling by "Constructor"
       // login.login(driver);
        Self_Assessment_Details_Page1 page1=new Self_Assessment_Details_Page1();
        page1.Page1(driver);
        Self_Assessment_Details_Page2 page2=new Self_Assessment_Details_Page2();
        page2.Page2(driver);
        Self_Assessment_Details_Page3 page3=new Self_Assessment_Details_Page3();
        page3.Page3(driver);
        page3.File_upload_QNo_25(driver);
     
        //To Preview  
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[7]/div[2]/div/button")).click();
	}
}
	
	
	
