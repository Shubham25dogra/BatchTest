import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoscreenshotLenwidth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> newTAB = driver.getWindowHandles();
		Iterator<String> Base = newTAB.iterator();
		
		String Parent = Base.next();
		String Child = Base.next();
		
		driver.switchTo().window(Child);
		driver.get("https://www.eclipse.org/");
		
		System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
		String line = driver.findElement(By.xpath("//div/h1")).getText();
		String[] main = line.split("for")[1].split("and");
		String user = main[0].trim();
		System.out.println(user);
		
		driver.switchTo().window(Parent);
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys(user);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		// Screenshot of user name bar. 
		FileUtils.copyFile(file, new File("logo.png"));
		
		// Get Height & Width of Search Bars or also for other Bars
		System.out.println(name.getRect().getDimension().getWidth());
		System.out.println(name.getRect().getDimension().getHeight());

	}

}
