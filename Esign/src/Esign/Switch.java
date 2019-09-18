package Esign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url= "http://18.130.12.231/dns/index.php";
		driver = new ChromeDriver();
        driver.get(url);
		driver.manage().window().maximize();
		
		DNS_Login login=new DNS_Login();
			      login.Login(driver);
		Open_Esign esign=new Open_Esign();
		           esign.Esign(driver);
		           esign.CreateContract(driver);
			       
		           

	}

}
