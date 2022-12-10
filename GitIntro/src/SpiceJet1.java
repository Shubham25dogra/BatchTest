import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJet1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\Chrome 102.0.5005.61\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		// Here we take Assertion False Command Before 16nth line where we provide true Command
		Assert.assertFalse(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).isSelected());
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).isSelected());
		// Here we take Assertion True Command After 16nth line where we provide true Command
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click(); // for single click  or 2 Adults
		// if we want 5 Adults then for that we have to repeat above command 4 times
		// But its not correct way
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		int i=1;
		while(i<5)  // command took place after 2 adult and stop to 6 Adult here that is when i= 4 less than 5
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		
		// Here We use Assertion equal command
		// Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText(), "Passengers 6 Adults");
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		
		// In while loop we write everything in different place but as we studied in previous lecture that 'for' loop is best option
		// because in 'for' loop we write every thing in same place
		// for(int i=0; i<5; i++)

	}

}
