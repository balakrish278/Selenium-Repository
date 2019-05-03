package Outsourcing_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Outsourcing_Invoices {
	
	
	@FindBy(how=How.XPATH,using="//a[@href='http://elshaddai-tech.co.uk/outsourcing/invoices']")
	@CacheLookup
	WebElement Invoice_Module_button;
	@FindBy(how=How.XPATH,using="//a[@href='http://elshaddai-tech.co.uk/outsourcing/invoices/add']")
	@CacheLookup
	WebElement Create_Invoice;
	
	

public void Invoice_Module() {	
		
	
	    Invoice_Module_button.click();
	    Create_Invoice.click();
	}

}
