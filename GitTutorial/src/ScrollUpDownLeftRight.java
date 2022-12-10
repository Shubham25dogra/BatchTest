import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollUpDownLeftRight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Here We Learn Technique to Scroll Up And Down Page Without mouse
		// Here In Selenium JavaExecutor command is useful For Scroll up And Down property
		
		JavascriptExecutor Scroll = (JavascriptExecutor)driver;
		Scroll.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		Scroll.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		List<WebElement> values = driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"));	
		
		int Sum = 0;
		
		for(int i=0; i<values.size(); i++)
		{
			// Here this 'values.get(i).getText()' is String We have to convert it in integer So for that
			Sum = Sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(Sum);
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
		System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		String ADD = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int totalsum = Integer.parseInt(ADD);
		
		Assert.assertEquals(Sum, totalsum);

	}

}
