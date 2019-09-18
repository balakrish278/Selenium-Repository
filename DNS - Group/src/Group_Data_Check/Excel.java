package Group_Data_Check;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Excel extends Test{
	
	
	
	public void Exceldata(WebDriver Driver) throws IOException, InterruptedException {
		 
		Check_For_Values cfv =new Check_For_Values(); 
		File src=new File("E:\\Workspace\\Excel\\tocheckfee.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total no. of rows"+" "+rowcount);
		
		for( i=1;i<=1;i++) {	
			   	    			    
			    client_no=(int)sheet.getRow(i).getCell(8).getNumericCellValue();			    
			    driver.navigate().to("https://crm.nomismasolution.co.uk/livednsgroup/index.php?module=Accounts&view=Detail&record="+client_no+"&mode=showDetailViewByMode&requestMode=full&tab_label=Client%20Details");
			    Thread.sleep(2000);			    
			    
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
			    //NumberToTextConverter.toText(monthlyfeedouble);
				yearlyfeedouble=(double) sheet.getRow(i).getCell(4).getNumericCellValue();
				yearlyfee=String.format("%.2f",yearlyfeedouble);
				quarterlyfeedouble=(double) sheet.getRow(i).getCell(5).getNumericCellValue();
			    quarterlyfee=String.format("%.2f",quarterlyfeedouble);
			    adhocfeedouble=(double) sheet.getRow(i).getCell(6).getNumericCellValue();
			    adhocfee=String.format("%.2f",adhocfeedouble);
			    agreementfeedouble=(double) sheet.getRow(i).getCell(7).getNumericCellValue();
			    agreementfee=String.format("%.2f",agreementfeedouble);
			    
				Thread.sleep(2000);
				cfv.check_for_value(driver);
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
				    
					Thread.sleep(2000);
					cfv.check_for_value(driver);
			    }
			    
		}
	
	}
}
	
	
		
	
	
	

