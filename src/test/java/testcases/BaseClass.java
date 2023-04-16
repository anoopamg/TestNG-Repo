package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	

	@BeforeTest(alwaysRun=true)
	public void before()
	{
		System.out.println("Inside before test");
	}
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Inside before method");
	}
	@AfterMethod
	public void method2()
	{
		System.out.println("Inside after method");
	}
	
	@AfterTest
	public void after()
	{
		System.out.println("Inside after test");
	}

}
