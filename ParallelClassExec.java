package TestNgUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelClassExec {
WebDriver driver;
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		System.out.println("We have entered into our site");
	}
	@Test
	public void inputForm() throws InterruptedException
	{
		setup();

		
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();
		driver.findElement(By.cssSelector("#user-message")).sendKeys("Hello World");
		driver.findElement(By.cssSelector("#showInput")).click();
		Assert.assertEquals(driver.getTitle(), "Selenium Grid Online | Run Selenium Test On Cloud");
	}
}
