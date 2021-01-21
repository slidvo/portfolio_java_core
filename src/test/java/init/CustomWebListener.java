package test.java.init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class CustomWebListener extends AbstractWebDriverEventListener {
	private String text = null;

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {

		if (element.getTagName().equals("a")) {
			text = element.getAttribute("href");
		}

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		String elt = element.toString();

		if (text != null) {
			System.out.println("Was clicked ELT : " + elt + "\nHREF : " + text);
			text = null;
		}
			

	}
}
