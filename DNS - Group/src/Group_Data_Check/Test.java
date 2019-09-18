package Group_Data_Check;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Test  {
	
	public String accountantname,monthlyfee,yearlyfee,quarterlyfee,adhocfee,agreementfee;		
	public double monthlyfeedouble,yearlyfeedouble,quarterlyfeedouble,adhocfeedouble,agreementfeedouble;	
	public static WebDriver driver;
    public int i,client_no;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Login login=new Login();
		login.login(driver);
		Excel ED=new Excel();
		ED.Exceldata(driver);

}

}
