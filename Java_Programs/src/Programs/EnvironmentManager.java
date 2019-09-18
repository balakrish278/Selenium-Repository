package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentManager {
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);
        
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Thread.sleep(4000); 
        driver.switchTo().window(tabs.get(1));          
        driver.navigate().to("http://www.yahoo.com/");
        
	}
	

}
