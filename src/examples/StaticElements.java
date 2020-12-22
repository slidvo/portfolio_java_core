package examples;

public class StaticElements {
	public final static String staticVariable = "CONSTANT VALUE";
	
	public static void staticMethod(String str) {
		System.out.println("This msg from static method! : "+"staticVariable = "+str);
	}
	
}
