package Practice.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Classn3 {

	@AfterClass
	public void test9()
	{
		System.out.println("Test9 is generated");
	}
	
	@Test
	public void test10()
	{
		System.out.println("Test10 is generated");
	}
	
	@Test
	public void test11()
	{
		System.out.println("Test11 is generated");
	}
	
	@BeforeClass
	public void test12()
	{
		System.out.println("Test12 is generated");
	}
}
