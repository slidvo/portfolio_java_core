package examples;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumIEDriver {

	public SeleniumIEDriver() {
		System.setProperty("webdriver.ie.driver", "drivers\\ie\\iedriver.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();

		ie.get("https://hh.ru/applicant/resumes/view?resume=3f170b92ff0879b26c0039ed1f577746556339");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ie.quit();
		}

	}

}
