package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void test1()
	{
		System.out.println("I am Test1");
	}
	
	@Test(dataProvider="getData")
	void test2(String username,String password)
	{
		System.out.println("I am Test2");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@BeforeTest
	void beforetest()
	{
		System.out.println("I am BeforeTest");
	}
	
	@AfterTest
	void aftertest()
	{
		System.out.println("I am AfterTest");
	}
	
	@org.testng.annotations.BeforeMethod
	void beforemethod()
	{
		System.out.println("I am Beforemethod");
	}
	
	@AfterMethod
	void aftermethod()
	{
		System.out.println("I am Aftermethod");
	}
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("I am Beforeclass");
	}
	
	@AfterClass
	void afterclass()
	{
		System.out.println("I am Afterclass");
	}
	
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("I am Beforesuite");
	}
	
	@AfterSuite
	void Aftersuite()
	{
		System.out.println("I am Aftersuite");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="username1";
		data[0][1]="password1";
		data[1][0]="username2";
		data[1][1]="password2";
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
	}
	
	

}
