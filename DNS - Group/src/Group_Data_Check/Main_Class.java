package Group_Data_Check;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_Class {
	static String accountantname,monthlyfee,yearlyfee,quarterlyfee,adhocfee,agreementfee;		
	static double monthlyfeedouble,yearlyfeedouble,quarterlyfeedouble,adhocfeedouble,agreementfeedouble;	
	static WebDriver driver;
	static int i,client_no;
	
         
	public static void main(String[] args) throws IOException, InterruptedException {
		
				login();
				exceldata();
		
	}
	
static void login() {
		
		String url="https://crm.nomismasolution.co.uk/livednsgroup/";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='username']")));
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("rex");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("@Newpwd4321@@");
		driver.findElement(By.xpath(".//*[@id='forgotPassword']/button")).click();
		//Navigation
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menubar_item_Accounts']/span")));		
		
		
		
	}
	
static void exceldata() throws IOException, InterruptedException {
		
		File src=new File("E:\\Workspace\\Excel\\tocheckfee.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total no. of rows"+" "+rowcount);
		
		for ( i=1;i<=1;i++) {			   	    			    
			   
			    client_no=(int)sheet.getRow(i).getCell(8).getNumericCellValue();
			    Thread.sleep(2000);
			    driver.navigate().to("https://crm.nomismasolution.co.uk/livednsgroup/index.php?module=Accounts&view=Detail&record="+client_no+"&mode=showDetailViewByMode&requestMode=full&tab_label=Client%20Details");    
			    			    
			    try {
			    if(driver.findElement(By.linkText("Go Back")).isDisplayed()) {
			    	
			    	System.out.println("Deleted");					
					Row row = sheet.getRow(i);
					Cell cell = row.getCell(10);					
					cell.setCellValue("Deleted");
					FileOutputStream fos = new FileOutputStream("E:\\Workspace\\Excel\\tocheckfee.xlsx");
					wb.write(fos);		
					fos.close();
			    	
			    }
		
		else {
			    
			 
				accountantname=sheet.getRow(i).getCell(1).getStringCellValue();		
				monthlyfeedouble=(double) sheet.getRow(i).getCell(3).getNumericCellValue();
			    monthlyfee=String.format("%.2f",monthlyfeedouble);
				yearlyfeedouble=(double) sheet.getRow(i).getCell(4).getNumericCellValue();
				yearlyfee=String.format("%.2f",yearlyfeedouble);
				quarterlyfeedouble=(double) sheet.getRow(i).getCell(5).getNumericCellValue();
			    quarterlyfee=String.format("%.2f",quarterlyfeedouble);
			    adhocfeedouble=(double) sheet.getRow(i).getCell(6).getNumericCellValue();
			    adhocfee=String.format("%.2f",adhocfeedouble);
			    agreementfeedouble=(double) sheet.getRow(i).getCell(7).getNumericCellValue();
			    agreementfee=String.format("%.2f",agreementfeedouble);			    
				
				check_for_value();
			    }
			    }
			    catch (Exception e) {
			    	
			    	
			    	accountantname=sheet.getRow(i).getCell(1).getStringCellValue();		
					monthlyfeedouble=(double) sheet.getRow(i).getCell(3).getNumericCellValue();
				    monthlyfee=String.format("%.2f",monthlyfeedouble);
					yearlyfeedouble=(double) sheet.getRow(i).getCell(4).getNumericCellValue();
					yearlyfee=String.format("%.2f",yearlyfeedouble);
					quarterlyfeedouble=(double) sheet.getRow(i).getCell(5).getNumericCellValue();
				    quarterlyfee=String.format("%.2f",quarterlyfeedouble);
				    adhocfeedouble=(double) sheet.getRow(i).getCell(6).getNumericCellValue();
				    adhocfee=String.format("%.2f",adhocfeedouble);
				    agreementfeedouble=(double) sheet.getRow(i).getCell(7).getNumericCellValue();
				    agreementfee=String.format("%.2f",agreementfeedouble);					    
					
					check_for_value();
			    }
			    
		}
   }

static void check_for_value() throws IOException {
	
	WebDriverWait wait=new WebDriverWait(driver,30); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Accounts_detailView_fieldValue_cf_1058")));
	
	String clientname= driver.findElement(By.id("Accounts_detailView_fieldValue_accountname")).getText();
	
	String monthlyvalue= driver.findElement(By.id("Accounts_detailView_fieldValue_cf_1058")).getText();	
	
	String yearlyvalue= driver.findElement(By.id("Accounts_detailView_fieldValue_cf_1032")).getText();
	
	String quarterlyvalue= driver.findElement(By.id("Accounts_detailView_fieldValue_cf_2012")).getText();
	
	String adhocvalue= driver.findElement(By.id("Accounts_detailView_fieldValue_cf_2134")).getText();
	
	String agreementvalue= driver.findElement(By.id("Accounts_detailView_fieldValue_cf_2479")).getText();
	
	
	
	if(clientname.equals(accountantname) && monthlyvalue.equals(monthlyfee) && yearlyvalue.equals(yearlyfee) && quarterlyvalue.equals(quarterlyfee) && adhocvalue.equals(adhocfee) && agreementvalue.equals(agreementfee)) {
	
		System.out.println("Pass");		
		File src=new File("E:\\Workspace\\Excel\\tocheckfee.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(10);		
		cell.setCellValue("Pass");
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\Excel\\tocheckfee.xlsx");
		wb.write(fos);		
		fos.close();
	}
	
	else {	
		System.out.println("Fail");		
		File src=new File("E:\\Workspace\\Excel\\tocheckfee.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(10);		
		cell.setCellValue("Fail");
		FileOutputStream fos = new FileOutputStream("E:\\Workspace\\Excel\\tocheckfee.xlsx");
		wb.write(fos);		
		fos.close();
	}
	
}


}
