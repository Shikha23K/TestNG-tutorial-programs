package TestNgUsage;

import org.junit.Assert;
import org.testng.SkipException;

import org.testng.annotations.Test;
//@Listeners(TestNgUsage.CustomedListener.class)
public class ListenerTestExamp {
	
	@Test
	void test1()
	{
		System.out.println("This is test1");
		Assert.assertEquals("A", "A");		
		
	}
	
	@Test
	void test2()
	{
		System.out.println("This is test2");
		Assert.assertEquals("A","B");
	}
	
	@Test
	void test3()
	{
		System.out.println("This is test 3");
		throw new SkipException("This is skip exception..");

	}

}
