package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@TestMethodOrder(OrderAnnotation.class)
public class GmailRegistrationFormTestSet {
	private static final String url = "https://accounts.google.com/";
	private static ChromeDriver d;
	{
		WebDriverManager.chromedriver().setup();
	}

	@Test
	@Order(1)
	public void checkLogo() {
		d = new ChromeDriver();
		try {
			d.get(url);
			List<WebElement> el = d.findElements(By.xpath("//div[@id=\"logo\"]/div/*[name()=\"svg\"]/*[name()=\"g\"]"));
			System.out.println("elements size :" + el.size());
			assertEquals(6, el.size());
		} catch (Exception e) {
			throw new Error(e.getMessage());
		} finally {
			d.quit();
		}
	}

	@Test
	@Order(2)
	public void checkHeaderText() {
		d = new ChromeDriver();
		System.out.println("checkHeaderText:");
		try {
			d.get(url);
			WebElement el = d.findElement(By.xpath("//h1[@id='headingText']/span"));
			assertEquals("Вход", el.getText());
			System.out.println("\tstep 1 successfully");

//			Thread.sleep(2000);
			WebElement hsub = d.findElement(By.xpath("//div[@id=\"headingSubtext\"]/span"));
			assertEquals("Используйте аккаунт Google", hsub.getText());
			System.out.println("\tstep 2 successfully");

//			assert d.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
//			assert d.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();

		} catch (Error e) {
			throw new Error(e.getMessage());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			d.quit();
		}
	}

	@Test
	@Order(3)
	public void checkInput() {
		d = new ChromeDriver();
		try {
			d.get(url);
			WebElement el = d.findElement(By.xpath("//input[@id='identifierId']"));
			assertEquals("Телефон или адрес эл. почты", el.getAttribute("aria-label"));

		} catch (Error e) {
			throw new Error(e.getMessage());
		} finally {
			d.quit();
		}

	}

}