package day1TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount=20) // used to run the test desired number of times
	
	public void method1() {
		
		
		System.out.println("Hi.. This is Test method! for invocation");		
		
		
	}
	

}
