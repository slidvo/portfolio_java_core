package examples;

public class Methods {
	public Methods() {
		System.out.println("Was created instance of Mthods class");
		new ParametersOfMethods();
	}
	
	private class ParametersOfMethods{
		private ParametersOfMethods() {
			System.out.println("Was created instance of ParametersOfMethods class");			
			//Call methods :
			methodWithArgs(1, "str1",true);
			variableLengthOfArgs("Hello dude! Just Watch a summ of args", 1,2,3,4,5,6,7,8,9);
		}
		
		private void methodWithArgs(int arg1, String arg2, boolean flag) {
			//Some code
		}
		
		private void variableLengthOfArgs(String str, int ...numbers) {
			String allNums ="{";
			for(int i : numbers) {
				allNums +=i+" ";
			}
			allNums+="}";
			System.out.printf("String : %1$2s %2$s",str,allNums);
			int res = 0;
			
			for (int i : numbers) {
				res += i;
			}
			System.out.printf(": %1$d\n",res);
		}
	}

}
