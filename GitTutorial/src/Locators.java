import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:rahulshettyacademy.com/locatorspractice/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("inputUsername")).sendKeys("Shubham");
	    driver.findElement(By.name("inputPassword")).sendKeys("9418269117");
	    driver.findElement(By.className("submit")).click();
	    // CSS with class (tagname.classname) and with ID (tagname#ID)
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    // now its with Linktext
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    // now based on Xpath (//tagname[@attribute='placement'])
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ShubhamDogra");
	    // now when CSS with no Class,Name and ID ("tagname[attribute='placement']") 
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dogra.shubham1@gmail.com");
	    // if There is same attribute with same placement in 5 spaces then you have to go with xpath
	    // i.e., (//tagname[@attribute='placement'][3]) here 3 is shows that we give command to computer that put value on 3rd number space.
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    // In more than 1 Spaces case Now we use CSS
	    // i.e., (tagname[attribute='placement]:nth-child(3))
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("shubham@gmail.com");
	    // Now X-path with parents to Child method (//ParentsTagName/ChildTagname)
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("8758684196");
	    // method below use for classname (tagname.classname or .classname)
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   // Now CSS with parents to child (parentsTagName ChildTagName)
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    // if Intercepted error is Shown its only shows when screen change randomly at that we have to use 
	    // Thread.sleep(miliseconds);  here seconds in miliseconds i.e., for exp   1sec=1000 milisecond
	    driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	    Thread.sleep(2000);
	    // Below       tagname#Id
	    driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
	    // Now CSS with regular expression by adding * i.e., tagname[attibute*='placement'] here placement with half letter
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.name("chkboxOne")).click();
	    // regular expression with X-path
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
