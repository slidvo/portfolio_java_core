package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingConfigurationsFromFile {
	File f;
	FileInputStream fr;
	Properties p = new Properties();
	public ReadingConfigurationsFromFile(String fileName) throws IOException {
		// TODO Auto-generated constructor stub
		System.out.println("Was created instance of class ReadingConfigurationsFromFile");
		this.f = new File(System.getProperty("user.dir")+"\\src\\configs\\"+fileName);
		this.fr = new FileInputStream(f);
		this.p.load(this.fr);
		this.fr.close();
	}
	
	public Properties getP() {
		return this.p;
	}
	
	public void showAllProperties() {
		for (Object key : this.p.keySet()) {
			System.out.println("Property : "+key+" = "+ this.p.getProperty((String) key));
		}
		System.out.println();
	} 
	
	
	
	
}
