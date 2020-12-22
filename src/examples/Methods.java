package examples;

public class Methods {
	public Methods() {
		System.out.println("Was created instance of Mthods class");
		new ParametersOfMethods();
	}

	private class ParametersOfMethods {
		private ParametersOfMethods() {
			System.out.println("Was created instance of ParametersOfMethods class");
			// Call methods :
			methodWithArgs(1, "str1", true);
			variableLengthOfArgs("Hello dude! Just Watch a summ of args", 1, 2, 3, 4, 5, 6, 7, 8, 9);
		}

		private void methodWithArgs(int arg1, String arg2, boolean flag) {
			// Some code
		}

		private void variableLengthOfArgs(String str, int... numbers) {
			String allNums = "{";
			for (int i : numbers) {
				allNums += i + " ";
			}
			allNums += "}";
			System.out.printf("String : %1$2s %2$s", str, allNums);
			int res = 0;

			for (int i : numbers) {
				res += i;
			}
			System.out.printf(": %1$d\n", res);
		}
	}

	@SuppressWarnings("unused")
	private class OverloadingMethods {
		private OverloadingMethods() {
			// some code
		}

		private OverloadingMethods(String str) {
			//some code with str arg
		}
		
		private OverloadingMethods(int vlaue) {
			//some code with integer value
		}
	}
	
	@SuppressWarnings("unused")
	private class OverridingMethods extends AbstractClassExmpl{
		private OverridingMethods() {
			
		}

		//Here we should override abstract method from abstract class
		@Override
		public void abstactMethod() {
			// TODO Auto-generated method stub
			String str = "Method was overrided!";
			
		}
		
		
	}
	
	abstract class AbstractClassExmpl{
		public abstract void abstactMethod(); 
	}

}
