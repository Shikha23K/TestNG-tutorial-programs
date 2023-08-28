package TestNgUsage;

import org.testng.annotations.DataProvider;

public class CustomeDataProvider {
	@DataProvider(name="LoginDataProvider")
	public Object[][] getLoginData()
	{
		Object[][] data= {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"},{"performance_glitch_user","secret_sauce"}};
		return data;		
	}
	
	

}
