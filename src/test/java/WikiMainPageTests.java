package test.java;

import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@TestMethodOrder(OrderAnnotation.class)
public class WikiMainPageTests {
	private static final String url = "https://www.wikipedia.org/";
	WebDriver d;
	{
		WebDriverManager.chromedriver().setup();
	}

	@Test
	@Order(1)
	public void checkLanguages() {
		d = new ChromeDriver();

		try {

			d.get(url);
			Select s = new Select(new WebDriverWait(d, 5)
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='searchLanguage']"))));
			List<WebElement> options = s.getOptions();

			assertEquals(70, options.size());

			for (WebElement elt : options) {
				System.out.print(elt.getText() + " ");
			}

			assertEquals("English", s.getFirstSelectedOption().getText());

			s.selectByValue("ru");
			assertEquals("Русский", s.getFirstSelectedOption().getText());

			d.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium webdriver");
			d.findElement(By.xpath("//button[@type='submit']")).click();
			assertEquals("Результаты поиска", d.findElement(By.xpath("//h1[@id='firstHeading']")).getText());

		} catch (AssertionError e) {
			throw new AssertionError(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			d.quit();
		}
	}

}
