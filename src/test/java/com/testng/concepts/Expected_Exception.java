package com.testng.concepts;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		
		int a = 22;
		System.out.println(a/0);
		
		System.out.println("Display Output");
	}
	

}
