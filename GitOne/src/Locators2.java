import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Now Here We Learn That executing Factor from Child to Parents.
		// As previous we learn Factor from Parents to child.
		
		// When we work On X-path than in Parents To Child we Set an example with double Slash '//'. 
		// But if we wanna to carry from root than we can use single Slash '/'
		
		// For Sibling to Sibling we can go with if parents have 3 sibling than   '//Parents/child[0]/following-sibling::child[1]'
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		// from Sibling to parent    '//Parents/child[0]/parent::parentname'
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());

	}

}
