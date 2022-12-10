import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErrorBadssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		 option.setAcceptInsecureCerts(true);
		 
		 // ChromeOptions is a method via which we inhale WebSite issues or problems
		 // Website- https://chromedriver.chromium.org/capabilities
		 
		 // Part 1
		 // ChromeOptions options = new ChromeOptions();
        // options.addExtensions(new File("/path/to/extension.crx"));
        // ChromeDriver driver = new ChromeDriver(options);
		 
		 // Part 2
		 // Proxy proxy = new Proxy();
        // proxy.setHttpProxy("myhttpproxy:3337");
        // options.setCapability("proxy", proxy);
		 
		 // Part 3
		 // Block Pop-up Windows
		 // ChromeOptions options = new ChromeOptions();
        // options.setExperimentalOption("excludeSwitches",
        // Arrays.asList("disable-popup-blocking"));
		 
		 // Part 4
		 // Set Download Directory
		 // Map<String, Object> prefs = new HashMap<String, Object>();
		 // prefs.put("download.default_directory", "/directory/path");
        // options.setExperimentalOption("prefs", prefs);
	
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Dogra\\Downloads\\Driver\\ChrmDriver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(option);
	     
	     driver.get("https://expired.badssl.com/");
	     
	     System.out.println(driver.getTitle());

	}

}
