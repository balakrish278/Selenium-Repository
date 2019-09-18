package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod_and_Enabled {

	
	@Test(timeOut=4000)
	public void test1()
	{
		System.out.println("I am Test1");
	}
	@Test(timeOut=4000)
	public void test4()
	{
		System.out.println("I am Test4");
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("I am Test3");
	}
	
	@Test(dependsOnMethods= {"test1","test4"})
	public void test2()
	{
		System.out.println("I am Test2");		
		
		
	}
	
	
}
