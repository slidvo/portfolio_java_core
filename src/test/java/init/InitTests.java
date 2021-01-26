package test.java.init;


import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitTests {
	protected static String googleSearch = "https://www.google.com";
	protected static String  basedir = System.getProperty("user.dir") + "\\src\\test\\resources";
	protected static WebDriver d;
	
	{
		WebDriverManager.chromedriver().setup();
	}
	

	// качаем файл с помощью NIO
	protected static void downloadUsingNIO(String urlStr, String file) throws IOException {
		URL url = new URL(urlStr);
		ReadableByteChannel rbc = Channels.newChannel(url.openStream());
		FileOutputStream fos = new FileOutputStream(file);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
	}
	
	
	
}
