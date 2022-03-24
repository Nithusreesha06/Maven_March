    package com.maven.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Base_class {
	
	public static WebDriver driver;
	public static String Value;
	
	public static WebDriver browser_Configuration(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void clicktheElement(WebElement element) {
		element.click();
		
	}	
	public static void passtheValueElement(WebElement element,String data)	{
		element.sendKeys(data);
		
	}	
		
	
	
	public static void getUrl( String url) {
		driver.get(url);
	}
	
		
		
	public static void selectbyDropdown(String type, WebElement element,String value)	{
		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);  
				
			}
			else if (type.equalsIgnoreCase("byIndex")) {
				int i = Integer.parseInt(value);
				s.selectByIndex(i);
				
			}
			else if (type.equalsIgnoreCase("byText")) {
				s.selectByVisibleText(value);
				
			}
		}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
		}
			}
		public static void close() {
			driver.close();
		}
		public static String Particular_Data(String path, int row_Index, int cell_Index) throws IOException {
			File f = new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\Test  case Adactin booking.xlsx");
		FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheetAt = wb.getSheetAt(0);
			Row r = sheetAt.getRow(row_Index);
			org.apache.poi.ss.usermodel.Cell cell =r.getCell(cell_Index);
	        org.apache.poi.ss.usermodel.CellType celltype= cell.getCellType();
	        
	        if (celltype.equals(celltype.STRING)) {
	        	Value =cell.getStringCellValue();
	        }
				
			
	        else if (celltype.equals(celltype.NUMERIC)) {
	        	double numericCellValue = cell.getNumericCellValue();
	        	int val = (int) numericCellValue;
	       	Value= String.valueOf(val);
				
			
	        
			
			
	        }
			return Value;
			
			
		}
		
}
		
		
	


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

