import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

  public static final String USERNAME = "bala353";
  public static final String AUTOMATE_KEY = "TL3aAjpgo4fbpxJtuMaQ";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browserName", "android");
    caps.setCapability("device", "Google Pixel 2");
    caps.setCapability("realMobile", "true");
    caps.setCapability("os_version", "9.0");
    caps.setCapability("deviceOrientation", "landscape");
    caps.setCapability("browserstack.debug", "true");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://q2m.in/home");
    System.out.println(driver.getTitle());
    WebElement ele = driver. findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/a"));
    Actions action = new Actions(driver);
    Thread.sleep(2000);
    action.moveToElement(ele).moveToElement(driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/div/ul/li[1]/a"))).click().build().perform();
    Thread.sleep(3000);
    WebElement ele1 = driver. findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/a"));
    action.moveToElement(ele1).moveToElement(driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/div/ul/li[2]/a"))).click().build().perform();
    Thread.sleep(3000);
    WebElement ele2 = driver. findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/a"));
    action.moveToElement(ele2).moveToElement(driver.findElement(By.xpath(".//*[@id='top-bar']/div[2]/nav/div/ul/li[1]/div/ul/li[3]/a"))).click().build().perform();
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    driver.quit();

  }
}