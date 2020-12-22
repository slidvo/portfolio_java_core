package examples;

public class HandlingExceptions {

	public static void main(String[] args) {
		new HandlingExceptions();
	}

	boolean flag;
	{ // initialization
		flag = true;
	}

	public HandlingExceptions() {
		// Some code
		tryCatchFinallyExample();
	}

	private void tryCatchFinallyExample() {

		try {
			flag = false;
			@SuppressWarnings("unused")
			int i = 1 / 0;
		} catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());
		} finally {
			// after try and catch follows finally block that always performed
			flag = true;
		}
	}

}
