package Data_Display;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Summary {
	
	
	//Summary
	@FindBy(how=How.XPATH,using="//*[@data-id='9']")
	WebElement Summary;
	//By sum=By.xpath("//*[@data-id='9']"); (Another method)
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_accountname']/label")
	WebElement	ClientName;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_phone']/label")
	WebElement PrimaryPhone;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_1064']/label")
	WebElement JoiningDate;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_account_no']/label")
	WebElement ClientNumber;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_1896']/label")
	WebElement MobilePhone;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_785']/label")
	WebElement BusinessType;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_email1']/label")
	WebElement PrimaryEmail;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_1030']/label")
	WebElement BillingFrequency;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_1022']/label")
	WebElement Status;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_1046']/label")
	WebElement LegalStatus;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2748']/label")
	WebElement SecondaryStatus;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2750']/label")
	WebElement StatusReason;
	
	//Primary Director

	@FindBy(how=How.XPATH,using="//*[@ data-id='129'AND@data-mode='show']")
	WebElement PrimaryDirector;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2409']/label")
	WebElement Title;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_851']/label")
	WebElement FirstName;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_853']/label")
	WebElement LastName;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_855']/label")
	WebElement Address;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_857']/label")
	WebElement PostCode;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_859']/label")
	WebElement ContactNumber ;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_861']/label")
	WebElement ContactEmail;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_863']/label")
	WebElement NINumber;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_865']/label")
	WebElement TaxCode;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2385']/label")
	WebElement KYC_UserTitle;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2387']/label")
	WebElement KYC_DOB;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2389']/label")
	WebElement KYC_PassportNumber;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2391']/label")
	WebElement KYC_PassportCountry;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2397']/label")
	WebElement KYC_PassportExpiry;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2395']/label")
	WebElement KYC_LicenseNumber;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2393']/label")
	WebElement KYC_Gender;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2399']/label")
	WebElement KYC_Building;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2401']/label")
	WebElement KYC_Bandtext;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2403']/label")
	WebElement KYC_Score;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_2405']/label")
	WebElement KYC_CreatedDate;
	@FindBy(how=How.XPATH,using=".//*[@id='Accounts_detailView_fieldLabel_cf_4169']/label")
	WebElement Group;
	
	public void Elements(WebDriver driver) {
		
		WebDriverWait wait;
		wait=new WebDriverWait(driver,30);
		WebElement summary=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='9']")));
		summary.click();
		
		
		
		SoftAssert SoftAssert=new SoftAssert();		
		//Summary
	/*	SoftAssert.assertEquals(Summary.getText(), "Summary");
		Assert.assertEquals(ClientName.getText(), "Client Name");
		Assert.assertEquals(PrimaryPhone.getText(), "Primary Phone");		
		Assert.assertEquals(JoiningDate.getText(), "Joining Date");
		Assert.assertEquals(ClientNumber.getText(), "Client Number");
		Assert.assertEquals(MobilePhone.getText(), "Mobile Phone");
		Assert.assertEquals(BusinessType.getText(), "Business Type");
		Assert.assertEquals(PrimaryEmail.getText(), "Primary Email");
		Assert.assertEquals(BillingFrequency.getText(), "Billing Frequency");
		Assert.assertEquals(Status.getText(), "Status");
		Assert.assertEquals(LegalStatus.getText(), "Legal Status");
		Assert.assertEquals(SecondaryStatus.getText(), "* Secondary Status");
		Assert.assertEquals(StatusReason.getText(), "* Status Reason");
		System.out.print("Summary Passed");*/
		
		
		wait=new WebDriverWait(driver,30);
		WebElement primarydirector=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='129']")));
		primarydirector.click();
		
		//Primary Director		
		SoftAssert.assertEquals(PrimaryDirector.getText(), "  Primary Director");
		Assert.assertEquals(Title.getText(), "Title");
		Assert.assertEquals(FirstName.getText(), "First Name");
		Assert.assertEquals(LastName.getText(), "Last Name");
		Assert.assertEquals(Address.getText(), "Address");
		Assert.assertEquals(PostCode.getText(), "Post Code");
		Assert.assertEquals(ContactNumber.getText(), "Contact Number");
		Assert.assertEquals(ContactEmail.getText(), "Contact Email");
		Assert.assertEquals(NINumber.getText(), "NI Number");
		Assert.assertEquals(TaxCode.getText(), "Tax Code");
		Assert.assertEquals(KYC_UserTitle.getText(), "KYC - User Title");
		Assert.assertEquals(KYC_DOB.getText(), "KYC - DOB");
		Assert.assertEquals(KYC_PassportNumber.getText(), "KYC - Passport Number");
		Assert.assertEquals(KYC_PassportCountry.getText(), "KYC - Passport Country");
		Assert.assertEquals(KYC_PassportExpiry.getText(), "KYC - Passport Expiry");
		Assert.assertEquals(KYC_LicenseNumber.getText(), "KYC - License Number");
		Assert.assertEquals(KYC_Gender.getText(), "KYC - Gender");
		Assert.assertEquals(KYC_Building.getText(), "KYC - Building");
		Assert.assertEquals(KYC_Bandtext.getText(), "KYC - Band text");
		Assert.assertEquals(KYC_Score.getText(), "KYC - Score");
		Assert.assertEquals(KYC_CreatedDate.getText(), "KYC - Created Date");
		Assert.assertEquals(Group.getText(), "Group1");
		System.out.print("Primary Director Passed");
		SoftAssert.assertAll();
						
	}
	
}
