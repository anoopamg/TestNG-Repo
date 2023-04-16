package testcases;

import org.testng.annotations.Test;

public class CarLoanTest extends BaseClass{

	@Test(groups= {"sanity"})
	public void test() {
		System.out.println("Inside CarLoanTest 1");
	}
	
	@Test(groups= {"regression"})
	public void test1() {
		System.out.println("Inside CarLoanTest 2");
	}
}
