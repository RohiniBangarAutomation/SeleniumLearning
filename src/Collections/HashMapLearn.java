package Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapLearn {

	public static void main(String[] args) {
		// Kay value Pair
		// duplicate keys are not allowed
		// duplicate values are allowed
		// map is unordered
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("Name", "Pooja");
		map.put("Company", "TCS");
		map.put("City", "Pune");
		map.put("SurName", "Shinde");
		System.out.println(map);
		System.out.println();
		System.out.println(map.keySet());
		System.out.println();

		Set<String> keys = map.keySet();
		for (String var : keys) {
			System.out.println("key is--" + var + "  Value is---" + map.get(var));
		}

	}

}
