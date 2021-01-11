package portfolio_java_core;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import examples.CollectionsExample;
import examples.ConditionExpressions;
import examples.HandlingExceptions;
import examples.HashSetExample;
import examples.InheritanceExmpl;
import examples.LinkedListExample;
import examples.Log4jExample;
import examples.Methods;
import examples.MySqlConnectionExample;
import examples.ReadingConfigurationsFromFile;
import examples.ReadingFiles;
import examples.StaticElements;
import examples.TypesConversion;
import examples.TypesOfData;
import examples.WorkWithStrings;
import examples.WrittingFiles;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);
//	 Creating instance of TypeOfData
	private static TypesOfData tod = new TypesOfData();
	private static WorkWithStrings wws = new WorkWithStrings();

	public static void main(String[] args) throws IOException {
		System.out.println("Main class was started");

		new MySqlConnectionExample();

//		new SeleniumChromeDriver();
//		new SeleniumFireFoxDriver()
//		new SeleniumIEDriver();
//		new SeleniumEdgeDriver();

		// show initialized variables inside class
		tod.showVariables();

		wws.showMe();
		wws.showStringMethods();

		new ConditionExpressions();
		new TypesConversion();
		new Methods();

		new HandlingExceptions();

		// We can execute static method without creating instance of class
		StaticElements.staticMethod(StaticElements.staticVariable);

		new InheritanceExmpl("Slava", "SpaceX");

		// Examples of work with different extensions files (reading writing)
		workWithFiles();

		// CollectionsExample
		new CollectionsExample();

		// HashSet example
		new HashSetExample();

		// LinkedList example
		new LinkedListExample();

		// Log4j
		logger.trace("Entering application.");

		Log4jExample l4 = new Log4jExample();

		if (!l4.doIt()) {
			logger.error("Did not do it.");
		}
		logger.trace("Exiting applicatiopn.");

		System.out.println("Main class finished the exection ");
	}

	static void workWithFiles() throws IOException {
		ReadingConfigurationsFromFile rcff = new ReadingConfigurationsFromFile("object.properties");
		rcff.showAllProperties();

		// ReadingFiles
		ReadingFiles read1 = new ReadingFiles("read1.txt");
		read1.show();
		read1.close();

		ReadingFiles read2 = new ReadingFiles("read2.csv");
		read2.show();
		read2.close();

		// Writing files
		WrittingFiles textFile1 = new WrittingFiles("textFile1.txt");

		String data = "String : data for writting textFile1.txt";

		textFile1.write(data);
		textFile1.close();

		data = "<!doctype html>".concat("<html>").concat("<head>").concat("<meta charset=\"utf-8\">")
				.concat("<title>htmlFile</title>").concat("</head>").concat("<body>").concat("<h1>Заголовок 1</h1>")
				.concat("<p>Текст параграфа</p>").concat("</body>").concat("</html>");

		WrittingFiles htmlFile1 = new WrittingFiles("htmlFile1.html");

		htmlFile1.write(data);
		htmlFile1.close();

		WrittingFiles csvFile1 = new WrittingFiles("csvFile.csv");
		data = "Name,age,gender\nSlava,32,male";
		csvFile1.write(data);
		csvFile1.close();
	}
}
