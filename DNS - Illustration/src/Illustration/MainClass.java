package Illustration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		DNS_Login log=new DNS_Login();
		log.login(driver);
		Calculation_Details Caldet=new Calculation_Details();
		Caldet.details(driver);
		Hundred_Partial hp=new Hundred_Partial();
		hp.margin(driver);
		

	}

}
