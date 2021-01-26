package test.java.init;


import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitTests {
	protected static String googleSearch = "https://www.google.com";
	protected static String  basedir = System.getProperty("user.dir") + "\\src\\test\\resources";
	protected static WebDriver d;
	
	{
		WebDriverManager.chromedriver().setup();
	}
	
	
	
}
