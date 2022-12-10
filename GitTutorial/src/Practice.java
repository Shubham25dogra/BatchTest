

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert SL = new SoftAssert();
		List<WebElement> name = driver.findElements(By.cssSelector("li.gf-li a"));
		
		for(WebElement Link:name)
		{
			String Url = Link.getAttribute("href");
			HttpURLConnection data = (HttpURLConnection)new URL(Url).openConnection();
			data.setRequestMethod("HEAD");
			data.connect();
			int StatusCode = data.getResponseCode();
			System.out.println(StatusCode);
			SL.assertTrue(StatusCode<400, "The Link with Text "+ Link.getText()+ " is broken with Code " + StatusCode);
		}
		SL.assertAll();
		
	}	
}
