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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check_For_Values extends Test  {
	
	 void check_for_value(WebDriver driver) throws IOException {
	
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
