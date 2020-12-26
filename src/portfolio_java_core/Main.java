package portfolio_java_core;

import java.io.IOException;
import examples.ConditionExpressions;
import examples.HandlingExceptions;
import examples.InheritanceExmpl;
import examples.Methods;
import examples.ReadingConfigurationsFromFile;
import examples.StaticElements;
import examples.TypesConversion;
import examples.TypesOfData;
import examples.WorkWithStrings;

public class Main {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Main class was started");
		
		//Creating instance of TypeOfData
		TypesOfData tod = new TypesOfData();
		//show initialized variables inside class 		
		tod.showVariables();
		
		WorkWithStrings wws = new WorkWithStrings();
		
		wws.showMe();
		wws.showStringMethods();
		
		new ConditionExpressions();
		new TypesConversion();
		new Methods();
		
		new HandlingExceptions();
		
		StaticElements.staticMethod(StaticElements.staticVariable);
		
		new InheritanceExmpl("Slava", "SpaceX");
		
		ReadingConfigurationsFromFile rcff = new ReadingConfigurationsFromFile("object.properties");
		rcff.showAllProperties();
		
		System.out.println("Main class finished the exection ");
	}

}
