package TestNG;

import org.testng.annotations.Test;

public class Class4 {
	
	@Test(groups=("Group"))
	public void test1()
	{
		System.out.println("I am Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am Test2");		
		
	}


}
