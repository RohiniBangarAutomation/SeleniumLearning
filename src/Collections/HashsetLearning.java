package Collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashsetLearning {

	public static void main(String[] args) {

		// set is unordered list
		// duplicate values are not allowed

		HashSet<String> set = new HashSet<String>();

		set.add("Hello");
		set.add("Geeta");
		set.add("Pune");
		set.add("Class");

		set.add("Hello");

		System.out.println(set);

		for (String str : set) {

			System.out.println(str);

		}

		Iterator<String> itr=set.iterator();

		while (itr.hasNext()) {
			String var = itr.next();
			if (var.equals("Pune"))

				System.out.println(var);
		}

	}

}
