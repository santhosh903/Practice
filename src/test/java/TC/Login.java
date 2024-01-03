package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.BrowserInit;

public class Login extends BrowserInit{
	
	WebDriver driver = ChromeInit();
	
	
	
	@BeforeTest
	public void openUrl()
	{
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		System.out.println("Before Test Executed");
	}
	
	@Test(priority=2)
	public void enterDetails()
	{
		int size = driver.findElements(By.xpath("//*[@class='text-center text-white']/b")).size();
		String[] a = new String[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=driver.findElements(By.xpath("//*[@class='text-center text-white']/b")).get(i).getText();
		}
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(a[0]);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(a[1]);
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
				
		Select s = new Select(driver.findElement(By.xpath("//*[@class='form-control'][@data-style='btn-info']")));
		s.selectByVisibleText("Teacher");
		System.out.println("enterDetails done");
	}
	
	@Test(priority=3)
	public void clickSubmit()
	{
		driver.findElement(By.xpath("//*[@id='terms']")).click();
		driver.findElement(By.xpath("//*[@value='Sign In']")).click();
		System.out.println("Submit Clicked");
	}
}
