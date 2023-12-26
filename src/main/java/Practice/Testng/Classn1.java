package Practice.Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classn1 {

	
	@AfterTest
	public void test1 () {
		
		System.out.println("Test1 is succeeded");
	}
	
	@Test
	public void test2 () {
		
		System.out.println("Test2 is succeeded");
	}
	
	
	@BeforeTest
	public void test3 () {
		
		System.out.println("Test3 is succeeded");
	}
	
	@Test
	public void test4 () {
		
		System.out.println("Test4 is succeeded");
	}
	
	@Test
	public void test5 () {
		
		System.out.println("Test5 is succeeded");
	}
	
	
}
