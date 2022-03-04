package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	//method for launch browser
	public static WebDriver LaunchBrowser(String name)
	{
	if(name.equalsIgnoreCase("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
      return driver;
	}
	//get url
	public static void Geturl(String url) {
		driver.get(url);
	}
	
	//close browser
	public static void CloseBrowser() {
		driver.close();
	}
	//quit 
	public static void QuitBrowser() {
		driver.quit();
	}
	//sendKeys
	public static void SendKeys(WebElement element,String input) {
		element.sendKeys(input);
	}
	//click
	public static void click(WebElement element) {
		element.click();
	}
	//navigate back
	public static void Navigateback() {
		driver.navigate().back();
	}
	//navigate forward
	public static void Navigatforward() {
		driver.navigate().forward();
	}
	//navigate back
	public static void Refresh(){
		driver.navigate().refresh();
	}
	public static void WaitForElement() {
		
	}
	public static void MouseOver(){
		
	}
	public static void DropDown() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
