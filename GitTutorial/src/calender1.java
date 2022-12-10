import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		
		Thread.sleep(2000);
		while(!driver.findElement(By.cssSelector(".DayPicker-Caption")).getText().contains("October"))
		{
			driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		}
		// While Loop Always Allows Loop Conditions Inside There Bracket
		// But if We Give Negotiation sign i.e., "!" It Allow process again n again until it match there Condition.
		
		List<WebElement> date = driver.findElements(By.cssSelector(".dateInnerCell"));
		//int count = driver.findElements(By.cssSelector(".dateInnerCell")).size();
		
		for(int i=0; i<date.size(); i++)
		{
			String Date = date.get(i).getText();
			System.out.println(Date);
			if(Date.contains("30"))
			{
				driver.findElements(By.cssSelector(".dateInnerCell")).get(i).click();
				break;
			}
		}

	}

}
