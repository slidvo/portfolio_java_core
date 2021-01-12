package test.java;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ScreenshotTaking {
	private static final String accountsGoogle = "https://accounts.google.com/";
	private static final String baseDir = System.getProperty("user.dir") + "\\src\\test\\resources";
	private static WebDriver d;
	{
		WebDriverManager.chromedriver().setup();
	}

	@Test
	@Order(1)
	public void compareScreenshots() {

		try {

			ImageDiffer imgDiffer = new ImageDiffer();

			ImageDiff imgDiff = imgDiffer.makeDiff(ImageIO.read(new File(baseDir + "\\tmp\\screenShot_2.jpg")),
					ImageIO.read(new File(baseDir + "\\screenShot_1.jpg")));

			assertFalse(imgDiff.hasDiff());

		} catch (Error e) {
			e.printStackTrace();
			if (e instanceof AssertionError) {
				throw new AssertionError("Изображения отличаются");
			}
			throw new Error(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Order(2)
	public void captureScreenshot() {
		d = new ChromeDriver();
		try {
			d.get(accountsGoogle);
			File picAccountsGoole = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(picAccountsGoole, new File(baseDir + "\\accountsGoogle.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			throw new Error("Не удалось созранить скриншот");
		} finally {
			d.quit();
		}
	}
}
