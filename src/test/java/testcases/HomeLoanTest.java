package testcases;

import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{
	
	@Test(groups= {"sanity"},dependsOnMethods="test1")
	public void test() {
		System.out.println("Inside HomeLoanTest");
	}
	
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("Inside HomeLoanTest 2");
	}	

}
