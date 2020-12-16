package portfolio_java_core;

import types.TypesOfData;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main class was started");
		
		//Creating instance of TypeOfData
		TypesOfData tod = new TypesOfData();
		//show initialized variables inside class 		
		tod.showVariables();
		
		
		System.out.println("Main class finished the exection ");
	}

}
