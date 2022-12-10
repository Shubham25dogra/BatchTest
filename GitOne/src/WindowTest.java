import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham Dogra\\Downloads\\ChrmDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[target='_blank']:nth-child(2)")));
		driver.findElement(By.cssSelector("a[target='_blank']:nth-child(2)")).click();
		
		Set<String> A = driver.getWindowHandles();
		Iterator<String> B = A.iterator();
		String Web1 = B.next();
		String Web2 = B.next();
		
		driver.switchTo().window(Web2);
		
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		
		driver.switchTo().window(Web1);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3[.='Opening a new window']")).getText());

	}

}
