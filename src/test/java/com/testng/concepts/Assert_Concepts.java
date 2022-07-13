package com.testng.concepts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assert_Concepts {
	
	@Test
	private void username() {
		
		String expected_username = "Nithusreesha";
		String actual_username = "Nithya06sreesha";
		
		assertEquals(expected_username,actual_username);
		
		System.out.println("Assert validation");
	}

}
