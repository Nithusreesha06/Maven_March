package com.testng.concepts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Multithreading_Concept {
	
	@Test(priority = -1)
	private void  username() {
		
		String expected_username = "Nithya06sreesha";
		String actual_username = "Nithya06sreesha";
		Assert.assertEquals(expected_username, actual_username);
		System.out.println("Assert validation");
	
	}
	@Test(priority= 0)
	private void password() {
		String expected_password = "nithya@06";
		String actual_password= "I4A4Y9";
		assertEquals(expected_password, actual_password);
		System.out.println("Assert validation not equals");
	}

}
