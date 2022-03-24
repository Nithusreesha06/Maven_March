package com.project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.maven.task.Base_class;
import com.maven.task.Page_Object_Manager;

public class Project_1 extends Base_class {
	public static Logger log = Logger.getLogger(Project_1.class);
	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Object_Manager pom = Page_Object_Manager(driver);
	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");

		getUrl("https://adactinhotelapp.com/");
		log.info("Url Launch");
	
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//login
		WebElement name = driver.findElement(By.id("username"));
	    passtheValueElement(name, "Nithu06sreesha");
		
		WebElement pass = driver.findElement(By.id("password"));
		passtheValueElement(pass, "I4A4Y9");
		
		WebElement button = driver.findElement(By.name("login"));
		clicktheElement(button);
		log.info("Credentials entered in field");
		
		//details
		
		WebElement locate = driver.findElement(By.id("location"));
		selectbyDropdown("byValue", locate,"London" );
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    selectbyDropdown("byIndex", hotel, 2);
		WebElement room = driver.findElement(By.id("room_type"));
		selectbyDropdown("byText", room, "Deluxe");
		WebElement num = driver.findElement(By.id("room_nos"));
		selectbyDropdown("byText", num, "1 - One");
		
		Thread.sleep(2000);
		
		WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		passtheValueElement(checkin,"22-09-2022");
		
		WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		passtheValueElement(checkout, "26-09-2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		selectbyDropdown("byValue", adult, "2");
		
		WebElement child = driver.findElement(By.name("child_room"));
		selectbyDropdown("byIndex", child, 1);
		//search
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		clicktheElement(search);
		log.info("Details entered successfully");
		
		//select hotel
		
		WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		clicktheElement(select);
		WebElement cont = driver.findElement(By.id("continue"));
		clicktheElement(cont);
		log.info("Selection process done");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//bank details
		
		WebElement name1 = driver.findElement(By.id("first_name"));
		passtheValueElement(name1, "Nithya");
		WebElement last = driver.findElement(By.id("last_name"));
		passtheValueElement(last, "Shree");
		
		WebElement add = driver.findElement(By.id("address"));
		passtheValueElement(add, "123,chennai");
		WebElement credit = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		passtheValueElement(credit, "0022810005030282");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		selectbyDropdown("byValue", cardtype, "MAST");
		
		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
		selectbyDropdown("byIndex", expirymonth, 10);
		
		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		selectbyDropdown("byValue", expiryyear, "2024");
		
		WebElement ccv = driver.findElement(By.name("cc_cvv"));
		passtheValueElement(ccv, "321");
		WebElement book = driver.findElement(By.id("book_now"));
		clicktheElement(book);
		log.info("Booking confirmed");
		
		//take screenshot
		
		WebElement logout = driver.findElement(By.id("logout"));
		clicktheElement(logout);
		log.info("Logged out successfully");
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//File saved = new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\selenium training\\Screenshot\\booking.png");
		//FileUtils.copyFile(source, saved);
		
		//table screen shot
		//WebElement button1 = driver.findElement(By.id("my_itinerary"));
		//button1.click();
		
		//WebElement booked = driver.findElement(By.xpath("//td[text() = 'Booked Itinerary']"));
		//TakesScreenshot ts1 = (TakesScreenshot) driver;
		//File sourcefile = ts1.getScreenshotAs(OutputType.FILE);
		//File savedfile = new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\selenium training\\Screenshot\\itinerary.png");
		//FileUtils.copyFile(sourcefile, savedfile);
		
		//logout
		
		//WebElement lg = driver.findElement(By.xpath("//a[text() = 'Logout']"));
		//lg.click();
		
		
		
		
		
		
		
		
	}

	private static void selectbyDropdown(String type, WebElement hotel, int i) {
		// TODO Auto-generated method stub
		
	}

	private static Page_Object_Manager Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
