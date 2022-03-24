package com.maven.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement select;
	@FindBy(id = "continue")
	private WebElement cont;
	
	public Select_Page(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getSelectbtn() {
		return select;
	}
	public WebElement getContinue() {
		return cont;
	}

}
