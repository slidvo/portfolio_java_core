package test.java;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import test.java.init.InitTests;

@TestMethodOrder(OrderAnnotation.class)
public class MosRu extends InitTests {

	String login = "sidoroff.olex1y@yandex.ru";
	String password = "Qazsxdr22";
	String testpdfUrl = "http://orimi.com/pdf-test.pdf";

	@Test
	@Order(1)
	public void mosRuauth() throws IOException {

		d = new ChromeDriver();

		d.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

		try {

			d.get("https://my.mos.ru/login");

			WebElement buttonEnter = d.findElement(By.xpath("//*[@id=\"button\"]"));

			buttonEnter.click();

			d.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(login);

			d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

			d.findElement(By.xpath("//*[@id=\"bind\"]")).click();

		} catch (Error e) {
			throw new Error(e.getMessage());
		} finally {
			d.quit();
		}

	}

	@Test
	@Order(2)
	/**
	 * Пользователь должен быть авторизирован
	 * 
	 */

	public void mosRuAttachFile() throws IOException, Exception {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--user-data-dir=C:\\Users\\Vyacheslav\\AppData\\Local\\Google\\Chrome\\User Data");

		d = new ChromeDriver(opt);

		d.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

		try {

			String testpdfFile = basedir + "\\test-pdf.pdf";

			downloadUsingNIO(testpdfUrl, testpdfFile);

			// Переход на страницу заполнения формы
			d.navigate().to("https://www.mos.ru/pgu/ru/application/dtis/020301/?load_app=1&draft_id=151263564");

			// Нажать кнопку прикрепить файл
			d.findElement(By.xpath("//*[@id=\"transportFacility\"]/fieldset/fieldset[2]/div[10]/div[1]/div[1]/a"))
					.click();

			// Нажать esc
			Thread.sleep(2000L);
			new Robot().keyPress(KeyEvent.VK_ESCAPE);
			new Robot().keyRelease(KeyEvent.VK_ESCAPE);

		} catch (Error e) {
			e.printStackTrace();
			throw new Error(e.getMessage());
		} finally {

			// указать какой файл будет загружен
			d.findElement(By.xpath("//div[@class=\"btn-add\"]/input[@type=\"file\"]"))
					.sendKeys(basedir + "\\test-pdf.pdf");

			// Кнопка сохранить черновик
			// *[@id="form-info"]/div[2]/div[2]/a
			d.findElement(By.xpath("//*[@id=\"form-info\"]/div[2]/div[2]/a")).click();

			Thread.sleep(1000L);

			// Подтверждение
			// *[@id="draft-save-button"]
			d.findElement(By.xpath("//a[@id=\"draft-save-button\"]")).click();

			d.quit();
		}

	}

}
