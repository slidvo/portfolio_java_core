package test.java;

import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import test.java.init.CustomWebListener;
import test.java.init.InitTests;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(OrderAnnotation.class)
public class HandlingDragAndDropSlidersResizable extends InitTests {

	@BeforeAll
	static void setup() {
		System.out.println("Test set : HandlingDragAndDropSlidersResizable had successfully lanched");
	}

	@Test
	@Order(1)
	void eventFiringWebDriver() {
		d = new ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(d);
		
		CustomWebListener listener = new CustomWebListener();
		
		driver.register(listener);

		try {
			driver.get(googleSearch);

			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"fsl\"]/a[1]")).click();
			
			Thread.sleep(2000);
			

		} catch (Error e) {
			e.printStackTrace();
			throw new Error(e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
