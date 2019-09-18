package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Global_Parameter_By_PropertiesClass {
	
	@Test
	public void Login() throws IOException {
		
		Properties pro=new Properties();
		FileInputStream fis= new FileInputStream("E:\\Workspace\\TestNGTutorial\\Credential.properties");
		pro.load(fis);
		System.out.println(pro.getProperty("Username")+" "+pro.getProperty("Password"));
		
	}

}
