package TestNgUsage;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GroupingTest {

		WebDriver driver;
		WebElement key;
		
		
		@Test(groups= {"Sanity"})
		void test1()
		{
			System.out.println("Test 1 Group name : Sanity");
	
		}
		
		@Test(groups= {"Regression"})
		void test2()
		{
			System.out.println("Test 2 Group name : Regression");
						
		}
		
		@Test(groups= {"Sanity"})
		void test3()
		{
			System.out.println("Test 3 Group name :Sanity ");
		}
		
		@Test(groups= {"Regression","Sanity"})
		void test4()
		{
			System.out.println("Test 4 Group name :Sanity and Regression");
	
		}
		
		@Test(groups= {"Regression"})
		void test5()
		{
			System.out.println("Test 5 Group name : Regression");
			
			
		}
		
		@Test(priority=1)
		void test6()
		{
			System.out.println("Test 6 Group name : no group");
		}
}



