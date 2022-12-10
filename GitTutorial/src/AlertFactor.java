import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFactor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Shubham"; 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com//AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        
        // After Click A browser Show us "Alert option", to accept that Alert we can,t use "findElement method"
        // Bcoz "Alert" Never Allow us to inspect There Command.
        // And we Never reject that "Alert" to.... Bcoz there is only one option that is "accept".
        // To accept we have another Criteria See below
        
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

	}

}
