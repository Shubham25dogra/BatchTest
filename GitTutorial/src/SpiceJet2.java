import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJet2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\Chrome 102.0.5005.61\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@dir='auto'][.='Family & Friends']")).click();
		driver.findElement(By.cssSelector("div[style='flex: 0.3 1 0%; margin-left: 10px;'] div[style='border-bottom-left-radius: 0px; border-top-left-radius: 0px;']")).click();
		driver.findElement(By.xpath("//div[@style='font-family: inherit;'][.='INR']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[style='flex: 0.3 1 0%; margin-left: 10px;'] div[style='border-bottom-left-radius: 0px; border-top-left-radius: 0px;']")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		
		for(int i=0; i<3; i++) 
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@style='font-family: inherit;'][.='IXC']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div[@data-focusable='true']")).getText());
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		
		driver.findElement(By.xpath("//div[@dir='auto'][.='International']")).click();
		driver.findElement(By.xpath("//div[@dir='auto'][.='DXB']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).getText());
		
		//driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
		
		driver.findElement(By.xpath("(//div[@tabindex='0'])[67]")).click();
		// Numberic X-Path
		
		if(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style").contains("background-color: rgb(238, 238, 238)"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();

	}

}
