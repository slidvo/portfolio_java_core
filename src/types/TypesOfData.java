package types;

public class TypesOfData {
	
	private final boolean active = true ;
	private final boolean nonActive = false; 
	
	private final byte minByteValue = Byte.MIN_VALUE;  
	private final byte maxByteValue =  Byte.MAX_VALUE;
	
	private short minShortValue = Short.MIN_VALUE;
	private short maxShortValue =  Short.MAX_VALUE;
	
	private int minIntValue = Integer.MIN_VALUE;
	private int maxIntValue = Integer.MAX_VALUE;
	
	private long minLongValue = Long.MIN_VALUE;
	private long maxLongValue = Long.MAX_VALUE; 
	
	private double minDoubleValue = Double.MIN_VALUE;
	private double maxDoubleValue = Double.MAX_VALUE;
	
	private float minFloatValue = Float.MIN_VALUE;
	private float maxFloatValue = Float.MAX_VALUE;
	private float floatExample = 4.2F;
	
	private char minCharValue = Character.MIN_VALUE;
	private char maxCharValue = Character.MAX_VALUE;

	public TypesOfData() {
		System.out.println("Created instance of class TypesOfData");
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
		System.out.println("\tfloatExample  = ".concat(Float.toString(floatExample)).concat(" : already without F in the end of sentence"));
		System.out.println("\tminCharValue  = ".concat(Integer.toString(minCharValue)));
		System.out.println("\tmaxCharValue  = ".concat(Integer.toString(maxCharValue)));
		
		
		
		System.out.println("=== End list of variables");
	}
	

}
