package Module;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Home_Page_Object;
import Resources.Base;

public class Home_Page extends Base {
	
	@BeforeTest
	public void t() throws IOException, InterruptedException {
		Choosing_Browser();
		driver.get("https://www.qaclickacademy.com/practice.php");		
		Thread.sleep(3000);
	}
	
	@Test(dataProvider="getdata")
	public void HomePage(String user,String pass) throws IOException, InterruptedException
	{
		System.out.println(user);
		System.out.println(pass);
		Home_Page_Object hpo= new Home_Page_Object(driver);
		hpo.Home().click();
		
		
	}
	@AfterTest
	public void closing_browser() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[1][2];
		data[0][0]="qwerty";
		data[0][1]="1234";
	//	data[1][0]="asdf";
	//	data[1][1]="6789";
		return data;
	}
	

}
