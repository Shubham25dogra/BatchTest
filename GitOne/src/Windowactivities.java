import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Here we have to import FileUtils driver because our Selenium is not able to detect this file jars which not attached with eclipse driver
//So for that we have to first open 'commons.apache.org/proper/commons-io/' then click to download button from where we download bin-zip file
//on Lecture 108 in Tutorial WebSite

public class Windowactivities {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\ChrmDriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("http://google.com");
		 driver.navigate().to("https://www.facebook.com");
		 driver.navigate().back();
		 driver.navigate().forward();
		 
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(source,new File("C:\\Users\\Shubham Dogra\\Desktop\\Screenshot\\screenshot.png"));
		 // Here our Selenium 

	}

}
