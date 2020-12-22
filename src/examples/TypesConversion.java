package examples;

public class TypesConversion {

	public TypesConversion() {
		System.out.println("Was created instance of class TypesConversion");
		manualCasting();
		autoCasting();
	}

	private void autoCasting() {
		int intValue = Integer.MAX_VALUE;
		float floatValue = intValue;
		// Loose of precision
		System.out.println("\tTypesConversion: auto int.max_value(" + intValue + ") -> float :".concat(Float.toString(floatValue)));
	}

	private void manualCasting() {
		int intValue = 42;
		short shortValue = 42;
		byte byteValue = (byte) (intValue + shortValue);
		System.err.println("\tTypesConversion: bytevalue : ".concat(Byte.toString(byteValue)));
	}

}
