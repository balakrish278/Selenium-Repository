package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters({"URL"})
	@Test
	public void test1(String urlname)
	{
		System.out.println(urlname);		
		
	}

}
