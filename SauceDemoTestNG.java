package TestNgUsage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoTestNG {
	WebDriver driver;
	
	@Test(priority=1)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
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
		//Assert.fail();
		System.out.println("I will help you to add item in Cart");
		
		/*it makes this method to fail.and dependent methods will be	
		skipped. we can run those dependent methods forcefully using
		" AlwaysRun " Property
		*/
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
