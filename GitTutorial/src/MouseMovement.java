import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		// Here We Learn How to operate mouse Key Automatically When Some Button Didn't want to click, its Applicable only with movement of mouse key over it.
		// So for that We import Actions Driver to perform our need. 
		Actions AB = new Actions(driver);
		
		// we Perform these Actions in two ways that is shown below.
		//AB.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		WebElement mouse = driver.findElement(By.id("nav-link-accountList"));
		
		// Now Here We also learn How to press Any Keys from Keyboard Automatically
		// Here We perform Action by pressing Shift Button in Auto mode
		AB.moveToElement(driver.findElement(By.name("field-keywords"))).click().keyDown(Keys.SHIFT).sendKeys("lamps").doubleClick().build().perform();
		// Now After performing we want Select Key that we wrote on Search Bars i.e., lamps we Have to apply double click command
		
		AB.moveToElement(mouse).contextClick().build().perform();
		// If we want to click right button without mouse than we have to select 'ContextClick'
		// ContextClick = MouseRightkeyPress

	}

}
