package TestNgUsage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelMethodExec {
	WebDriver driver;
	
	
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("We have entered into our site");
	}
	
	@Test

	public void homePageTitle()
	{	setup();
		String title=driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		System.out.println(title);
	}
	@Test
	public void loginButton()
	{
		setup();
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		//btn.click();
		Assert.assertTrue(btn.isEnabled());
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
