package com.testng.concepts;

import org.testng.annotations.Test;

public class Group_Concepts {
	@Test(groups = "movies")
	private void Amazon_Prime() {
		System.out.println("Amazon prime");
	}
	
	@Test(groups = "movies")
	private void Netflix() {
		System.out.println("netflix");
	}
	
	@Test(groups = "women")
	private void Saree() {
		System.out.println("saree");
	}
	
	
	@Test(groups = "women")
	private void Kurti() {
		System.out.println("kurti");
	}
	
	@Test(groups = "women")
	private void Lehenga() {
		System.out.println("lehenga");
	}
	
	@Test(groups = "vehicles")
	private void Car() {
		System.out.println("car");
		}
	
	@Test(groups = "vehicles")
	private void Bike() {
		System.out.println("Bike");
	}
	
	@Test(groups = "vehicles")
	private void Cycle() {
		System.out.println("cycle");
	}

}
