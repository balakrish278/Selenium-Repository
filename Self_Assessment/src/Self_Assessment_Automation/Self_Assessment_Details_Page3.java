package Self_Assessment_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Self_Assessment_Details_Page3 {
	void Page3(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		String[] myNo= {"21","22","23","24"};
        String[] myText = {"started/stopped","outside the UK","tax information","previous/future years"};
        for( int i = 0; i < myNo.length; i++)
		   {
		    String no = myNo[i];
		    String text = myText[i];    
	
		    driver.findElement(By.id("option"+no)).click();
		    driver.findElement(By.id("txComments"+no)).clear();
			driver.findElement(By.id("txComments"+no)).sendKeys(""+text);
			
			}
           driver.findElement(By.id("txComments25")).clear();
           driver.findElement(By.id("txComments25")).sendKeys("records with HMRC");
           System.out.println("Page3 details given successfully");

	}
	
	void File_upload_QNo_25(WebDriver driver) throws Exception{
				//File to be uploaded for Q.No:25		
				//Some issue with Firefox
		File src=new File("E:\\Workspace\\Excel\\Self_Assessmetn_Q.No.25.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		int column=sheet1.getDefaultColumnWidth();
		System.out.println("Total no. of rows"+rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			Thread.sleep(3000);
			String filename=sheet1.getRow(i).getCell(0).getStringCellValue();
			String filetype=sheet1.getRow(i).getCell(1).getStringCellValue();
			Thread.sleep(3000);
			WebElement chooseFile= driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[6]/div[1]/div[1]/span[1]/input"));
			Thread.sleep(3000);
			chooseFile.sendKeys("E:\\Downloads\\"+filename);
			driver.findElement(By.id("txtFup")).sendKeys(""+filetype);
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='frmSac']/fieldset/div[6]/div[1]/div[4]/button")).click();
			
		}
		System.out.println("Files uploaded successfully");
	}	
}
