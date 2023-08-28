package TestNgUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParamSauceLogin {
WebDriver driver;
	
	@Test
	@Parameters({"browser","url"})
	public void setup(String browser,String webapp)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		}
		else
			if(browser.equalsIgnoreCase("Firefox"));
				driver=new FirefoxDriver();
			
		driver.get(webapp);
		System.out.println("We have entered into out site");
	
	}
	
	@Test(dependsOnMethods= {"setup"})
	public void Login()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Logged in Successfully");
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void AddToCart()
	{
	
		System.out.println("I will help you to add item in Cart");
	
	}
	
	@Test(dependsOnMethods= {"AddToCart"})
	public void RemoveItem()
	{	
		System.out.println("I will help you to remove item from the Cart");
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void DisplayItem()
	{
		System.out.println("I will help you to display item ");
	}
	
	@Test(dependsOnMethods= {"Login","AddToCart"})//,alwaysRun=true)
	public void CheckOut()
	{System.out.println("I will make to check out easily");}
	
	@AfterClass
	public void quitBrowser()
	{
		driver.quit();
		System.out.println("We are out of the browser");
	}
}


