package com.maven.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Details {
	public Bank_Details(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement name1;
	@FindBy(id = "last_name")
	private WebElement last;
	@FindBy(id = "address")
	private WebElement add;
	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement credit;
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	@FindBy(name = "cc_cvv")
	private WebElement ccv;
	@FindBy(id = "book_now")
	private WebElement book;
	@FindBy (id = "logout")
	private WebElement logout;
	
	public WebElement getFirstName() {
		return name1;
	}
	public WebElement getLastName() {
		return last;
	}
	public WebElement getAddress() {
		return add;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getCardtypr() {
		return cardtype;
	}
	public WebElement getExpirymonth() {
		return expirymonth;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCCV() {
		return ccv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getLogout() {
		return logout;
	}

}
