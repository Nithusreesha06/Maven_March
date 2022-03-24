package com.project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.maven.task.Base_class;
import com.maven.task.Page_Object_Manager;

public class Adactin_Booking extends Base_class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Object_Manager pom = Page_Object_Manager(driver);
	//public static Logger log = Logger.getLogger(Adactin_Booking.class);

	public static void main(String[] args) throws InterruptedException, IOException {
		//PropertyConfigurator.configure("log4j.properties");

		getUrl("https://adactinhotelapp.com/");
	//	log.info("Url Launch");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String name = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				10, 5);
		String pass = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				11, 5);

		// login
		// Login_Page lp = new Login_Page(driver);

		passtheValueElement(pom.get_instance_LP().getUsername(), name);

		passtheValueElement(pom.get_instance_LP().getPassword(), pass);

		clicktheElement(pom.get_instance_LP().getLogin());
		//log.info("Credentials entered in field");

		// details
		// Detail_Page dp = new Detail_Page(driver);
		String locate = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				12, 5);
		String hotel = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				13, 5);
		String room = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				14, 5);
		String num = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				15, 5);

		// WebElement locate = driver.findElement(By.id("location"));
		selectbyDropdown("byvalue", pom.get_instance_DP().getLocation(), locate);

		// WebElement hotel = driver.findElement(By.id("hotels"));
		selectbyDropdown("byindex", pom.get_instance_DP().getHotel(), hotel);

		// WebElement room = driver.findElement(By.id("room_type"));
		selectbyDropdown("bytext", pom.get_instance_DP().getRoomtype(), room);

		// WebElement num = driver.findElement(By.id("room_nos"));
		selectbyDropdown("bytext", pom.get_instance_DP().getRoomno(), num);

		// Thread.sleep(2000);

		// WebElement checkin =
		// driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String checkin = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				16, 5);
		String checkout = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				17, 5);
		String adult = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				18, 5);
		String child = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				19, 5);

		passtheValueElement(pom.get_instance_DP().getCheckin(), checkin);

		// WebElement checkout =
		// driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		passtheValueElement(pom.get_instance_DP().getCheckout(), checkout);

		// WebElement adult = driver.findElement(By.id("adult_room"));
		selectbyDropdown("byvalue", pom.get_instance_DP().getAdult(), adult);

		// WebElement child = driver.findElement(By.name("child_room"));
		selectbyDropdown("byindex", pom.get_instance_DP().getChild(), child);
		// search
		// WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		clicktheElement(pom.get_instance_DP().getSearch());
		//log.info("Details entered successfully");

		// select hotel
		// Select_Page sp = new Select_Page(driver);

		// WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		clicktheElement(pom.get_instance_SP().getSelectbtn());
		// WebElement cont = driver.findElement(By.id("continue"));
		clicktheElement(pom.get_instance_SP().getContinue());
		//log.info("Selection process done");

		// bank details
		// Bank_Details bd = new Bank_Details(driver);

		String add = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				21, 5);
		String credit = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				22, 5);
		String cardtype = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				23, 5);
		String expirymonth = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				24, 5);

		// WebElement name1 =
		// driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		passtheValueElement(pom.get_instance_BD().getFirstName(), "Nithya");

		// WebElement last = driver.findElement(By.id("last_name"));
		passtheValueElement(pom.get_instance_BD().getLastName(), "Shree");

		// WebElement add = driver.findElement(By.id("address"));
		passtheValueElement(pom.get_instance_BD().getAddress(), add);

		// WebElement credit =
		// driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		passtheValueElement(pom.get_instance_BD().getCredit(), credit);

		// WebElement cardtype = driver.findElement(By.id("cc_type"));
		selectbyDropdown("byvalue", pom.get_instance_BD().getCardtypr(), cardtype);

		// WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
		selectbyDropdown("byindex", pom.get_instance_BD().getExpirymonth(), expirymonth);

		String expiryyear = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				24, 5);
		String ccv = Particular_Data(
				"C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx",
				25, 5);

		// WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		selectbyDropdown("bytext", pom.get_instance_BD().getExpiryyear(), expiryyear);

		// WebElement ccv = driver.findElement(By.name("cc_cvv"));
		passtheValueElement(pom.get_instance_BD().getCCV(), ccv);

		// WebElement book = driver.findElement(By.id("book_now"));
		clicktheElement(pom.get_instance_BD().getBook());
		//log.info("Booking confirmed");

		// logout
		// WebElement logout = driver.findElement(By.id("logout"));
		clicktheElement(pom.get_instance_BD().getLogout());
		//log.info("Logged out successfully");

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

	
	

	

	private static Page_Object_Manager Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void selectbyDropdown(String type, WebElement hotel, int i) {
		// TODO Auto-generated method stub

	}

}
