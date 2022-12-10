import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the framework
//for work with TestNG we have to first download TestNG software from 'Maven Repository' Site. Download by clicking at 'Jars'
//After download go to yours project i.e., here project is Introduction right click there and go to properties
//Here we use it only for assertion 

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\Chrome 102.0.5005.61\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		// Assert.assertFalse(boolean)   use for TestNG
		Assert.assertFalse(driver.findElement(By.xpath("//div[@style='position: relative; z-index: 1;'][1][.='Family & Friends']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[@style='position: relative; z-index: 1;'][1][.='Family & Friends']")).isSelected());
		driver.findElement(By.xpath("//div[@style='position: relative; z-index: 1;'][1][.='Family & Friends']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@style='position: relative; z-index: 1;'][1][.='Family & Friends']")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[@style='position: relative; z-index: 1;']")).size());
		
		//driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip'][.='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip'][.='DED']")).click();
		
		//driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
		driver.findElement(By.cssSelector("div[data-testid='undefined-month-June-2022'] div[data-testid='undefined-calendar-day-30']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).isEnabled());
		
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style"));
		driver.findElement(By.cssSelector("div[data-testid='round-trip-radio-button']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style"));
		
		driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();
		driver.findElement(By.cssSelector("div[data-testid='undefined-month-July-2022'] div[data-testid='undefined-calendar-day-6']")).click();

	}

}
