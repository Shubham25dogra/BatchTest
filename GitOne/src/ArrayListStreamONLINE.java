import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ArrayListStreamONLINE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[.='Top Deals']")).click();
		
		Set<String> Page = driver.getWindowHandles();
		Iterator<String> data = Page.iterator();
		
		String Parent = data.next();
		String Child = data.next();
		
		driver.switchTo().window(Child);
		
		// Click on Column
		driver.findElement(By.cssSelector("tr th:first-child")).click();
		// Capture all webElements into List.
		List<WebElement> Elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all WebElements into new (original) List.
		List<String> OriginalList = Elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(OriginalList);
		// Sort On the Original List : Sorted List 
		List<String> Sortedlist = OriginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(Sortedlist);
		// Compare OriginalList Vs Sorted List.
		Assert.assertTrue(OriginalList.equals(Sortedlist));
		
		// Filter is used For to identify a single value that we need
		List<Object> price = Elementlist.stream().filter(s->s.getText().contains("Banana")).map(s->getpriceFruit(s)).collect(Collectors.toList());
		// As getpriceFruit is not a registered jars in map this is the word that I create by own self
		// To remove error bellow jars that we create by own self we have to create class with that name outside the
		// link in line 14
		price.forEach(a->System.out.println(a));
		
		// if Searching Item is not available in first page then we have to search multiple pages for the item that we apply
		// so for that we apply do;while method
		// for that List<Object> price write individually
		List<Object> price1;
		do
		{
			List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
			price1 = row.stream().filter(s->s.getText().contains("Rice")).map(s->getpriceFruit(s)).collect(Collectors.toList());
			price1.forEach(a->System.out.println(a));
			if(price1.size()<1)
			{
				// Here We have next button which available for next page
				// Here we have search value of Rice
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			
		}while(price1.size()<1);
		
		driver.switchTo().window(Parent);

	}
	private static Object getpriceFruit(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		// Original "XPATH" is //tr/td[1]/following-sibling::td[1] .
		// Here //tr/td[1] XPATH. We Write further in line 34.  
		
		return pricevalue;
	}


}
