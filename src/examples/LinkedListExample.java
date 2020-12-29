package examples;

import java.util.LinkedList;

public class LinkedListExample {
	LinkedList<String> cities = new LinkedList<String>();
	{
		cities.add("Moscow");
		cities.add("Surgut");
		cities.add("Saint-Peterspurg");
		cities.add("Irkutsk");
		cities.add("Chelyabinsk");
		cities.remove(cities.size() - 1);

		cities.addLast("Perim");
		cities.addFirst("Anapa");
		cities.set(cities.size() - 2, "Tyumen");
		cities.add("Perim");
	}

	public LinkedListExample() {
		System.out.println("Was created instance of class LinkedListExample.");
		showCities();
	}

	void showCities() {
		boolean flg = true;
		for (String city : cities) {
			if (city.equals("Perim") & flg) {
				System.out.print(city + ". ");
				flg = false;
			} else {
				if (!city.equals("Perim"))
					System.out.print(city + ", ");
			}

		}
		System.out.println();
	}
}
