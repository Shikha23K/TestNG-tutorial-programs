package TestNgUsage;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
/*in testNG frame work
 * TestSuit  ---(Contains)--> TestCases ----(Contains)--> TestSteps
 * 
 * (Package)-----(Contains)-->(Classes)-----contains---> (methods)
 * 
 * 
 * by using @Test annotation methods are identified as test method
 * 
 * 1.Setup -- open browser and application
 * 2login
 * 3close
 * 
 * TestNg Report Emailable report -> test-output folder->emailable-report->openwith
 * -->web browser
 */


public class FirstTestNG {

	@Test(priority=1)
	void setup()
	{
		
		//open browser
		//get to URL
	}
	
	@Test(priority=2)
	void login()
	{
		//login to profile
		
	}
	
	@Test(priority=3)
	void teardown()
	{
		//closing browser
	}
	
}
