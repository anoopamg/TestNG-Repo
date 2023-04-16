package testcases;

import org.testng.annotations.Test;

public class CreditCardTest {
	@Test(groups= {"sanity"})
	public void test() {
		System.out.println("Inside CreditCardTest 1");
	}
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("Inside CreditCardTest 2");
	}

}
