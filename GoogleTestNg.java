package TestNgUsage;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestNg {
	WebDriver driver;
	WebElement key;
	
	@BeforeClass  //class level
    public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test//method level
	public void SearchField()
	{	System.out.println("I got the Search Box and Typed value");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(dependsOnMethods="SearchField")//method level
	public void TheResult()
	{
		System.out.println("Now here is the result");
		List <WebElement> serchList=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		System.out.println(serchList.size());
		for(int i=0;i<serchList.size();i++)
		{
			System.out.println(serchList.get(i).getText());
			
			if(serchList.get(i).getText().equalsIgnoreCase("java download"))
			{		
				key=serchList.get(i);
				key.click();	
				break;
		}
		}

	}
	@AfterMethod 		//method level
	public void OpenTheKey()
	{
		driver.switchTo().window(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());				

		
	}
	
	@AfterClass			//class level
	public void CloseBrowser()
	{
		System.out.println("Browser is now closed");
		driver.close();
	}
	
	//it ll execute Before all test class defined in testng.xml
	
	@BeforeTest			//Test level
	public void beforeAnyTest()
	{
		System.out.println("I will be executed before any test case of any class");
		
	}
	
	@AfterTest			//Test Level
	public void AfterAnyTest()
	{
		System.out.println("I will be executed after all test case of any class");
		driver.quit();
		
	}
	
	
}
