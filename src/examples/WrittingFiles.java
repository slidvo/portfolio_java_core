package examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingFiles {
	File f;
	FileWriter fw;
	BufferedWriter bw;
	String dir = System.getProperty("user.dir");

	public WrittingFiles(String name) throws IOException {
		System.out.println("Was created instance of class Writting Files");
		f = new File(dir+"\\src\\files\\write\\"+name);
		fw = new FileWriter(f);
		bw = new BufferedWriter(fw);

	}
	
	public void write(String data) throws IOException {
		System.out.println(data);
		this.bw.write(data);
		this.bw.newLine();
	}

	public void close() throws IOException {
		this.bw.close();
		this.fw.close();
	}
}
