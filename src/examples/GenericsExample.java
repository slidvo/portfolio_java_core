package examples;

class GenericsExample {

	private class example1<T, D> {
		private T id;
		private D arg;

		public example1(T id, D arg) {
			// TODO Auto-generated constructor stub
			System.out.println("Was created instance of example1 class");
			this.id = id;
			this.arg = arg;
			System.err.printf(id + " : %s \n", id.getClass().getSimpleName());
			System.out.println(this.id  + " " + this.arg);

		}
	}

	<A> GenericsExample(A arg) {
		// TODO Auto-generated constructor stub
		System.out.println("Was created instance of class GenericsExample");
		System.out.println("arg : " + arg + " type : " + arg.getClass().getSimpleName());

		new example1<String, Integer>("TheAnswer :", 42);
	}

}

interface Transport<T> {
	T getId();
}

class Motorcycles<T> implements Transport<T> {

	@Override
	public T getId() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Motorcycles2 implements Transport<Integer> {

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}