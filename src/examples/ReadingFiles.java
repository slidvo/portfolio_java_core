package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadingFiles {
	File f;
	FileReader fr;
	BufferedReader br;
	String name = "";
	String base_dir = System.getProperty("user.dir");
	public ReadingFiles(String name) throws IOException {
		// TODO Auto-generated constructor stub
		System.out.println("Was created instance of class FileReading");
		this.name = name;
		this.f = new File(base_dir+"\\src\\files\\read\\"+this.name);
		this.fr = new FileReader(f);
		this.br = new BufferedReader(fr);
		
	}
	
	public void show() throws IOException {
		
		switch (this.name.substring(this.name.length()-3)) {
		case "csv":
			readCsv();
			break;
		case "txt":
			readTxt();
			break;
		default:
			System.out.println("Unknown file format");
		}
		
	}
	
	void readCsv() throws IOException {
		List<List<String>> records = new ArrayList<>();
		String line;
		
		while((line = this.br.readLine()) != null) {
			String[] val = line.split(",");
			records.add(Arrays.asList(val));
		}
		
		for (List<String> lstr : records) {
			String res ="";
			for(String str : lstr) {
				res += str +" | ";
			}
			System.out.println(res);
		}
	}
	
	void readTxt() throws IOException {
		String line = "";
		while((line = this.br.readLine()) != null) {
			System.err.println(line);
		}
	}
	
	public void close() throws IOException {
		fr.close();
	}
	
}
