package TestNgUsage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertSauce {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("We have entered into out site");
	}
	
	@Test(priority=1)

	public void homePageTitle() throws IOException
	{
		String title=driver.getTitle();
		Assert.assertEquals("Swag Labs", title);
		this.takeScreenShot(driver,"d:/sc.png" );
		System.out.println(title);
	}
	@Test(priority=0)
	public void loginButton()
	{
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		//btn.click();
		Assert.assertTrue(btn.isEnabled());
		
		
	}
	public void takeScreenShot(WebDriver driver,String filepath) throws IOException
	{
		TakesScreenshot screen=((TakesScreenshot)driver);
		File screenFile=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File(filepath);
		FileUtils.copyFile(screenFile,dest);
	}
	public void tearDown()
	{
		driver.quit();
	}

}
