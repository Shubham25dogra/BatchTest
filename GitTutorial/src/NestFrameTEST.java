import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestFrameTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[.='Nested Frames']")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
