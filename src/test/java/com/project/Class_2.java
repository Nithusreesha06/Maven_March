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

public class Class_2 extends Base_class {
	//public static WebDriver driver;
	public static WebDriver driver = browser_Configuration("chrome");
	public static Logger log = Logger.getLogger(Class_2.class);
	


	public static void main(String[] args) throws IOException, InterruptedException {
		//driver = browser_Configuration("chrome");
		PropertyConfigurator.configure("log4j.properties");

		getUrl("http://automationpractice.com/index.php");
		log.info("Url Launch");


		// sign in
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		clicktheElement(sign);
		// login
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("nithusreesha06@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		passtheValueElement(pass, "12345");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		clicktheElement(login);
		log.info("Credentials entered in field");

		// purchase
		WebElement shirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		clicktheElement(shirt);
		WebElement sort = driver.findElement(By.id("selectProductSort"));
		selectbyDropdown("byValue", sort, "price:asc");
		
		WebElement list = driver.findElement(By.id("list"));
		clicktheElement(list);
		WebElement view = driver.findElement(By.xpath("//a[@title='View']"));
		clicktheElement(view);
		
		//quantity
		WebElement quan = driver.findElement(By.xpath("(//a[contains(@class, 'button')])[5]"));
		clicktheElement(quan);
		//size
		WebElement size = driver.findElement(By.id("group_1"));
		selectbyDropdown("byText", size, "M");
		//color
		WebElement color = driver.findElement(By.name("Orange"));
		clicktheElement(color);
		
		WebElement sub = driver.findElement(By.name("Submit"));
		clicktheElement(sub);
		log.info("Added to cart");
		Thread.sleep(3000);
		//checkout
		WebElement checkout = driver.findElement(By.xpath("//a[contains(@title, 'checkout')]"));
		clicktheElement(checkout);
		
		//summary screenshot
		WebElement sum = driver.findElement(By.id("cart_summary"));
		
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//File saved = new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Screenshot\\cart.png");
	//	FileUtils.copyFile(source, saved);
		clicktheElement(sum);
		log.info("check cart summary");
		
		WebElement pro = driver.findElement(By.xpath("(//a[contains(@title, 'Proceed')])[2]"));
		clicktheElement(pro);
		WebElement add = driver.findElement(By.name("processAddress"));
		clicktheElement(add);
		WebElement cgv = driver.findElement(By.id("cgv"));
		clicktheElement(cgv);
		WebElement carrier = driver.findElement(By.name("processCarrier"));
		clicktheElement(carrier);
		
		//payment
		WebElement pay = driver.findElement(By.xpath("//a[@class='cheque']"));
		clicktheElement(pay);
		WebElement sub1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clicktheElement(sub1);
		log.info("Payment done successfully");
		//confirmation
		WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		
		//File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		//File savedfile = new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Screenshot\\confirm.png");
	//	FileUtils.copyFile(sourcefile, savedfile);
		
		clicktheElement(back);
		
		//history screenshot
		//WebElement history = driver.findElement(By.xpath("//h1[text()='Order history']"));
		
		//File sf = ts.getScreenshotAs(OutputType.FILE);
		//File df = new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Screenshot\\history.png");
		//FileUtils.copyFile(sf, df);
		
		close();
		log.info("Close the page");
		
		
		

	}

	

}
