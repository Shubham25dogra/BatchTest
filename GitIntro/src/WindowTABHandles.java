import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTABHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    String ParentHandle = driver.getWindowHandle();
	    System.out.println(ParentHandle);
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("newWindowBtn")).click();
	    Set<String> Handles = driver.getWindowHandles();
	    for(String handle:Handles)
	    {
	    	System.out.println(handle);
	    }

	}

}
