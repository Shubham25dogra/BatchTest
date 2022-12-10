import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoNewTAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\ChrmDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		
		// Now Here I Want to switch in new Tab after above Command.
		// So for that I have to deal with getWindowHandles and write before this that what 'getWindowHandles()' show in there link
		// for example 'getWindowHandles()' show us to Add "Set<String>" before that. As I type below.
		Set<String> Tab = driver.getWindowHandles();
		
		// Same here as 'iterator()' show us to add "Iterator<String>" before that.
		Iterator<String> Tab1 = Tab.iterator();
		
		// And 'next()' show us to add "String" before that
		String ParentID = Tab1.next();
		// Here ParentID is that I Have gave on Line 15
		String ChildID = Tab1.next();
		// And ChildID is that which open after 17th line step
		
		driver.switchTo().window(ChildID);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		// Now From After this text we trying to get our some part of text
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		// Here first I will apply debug
		// Then Select whole item in line 37 with mouse and click right button and select watch
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(emailid);

	}

}
