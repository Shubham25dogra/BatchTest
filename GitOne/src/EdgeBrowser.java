import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
