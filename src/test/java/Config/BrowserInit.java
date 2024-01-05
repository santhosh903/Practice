package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserInit {
	
	WebDriver driver;
	
	public WebDriver ChromeInit()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\asant\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		co.addArguments("--headless=new");										// headless mode execution
		WebDriver driver = new ChromeDriver(co);
		return driver;
	}
	
	public String prop(String PropName) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("properties");
		prop.load(fis);
		return prop.getProperty(PropName);
	}
}
