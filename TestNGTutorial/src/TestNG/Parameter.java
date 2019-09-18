package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters({"URL1","URL2"})
	@Test
	public void test1(String url1,String url2)
	{
		System.out.println(url1);		
		System.out.println(url2);
		
	}

}
