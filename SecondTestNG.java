package TestNgUsage;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class SecondTestNG {
	
	@Test(priority=1)
	void setup()
	{
		System.out.println("I am inside scondTestNG class to SETUP");
		//open browser
		//get to URL
	}
	
	@Test(priority=2)
	void SearchCustomer()
	{
		System.out.println("I am inside scondTestNG class to LOGIN");
		//login to profile		
	}
	@Test(priority=3)
	void AddCustomer()
	{
		System.out.println("I am inside scondTestNG class to ADD_CUSTEMR");
		//login to profile
		
	}
	
	@Test(priority=4)
	void teardown()
	{
		System.out.println("I am inside scondTestNG class to QUIT");
		//closing browser
	}
	@BeforeSuite
	public void BeforeTheSuite()
	{
		System.out.println("I am inside scondTestNG class and I'll be executed before the entire TEST SUITE");
		
	}
	@AfterSuite
	public void AfterTheSuite()
	{
		System.out.println("I am inside scondTestNG class and I'll be executed after the entire TEST SUITE");
		
	}
}
