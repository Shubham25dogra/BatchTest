import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// Here from tagname I will identify that how many frame were there in website.
		
		// Here I use frame(webElement) as given below
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//frame(int index) it shows number of frame available in site
		// so deal with frame(int index) you have to first clarify yourself that in which frame you have to work is available in 0,1,2 or 3 index
		driver.findElement(By.id("draggable")).click();
		
		Actions A = new Actions(driver);
		
		WebElement Pull = driver.findElement(By.id("draggable"));
		WebElement Put = driver.findElement(By.id("droppable"));
		
		A.dragAndDrop(Pull, Put).build().perform();
		
		driver.switchTo().defaultContent();
		// Here defaultContent() = original page of Site

	}

}
