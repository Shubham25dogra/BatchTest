import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
				//ChromeBrowser Driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());

	}

}
