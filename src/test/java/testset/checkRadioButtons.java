package test.java.testset;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@TestMethodOrder(OrderAnnotation.class)
public class checkRadioButtons {
	private static final String url = System.getProperty("user.dir") + "\\src\\test\\recources\\page.html";
	WebDriver d;
	{
		WebDriverManager.chromedriver().setup();
	}

	@Test
	@Order(1)
	void checkRadio() {
		d = new ChromeDriver();
		try {
			d.get(url);
			d.manage().window().maximize();
			WebElement elt = d.findElement(By.xpath("/html/body/p[1]/input"));

			elt.click();
			assertTrue(elt.isSelected());
			assertEquals("email", elt.getAttribute("value"));

		} catch (Error e) {
			throw new Error(e.getMessage());
		} finally {
			d.quit();
		}
	}

}