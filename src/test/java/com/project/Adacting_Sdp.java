package com.project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.configuration.File_Reader_Manager;
import com.maven.task.Base_class;
import com.maven.task.Page_Object_Manager;

public class Adacting_Sdp extends Base_class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Object_Manager pom = Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Booking.class);

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_URL();

		getUrl(url);
	    log.info("Url Launch");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// login
		// Login_Page lp = new Login_Page(driver);
		String username = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_username();

		passtheValueElement(pom.get_instance_LP().getUsername(), username);
		String password = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_password();

		passtheValueElement(pom.get_instance_LP().getPassword(), password);

		clicktheElement(pom.get_instance_LP().getLogin());
		log.info("login details");
		//log.info("Credentials entered in field");

		// details
		// Detail_Page dp = new Detail_Page(driver);
	

		// WebElement locate = driver.findElement(By.id("location"));
		selectbyDropdown("byvalue", pom.get_instance_DP().getLocation(), "London");

		// WebElement hotel = driver.findElement(By.id("hotels"));
		selectbyDropdown("byindex", pom.get_instance_DP().getHotel(), 2);

		// WebElement room = driver.findElement(By.id("room_type"));
		selectbyDropdown("bytext", pom.get_instance_DP().getRoomtype(), "Super Deluxe");

		// WebElement num = driver.findElement(By.id("room_nos"));
		selectbyDropdown("bytext", pom.get_instance_DP().getRoomno(), "1 - One");

		// Thread.sleep(2000);

		// WebElement checkin =
		// driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		passtheValueElement(pom.get_instance_DP().getCheckin(), "22-09-2022");

		// WebElement checkout =
		// driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		passtheValueElement(pom.get_instance_DP().getCheckout(), "26-09-2022");

		// WebElement adult = driver.findElement(By.id("adult_room"));
		selectbyDropdown("byvalue", pom.get_instance_DP().getAdult(), "3-Threee");

		// WebElement child = driver.findElement(By.name("child_room"));
		selectbyDropdown("byindex", pom.get_instance_DP().getChild(), 1);
		// search
		// WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		clicktheElement(pom.get_instance_DP().getSearch());
		log.info("Details entered successfully");

		// select hotel
		// Select_Page sp = new Select_Page(driver);

		// WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		clicktheElement(pom.get_instance_SP().getSelectbtn());
		// WebElement cont = driver.findElement(By.id("continue"));
		clicktheElement(pom.get_instance_SP().getContinue());
		log.info("Selection process done");

		// bank details
		// Bank_Details bd = new Bank_Details(driver);

		

		// WebElement name1 =
		// driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		passtheValueElement(pom.get_instance_BD().getFirstName(), "Nithya");

		// WebElement last = driver.findElement(By.id("last_name"));
		passtheValueElement(pom.get_instance_BD().getLastName(), "Shree");

		// WebElement add = driver.findElement(By.id("address"));
		passtheValueElement(pom.get_instance_BD().getAddress(), " 123,chennai");

		// WebElement credit =
		// driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		passtheValueElement(pom.get_instance_BD().getCredit(), "22810005030282");

		// WebElement cardtype = driver.findElement(By.id("cc_type"));
		selectbyDropdown("byvalue", pom.get_instance_BD().getCardtypr(), "Master Card");

		// WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
		selectbyDropdown("byindex", pom.get_instance_BD().getExpirymonth(), 10);

		

		// WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		selectbyDropdown("bytext", pom.get_instance_BD().getExpiryyear(), "2024");

		// WebElement ccv = driver.findElement(By.name("cc_cvv"));
		passtheValueElement(pom.get_instance_BD().getCCV(), "321");

		// WebElement book = driver.findElement(By.id("book_now"));
		clicktheElement(pom.get_instance_BD().getBook());
		log.info("Booking confirmed");

		// logout
		// WebElement logout = driver.findElement(By.id("logout"));
		clicktheElement(pom.get_instance_BD().getLogout());
		log.info("Logged out successfully");

		// TakesScreenshot ts = (TakesScreenshot) driver;
		// File source = ts.getScreenshotAs(OutputType.FILE);
		// File saved = new
		// File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\selenium
		// training\\Screenshot\\booking.png");
		// FileUtils.copyFile(source, saved);

		// table screen shot
		// WebElement button1 = driver.findElement(By.id("my_itinerary"));
		// clicktheElement(button1);

		// WebElement booked = driver.findElement(By.xpath("//td[text() = 'Booked
		// Itinerary']"));
		// TakesScreenshot ts1 = (TakesScreenshot) driver;
		// File sourcefile = ts1.getScreenshotAs(OutputType.FILE);
		// File savedfile = new
		// File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\selenium
		// training\\Screenshot\\itinerary.png");
		// FileUtils.copyFile(sourcefile, savedfile);

		// logout

		// WebElement lg = driver.findElement(By.xpath("//a[text() = 'Logout']"));
		// clicktheElement(lg);

	}

	private static void selectbyDropdown(String type, WebElement hotel, int i) {
		// TODO Auto-generated method stub
		
	}

	private static Page_Object_Manager Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	



}
