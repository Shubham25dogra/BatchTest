import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class AboveBelowtoRightLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    WebElement able = driver.findElement(By.id("username"));
	    System.out.println(driver.findElement(with(By.tagName("label")).above(able)).getText());
	    
	    WebElement Pass = driver.findElement(By.cssSelector("label[for='username']"));
	    driver.findElement(with(By.tagName("input")).below(Pass)).sendKeys("Password");
	    
	    WebElement sign = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
	    System.out.println(driver.findElement(with(By.tagName("span")).toRightOf(sign)).getText());
	    
	    WebElement left = driver.findElement(By.xpath("//span[.=' User']"));
	    driver.findElement(with(By.tagName("span")).toLeftOf(left)).click();

	}

}
