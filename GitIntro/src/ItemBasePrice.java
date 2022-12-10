import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemBasePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] veggies = {"Beetroot","Brinjal","Pumpkin"};
		// This is Array
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		int j=0;
		// here we use "driver.findElements" instead of "driver.findElement"
		// findElements Use when we get result more than 1 
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// here "h4.product-name" CSS conduct by 30 elements i.e., list with 30 element
		// when we use findElemnts property then we have to write WebElement with list Further of it
		
		for(int i=0; i<products.size(); i++)
		{
			// Actual Veggies Name that we have in WebSite is including 1Kg with their name i.e.,
			// Beetroot - 1Kg , Brinjal - 1kg, Pumpkin - 1kg
			// But We give our Veggies name by removing 1kg as mention in 17th line
			
			// So to Formatting Actual name equal to vegetables name on 17th line
			// Add Split After getText() below
			
			String[] name = products.get(i).getText().split("-");
			// Here Vegetables Split in two parts 1. Beetroot and 2. 1kg But in WebSite Space is also there After Vegetable name or before 1kg with "hash"
			// So to remove Spaces we also use another option too
			
			String formattedname = name[0].trim();
			
			// Trim Always be use to remove Spaces From required items
			// Conversion of Array to Arraylist
			// Using Array.asList
			List<String> AL = Arrays.asList(veggies);
			
			if(AL.contains(formattedname))
			{
				j++;
				// When Selenium Matches All the Veggies That I had Gave on 17th line then there is no purpose to run our command upto 30's items
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// After j==3 it suggest that it run only 3 times when it matches all the veggies in 17th line
				// becoz there(17th line) we only written 3 items. So we put j==3, but if write 4 items then j==4 and so on.
				if(j==veggies.length)
					// we also take number there instesd of "veggies.length".
				{
				break;
				}
			}
		}
		// This loop method we conduct only when there is no single content or locator we can create.  
		// we put breakpoint at line 24 to run it into debug mode
		
		// As we see when we run it in "Run as" mode then our mention items were not selected except 1st one and others are selected different
		// But our code Succesfully run. it is because we provide our xpath with text where 'Add to Cart' is given.
		// But after selected it is shown 'ADDED' for 3 to 4 seconds. And we know that our Selenium took 3 to 4 milisecond.
		// To enhance this problem we have to replace text xpath with another xpath.

	}

}
