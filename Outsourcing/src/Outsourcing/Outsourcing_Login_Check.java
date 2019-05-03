package Outsourcing;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Outsourcing_Pages.Outsourcing_Login;

public class Outsourcing_Login_Check {

WebDriver driver;
	
	@FindBy(xpath=".//*[@id='login-form']/section/form/div[1]/input")
	@CacheLookup
	WebElement Email;
	@FindBy(how=How.XPATH,using=".//*[@id='inputPassword']")
	@CacheLookup
	WebElement Password;
	@FindBy(how=How.XPATH,using=".//*[@id='login-form']/section/form/button")
	@CacheLookup
	WebElement SignIn_button;
	
	
public void Login_Check_Credentials() throws Exception {	

	File src=new File("E:\\Workspace\\Excel\\Outsourcing_Login_Credentials.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	int rowcount=sheet1.getLastRowNum();
	int column=sheet1.getDefaultColumnWidth();
	Object data[][]=new Object[rowcount][2];
	System.out.println("Total no. of rows"+rowcount);
	System.out.println("Total no. of rows"+column);

	for(int i=0;i<=rowcount;i++)
	{   
	
		Thread.sleep(3000);
		data[i][0]=sheet1.getRow(i).getCell(0).getStringCellValue();
		
		data[i][1]=sheet1.getRow(i).getCell(1).getStringCellValue();
		String email=(String) data[i][0];
		String password=(String) data[i][1];
		//String email=sheet1.getRow(i).getCell(0).getStringCellValue();
		//String password=sheet1.getRow(i).getCell(1).getStringCellValue();
		
		
		/*Email.clear();
		Email.sendKeys(email);
		Password.clear();
		Password.sendKeys(password);
		Thread.sleep(2000);
		SignIn_button.click(); */ 
		Outsourcing_Login login_page=PageFactory.initElements(driver, Outsourcing_Login.class);
		login_page.Login_Credential(email,password);
		driver.quit();
		System.out.println(email+"  "+password);
		wb.close();
		
		
		
	}
    
	
	/*ExcelSheetConfig config=new ExcelSheetConfig("E:\\Workspace\\Excel\\Outsourcing_Login_Credentials.xlsx");
	int row =config.getRowCount(0);
	Object data[][]=new Object[row][2];
	for(int i = 0;i<row;i++) {
		
		data[i][0]=config.getData(0,i,0);
		data[i][1]=config.getData(0,i,1);
		
	}*/
}
}