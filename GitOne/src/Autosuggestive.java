import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		// Now Here we Cant't use id or other Path Because we didn't know the location of Country that we exactly want.
		// Here after Typing Ind the location  of India (today) at 2nd Number, But tommorow it will be at 1st or at 3rd don't know
		// So to inhale this problem we deal with another Strategy
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}

	}

}
