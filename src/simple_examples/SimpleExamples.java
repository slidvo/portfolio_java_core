package simple_examples;

public class SimpleExamples {

	private int value_1 = 1;
	private int value_2 = 2;
	private boolean resultOfcValuesCondtition;

	public SimpleExamples() {
		System.out.println("Was created instance of class SimpleExamples");
		conditionExpresssions();
		new CastingTypes();
	}

	private void conditionExpresssions() {
		this.resultOfcValuesCondtition = this.value_1 > this.value_2;
		System.out.println(
				"Expression ".concat(Integer.toString(this.value_1).concat(" > ")).concat(Integer.toString(this.value_2))
						.concat(" is : ").concat(Boolean.toString(this.resultOfcValuesCondtition)));
	}
	
	private class CastingTypes{
		private CastingTypes() {
			System.out.println("Was created instance of class CasrtingTypes");
			autoCasting();
			manualCasting();
		}
		
		private void autoCasting() {
			int intValue = Integer.MAX_VALUE;
			float floatValue = intValue;
			//Loose of precision
			System.out.println("auto int.max_value("+intValue+") -> float :".concat(Float.toString(floatValue)));
		}
		
		private void manualCasting() {
			int intValue = 42;
			short shortValue = 42;
			byte byteValue = (byte)(intValue + shortValue);
			System.err.println("bytevalue : ".concat(Byte.toString(byteValue)));
		}
		
		
	}
}
