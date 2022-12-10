import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkinWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To identify All 'Links' in Website We have to deal with Common TAGNAME i.e., 'a'
		// In All website 'Links' direct relate to common Tagname i.e., 'a'
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// To identify links on Footer
		WebElement Footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		
		// Count of 1st Sections in inside footer section
	    WebElement Base = driver.findElement(By.xpath("(//ul)[1]"));
	    System.out.println(Base.findElements(By.tagName("a")).size());
	    
	    // Now put Click on Every links on 1st Section.
	    // After click on 1st link of 1st section then different window is open bcoz that link contain different WebURL
	    // After this Selenium Failed our work bcoz it didn't find 2nd and other link of 1st section
	    // So to inhale this see my steps below
	    
	    for(int i=1; i<Base.findElements(By.tagName("a")).size(); i++)
	    {
	    	// Here we take i=1 it is because we have to click child link of 1st section except of its mother link
	    	// where mother link start from '0'.
	        String KEY = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	Base.findElements(By.tagName("a")).get(i).sendKeys(KEY);
	    }	
	    Set<String> Page = driver.getWindowHandles();
		Iterator<String> step = Page.iterator();
			// Now As we learn in 'SwitchtoNewTAB' class. That from current page to next page we to give command of 'next' after iterator
			// But there is 5 different page in our WEB site.
			// So for that is another option is also available i.e., 'hasNext'
			
		while(step.hasNext())
		{
			driver.switchTo().window(step.next());
			System.out.println(driver.getTitle());
		}

	}

}
