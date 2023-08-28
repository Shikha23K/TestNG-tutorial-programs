package TestNgUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TableValidat {

	FirefoxDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");

	}
	
	@Test
	public void countBranch()
	{
		int row=driver.findElements(By.xpath("//table[@id='table02']//tbody//tr")).size();
		System.out.println("Rows   : "+row);

		int cols=driver.findElements(By.xpath("//table[@id='table02']//tbody//tr[1]//td")).size();
		System.out.println("Columns no  : "+cols);
		int count=0;
		for(int i=1;i<=row;i++)
			if(driver.findElement(By.xpath("//table[@id='table02']//tbody//tr["+i+"]//td["+3+"]")).getText().equalsIgnoreCase("San Francisco"))
					count++;
		System.out.println("No of employee who work in  San Francisco branch : "+count);
			

	}
	@Test
	public void ValidateSalary()
	{
		int row=driver.findElements(By.xpath("//table[@id='table02']//tbody//tr")).size();
		System.out.println("Rows   : "+row);

		int cols=driver.findElements(By.xpath("//table[@id='table02']//tbody//tr[1]//td")).size();
		System.out.println("Columns no  : "+cols);
		int sal;
		String salary,name;
		for(int i=1;i<=row;i++)
		{
			salary=driver.findElement(By.xpath("//table[@id='table02']//tbody//tr["+i+"]//td["+6+"]")).getText();
			name=driver.findElement(By.xpath("//table[@id='table02']//tbody//tr["+i+"]//td["+1+"]")).getText();
			String ar=salary.replaceAll("[^0-9]","");		
			sal=Integer.valueOf(ar);
			
			if(sal>100000)
				System.out.println(name+" is getting paid  $" +sal);
		}
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
