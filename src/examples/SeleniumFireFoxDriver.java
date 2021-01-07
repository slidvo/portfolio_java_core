package examples;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFireFoxDriver {

	public SeleniumFireFoxDriver() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.gecko.driver", "drivers\\firefox\\geckodriver.exe");
		FirefoxDriver fireFox = new FirefoxDriver();
		fireFox.get("https://hh.ru/applicant/resumes/view?resume=3f170b92ff0879b26c0039ed1f577746556339");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fireFox.quit();
		}
	}
}
