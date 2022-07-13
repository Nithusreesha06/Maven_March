package com.testng.concepts;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Priority {
	@Test
	private void username() {
		
		String expected_username = "Nithusreesha";
		String actual_username = "Nithya06sreesha";
		
		assertEquals(expected_username,actual_username);
		
		System.out.println("Assert validation");
	}
	@Test(priority = 0)
	private void password() {
		
		String expected_password = "nithya@06";
		String actual_password= "I4A4Y9";
		assertEquals(expected_password, actual_password);
		System.out.println("Assert validation not equals");
	}
	@Test(priority = 1)
	private void login() {
		
		String expected_mail= "nithyavimal@gmail.com";
		String actual_mail="herbalifenithya98@gmail.com";
		assertEquals(expected_mail, actual_mail);
		System.out.println("Assert validation same");
		
	}
	
	@Test(priority = 2)
	private void enternumber() {
		
		String a = null;
		Assert.assertNull(a);
		System.out.println("Assert validation null");
	}
	@Test(priority = 3)
	private void number() {
		int a = 12;
		Assert.assertNotNull(a);
		System.out.println("Assert validation not null");
	}

}
