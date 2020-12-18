package work_with_strings;

import java.text.Collator;
import java.text.RuleBasedCollator;

public class WorkWithStrings {

	private String strValue = "\"string 1\"";
	private String strValue2 = "\"String 1\"";
	// String declaring examples :
	String exmpl_1 = "Strign declaring example 1"; // Classsic declaring
	char[] exmpl_2 = new char[] { 'e', 'x', 'a', 'm', 'p', 'l', 'e', ' ', '2' }; // Decalre throught char[]

	public WorkWithStrings() {
		System.out.println("Created instance of class WorkWithStrings");
	}

	public void showMe() {
		System.out.println("==");

		System.out.println("\tstrValue = ".concat(strValue));

		// Strings comparing with Collator help
		System.out.println("\tcomparing " + strValue + " with " + strValue2 + " : "
				+ Collator.getInstance().compare(strValue, strValue2));

		System.out.println("\tcomparing " + strValue + " with " + strValue2 + " : "
				+ RuleBasedCollator.getInstance().compare(strValue, strValue2));

		System.out.println("\tcomparing " + strValue2 + " with " + strValue + " : "
				+ Collator.getInstance().compare(strValue2, strValue));
		//
		System.out.println("\tcomparing " + strValue + " with " + strValue + " : " + strValue.compareTo(strValue));

		System.out.println("==");

	}

	/**
	 * @param text
	 * @return number of symbols in the text
	 */
	private int stringLengthExample(String text) {
		return text.length();
	}

	/*
	 * ignoring case of comparing strings
	 */
	private boolean stringEqualsIgnoreCaseExamle() {
		String text_1 = "TEXT";
		String text_2 = "text";
		System.out.print("\ttext_1 :" + text_1 + " & text_2:" + text_2);
		return text_1.equalsIgnoreCase(text_2);
	}

	private boolean stringStartsWithExample(String text) {
		return text.startsWith(text.substring(0, 2));
	}

	public void showStringMethods() {
		System.out.println("== Result of few default String methods :");

		// Show result of String.length() method
		System.out.println("\tlength of \"".concat(exmpl_1.concat("\" is "))
				.concat(Integer.toString(stringLengthExample(exmpl_1))).concat(" symbols."));

		// Show result of String.equalsIgnoreCase() method
		System.out.println("\t equalsIgnoreCase : ".concat(Boolean.toString(stringEqualsIgnoreCaseExamle())));

		System.out.println("\t".concat(exmpl_1.concat(" startWith(\"Str\") : "))
				.concat(Boolean.toString(stringStartsWithExample(exmpl_1))));
		System.out.println("==");
	}

}
