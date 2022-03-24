 package com.maven.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	public WebDriver driver;
	
	private Login_Page lp;
	
	private Detail_Page dp;
	
	private Select_Page sp;
	
	private Bank_Details bd;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Login_Page get_instance_LP() {
		lp=new Login_Page(driver);
		return lp;
		
	}
	public Detail_Page get_instance_DP() {
		dp=new Detail_Page(driver);
		return dp;
	}
	public Select_Page get_instance_SP() {
		sp=new Select_Page(driver);
		return sp;
	}
	public Bank_Details get_instance_BD() {
		bd=new Bank_Details(driver);
		return bd;
	}
	
	}
	
	


