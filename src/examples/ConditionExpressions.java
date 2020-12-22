package examples;

public class ConditionExpressions {

	private int value_1 = 1;
	private int value_2 = 2;
	private boolean resultOfcValuesCondtition;

	public ConditionExpressions() {
		System.out.println("Was created instance of class SimpleExamples");
		conditionExpresssions();
	}

	private void conditionExpresssions() {
		this.resultOfcValuesCondtition = this.value_1 > this.value_2;
		System.out.println("\tConditionExpressions : Expression ".concat(Integer.toString(this.value_1).concat(" > "))
				.concat(Integer.toString(this.value_2)).concat(" is : ")
				.concat(Boolean.toString(this.resultOfcValuesCondtition)));
	}	
}
