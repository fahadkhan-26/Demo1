package Practice.Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Classn4 {

	@AfterSuite
	public void test13()
	{
		System.out.println("Test13 is passed and returned");
	}
	
	@Test
	public void test14()
	{
		System.out.println("Test14 is passed and returned");
	}
	
	@BeforeSuite
	public void test15()
	{
		System.out.println("Test15 is passed and returned");
	}
}
