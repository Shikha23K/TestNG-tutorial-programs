package TestNgUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvSauce {
	WebDriver driver;
	
	@Test(priority=1)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("We have entered into our site");
	
	}

	@Test(priority=2,dataProvider="LoginDataProvider",dataProviderClass=CustomeDataProvider.class)
	public void Login(String userName,String pwd)
	{
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		System.out.println("Logged in Successfully");
	}
	
	
	
	
	
}
