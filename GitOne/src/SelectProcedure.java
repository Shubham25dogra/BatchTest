import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		// dropdown with Select Tag
		WebElement dropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		// Here we Use Select Concept instesd of findElement to apply that we need
		Select data = new Select(dropdown);
		data.selectByIndex(2);
		// Here selection with there Position that is with selectByIndex
		System.out.println(data.getFirstSelectedOption().getText());
		
		data.selectByVisibleText("INR");
	    // Here selection with visible Text 
		System.out.println(data.getFirstSelectedOption().getText());
		// Here Value is attribute which is given under 'Select' Tagname
		
		data.selectByValue("USD");
		// Here selection with value it is similar to visible Text
		System.out.println(data.getFirstSelectedOption().getText());

	}

}
