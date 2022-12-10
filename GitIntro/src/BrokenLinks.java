import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Our goal to identify all broken URl's
		// first Step All Url's which Tied up to the Links using Selenium
		// Java Method's which we use on this lecture will call's URL's and get you the 'status code'.
		// if 'Status Code' Is greater than '>' 400 then that URL is not working or if it is 200 then it is working. or which mean it is broken
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert a = new SoftAssert();
		// SoftAssert is used for identify Failure without Stoping Test.
		// If you only Want Response Code of All Link in WebSite without there failure Assertion Then there is no need 
		// to deal with SoftAssert and assertTrue Condition
		
		List<WebElement> LISTURL = driver.findElements(By.cssSelector("li.gf-li a"));
		
		for(WebElement Link:LISTURL)
		{
		    // Now Here We use For More Than one URL
			String URLs = Link.getAttribute("href");
			HttpURLConnection Connections = (HttpURLConnection)new URL(URLs).openConnection();
			Connections.setRequestMethod("HEAD");
		    Connections.connect();
		    int StatusCodes = Connections.getResponseCode();
		    System.out.println(StatusCodes);
		    a.assertTrue(StatusCodes<400, "The link with text" + Link.getText()+" is broken with code"+ StatusCodes);
		    
		}
		a.assertAll();
	
		// This method For one URL 
		
		String url = driver.findElement(By.cssSelector("a[href*='appiumselenium']")).getAttribute("href");
		
		HttpURLConnection Connection = (HttpURLConnection)new URL(url).openConnection();
		// There is no need to learn HttpURLConnection
		// We can also identify by "new URL().openConnection" Parent name.
		Connection.setRequestMethod("HEAD");
		// here we represent URL in SetRequestMethod with "HEAD" inside the Brackets
		// Or to Printed Country name after Selection from country Blog's we use "value" inside the 'getAttribute("value") method.
		Connection.connect();
		int StatusCode = Connection.getResponseCode();
		// Now We get "StatusCode" as we mention in line 20;
		System.out.println(StatusCode);

	}

}
