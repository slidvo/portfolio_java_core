package examples;

public class TypesOfData {

	private final boolean active = true;
	private final boolean nonActive = false;

	private final byte minByteValue = Byte.MIN_VALUE;
	private final byte maxByteValue = Byte.MAX_VALUE;

	private short minShortValue = Short.MIN_VALUE;
	private short maxShortValue = Short.MAX_VALUE;

	private int minIntValue = Integer.MIN_VALUE;
	private int maxIntValue = Integer.MAX_VALUE;

	private long minLongValue = Long.MIN_VALUE;
	private long maxLongValue = 9_223_372_036_854_775_807L;

	private double minDoubleValue = Double.MIN_VALUE;
	private double maxDoubleValue = Double.MAX_VALUE;

	private float minFloatValue = Float.MIN_VALUE;
	private float maxFloatValue = Float.MAX_VALUE;
	private float floatExample = 4.2F;

	private char minCharValue = Character.MIN_VALUE;
	private char maxCharValue = Character.MAX_VALUE;

	public TypesOfData() {
		System.out.println("Created instance of class TypesOfData");
		new ArraysExmapleClass();
	}

	public void showVariables() {
		System.out.println("=== List of variables :");
		System.out.println("\tactive       = ".concat(Boolean.toString(active)));
		System.out.println("\tnonActive    = ".concat(Boolean.toString(nonActive)));
		System.out.println("\tminBytevalue = ".concat(Byte.toString(minByteValue)));
		System.out.println("\tmaxBytevalue = ".concat(Byte.toString(maxByteValue)));
		System.out.println("\tminShortValue= ".concat(Short.toString(minShortValue)));
		System.out.println("\tmaxShortValue= ".concat(Short.toString(maxShortValue)));
		System.out.println("\tminIntValue  = ".concat(Integer.toString(minIntValue)));
		System.out.println("\tmaxIntValue  = ".concat(Integer.toString(maxIntValue)));
		System.out.println("\tminLongValue = ".concat(Long.toString(minLongValue)));
		System.out.println("\tmaxLongValue = ".concat(Long.toString(maxLongValue)));
		System.out.println("\tminDoubleValue = ".concat(Double.toString(minDoubleValue)));
		System.out.println("\tmaxDoubleValue = ".concat(Double.toString(maxDoubleValue)));
		System.out.println("\tminFloatValue = ".concat(Float.toString(minFloatValue)));
		System.out.println("\tmaxFloatValue = ".concat(Float.toString(maxFloatValue)));
		System.out.println("\tfloatExample  = ".concat(Float.toString(floatExample))
				.concat(" : already without F in the end of sentence"));
		System.out.println("\tminCharValue  = ".concat(Integer.toString(minCharValue)));
		System.out.println("\tmaxCharValue  = ".concat(Integer.toString(maxCharValue)));

		System.out.println("=== End list of variables");
	}

	private class ArraysExmapleClass {
		private ArraysExmapleClass() {
			System.out.println("Was created arrays example class");
			this.show();
			this.showShortFor();
		}
		// array defining

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		@SuppressWarnings("unused")
		int[] numbers_2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		@SuppressWarnings("unused")
		int[] numbers_3 = new int[4];
		@SuppressWarnings("unused")
		int lengthOfArrayNumbers = numbers.length;

		// multidimensional arrays
		int[][] multiDimArr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 } };

		private void show() {
			for (int i = 0; i < multiDimArr.length; i++) {
				for (int j = 0; j < multiDimArr[i].length; j++) {
					System.out.print(multiDimArr[i][j] + "\t");
				}
				System.out.println("\n");
			}
		}

		private void showShortFor() {
			int count = 0;
			System.out.println("Short entry of cycle for result :");
			for (int[] i : multiDimArr) {
				System.out.printf("\t %2$2s line %1$d :",count,"text");
				for (int j : i) {
					System.out.print(j + " ");
				}
				System.out.println("\n");
				count += 1;
			}
		}
	}
}
