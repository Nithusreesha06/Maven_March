 package com.maven.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detail_Page {
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement locate;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement  room;
	@FindBy(id = "room_nos")
	private WebElement num;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkin;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkout;
	@FindBy(id = "adult_room")
	private WebElement adult;
	@FindBy(name = "child_room")
	private WebElement child;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement search;
	
	public Detail_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getRoomno() {
		return num;
	}
	public WebElement getRoomtype() {
		return room;
	}
	public WebElement getHotel() {
		return hotels;
	}
	public WebElement getLocation() {
		return locate;
	}
}
