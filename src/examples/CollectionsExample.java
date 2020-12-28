package examples;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample {

	/**
	 * Arrays - to store multiple values 1. Fixed size 2. Only one type of data
	 * 
	 * Collections: Sets Lists Queues Utilities 1. Infinite size 2. Can to contain
	 * few types of data 3. Works with class wrappers like : Integer Character
	 * Boolean Long Float Double .
	 */

	public CollectionsExample() {
		System.out.println("Was created class CollectionsExample");
		boxing();
		arrayListExample();

	}

	void boxing() {
		int variable = 10;
		Integer obj = variable; // auto boxing
		System.out.println("obj : " + obj);

		@SuppressWarnings("unused")
		int i = obj; // unboxing
	}

	void arrayListExample() {
		ArrayList arrList = new ArrayList<>();
		System.out.println("arrList : " + arrList);
		arrList.add(10); // auto boxing 10 into Object
		arrList.add("Slava"); // auto boxing
		arrList.add(10.25); // auto boxing
		arrList.add(true); // auto boxing
		arrList.add(null); // auto boxing
		arrList.add('c'); // auto boxing
		System.out.println(
				"arrList.add(10) : " + arrList + " size :" + arrList.size() + " arrList.get(0) : " + arrList.get(0));
		try {
			int i = 7;
			if (i > 6) {
				throw new IndexOutOfBoundsException("Предлагаемый индекс выходит за пределы длины списка");
			} else {
				arrList.get(i);
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		arrList.remove(4);
		System.out.println("arrList.remove(4) : " + arrList + "  arrList.size() : " + arrList.size());
		
		//get all list values :
		for (Object i : arrList) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		//get all values with Iterator help
		Iterator iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		} System.out.println();
		
		//Generic ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add("String"); The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		list.add(10);
		/*
		 * list.get(0) give Integer value and when we addition 32 (int) to 10 (Integer) 
		 * then 10 unboxing to int
		 */
		System.out.printf("%d + %d = %d  \n",list.get(0),32, (32+list.get(0)));
	}

}
