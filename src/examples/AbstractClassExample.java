package examples;

public class AbstractClassExample {
	public static void main(String [] args) {
		
		ExtenderOfAbstractClass eoac = new ExtenderOfAbstractClass();
		
		eoac.abstactMethodOne();
		eoac.justMethod();
				
	} 
}

abstract class FirstAbstractClass{
	abstract void abstactMethodOne();
	
	public void justMethod() {
		System.err.println("It is just a method in abstract class.");
	} 
}

class ExtenderOfAbstractClass extends FirstAbstractClass {
	public ExtenderOfAbstractClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void abstactMethodOne() {
		// TODO Auto-generated method stub
		System.out.println("We necessarily must to implement abstract method in class extender. Of course if class extender if not abstract too.");
	}
	
	
}