package com.testng.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	@Test
	@Parameters({"username","password"})
	
	private void login(String username,int password) {
		
		System.out.println("username:"+ username);
		System.out.println("password:"+ password);

 }
}