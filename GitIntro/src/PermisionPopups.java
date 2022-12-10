import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermisionPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> Contentsetting = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		// for Pup-ups with "Show notifications" we use "notification" at line 19.
		// for Pup-ups with "Know your location" we use "geolocation" at line 19.
		// for Pop-ups with "Use your Camera" and "Use your microphone" we use "media_stream" at line 19
		Contentsetting.put("notification", 0);  // Here 0 is for Pop-up streaming
		// 1 is for Allowing Pop-up  1- Allow
		// 2 is for Blocking Pop-up  2- Block
		profile.put("managed_default_content_settings", Contentsetting);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cleartrip.com/"); // site for notification Pop-up
		// driver.get("https://www.spicejet.com");  // site for location Pop-up
		// driver.get("https://www.mictests.com");  // site for microphone Pop-up
		// driver.get("https://www.webcamtests.com");  // site for web camera Pop-up
		
	}

}
