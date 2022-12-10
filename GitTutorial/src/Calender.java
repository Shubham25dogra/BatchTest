import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		// Here It might Show Pop-ups When we open this WebSite
		// There is Different Pop-ups 
		// 1. Know your location
		// 2. Show notifications
		// 3. Use your Camera
		// 4. Use your microphone
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");  // for Show notifications
		//option.addArguments("disable-geolocation");   // for know your location
		//option.addArguments("disable-media-stream");  // for Use your microphone
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		// If You want to select present month date than do not provide any property related month i.e.; (do not select any css,xpath)
		//driver.findElement(By.xpath("(//div[@style='font-family: inherit;'])[135]"));
		//Here we have to use While loop concept
		// While loop will keep on executing until it becomes false
		Thread.sleep(2000);
		while(!driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-k8qxaj'] div")).getText().contains("December"))
		{
			driver.findElement(By.xpath("(//*[local-name()='circle'])[5]")).click();
		}
		
		List<WebElement> date = driver.findElements(By.cssSelector(".css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu"));
	    for(int i=0; i<date.size(); i++)
	    {
	    	String Date = date.get(i).getText();
	    	if(Date.equalsIgnoreCase("18"))
	    	{
	    		driver.findElements(By.cssSelector(".css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu")).get(i).click();
	    		break;
	    	}
	    }

	}

}
