package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInit {
	
	WebDriver driver;
	
	public WebDriver ChromeInit()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

}
