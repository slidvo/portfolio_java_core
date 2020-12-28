package examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	//keep only unique values
	// keep ordered result
	Set<String> set = new HashSet<String>();
	{
		set.add("Slava");
		set.add("Example sets");
		set.add("Java core");
		set.add("Slava");
	}
	
	public HashSetExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Was created instance of HashSetExample class.");
		
//		for (String str : set) {
//			System.out.print(str+", ");
//		}
//		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
