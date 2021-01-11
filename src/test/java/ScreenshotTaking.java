package test.java;

import static org.junit.Assert.assertFalse;

import java.io.File;

import javax.imageio.ImageIO;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ScreenshotTaking {
	@Test
	@Order(1)
	public void compareScreenshots() {

		try {

			ImageDiffer imgDiffer = new ImageDiffer();

			ImageDiff imgDiff = imgDiffer.makeDiff(
					ImageIO.read(
							new File(System.getProperty("user.dir") + "\\src\\test\\resources\\tmp\\screenShot_2.jpg")),
					ImageIO.read(
							new File(System.getProperty("user.dir") + "\\src\\test\\resources\\screenShot_1.jpg")));

			assertFalse(imgDiff.hasDiff());

		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
