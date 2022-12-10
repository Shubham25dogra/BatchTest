import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\Chrome 102.0.5005.61\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		
		String[] Mobiles = {"Samsung","iphone","Nokia","Blackberry"};
		
		driver.findElement(By.className("form-control")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//label[@class='customradio'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.cssSelector("select[data-style='btn-info']")).click();
		driver.findElement(By.xpath("//select/option[3]")).click();
		// CSS with tagname#id
		// CSS with tagname.class
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input.btn")).click();
		
		int j=0;
		Thread.sleep(3000);
		List<WebElement> Phone = driver.findElements(By.className("card-title"));
		
		for(int i=0; i<Phone.size(); i++)
		{
			String[] name = Phone.get(i).getText().split(" ");
			String Webname = name[0];
			
			List AL = Arrays.asList(Mobiles);
			if(AL.contains(Webname))
			{
				j++;
				driver.findElements(By.cssSelector("button.btn")).get(i).click();
				if(j==Mobiles.length)
				{
					break;
				}
			}
		}
		
		driver.findElement(By.cssSelector("a.btn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-success")));
		driver.findElement(By.cssSelector("button.btn-success")).click();

	}

}
