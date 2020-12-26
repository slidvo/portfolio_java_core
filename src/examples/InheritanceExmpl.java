package examples;

public class InheritanceExmpl {
	Employee empl;
	public InheritanceExmpl(String name , String company){
		System.out.println("=Was created instance of class InheritanceExmpl");
		this.empl = new Employee(name, company);
		empl.showInformation();
		System.out.println("=Instance of InheritanceExmpl is finished");
	}
	class Person {
		
		private String name;
		{
			name = "Unknown";
		}

		protected Person(String name) {
			System.out.println(" ==Was created instance of class Person");
			this.name = name;
		}

		protected void showInformation() {
			System.out.print("\tName :" + this.name);
		}
		
		protected String getName() {
			return this.name;
		}

	}

	class Employee extends Person {
		private String company;

		protected Employee(String name, String company) {
			super(name);
			System.out.println("  ===Was created instance of class Exmployee");
			this.company = company;
		}
		
		protected void showInformation() {
			System.out.printf(" Employee : %s works in %s\n",super.getName(),this.company);
		}
		
		
	}
	 
	final class ProhibitedInheritance {
		public ProhibitedInheritance() {
			// TODO Auto-generated constructor stub
			System.out.println("Was created instance of class ProhibitedInheritance. Instancing of this class is prohibited.");
		}
	}
	
/*
 * class TryToExtendsProhibitedInheritance extends ProhibitedInheritance {}
 * Error : cannot subclass of the final class
 */
	
}