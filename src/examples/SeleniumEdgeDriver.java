package examples;

import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEdgeDriver {
	
	public SeleniumEdgeDriver() {
		System.setProperty("webdriver.edge.driver", "drivers\\edge\\msedgedriver.exe");
		
		EdgeDriver edge = new EdgeDriver();
		
		edge.get("https://hh.ru/applicant/resumes/view?resume=3f170b92ff0879b26c0039ed1f577746556339");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			edge.quit();
		}

	}

}
