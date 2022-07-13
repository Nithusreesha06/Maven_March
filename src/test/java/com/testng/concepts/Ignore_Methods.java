package com.testng.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Methods {

	@Test(priority = 1,groups = "login")
	private void browser_launch() {
		System.out.println("browser launch");
	}
	
	@Test(priority = 2,groups = "login")
	private void setProperty() {
		System.out.println("Set Property");
	}
	
	@Test(priority = 3,groups = "login")
	private void getUrl() {
		System.out.println("Url");
	}
	
	@Ignore
	@Test(priority = 2,groups = "login", enabled= false)
	private void Login_btn() {
		System.out.println("login");
	}
	
	@Test(priority = -1,invocationCount = 3)
	private void Details_enter() {
		System.out.println("Booking details");
	}
	
	@Test(priority = -1,enabled = false)
	private void Selection() {
		System.out.println("Hotel selection");
		}
	
	@Test(priority = -2)
	private void Booking_cfm() {
		System.out.println("Booking confirmation");
	}
	
	@Test(priority = 4)
	private void Logout_btn() {
		System.out.println("logout");
	}


}
