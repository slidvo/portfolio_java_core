package portfolio_java_core;

import types.TypesOfData;
import work_with_strings.WorkWithStrings;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main class was started");
		
		//Creating instance of TypeOfData
		TypesOfData tod = new TypesOfData();
		//show initialized variables inside class 		
		tod.showVariables();
		
		WorkWithStrings wws = new WorkWithStrings();
		
		wws.showMe();
		wws.showStringMethods();
		
		
		System.out.println("Main class finished the exection ");
	}

}
