import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemBasePrice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait is Good bcoz It Apply For all stances or in(Commands)
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// Now Here We use ExplicitWait
		
		WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] vegetables = {"Cucumber","Carrot","Beans"};
		Thread.sleep(3000);
		additems(driver,vegetables);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
		
		Explicit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		Explicit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
	}

	public static void additems(WebDriver driver,String[] vegetables)
	{
		int j=0;
		List<WebElement> onlineVeggies = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0; i<onlineVeggies.size(); i++)
		{
			String[] name = onlineVeggies.get(i).getText().split("-");
			String Formattedname = name[0].trim();
			
			List<String> VEG = Arrays.asList(vegetables);
			if(VEG.contains(Formattedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==vegetables.length)
				{
					break;
				}
				
			}
		}

	}

}
