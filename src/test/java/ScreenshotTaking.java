package test.java;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTaking {
	private static final String url = "https://accounts.google.com/";
	private static ChromeDriver d;
	{
		WebDriverManager.chromedriver().setup();
	}

	@Test
	@Order(1)
	public void makeRegFormScreenshot() {
		d = new ChromeDriver();
		try {
			d.get(url);
			d.manage().window().maximize();

			File screenShot_1 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenShot_1,
					new File(System.getProperty("user.dir") + "\\src\\test\\resources\\screenShot_1.jpg"));

		} catch (Exception e) {
			throw new Error(e.getMessage());
		} finally {
			d.quit();
		}
	}
}
