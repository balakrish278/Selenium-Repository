package Module;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Home_Page_Object;
import Resources.Base;

public class Assertion extends Base {
	
	
	@Test
	public void assertion() {
		
		Home_Page_Object hp= new Home_Page_Object(driver);
		Assert.assertEquals(hp.Home().getText(), "Home");
		
	}

}
