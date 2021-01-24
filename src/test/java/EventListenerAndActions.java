package test.java;

import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import test.java.init.CustomWebListener;
import test.java.init.InitTests;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(OrderAnnotation.class)
public class EventListenerAndActions extends InitTests {

	@BeforeAll
	static void setup() {
		System.out.println("Test set : HandlingDragAndDropSlidersResizable had successfully lanched");
	}

//	@Test
//	@Order(1)
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

//	@Test
//	@Order(2)
	void mouseMoving() {
		d = new ChromeDriver();

		EventFiringWebDriver driver = new EventFiringWebDriver(d);

		CustomWebListener listener = new CustomWebListener();

		driver.register(listener);

		Actions actions = new Actions(driver);

		driver.get(googleSearch);

		try {
			WebElement elt = driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a"));
			int x = elt.getRect().getX();
			int y = elt.getRect().getY();

			actions.moveByOffset(x, y).build().perform();

			actions.click(elt).build().perform();

			Thread.sleep(2000);
			// switch driver to another frame
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[3]/iframe")));

			WebElement gmaps = driver
					.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[3]/a"));

			actions.moveToElement(gmaps).build().perform();

			actions.click(gmaps).build().perform();

			Thread.sleep(2000);
		} catch (Error e) {
			e.printStackTrace();
			throw new Error(e.getMessage());
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

	@Test
	@Order(3)
	void handlingJqueryElements() {
		d = new ChromeDriver();

		try {
			d.get(basedir + "\\jquery.html");
			Actions a = new Actions(d);

			WebElement draggable = d.findElement(By.id("draggable"));
			WebElement droppable = d.findElement(By.id("droppable"));

			a.dragAndDrop(draggable, droppable).build().perform();
			;
			Thread.sleep(2000);

			for(int i=0; i<3;i++) {
				
				a.dragAndDropBy(draggable, -50, 0).build().perform();
				
			}

			Thread.sleep(2000);

		} catch (Error e) {
			e.printStackTrace();
			throw new Error(e.getMessage());
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			d.quit();
		}

	}
}
