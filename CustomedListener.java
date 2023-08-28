package TestNgUsage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomedListener implements ITestListener{
	
	//this belongs to ITestListener and will execute before starting of test set/batch.
	public void onStart(ITestContext arg)
	{
		System.out.println("Starts test execution ..."+arg.getName());
	}
	
	//this belongs to ITestListener and will execute before starting of test set/batch.
	
	public void onFinish(ITestContext ar)
	{
		System.out.println("Finish test execution "+ar.getName());
	}
	
	//this belongs to ITestListener and will execute before starting of test set/batch.
	
	public void onTestStart(ITestResult ar)
	{
		System.out.println("Starts testing "+ar.getName());
	}
	
	//this belongs to ITestListener and will execute before starting of test set/batch.
	
	public void onTestSkipped(ITestResult ar)
	{
		System.out.println("Skipped test  "+ar.getName());
	}
	
	
	//this belongs to ITestListener and will execute before starting of test set/batch.
	
	public void onTestSuccess(ITestResult ar)
	{
		System.out.println("Succeess test  "+ar.getName());
	}
	
	//this belongs to ITestListener and will execute before starting of test set/batch.
	
	public void onTestFailure(ITestResult ar)
	{
		System.out.println("Failed test  "+ar.getName());
	}

	//this belongs to ITestListener and will execute before starting of test set/batch.
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult ar)
	{
		
	}

}
