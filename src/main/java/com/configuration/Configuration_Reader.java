package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f= new File("C:\\Users\\91908\\Downloads\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\NITHYA\\Maven_Mar\\src\\main\\java\\com\\data\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		p= new Properties();
		p.load(fis);
	}
	
	public String get_Config_URL() {
		String url = p.getProperty("url");
		return url;
	}
	public String get_Config_username() {
		String username = p.getProperty("username");
		return username;
	}
	public String get_Config_password() {
		String password = p.getProperty("password");
		return password;
	}

}
