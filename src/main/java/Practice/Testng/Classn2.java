package Practice.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Classn2 {

	@AfterMethod
	public void test5()
	{
		System.out.println("Test5 is created");
	}
	
	@Test
	public void test6()
	{
		System.out.println("Test6 is created");
	}
	
	@Test
	public void test7()
	{
		System.out.println("Test7 is created");
	}
	
	@BeforeMethod
	public void test8()
	{
		System.out.println("Test8 is created");
	}
}
