import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\Chrome 102.0.5005.61\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait rest = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String[] Mobiles = {"Samsung","iphone","Nokia","Blackberry"};
		Natural(driver,Mobiles);
		
		driver.findElement(By.cssSelector("a.btn")).click();
		rest.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-success")));
		driver.findElement(By.cssSelector("button.btn-success")).click();
		
	}
	public static void Natural(WebDriver driver,String[] Mobiles) {
		
		WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.className("form-control")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//span[.=' User']")).click();
		Explicit.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.cssSelector("select[data-style='btn-info']")).click();
		driver.findElement(By.xpath("//select/option[3]")).click();
		// CSS with tagname#id
		// CSS with tagname.class
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input.btn")).click();
		
		int j=0;
		
		Explicit.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-title")));
		List<WebElement> mobilename = driver.findElements(By.className("card-title"));
		for(int i=0; i<mobilename.size(); i++)
		{
			String[] name = mobilename.get(i).getText().split(" ");
			String formatname = name[0];
			
			List AL = Arrays.asList(Mobiles);
			if(AL.contains(formatname))
			{
				j++;
				driver.findElements(By.cssSelector("button.btn")).get(i).click();
				if(j==Mobiles.length)
				{
					break;
				}
			}
		}

	}

}
