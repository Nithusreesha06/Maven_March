package com.testng.concepts;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Demo {
	
	@BeforeTest
	private void browser_launch() {
		System.out.println("browser launch");
	}
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}
	
	@BeforeClass
	private void getUrl() {
		System.out.println("Url");
	}
	
	@BeforeMethod
	private void Login_btn() {
		System.out.println("login");
	}
	
	@Test
	private void Details_enter() {
		System.out.println("Booking details");
	}
	
	@Test
	private void Selection() {
		System.out.println("Hotel selection");
		}
	
	@Test
	private void Booking_cfm() {
		System.out.println("Booking confirmation");
	}
	
	@AfterMethod
	private void Logout_btn() {
		System.out.println("logout");
	}

}
