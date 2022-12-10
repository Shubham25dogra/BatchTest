import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Server = new ChromeDriver();
		String PASSWORD = password(Server);
		Server.get("https:rahulshettyacademy.com/locatorspractice/");
		Server.findElement(By.id("inputUsername")).sendKeys("Rahul");
		Server.findElement(By.name("inputPassword")).sendKeys(PASSWORD);
		Server.findElement(By.className("submit")).click();
		Server.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		System.out.println(Server.findElement(By.tagName("p")).getText());
		Assert.assertEquals(Server.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// in Xpath you can also give command via text
		Server.findElement(By.xpath("//button[text()='Log Out']")).click();
		// if you work on Xpath you can also remove tagname and enter '*' (star) instead of it.
		// i.e., for example   //*[@attribute='placement']
		// Implicity wait use for line which is not shown on present page. 
		// and "Thread.sleep(milisec)" use for line which shown on next page.
		Server.close();
			
	}
	
	public static String password(WebDriver Server) throws InterruptedException
	{
		Server.get("https:rahulshettyacademy.com/locatorspractice/");
		Server.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		Server.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String Password1 = Server.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		// Now Here We Use Split Method
		String[] Password2 = Password1.split("'");
		// After Split it divide into two parts
		// 0th Part = Please use temporary password
		// 1st Part = 'rahulshettyacademy' to Login.
		// Here our Password exist in 2nd Part, But here it again Forcing us to split So
		
		// Now After Again Splitting
		// 0th Index = rahulshettyacademy
		// 1st Index = to Login.
		// Here Finally what we need will exist on 0th Index So,
		
		// String[] Password3 = Password2[1].split("'");
		// Password3[0];
		
		// Instead of Password3 We execute our Plan Over Password2
		
		String Password = Password2[1];
		return Password;

	}

}
