package Q2M;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url="http://q2m.in/home";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String homePage = "http://q2m.in/home";
		
        HttpURLConnection huc = null;
        int respCode = 200;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		url = it.next().getAttribute("href");
		if(url == null || url.isEmpty())
		
		{
            System.out.println("URL is either not configured for anchor tag or it is empty");
            
        }
		if(!url.startsWith(url))
		{
	           System.out.println("URL belongs to another domain, skipping it.");
	           
	    }
	}
}


		
		/*java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText());
		 
		 }
		
		Thread.sleep(3000);
		try {
			List <WebElement> ele=(List<WebElement>) driver.findElement(By.xpath(".//*[@class=\"is-visible\"]"));
			System.out.println(ele.size());
			ArrayList list = new ArrayList();
			String n;
			for(int i=0;i<ele.size();i++)
			{
			String text=((WebElement) ele).getText();
			//list.add(text);
		    System.out.println(text);
			}
		   /* List <WebElement> names = driver.findElements(By.xpath(".//*[@class=\"is-visible\"]"));

	        ArrayList list = new ArrayList();
	        String name;

	        for (int i = 0; i<names.size(); i++){
	            int index = i+1;
	            name = driver.findElement(By.xpath(".//*[@class=\"is-visible\"]" + "[" + index + "]")).getText();
	            list.add(name);

	            System.out.println(name);
	            
		
		}
		catch(Exception e){
			System.out.println(e);
		
		}*/
		 

		
	


