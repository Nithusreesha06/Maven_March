package com.testng.concepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	private void username() {
		
		String expected_username = "Nithusreesha";
		String actual_username = "Nithya06sreesha";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual_username, expected_username);
		System.out.println("Assert Verification");
	}

}
