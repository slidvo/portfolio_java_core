package test.java;

import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@TestMethodOrder(OrderAnnotation.class)
public class BrowserNavigationMethods {
	private static final String url = "https://yandex.ru";
	private static WebDriver d ;
	
	{
		WebDriverManager.chromedriver().setup();
	}
	
	@Test
	@Order(1)
	void methodsNavigation() throws Exception {
		d = new ChromeDriver();
		try {
			d.navigate().to(url);
			Thread.sleep(1000);
			d.navigate().to("https://google.com");
			
			Thread.sleep(1000);
			d.navigate().back();
			Thread.sleep(1000);
			d.navigate().forward();
			Thread.sleep(1000);
			d.navigate().to("https://www.google.ru/search?q=eifel%20tower&tbm=isch");
			Thread.sleep(1000);
			d.navigate().to(d.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img")).getAttribute("src"));
			Thread.sleep(1000);
		} finally {
			d.quit();
		}
		
		
	}

}
