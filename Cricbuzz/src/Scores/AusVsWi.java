package Scores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AusVsWi {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20246/aus-vs-wi-match-10-icc-cricket-world-cup-2019");
	    driver.manage().window().maximize();	   
	    WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("innings_1"))));
		
		int t=0;
		for(int i=3;i<=13;i++)
		{			
			
			WebElement Batsman=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[1]"));
			WebElement WicketTo=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[2]"));
			WebElement Run=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[3]"));
			WebElement Balls=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[4]"));
			WebElement Fours=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[5]"));
			WebElement Six=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[6]"));
			WebElement SR=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+i+"]/div[7]"));
			
			System.out.println(Batsman.getText()+" "+WicketTo.getText()+" "+Run.getText()+" "+Balls.getText()+" "+Fours.getText()+" "+Six.getText()+" "+SR.getText());
		   	t=t+(Integer.parseInt(Run.getText()));
			
		}
		int Extras=27;
		System.out.println(Extras);
		System.out.println(t+Extras+"->Total");    

	}

}
