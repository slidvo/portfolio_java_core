package examples;

public class LambdaExample {
	{
		Operationable operation;
		operation = (int[] arr)->{
			int res=0;
			for(int i : arr) {
				res+=i;
			}
			return res;
			
		};
		int summa = operation.add(new int[] {1,2,3,4,5,6,7}) ;
	}
	
}

interface Operationable {
	int add(int[] arr);
}