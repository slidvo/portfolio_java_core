package test.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class JavaScriptAlertsHandling {
	private static final String baseDir = System.getProperty("user.dir")+"\\src\\test\\resources";
	private static WebDriver d;

	@BeforeAll
	static void setup() {
		WebDriverManager.chromedriver().setup();
	}
	
	@Test
	@Order(1)
	void alerHandling() throws InterruptedException {
		d = new ChromeDriver();
		try {
			d.get(baseDir+"\\page.html");
			d.findElement(By.xpath("//div[@class=\"wrp\"]")).click();
			Thread.sleep(1000);
			Alert a = d.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			Thread.sleep(1000);
			
		} catch(Error e) {
			e.printStackTrace();
			throw new Error(e.getMessage());			
		}finally {
			d.quit();
		}
	}	
}
