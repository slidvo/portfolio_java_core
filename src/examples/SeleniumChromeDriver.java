package examples;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeDriver {
	public SeleniumChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "drivers\\chrome\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://hh.ru/applicant/resumes/view?resume=3f170b92ff0879b26c0039ed1f577746556339");
		try {
			Thread.sleep(3000);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			chrome.quit();
		}
		
	}
}
