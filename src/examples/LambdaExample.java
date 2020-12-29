package examples;

public class LambdaExample {
	int summa;
	{
		Operationable operation;
		operation = (int[] arr) -> {
			int res = 0;
			for (int i : arr) {
				res += i;
			}
			return res;

		};

		summa = operation.add(new int[] { 1, 2, 3, 4, 5, 6, 7 });
	}

	void show() {
		System.out.println("summa : " + this.summa);
	}

}

interface Operationable {
	int add(int[] arr);
}