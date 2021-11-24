package Set1JavaAssignment;

import java.util.HashMap;
import java.util.Set;

//47.Input a hashmap. Count the keys which are not divisible by 4 and return.
public class Q47Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Rohini");
		map.put(17, "Rohan");
		map.put(8, "TCS");
		map.put(12, "Pune");
		System.out.println(map.get(10));
		System.out.println(map.entrySet());
		Set<Integer> val = map.keySet();
		System.out.println("keys that are not divisibly by 4 are:");
		for (int var : val) {

			if (var % 4 != 0) {
				System.out.print(" " + var);

			}
		}

	}

}
